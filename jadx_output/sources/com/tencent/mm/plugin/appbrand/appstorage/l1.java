package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public abstract class l1 {
    public static boolean a(com.tencent.mm.vfs.r6 r6Var) {
        if (r6Var == null) {
            throw new java.lang.NullPointerException("file should not be NULL");
        }
        if (!r6Var.m()) {
            return false;
        }
        try {
            com.tencent.mm.plugin.appbrand.appstorage.FileStructStat fileStructStat = new com.tencent.mm.plugin.appbrand.appstorage.FileStructStat();
            if (com.tencent.mm.plugin.appbrand.appstorage.FileStat.vfsStat(r6Var.o(), fileStructStat) == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FileSystemUtil[ZIP]", "constainsSymLink, path %s, stat.st_mode %d", r6Var.o(), java.lang.Integer.valueOf(fileStructStat.st_mode));
                return fileStructStat.isSymLink();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e17, "", new java.lang.Object[0]);
        }
        return false;
    }

    public static java.lang.String b(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        java.lang.String trim = str.trim();
        if (!trim.startsWith("/")) {
            return "/".concat(trim);
        }
        int i17 = 0;
        while (i17 < trim.length() && '/' == trim.charAt(i17)) {
            i17++;
        }
        return "/" + trim.substring(i17);
    }

    public static long c(com.tencent.mm.vfs.r6 r6Var) {
        if (r6Var == null) {
            return -1L;
        }
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        long j17 = 0;
        if (G == null) {
            return 0L;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
            j17 += r6Var2.A() ? r6Var2.C() : c(r6Var2);
        }
        return j17;
    }

    public static java.nio.ByteBuffer d(com.tencent.mm.vfs.r6 r6Var, long j17, long j18) {
        if (r6Var == null || !r6Var.m() || !r6Var.A()) {
            return java.nio.ByteBuffer.allocateDirect(0);
        }
        int C = (int) r6Var.C();
        if (C >= 0 && (j17 + j18) - 1 <= C - 1) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(C);
            long j19 = C;
            if (j18 < 0) {
                j18 = j19;
            }
            try {
                java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(r6Var.o(), false);
                try {
                    B.getChannel().read(allocateDirect);
                    allocateDirect.flip();
                    if (j17 == 0 && j18 == j19) {
                        B.close();
                        return allocateDirect;
                    }
                    int i17 = (int) j18;
                    byte[] bArr = new byte[i17];
                    allocateDirect.position((int) j17);
                    allocateDirect.get(bArr, 0, i17);
                    java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
                    B.close();
                    return wrap;
                } catch (java.lang.Throwable th6) {
                    try {
                        B.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e17, "readAsDirectByteBuffer", new java.lang.Object[0]);
                nf.a.a(allocateDirect);
                return java.nio.ByteBuffer.allocateDirect(0);
            } catch (java.nio.BufferOverflowException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.FileSystemUtil[ZIP]", "BufferOverflow, file_length %d, byte_allocated %d", java.lang.Long.valueOf(r6Var.C()), java.lang.Integer.valueOf(allocateDirect.capacity()));
                nf.a.a(allocateDirect);
                return java.nio.ByteBuffer.allocateDirect(0);
            }
        }
        return java.nio.ByteBuffer.allocateDirect(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
    
        com.tencent.mm.sdk.platformtools.t8.v1(r3);
        r9.f291824a = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.appbrand.appstorage.j1 e(java.lang.String r8, ik1.b0 r9, java.lang.String r10, long r11, long r13) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appstorage.l1.e(java.lang.String, ik1.b0, java.lang.String, long, long):com.tencent.mm.plugin.appbrand.appstorage.j1");
    }

    public static void f(com.tencent.mm.vfs.r6 r6Var) {
        if (r6Var != null && r6Var.y() && r6Var.m()) {
            com.tencent.mm.vfs.r6[] G = r6Var.G();
            if (G != null) {
                for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                    if (r6Var2.y()) {
                        f(r6Var2);
                    }
                    r6Var2.l();
                }
            }
            r6Var.l();
        }
    }

    public static void g(com.tencent.mm.vfs.r6 r6Var, com.tencent.mm.vfs.t6 t6Var) {
        com.tencent.mm.vfs.r6[] H = r6Var.H(t6Var);
        if (H != null) {
            for (com.tencent.mm.vfs.r6 r6Var2 : H) {
                if (r6Var2.y()) {
                    g(r6Var2, t6Var);
                }
            }
        }
    }

    public static java.lang.String h(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        int i17 = 0;
        while (i17 < str.length() && '/' == str.charAt(i17)) {
            i17++;
        }
        return str.substring(i17);
    }

    public static java.lang.String i(java.lang.String str) {
        if (str != null) {
            str = str.trim();
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        int i17 = 0;
        while (i17 < str.length() && '/' == str.charAt(i17)) {
            i17++;
        }
        return str.substring(i17);
    }

    public static int j(java.util.zip.ZipInputStream zipInputStream, java.lang.String str) {
        try {
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        com.tencent.mm.sdk.platformtools.t8.v1(zipInputStream);
                        return 0;
                    }
                    java.lang.String name = nextEntry.getName();
                    if (!name.contains("../") && !name.contains("..\\")) {
                        java.io.OutputStream outputStream = null;
                        if (nextEntry.isDirectory()) {
                            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str + "/" + name.substring(0, name.length() - 1));
                            java.lang.String str2 = a17.f213279f;
                            if (str2 != null) {
                                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                                if (!str2.equals(l17)) {
                                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                                }
                            }
                            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                            if (m17.a()) {
                                m17.f213266a.r(m17.f213267b);
                            }
                        } else {
                            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str + "/" + name);
                            r6Var.s().J();
                            r6Var.k();
                            try {
                                try {
                                    outputStream = com.tencent.mm.vfs.w6.H(r6Var);
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        outputStream.write(bArr, 0, read);
                                        outputStream.flush();
                                    }
                                } catch (java.lang.Exception e17) {
                                    throw e17;
                                }
                            } finally {
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.sdk.platformtools.t8.v1(zipInputStream);
                throw th6;
            }
        } catch (java.io.FileNotFoundException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e18, "unzipBytes", new java.lang.Object[0]);
            com.tencent.mm.sdk.platformtools.t8.v1(zipInputStream);
            return -1;
        } catch (java.io.IOException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e19, "unzipBytes", new java.lang.Object[0]);
            com.tencent.mm.sdk.platformtools.t8.v1(zipInputStream);
            return -2;
        } catch (java.lang.OutOfMemoryError e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e27, "unzipBytes", new java.lang.Object[0]);
            com.tencent.mm.sdk.platformtools.t8.v1(zipInputStream);
            return -3;
        }
    }
}

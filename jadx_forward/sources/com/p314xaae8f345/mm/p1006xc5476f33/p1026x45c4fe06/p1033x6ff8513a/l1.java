package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public abstract class l1 {
    public static boolean a(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        if (r6Var == null) {
            throw new java.lang.NullPointerException("file should not be NULL");
        }
        if (!r6Var.m()) {
            return false;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11700x155a0685 c11700x155a0685 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11700x155a0685();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11699xd802b610.m49606x16a9a8b7(r6Var.o(), c11700x155a0685) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.FileSystemUtil[ZIP]", "constainsSymLink, path %s, stat.st_mode %d", r6Var.o(), java.lang.Integer.valueOf(c11700x155a0685.f33488x8eccb8c1));
                return c11700x155a0685.m49609x757c6ed7();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e17, "", new java.lang.Object[0]);
        }
        return false;
    }

    public static java.lang.String b(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
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

    public static long c(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        if (r6Var == null) {
            return -1L;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        long j17 = 0;
        if (G == null) {
            return 0L;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            j17 += r6Var2.A() ? r6Var2.C() : c(r6Var2);
        }
        return j17;
    }

    public static java.nio.ByteBuffer d(com.p314xaae8f345.mm.vfs.r6 r6Var, long j17, long j18) {
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
                java.io.RandomAccessFile B = com.p314xaae8f345.mm.vfs.w6.B(r6Var.o(), false);
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e17, "readAsDirectByteBuffer", new java.lang.Object[0]);
                nf.a.a(allocateDirect);
                return java.nio.ByteBuffer.allocateDirect(0);
            } catch (java.nio.BufferOverflowException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.FileSystemUtil[ZIP]", "BufferOverflow, file_length %d, byte_allocated %d", java.lang.Long.valueOf(r6Var.C()), java.lang.Integer.valueOf(allocateDirect.capacity()));
                nf.a.a(allocateDirect);
                return java.nio.ByteBuffer.allocateDirect(0);
            }
        }
        return java.nio.ByteBuffer.allocateDirect(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r3);
        r9.f373357a = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 e(java.lang.String r8, ik1.b0 r9, java.lang.String r10, long r11, long r13) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.e(java.lang.String, ik1.b0, java.lang.String, long, long):com.tencent.mm.plugin.appbrand.appstorage.j1");
    }

    public static void f(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        if (r6Var != null && r6Var.y() && r6Var.m()) {
            com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
            if (G != null) {
                for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                    if (r6Var2.y()) {
                        f(r6Var2);
                    }
                    r6Var2.l();
                }
            }
            r6Var.l();
        }
    }

    public static void g(com.p314xaae8f345.mm.vfs.r6 r6Var, com.p314xaae8f345.mm.vfs.t6 t6Var) {
        com.p314xaae8f345.mm.vfs.r6[] H = r6Var.H(t6Var);
        if (H != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : H) {
                if (r6Var2.y()) {
                    g(r6Var2, t6Var);
                }
            }
        }
    }

    public static java.lang.String h(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
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
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(zipInputStream);
                        return 0;
                    }
                    java.lang.String name = nextEntry.getName();
                    if (!name.contains("../") && !name.contains("..\\")) {
                        java.io.OutputStream outputStream = null;
                        if (nextEntry.isDirectory()) {
                            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str + "/" + name.substring(0, name.length() - 1));
                            java.lang.String str2 = a17.f294812f;
                            if (str2 != null) {
                                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                                if (!str2.equals(l17)) {
                                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                                }
                            }
                            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                            if (m17.a()) {
                                m17.f294799a.r(m17.f294800b);
                            }
                        } else {
                            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str + "/" + name);
                            r6Var.s().J();
                            r6Var.k();
                            try {
                                try {
                                    outputStream = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
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
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(zipInputStream);
                throw th6;
            }
        } catch (java.io.FileNotFoundException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e18, "unzipBytes", new java.lang.Object[0]);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(zipInputStream);
            return -1;
        } catch (java.io.IOException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e19, "unzipBytes", new java.lang.Object[0]);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(zipInputStream);
            return -2;
        } catch (java.lang.OutOfMemoryError e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.FileSystemUtil[ZIP]", e27, "unzipBytes", new java.lang.Object[0]);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(zipInputStream);
            return -3;
        }
    }
}

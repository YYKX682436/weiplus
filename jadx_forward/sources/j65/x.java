package j65;

/* loaded from: classes8.dex */
public class x {

    /* renamed from: c, reason: collision with root package name */
    public static final fp.h0 f379528c = new fp.h0("UncompressStrings");

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.AssetManager f379529a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f379530b;

    public x(android.content.Context context, android.content.res.AssetManager assetManager) {
        this.f379529a = assetManager;
        this.f379530b = new com.p314xaae8f345.mm.vfs.r6(context.getFilesDir(), "uncompressed_strings");
    }

    public static java.lang.String b(java.lang.String str) {
        return str + ".mmstr";
    }

    public boolean a(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        try {
            java.io.InputStream open = this.f379529a.open(str);
            try {
                java.io.OutputStream K = com.p314xaae8f345.mm.vfs.w6.K(r6Var.o(), false);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = open.read(bArr);
                        if (read == -1) {
                            K.flush();
                            K.close();
                            open.close();
                            return true;
                        }
                        K.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMStringOpener", th6, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final boolean c(java.lang.String str) {
        try {
            java.lang.String[] list = this.f379529a.list("strings");
            if (list != null) {
                for (java.lang.String str2 : list) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMStringOpener", th6, "", new java.lang.Object[0]);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        if (e(r15) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream d(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j65.x.d(java.lang.String):java.io.InputStream");
    }

    public final boolean e(java.lang.String str) {
        java.io.InputStream open;
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f379530b;
        if (!r6Var.m()) {
            return true;
        }
        boolean z17 = false;
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l("strings-identify.hash", false, true);
        com.p314xaae8f345.mm.vfs.z7 z7Var = r6Var == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : r6Var.f294699d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str2 = z7Var.f294812f;
            z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str2 + '/' + l17, z7Var.f294813g, z7Var.f294814h);
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            return true;
        }
        java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(b(str), false, true);
        com.p314xaae8f345.mm.vfs.z7 z7Var2 = r6Var == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : r6Var.f294699d;
        if (l18 != null && !l18.isEmpty()) {
            java.lang.String str3 = z7Var2.f294812f;
            z7Var2 = new com.p314xaae8f345.mm.vfs.z7(z7Var2.f294810d, z7Var2.f294811e, str3 + '/' + l18, z7Var2.f294813g, z7Var2.f294814h);
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var2, null);
        if (!(!m18.a() ? false : m18.f294799a.F(m18.f294800b))) {
            return true;
        }
        try {
            open = this.f379529a.open("strings/strings-identify.hash");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMStringOpener", th6, "", new java.lang.Object[0]);
        }
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open));
            try {
                java.lang.String readLine = bufferedReader.readLine();
                bufferedReader.close();
                if (open != null) {
                    open.close();
                }
                if (readLine != null) {
                    try {
                        java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l("strings-identify.hash", false, true);
                        com.p314xaae8f345.mm.vfs.z7 z7Var3 = r6Var == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : r6Var.f294699d;
                        if (l19 != null && !l19.isEmpty()) {
                            java.lang.String str4 = z7Var3.f294812f;
                            z7Var3 = new com.p314xaae8f345.mm.vfs.z7(z7Var3.f294810d, z7Var3.f294811e, str4 + '/' + l19, z7Var3.f294813g, z7Var3.f294814h);
                        }
                        java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(z7Var3, com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var3, null));
                        try {
                            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(D));
                            try {
                                java.lang.String readLine2 = bufferedReader.readLine();
                                bufferedReader.close();
                                if (D != null) {
                                    D.close();
                                }
                                if (readLine2 != null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMStringOpener", "identifyHashFromAssets = %s, identifyHashFromCache = %s", readLine, readLine2);
                                    z17 = readLine2.equals(readLine);
                                }
                            } finally {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (java.lang.Throwable th7) {
                                    th.addSuppressed(th7);
                                }
                            }
                        } finally {
                        }
                    } catch (java.lang.Throwable th8) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMStringOpener", th8, "", new java.lang.Object[0]);
                    }
                }
                return !z17;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j65.x.f():boolean");
    }
}

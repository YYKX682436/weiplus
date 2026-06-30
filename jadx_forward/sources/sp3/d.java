package sp3;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f492840a = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("diagnostic_storage");

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f492841b = "KEY_USER_MEM_CAP_INT_" + android.os.Build.FINGERPRINT;

    /* renamed from: c, reason: collision with root package name */
    public static int f492842c;

    public static java.lang.String a(java.lang.Object[] objArr) {
        if (objArr == null) {
            return "null";
        }
        int length = objArr.length - 1;
        if (length == -1) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (true) {
            sb6.append(java.lang.String.valueOf(objArr[i17]));
            if (i17 == length) {
                return sb6.toString();
            }
            sb6.append(";");
            i17++;
        }
    }

    public static void b(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalCacheDir() + "/Diagnostic");
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(r6Var2, r6Var.m82467xfb82e301());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.performance.Utils", "DevEnv: copy [%s] to sdcard [%s]", r6Var.o(), r6Var3.o());
        if (!r6Var2.m()) {
            r6Var2.J();
        }
        com.p314xaae8f345.mm.vfs.w6.w(r6Var.o(), r6Var3.o());
    }

    public static boolean c() {
        int o17 = f492840a.o(f492841b, 0);
        f492842c = o17;
        if (o17 == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((ku5.t0) ku5.t0.f394148d).q(new sp3.c());
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.performance.Utils", "[MEM] detect3GUserSpace = %d", java.lang.Integer.valueOf(f492842c));
        return f492842c == 3;
    }

    public static void d(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        java.io.BufferedReader bufferedReader;
        java.io.IOException e17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> dump file = %s, modified = %s", r6Var.m82467xfb82e301(), f(r6Var.B()));
        if (r6Var.m()) {
            java.io.BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.p314xaae8f345.mm.vfs.w6.C(r6Var)));
                while (true) {
                    try {
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, readLine);
                            }
                        } catch (java.io.IOException e18) {
                            e17 = e18;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "", new java.lang.Object[0]);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
                            r6Var.l();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", r6Var.m82467xfb82e301(), f(r6Var.B()));
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader2 = bufferedReader;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader2);
                        r6Var.l();
                        throw th;
                    }
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b || z65.c.a()) {
                    b(r6Var);
                } else {
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } catch (java.io.IOException e19) {
                bufferedReader = null;
                e17 = e19;
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
            r6Var.l();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", r6Var.m82467xfb82e301(), f(r6Var.B()));
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.String str2;
        java.nio.charset.Charset charset = r26.c.f450398a;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        try {
            com.p314xaae8f345.mm.vfs.u6 u6Var = new com.p314xaae8f345.mm.vfs.u6(r6Var);
            try {
                int C = (int) r6Var.C();
                byte[] bArr = new byte[C];
                int i17 = 0;
                while (i17 < C) {
                    int read = u6Var.read(bArr, i17, C - i17);
                    if (read == -1) {
                        break;
                    }
                    i17 += read;
                }
                str2 = new java.lang.String(bArr, charset);
                try {
                    u6Var.close();
                } catch (java.io.IOException e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.performance.Utils", e, "", new java.lang.Object[0]);
                    return str2;
                }
            } finally {
            }
        } catch (java.io.IOException e18) {
            e = e18;
            str2 = null;
        }
        return str2;
    }

    public static java.lang.String f(long j17) {
        return new java.text.SimpleDateFormat("yy-MM-dd HH:mm:ss", java.util.Locale.getDefault()).format(new java.util.Date(j17));
    }
}

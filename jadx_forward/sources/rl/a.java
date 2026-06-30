package rl;

/* loaded from: classes7.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 d17 = d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(rl.d.a("" + str.hashCode()));
        sb6.append("_convert.pcm");
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(sb6.toString(), false, true);
        com.p314xaae8f345.mm.vfs.z7 z7Var = d17.f294699d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str2 = z7Var.f294812f;
            z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str2 + '/' + l17, z7Var.f294813g, z7Var.f294814h);
        }
        return z7Var.m82499x9616526c();
    }

    public static com.p314xaae8f345.mm.vfs.r6 b(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            try {
                r6Var.k();
            } catch (java.lang.Exception e17) {
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.FileUtil", e17, "createNewFile", new java.lang.Object[0]);
            }
        }
        return r6Var;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(d().u() + "/" + str);
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.Object[] objArr = {r6Var.u(), str};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.FileUtil", "path:%s, appId:%s", objArr);
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, true);
        com.p314xaae8f345.mm.vfs.z7 z7Var = r6Var.f294699d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str3 = z7Var.f294812f;
            z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str3 + '/' + l17, z7Var.f294813g, z7Var.f294814h);
        }
        return z7Var.m82499x9616526c();
    }

    public static com.p314xaae8f345.mm.vfs.r6 d() {
        com.p314xaae8f345.mm.vfs.r6 j17 = com.p314xaae8f345.mm.vfs.r6.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalCacheDir());
        if (j17 == null) {
            j17 = com.p314xaae8f345.mm.vfs.r6.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir());
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(j17, "MixAudio");
        r6Var.J();
        return r6Var;
    }

    public static long e(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var.m()) {
            return r6Var.C();
        }
        return 0L;
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.r6 d17 = d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(rl.d.a("" + str2.hashCode()));
        sb6.append("_cache.pcm");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(d17.u() + "/" + str);
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.Object[] objArr = {r6Var.u(), str};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.FileUtil", "path:%s, appId:%s", objArr);
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(sb7, false, true);
        com.p314xaae8f345.mm.vfs.z7 z7Var = r6Var.f294699d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str3 = z7Var.f294812f;
            z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str3 + '/' + l17, z7Var.f294813g, z7Var.f294814h);
        }
        return z7Var.m82499x9616526c();
    }
}

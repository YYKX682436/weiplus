package xl3;

/* loaded from: classes7.dex */
public abstract class c {
    public static java.lang.String a(b21.r rVar) {
        int i17 = rVar.f98878d;
        java.lang.String str = rVar.f98879e;
        java.lang.String str2 = "";
        if (i17 == 6) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("6_");
            if (!android.text.TextUtils.isEmpty(str)) {
                char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
            }
            sb6.append(str2);
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("0_");
        if (!android.text.TextUtils.isEmpty(str)) {
            char[] cArr2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
        }
        sb7.append(str2);
        return sb7.toString();
    }

    public static java.lang.String b(java.lang.String str) {
        return "piece" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a("" + str.hashCode());
    }

    public static java.lang.String c(java.lang.String str, boolean z17) {
        java.lang.String a17;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(gl3.h.a(), "music");
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicFileUtil", "create file folder:%b for path:%s", java.lang.Boolean.valueOf(r6Var.J()), r6Var.o());
        }
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str + "temp"));
            sb6.append("-wifi");
            a17 = sb6.toString();
        } else {
            a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str + "temp");
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, a17);
        r6Var2.n();
        return r6Var2.o();
    }

    public static java.lang.String d(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(gl3.h.a(), "music");
        if (!r6Var.m()) {
            r6Var.J();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, b(str));
        r6Var2.n();
        return r6Var2.o();
    }

    public static java.lang.String e(java.lang.String str, boolean z17) {
        return c(str, false) + "-thumb-" + z17;
    }
}

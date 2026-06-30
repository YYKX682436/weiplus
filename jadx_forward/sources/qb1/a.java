package qb1;

/* loaded from: classes7.dex */
public abstract class a {
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f fVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, int i18, java.lang.String errMsg, java.util.HashMap hashMap, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            hashMap = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        hashMap.put("errCode", java.lang.Integer.valueOf(i18));
        env.a(i17, fVar.p(errMsg, hashMap));
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f fVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, java.util.HashMap hashMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        hashMap.put("errCode", 0);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        env.a(i17, fVar.t("ok", hashMap));
    }

    public static final int c() {
        return c06.f.a(java.lang.System.currentTimeMillis()).e(1, Integer.MAX_VALUE);
    }

    public static final boolean d(java.lang.String permission) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permission, "permission");
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return true;
        }
        return nf.t.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, null, permission);
    }
}

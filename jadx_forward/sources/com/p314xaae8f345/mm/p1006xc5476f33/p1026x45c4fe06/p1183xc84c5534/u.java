package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final long f169944a = java.util.concurrent.TimeUnit.SECONDS.toMillis(30);

    public static java.lang.String a() {
        return b() + "WxaAppRecord";
    }

    public static java.lang.String b() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        java.lang.String h17 = gm0.j1.u().h();
        if (!h17.endsWith("/")) {
            h17 = h17.concat("/");
        }
        java.lang.String str = h17 + "appbrand/report/";
        com.p314xaae8f345.mm.vfs.w6.u(str);
        return str;
    }

    public static void c(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12556xfd0202c3 c12556xfd0202c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12556xfd0202c3();
        c12556xfd0202c3.f169301f = 1;
        c12556xfd0202c3.f169303h = str;
        c12556xfd0202c3.f169304i = i17;
        c12556xfd0202c3.d();
    }

    public static void d(r45.uc7 uc7Var) {
        if (uc7Var == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.t.f169934a;
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.s(uc7Var), "MicroMsg.AppBrandIDKeyBatchReport");
            return;
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.n.f169654a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12556xfd0202c3 c12556xfd0202c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12556xfd0202c3();
            c12556xfd0202c3.f169305m = uc7Var;
            c12556xfd0202c3.f169301f = 3;
            c12556xfd0202c3.d();
        }
    }
}

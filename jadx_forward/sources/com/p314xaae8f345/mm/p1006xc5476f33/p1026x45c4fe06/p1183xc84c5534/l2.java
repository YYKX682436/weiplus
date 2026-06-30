package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class l2 implements ne.n, ne.q {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.l2 f169444b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.l2();

    @Override // ne.q
    public java.lang.String a() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return b(java.lang.System.currentTimeMillis());
    }

    public java.lang.String b(long j17) {
        java.lang.String a17;
        java.lang.String[] strArr = new java.lang.String[5];
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            a17 = gm0.j1.b().j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        } else {
            a17 = kk.v.a(gm0.m.i());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        }
        strArr[0] = "hash=".concat(a17);
        strArr[1] = "ts=" + j17;
        strArr[2] = "host=";
        strArr[3] = "version=" + o45.wf.f424562g;
        strArr[4] = "device=2";
        java.lang.String k17 = u46.l.k(strArr, "&");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "join(...)");
        return k17;
    }
}

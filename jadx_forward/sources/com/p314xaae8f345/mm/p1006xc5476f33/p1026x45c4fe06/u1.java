package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u1 f170794a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u1();

    public final void a(l81.b1 bundle, l81.v0 v0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        int hashCode = bundle.hashCode();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreRenderColdStartService", "start with id:" + hashCode + " username:" + bundle.f398545a + " appId:" + bundle.f398547b + " versionType:" + bundle.f398549c + " path:" + bundle.f398555f + " scene:" + bundle.f398565k);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p874xaefb6cc9.y.f29758x366c91de, 0);
        java.lang.String str = bundle.f398547b;
        if (str != null && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a.d(str)) {
            bundle.f398549c = 1;
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a.e()) {
            bundle.f398549c = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s1 s1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s1(hashCode, elapsedRealtime, v0Var);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.k0(hashCode, bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t1(hashCode, s1Var), s1Var, true, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.PRE_RENDER).a();
    }
}

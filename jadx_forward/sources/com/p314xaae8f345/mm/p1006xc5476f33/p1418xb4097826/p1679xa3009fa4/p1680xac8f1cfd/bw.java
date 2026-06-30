package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes14.dex */
public final class bw implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f215465d;

    public bw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar) {
        this.f215465d = sxVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("search device times:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f215465d;
        sb6.append(sxVar.L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", sb6.toString());
        int i17 = sxVar.L;
        boolean z17 = false;
        if (i17 >= sxVar.K) {
            sxVar.L = 0;
            sxVar.getClass();
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zw(sxVar));
            return false;
        }
        sxVar.L = i17 + 1;
        java.lang.String a17 = nf.s.a();
        java.lang.String b17 = nf.s.b();
        int i18 = y91.i0.f541814h;
        y91.i0 i0Var = y91.h0.f541810a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a2.b(a17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.a2.b(b17)) {
            z17 = true;
        }
        i0Var.f(z17);
        return true;
    }
}

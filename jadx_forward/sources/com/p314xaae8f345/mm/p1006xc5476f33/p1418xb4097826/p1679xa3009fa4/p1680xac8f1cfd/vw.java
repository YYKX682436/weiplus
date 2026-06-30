package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes14.dex */
public final class vw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f217805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f217806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f217807f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(x91.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar, boolean z17) {
        super(0);
        this.f217805d = hVar;
        this.f217806e = sxVar;
        this.f217807f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBreakDevice mrDevice:");
        x91.h hVar = this.f217805d;
        sb6.append(hVar);
        sb6.append(", selectedDevice:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f217806e;
        sb6.append(sxVar.f217474w);
        sb6.append(", isFromClick=");
        sb6.append(this.f217807f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", sb6.toString());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar, sxVar.f217474w)) {
            if (hVar != null) {
                hVar.h();
                hVar.i();
                hVar.f534187h = null;
            }
            sxVar.f217474w = null;
            sxVar.f217475x = 0L;
            if (sxVar.h().getVisibility() == 0) {
                if (sxVar.S6().isEmpty()) {
                    sxVar.W6(0);
                } else {
                    sxVar.W6(2);
                    sxVar.L = 0;
                    jz5.n nVar = (jz5.n) sxVar.M;
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) nVar.mo141623x754a37bb()).d();
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) nVar.mo141623x754a37bb()).c(0L, 3000L);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

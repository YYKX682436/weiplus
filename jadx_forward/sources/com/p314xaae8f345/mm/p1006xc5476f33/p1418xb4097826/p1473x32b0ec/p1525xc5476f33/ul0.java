package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ul0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 f196120d;

    public ul0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var) {
        this.f196120d = km0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        yg2.b m57691xa0fa63f9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what == 1) {
            qo0.c cVar = this.f196120d.f194858g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
            if ((k0Var == null || (m57691xa0fa63f9 = k0Var.m57691xa0fa63f9()) == null || !p3325xe03a0797.p3326xc267989b.z0.h(m57691xa0fa63f9)) ? false : true) {
                this.f196120d.f194814r = it.arg1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0 km0Var = this.f196120d;
                synchronized (km0Var.f194818v) {
                    if (km0Var.f194814r < km0Var.f194818v.size()) {
                        java.lang.Object obj = km0Var.f194818v.get(km0Var.f194814r);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                        km0Var.w1((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tl0) obj, false);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km0.t1(this.f196120d);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishBannerPlugin", "SCROLL_TO_NEXT_IMG_WHAT but viewScope is not active");
            }
        }
        return true;
    }
}

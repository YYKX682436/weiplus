package kp2;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07 f392490d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07 c14513x218d4a07, p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe) {
        this.f392490d = c14513x218d4a07;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oa.i k17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07 c14513x218d4a07 = this.f392490d;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = c14513x218d4a07.m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
        if (m158358x197d1fc6.m7474xfb86a31b() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareUIC", "addFragments after post view is null");
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = c14513x218d4a07.m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc62);
        if (m158358x197d1fc62.m7482xefa32bc()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareUIC", "addFragments after fragment detached");
            return;
        }
        r45.dd2 dd2Var = c14513x218d4a07.f203030h;
        kp2.c cVar = c14513x218d4a07.f203037r;
        jz5.f0 f0Var = null;
        if (dd2Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addFragments go to target page:targetTabInfo=");
            r45.dd2 dd2Var2 = c14513x218d4a07.f203030h;
            sb6.append(dd2Var2 != null ? java.lang.Integer.valueOf(dd2Var2.m75939xb282bd08(0)) : null);
            sb6.append('-');
            r45.dd2 dd2Var3 = c14513x218d4a07.f203030h;
            sb6.append(dd2Var3 != null ? dd2Var3.m75945x2fec8307(1) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareUIC", sb6.toString());
            c14513x218d4a07.S6(dd2Var.m75939xb282bd08(0));
            cVar.mo8333x510f45c9(c14513x218d4a07.R6(dd2Var.m75939xb282bd08(0)));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc63 = c14513x218d4a07.m158358x197d1fc6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc63);
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.b(m158358x197d1fc63).a(qp2.y.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff R6 = ((qp2.y) a17).R6();
            if (R6 != null && (k17 = R6.k(0)) != null && !k17.a()) {
                k17.b();
            }
            cVar.mo8333x510f45c9(0);
        }
    }
}

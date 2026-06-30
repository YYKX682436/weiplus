package kp2;

/* loaded from: classes2.dex */
public final class c extends zo2.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07 f392491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07 c14513x218d4a07, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.util.LinkedList linkedList) {
        super((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112, linkedList);
        this.f392491g = c14513x218d4a07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
    }

    @Override // zo2.a
    public void a(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    @Override // zo2.a
    public void l(int i17, int i18, int i19, int i27) {
        oa.i k17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15290x1a2d74fc.TAG, "onFragmentChange from:" + i17 + " to:" + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07 c14513x218d4a07 = this.f392491g;
        if (i17 != -1 && i17 != i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15290x1a2d74fc.TAG, "onFragmentChange hit onPageScrolled scroll change.");
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = c14513x218d4a07.m158358x197d1fc6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
            ((op2.a) pf5.z.f435481a.b(m158358x197d1fc6).a(op2.a.class)).f428770d.e();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEVER_SCROLL_IN_LIVE_SQUARE_CNT_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            ip2.a.f375152h = 3;
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).xj(null, ml2.x1.f409735f, "94", ml2.y.f409773e, i19, i27);
        c14513x218d4a07.f203033n = i18;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = c14513x218d4a07.m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc62);
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.b(m158358x197d1fc62).a(qp2.y.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff R6 = ((qp2.y) a17).R6();
        if (R6 == null || (k17 = R6.k(i18)) == null || k17.a()) {
            return;
        }
        k17.b();
    }

    @Override // zo2.b, p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }
}

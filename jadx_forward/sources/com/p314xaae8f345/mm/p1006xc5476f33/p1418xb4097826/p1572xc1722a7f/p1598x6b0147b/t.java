package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b;

/* loaded from: classes2.dex */
public final class t extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec f203751d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 f203752e;

    /* renamed from: f, reason: collision with root package name */
    public final ey2.k0 f203753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f203753f = (ey2.k0) a17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c7e;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec c14577x913488ec;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 d0Var;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14575x3ee3558d feedLoader;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56388xcaeb60d0;
        if (i17 == 501) {
            if (i18 != -1 || intent == null || (c14577x913488ec = this.f203751d) == null) {
                return;
            }
            c14577x913488ec.m58516xde59525f(intent);
            return;
        }
        if (i17 == 510 && i18 == -1 && (d0Var = this.f203752e) != null && (i19 = d0Var.f203713i) != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec c14577x913488ec2 = this.f203751d;
            if (c14577x913488ec2 != null && (feedLoader = c14577x913488ec2.getFeedLoader()) != null && (m56388xcaeb60d0 = feedLoader.m56388xcaeb60d0()) != 0) {
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = d0Var.m58532x4905e9fa().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8155x27702c4(i19);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 d0Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m58532x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        if (!com.p314xaae8f345.mm.ui.bk.Q() || (d0Var = this.f203752e) == null || (m58532x4905e9fa = d0Var.m58532x4905e9fa()) == null || (mo7946xf939df19 = m58532x4905e9fa.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8146xced61ae5();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec c14577x913488ec = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085);
        this.f203751d = c14577x913488ec;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158358x197d1fc6, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 d0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301) m158358x197d1fc6, c14577x913488ec, m80380x71e92c1d());
        c14577x913488ec.mo56536x3b13c504((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.b) d0Var);
        this.f203752e = d0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec c14577x913488ec = this.f203751d;
        if (c14577x913488ec != null) {
            c14577x913488ec.mo979x3f5eee52();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.x(2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 d0Var = this.f203752e;
        if (d0Var != null) {
            d0Var.f203716o.f();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        super.mo13982x7cf2e371();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec c14577x913488ec = this.f203751d;
        if (c14577x913488ec != null) {
            c14577x913488ec.m58506x21699b50();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineLbsUIC", "onPause");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec c14577x913488ec = this.f203751d;
        if (c14577x913488ec != null) {
            c14577x913488ec.m58508xb01dfb57();
        }
        this.f203753f.N6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo2282x953457f1(i17, permissions, grantResults);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec c14577x913488ec = this.f203751d;
        if (c14577x913488ec != null) {
            c14577x913488ec.m58511x953457f1(i17, permissions, grantResults);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineLbsUIC", "onResume");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec c14577x913488ec = this.f203751d;
        if (c14577x913488ec != null) {
            c14577x913488ec.m58512x57429eec();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineLbsUIC", "onUserVisibleFocused");
        super.mo58275xd317978f();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class)).a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.s.f203750d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec c14577x913488ec = this.f203751d;
        if (c14577x913488ec != null) {
            c14577x913488ec.m58514xd317978f();
        }
        ya2.o1.t4(this.f203753f, false, null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineLbsUIC", "onUserVisibleUnFocused");
        super.mo58437xaa858cb6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec c14577x913488ec = this.f203751d;
        if (c14577x913488ec != null) {
            c14577x913488ec.m58515xaa858cb6();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f203753f = (ey2.k0) a17;
    }
}

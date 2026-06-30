package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class k90 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements ya2.x1 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f216470d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa f216471e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa f216472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k90(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f216470d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j90(this));
    }

    public final int O6() {
        return ((java.lang.Number) this.f216470d.mo141623x754a37bb()).intValue();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b_a;
    }

    @Override // ya2.x1
    public void j7(r45.hx0 cmdItem, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdItem, "cmdItem");
        cmdItem.m75939xb282bd08(0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa;
        if (i17 == 10001 && i18 == -1 && intent != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar = this.f216471e;
            if (oaVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = oaVar.f188690f;
            if (a1Var == null || (m56022x4905e9fa = a1Var.m56022x4905e9fa()) == null) {
                return;
            }
            hc2.f1.v(m56022x4905e9fa, intent, oaVar.f188689e, true, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        if (m80381x45f41879()) {
            if (this.f216471e != null) {
                return false;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        if (this.f216471e != null) {
            m158354x19263085().finish();
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar = this.f216471e;
        if (oaVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = oaVar.f188690f;
        if (a1Var != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = a1Var.m56022x4905e9fa().getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
            int[] u17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager).u(null);
            int i17 = 0;
            int a07 = u17[0] - a1Var.o().a0();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = a1Var.m56022x4905e9fa().q0(u17[0], false);
            if (q07 != null && (view = q07.f3639x46306858) != null) {
                i17 = view.getTop();
            }
            int i18 = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = oaVar.f188689e;
            java.util.Iterator it = abstractC13919x46aff122.m56388xcaeb60d0().iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).T0();
                }
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ey2.t0.V6((ey2.t0) a17, "FinderFollowFeedUIContract.Presenter", oaVar.f190160m, a07, i18, abstractC13919x46aff122.m56388xcaeb60d0(), null, null, false, false, 224, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        int d17;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEW_CGI_INT_SYNC, 0);
        if (r17 == 1) {
            db2.u4.f309721a = "/cgi-bin/mmfinder-bin";
        } else if (r17 != 2) {
            db2.u4.f309721a = "/cgi-bin/micromsg-bin";
        } else {
            db2.u4.f309721a = "/cgi-bin/micromsg-bin";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCgiConstants", "config " + r17 + ' ' + db2.u4.f309721a);
        mv2.l lVar = mv2.l.f413130d;
        mv2.l.f413130d.e();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) m158358x197d1fc6 : null;
        if (abstractC15124x7bae6180 != null) {
            d17 = abstractC15124x7bae6180.getF203048s();
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085 : null;
            d17 = abstractActivityC15087xee12defa != null ? abstractActivityC15087xee12defa.getD() : 0;
        }
        int i17 = d17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852;
        int O6 = O6();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        this.f216471e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa(abstractActivityC21394xb3d2c0cf, i17, O6, m158358x197d1fc62 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) m158358x197d1fc62 : null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa xaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630853, i17, O6(), m80380x71e92c1d(), m158358x197d1fc6());
        android.view.View findViewById = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        xaVar.f187713m = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById;
        this.f216472f = xaVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar = this.f216471e;
        if (oaVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        xaVar.T(oaVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar2 = this.f216471e;
        if (oaVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa xaVar2 = this.f216472f;
        if (xaVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        oaVar2.m(xaVar2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) t70Var.M().r()).intValue() >= 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa xaVar3 = this.f216472f;
            if (xaVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            oj5.x.d(xaVar3.m56022x4905e9fa(), 6, 12, false, null, null, 28, null).f427413c = ((java.lang.Number) t70Var.M().r()).intValue() == 2;
        }
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f413094a.c();
        ((c61.l7) i95.n0.c(c61.l7.class)).P.b(104, this);
        ((c61.l7) i95.n0.c(c61.l7.class)).P.b(108, this);
        android.view.View decorView = m158354x19263085().getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f90(decorView, this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        if (!m80381x45f41879()) {
            o25.n1.c((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085());
        }
        final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5515x11ebd8ad>(m158354x19263085) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC$onCreateAfter$1
            {
                this.f39173x3fe91575 = 1338237085;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5515x11ebd8ad c5515x11ebd8ad) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5515x11ebd8ad event = c5515x11ebd8ad;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = event.f135846g.f89425a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k90 k90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k90.this;
                if (i17 != k90Var.O6()) {
                    return false;
                }
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g90(k90Var));
                return false;
            }
        }.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        if (m80381x45f41879()) {
            return;
        }
        o25.n1.e(m158354x19263085());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTwoFlowTimelineUIC", "onDestroy");
        ((c61.l7) i95.n0.c(c61.l7.class)).P.l(104, this);
        ((c61.l7) i95.n0.c(c61.l7.class)).P.l(108, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar = this.f216471e;
        if (oaVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        oaVar.mo979x3f5eee52();
        kk.l lVar = so2.f0.f491867a;
        so2.f0.f491867a.mo143584x5a5b64d();
        pm0.v.K(null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h90.f216132d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa xaVar = this.f216472f;
        if (xaVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        xaVar.m56022x4905e9fa().mo7960x6cab2c8d(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        int O6 = O6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        v1Var.x(O6, nyVar != null ? nyVar.V6() : null);
        v1Var.v(-1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar = this.f216471e;
        if (oaVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        oaVar.q();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.v(-1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar = this.f216471e;
        if (oaVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        oaVar.s();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80.f217526m && O6() == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTwoFlowTimelineUIC", "[onResume] shouldScrollToPostingItem");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa xaVar = this.f216472f;
            if (xaVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = xaVar.m56022x4905e9fa().getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager : null;
            if (c1164x587b7ff1 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1164x587b7ff1, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTwoFlowTimelineUIC", "onResume", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1164x587b7ff1.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTwoFlowTimelineUIC", "onResume", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80.f217526m = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.s(O6());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        if (!m158354x19263085().isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.j(O6(), false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        int O6 = O6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        v1Var.x(O6, nyVar != null ? nyVar.V6() : null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        super.mo58275xd317978f();
        pf5.u uVar = pf5.u.f435469a;
        ey2.t0 t0Var = (ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class);
        O6();
        t0Var.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class)).a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i90.f216255d);
        p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.b(m80379x76847179()).a(uo2.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((uo2.v) a17).R6(null);
        if (this.f216471e == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        android.content.Intent intent = m158354x19263085().getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_FINDER_JUMP_FOLLOW_TAB", false) : false;
        android.content.Intent intent2 = m158354x19263085().getIntent();
        if (intent2 != null) {
            intent2.removeExtra("KEY_FINDER_JUMP_FOLLOW_TAB");
        }
        boolean h07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().h0(O6());
        if (booleanExtra) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar = this.f216471e;
            if (oaVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            oaVar.y(true, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTwoFlowTimelineUIC", "[onUserVisibleFocused] pass this check");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oa oaVar2 = this.f216471e;
            if (oaVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            oaVar2.y(false, true);
            if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q0().r()).intValue() == 1 && h07) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                if (nyVar != null) {
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).aj(nyVar.V6(), 6, 0);
                }
            }
        }
        fc2.c Y6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.c(m158354x19263085()).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).Y6(O6());
        if (Y6 != null) {
            Y6.b(new fc2.x(O6()));
        }
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085 : null;
            int d17 = abstractActivityC15087xee12defa != null ? abstractActivityC15087xee12defa.getD() : 0;
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            ml2.j0.f409116i.f409847v = d17;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        ((ey2.t0) pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class)).T6(O6());
        if (this.f216471e == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        v1Var.v(O6());
        v1Var.j(O6(), true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e1 e1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e1.f206537a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k90(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f216470d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j90(this));
    }
}

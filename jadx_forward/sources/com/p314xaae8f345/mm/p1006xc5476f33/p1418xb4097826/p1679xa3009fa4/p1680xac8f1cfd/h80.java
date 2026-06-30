package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class h80 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.rb {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f216129e;

    /* renamed from: d, reason: collision with root package name */
    public ay2.i f216130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public void O6() {
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("KEY_FORBID_SQUARE_TEEN", false);
        m158359x1e885992().removeExtra("KEY_FORBID_SQUARE_TEEN");
        if (booleanExtra) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTeensGuideUIC", "checkTeensGuideShowByConfig: forbid square teen, skip teens guide");
            return;
        }
        if (c01.e2.a0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTeensGuideUIC", "checkTeensGuideShowByConfig: wechat user don't show teen guide");
            return;
        }
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        boolean Xd = ((uh4.c0) i95.n0.c(uh4.c0.class)).Xd();
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USREINFO_FINDER_TEENS_GUIDE_DONT_REMIND_ME_BOOLEAN_SYNC, false);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USREINFO_FINDER_TEENS_GUIDE_TIPS_LASTIME_LONG_SYNC;
        long t17 = c17.t(u3Var, 0L);
        long A = zl2.q4.f555466a.A();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTeensGuideUIC", "isTeenMode=" + mo168058x74219ae7 + " lastime=" + t17 + " todayStartTime=" + A + " isHideTeenMode=" + Xd);
        if (mo168058x74219ae7 || Xd || o17) {
            return;
        }
        if (A < t17) {
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            return;
        }
        r45.jz2 jz2Var = (r45.jz2) g92.b.f351302e.k2().d().m75936x14adae67(11);
        int m75939xb282bd08 = jz2Var != null ? jz2Var.m75939xb282bd08(2) : 0;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            int S6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) a17).S6();
            if (S6 == 1) {
                P6(m75939xb282bd08, 2);
                return;
            } else if (S6 == 3 || S6 == 4) {
                P6(m75939xb282bd08, 1);
                return;
            } else {
                P6(m75939xb282bd08, 4);
                return;
            }
        }
        if (m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6) m158354x192630852).getD() == 16) {
                P6(m75939xb282bd08, 1);
                return;
            } else {
                P6(m75939xb282bd08, 4);
                return;
            }
        }
        jz2.x0.f384287a.b(m158354x19263085());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        ((wo2.q0) ((jz2.y0) i95.n0.c(jz2.y0.class))).getClass();
        if (!((activity2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9.ActivityC14516x4f028c6e) || (activity2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.ActivityC14524xdd91c7bb))) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            ((wo2.q0) ((jz2.y0) i95.n0.c(jz2.y0.class))).getClass();
            if (!(activity3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ActivityC14498x316bf573)) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
                ((wo2.q0) ((jz2.y0) i95.n0.c(jz2.y0.class))).getClass();
                if (!((activity4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1579x333b55.ActivityC14517xebb478b4) || (activity4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14018x971b0c89))) {
                    P6(m75939xb282bd08, 4);
                    return;
                }
            }
        }
        P6(m75939xb282bd08, 1);
    }

    public final void P6(int i17, int i18) {
        if (!((i17 & i18) > 0) || f216129e) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ea eaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ea) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ea.class);
        if (eaVar != null) {
            eaVar.O6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ba(10, "TeensGuide", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g80(this)));
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USREINFO_FINDER_TEENS_GUIDE_TIPS_LASTIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            Q6();
        }
    }

    public final void Q6() {
        if (this.f216130d == null) {
            java.lang.String string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTeensGuideUIC", "tips=".concat(string));
            ay2.i iVar = new ay2.i(m158354x19263085());
            this.f216130d = iVar;
            iVar.f96781p = string;
        }
        ay2.i iVar2 = this.f216130d;
        if (iVar2 != null) {
            iVar2.f96784s = false;
            android.app.Activity activity = iVar2.f96772d;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            iVar2.f96783r = android.os.SystemClock.uptimeMillis();
            iVar2.show();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            o3Var.getClass();
            pf5.z zVar = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95 c6586xa056ef95 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6586xa056ef95();
            c6586xa056ef95.s(V6.m75945x2fec8307(0));
            c6586xa056ef95.f139360e = c6586xa056ef95.b("findercontextid", V6.m75945x2fec8307(1), true);
            c6586xa056ef95.p(java.lang.String.valueOf(V6.m75939xb282bd08(5)));
            c6586xa056ef95.f139366k = c6586xa056ef95.b("clicktabcontextid", V6.m75945x2fec8307(2), true);
            c6586xa056ef95.f139362g = 0;
            c6586xa056ef95.q("teenagemode_set");
            c6586xa056ef95.r(java.lang.String.valueOf(c01.id.c()));
            c6586xa056ef95.k();
            o3Var.Zk(c6586xa056ef95);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        boolean z17 = false;
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("KEY_TEMPORARY_FORBID_TEENS_GUIDE", false);
        m158359x1e885992().removeExtra("KEY_TEMPORARY_FORBID_TEENS_GUIDE");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((wo2.q0) ((jz2.y0) i95.n0.c(jz2.y0.class))).getClass();
        if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ActivityC14498x316bf573)) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((wo2.q0) ((jz2.y0) i95.n0.c(jz2.y0.class))).getClass();
            if (!((activity2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9.ActivityC14516x4f028c6e) || (activity2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.ActivityC14524xdd91c7bb)) && !(m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799)) {
                jz2.x0.f384287a.b(m158354x19263085());
                if (!booleanExtra) {
                    z17 = true;
                }
            }
        }
        if (z17) {
            O6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ay2.i iVar = this.f216130d;
        if (iVar != null) {
            iVar.b(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}

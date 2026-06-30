package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class h50 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.fb {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final boolean O6(android.view.View anchor, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        android.content.Context context = anchor.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 a4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class);
        if (a4Var != null && a4Var.f215262y) {
            return false;
        }
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14060x9edd984c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShareTipsBubbleUIC", "checkShowShareTips: do not show tips");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean z17 = ((java.lang.Number) ((ob2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.J9).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SET_SHARE_BUBBLE_TIPS_INT_SYNC;
        int r17 = c17.r(u3Var, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShareTipsBubbleUIC", "checkShowShareTips open: " + z17 + ", count: " + r17);
        if (!z17) {
            return false;
        }
        if (r17 < 3) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SHARE_BUBBLE_TIPS_LAST_TIME_LONG_SYNC;
            long t17 = c18.t(u3Var2, 0L);
            long A = zl2.q4.f555466a.A();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShareTipsBubbleUIC", "checkShowShareTips lastTime: " + t17 + ", startTime: " + A);
            if (A >= t17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm rmVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm(m80379x76847179(), null, 2, null);
                rmVar.f214507m = -1L;
                android.content.Context context2 = rmVar.f214498d;
                rmVar.f214506l = i65.a.b(context2, 68);
                rmVar.f214501g.setText(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f4j));
                rmVar.a(0, context2.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
                rmVar.c(anchor);
                rmVar.b();
                rmVar.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g50(this));
                gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                android.app.Activity context3 = m80379x76847179();
                java.lang.String u17 = pm0.v.u(j17);
                o3Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
                cl0.g gVar = new cl0.g();
                gVar.h("feedid", u17);
                gVar.o("trigger_reason", i17);
                java.lang.String gVar2 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                java.lang.String t18 = r26.i0.t(gVar2, ",", ";", false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context3 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, 0, "forward_edu", t18, nyVar != null ? nyVar.V6() : null, null, 16, null);
                return true;
            }
        }
        return false;
    }

    public final boolean P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return (((java.lang.Number) ((ob2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.J9).mo141623x754a37bb()).r()).intValue() == 1) && gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SET_SHARE_BUBBLE_TIPS_INT_SYNC, 0) < 3 && zl2.q4.f555466a.A() >= gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SHARE_BUBBLE_TIPS_LAST_TIME_LONG_SYNC, 0L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}

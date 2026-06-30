package fr2;

/* loaded from: classes2.dex */
public final class p extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f347269d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f347270e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f347271f;

    /* renamed from: g, reason: collision with root package name */
    public final dk2.of f347272g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f347273h;

    /* renamed from: i, reason: collision with root package name */
    public final yl2.g1 f347274i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f347275m;

    /* renamed from: n, reason: collision with root package name */
    public final xq2.b f347276n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f347277o;

    /* renamed from: p, reason: collision with root package name */
    public long f347278p;

    /* renamed from: q, reason: collision with root package name */
    public long f347279q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f347280r;

    /* renamed from: s, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f347281s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f347282t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f347283u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 act) {
        super(act);
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(act, "act");
        this.f347269d = new java.util.ArrayList();
        java.lang.String str2 = "";
        this.f347273h = "";
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        this.f347274i = new yl2.g1((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m158354x19263085, 7, 0L, 4, null);
        this.f347275m = true;
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(xq2.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f347276n = (xq2.b) a17;
        this.f347278p = 3600000L;
        this.f347282t = jz5.h.b(new fr2.a(this));
        this.f347283u = jz5.h.b(new fr2.b(this));
        dk2.of a18 = dk2.of.f315392j.a(m80379x76847179().getIntent());
        this.f347272g = a18;
        if (a18 != null && (str = a18.f315394a) != null) {
            str2 = str;
        }
        this.f347273h = str2;
    }

    public static final void O6(fr2.p pVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        pVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayTogetherBottomBarUIC", "jumpLiveRoom: feedId=".concat(pm0.v.u(c19792x256d2725.m76784x5db1b11())));
        android.content.Intent intent = new android.content.Intent();
        android.app.Activity context = pVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        pVar.f347269d.add(java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
        r45.wk0 wk0Var = new r45.wk0();
        if (V6 == null || (str = V6.m75945x2fec8307(1)) == null) {
            str = "";
        }
        wk0Var.set(0, str);
        if (V6 == null || (str2 = V6.m75945x2fec8307(2)) == null) {
            str2 = "";
        }
        wk0Var.set(1, str2);
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        java.lang.String m76801x8010e5e4 = c19792x256d2725.m76801x8010e5e4();
        if (m76801x8010e5e4 == null) {
            m76801x8010e5e4 = "";
        }
        y74Var.set(2, m76801x8010e5e4);
        y74Var.set(1, java.lang.Integer.valueOf(V6 != null ? V6.m75939xb282bd08(5) : 0));
        wk0Var.set(6, y74Var);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("page_position", 2);
        intent.putExtra("key_chnl_extra", jSONObject.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0));
        ml2.x1 x1Var = ml2.x1.A;
        android.app.Activity context2 = pVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar2 == null || (str3 = java.lang.Integer.valueOf(nyVar2.f216913n).toString()) == null) {
            str3 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareReportUtils", "report21053 pos: 0 actionType: 19 commentscene: " + str3 + " chnlExtra: ");
        ae2.in inVar = ae2.in.f85221a;
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).qj(p17, 0L, x1Var, str3, "", ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.V0).mo141623x754a37bb()).r()).intValue() == 1 ? p17.getFeedObject().getFeedObject().m76829x97edf6c0() : "");
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(pVar.m158354x19263085(), intent, kz5.c0.d(c19792x256d2725), 0, wk0Var, null);
    }

    public static final void P6(fr2.p pVar, int i17) {
        pVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("entrance_type", 7);
        jSONObject.put("entrance_id", pVar.f347274i.f544543c);
        mm2.g1 g1Var = (mm2.g1) dk2.ef.f314905a.i(mm2.g1.class);
        if (g1Var != null) {
            java.lang.Integer num = g1Var.f410615w;
            java.lang.Long l17 = g1Var.f410616x;
            java.lang.String str = g1Var.f410617y;
            if (num != null && l17 != null && str != null) {
                long longValue = l17.longValue();
                jSONObject.put("strategy_id", num.intValue());
                jSONObject.put("guide_live_id", longValue);
                jSONObject.put("guide_finderusername", str);
            }
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 36L, jSONObject.toString(), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q6(fr2.p r21, boolean r22, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr2.p.Q6(fr2.p, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void R6(android.view.View view, android.view.View view2, boolean z17) {
        if (view == null) {
            return;
        }
        view.animate().cancel();
        jz5.g gVar = this.f347283u;
        jz5.g gVar2 = this.f347282t;
        int intValue = z17 ? ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() : ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue();
        int intValue2 = z17 ? ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue() : ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        if (z17 && view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC", "animBtnLayout", "(Landroid/view/View;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC", "animBtnLayout", "(Landroid/view/View;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        view.animate().withEndAction(new fr2.c(z17, view2)).setUpdateListener(new fr2.d(view, intValue, intValue2)).setDuration(300L).start();
    }

    public final void S6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayTogetherBottomBarUIC", "cancelPreload: preloadJob=" + this.f347281s);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f347281s;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f347281s = null;
    }

    public final void T6() {
        if (!this.f347277o || this.f347278p <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayTogetherBottomBarUIC", "checkPreload: disable preload, needPreload=" + this.f347277o + ", preloadIntervalMs=" + this.f347278p);
            return;
        }
        if (this.f347281s != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayTogetherBottomBarUIC", "checkPreload: has started loop");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayTogetherBottomBarUIC", "checkPreload: start check");
            this.f347281s = p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new fr2.e(this, null), 3, null);
        }
    }

    public final void U6(boolean z17) {
        if (this.f347275m == z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayTogetherBottomBarUIC", "onScrollToTop: oldIsTop=" + this.f347275m + ", isTop=" + z17);
        this.f347275m = z17;
        R6(mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.s1p), mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.s1q), z17);
        R6(mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.s0u), mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.s0v), z17);
    }

    public final void V6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayTogetherBottomBarUIC", "setNeedPreload: current=" + this.f347277o + ", newNeedPreload=" + z17);
        if (this.f347277o == z17) {
            return;
        }
        this.f347277o = z17;
        if (z17) {
            T6();
        } else {
            S6();
        }
    }

    public final void W6() {
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.s0h);
        if (mo144222x4ff8c0f0 != null && mo144222x4ff8c0f0.getVisibility() == 0) {
            return;
        }
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.s0h);
        if (mo144222x4ff8c0f02 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo144222x4ff8c0f02, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC", "showBottomBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC", "showBottomBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.s1p);
        if (mo144222x4ff8c0f03 != null) {
            ym5.a1.h(mo144222x4ff8c0f03, new fr2.k(this));
            mo144222x4ff8c0f03.setOnClickListener(new fr2.m(this));
        }
        android.view.View mo144222x4ff8c0f04 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.s0u);
        if (mo144222x4ff8c0f04 != null) {
            ae2.in inVar = ae2.in.f85221a;
            int i17 = (((java.lang.Number) ae2.in.G5.r()).intValue() == 1 || !com.p314xaae8f345.mm.ui.bk.A()) ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mo144222x4ff8c0f04, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC", "showBottomBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f04.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f04, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC", "showBottomBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ym5.a1.h(mo144222x4ff8c0f04, new fr2.n(this));
            mo144222x4ff8c0f04.setOnClickListener(new fr2.o(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.s1q);
        d92.f fVar = d92.f.f309003a;
        if (textView != null) {
            fVar.l(textView, 15.0f, true);
        }
        android.widget.TextView textView2 = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.s0v);
        if (textView2 != null) {
            fVar.l(textView2, 15.0f, true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        m158345xefc66565();
        java.util.ArrayList objectList = this.f347269d;
        xq2.b bVar = this.f347276n;
        bVar.getClass();
        java.lang.String themeId = this.f347273h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectList, "objectList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemePreloadCacheVM", "storeRandomEnterRoomReadObjects: themeId=" + themeId + ", size=" + objectList.size());
        bVar.f537575m.put(themeId, objectList);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        S6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        T6();
    }
}

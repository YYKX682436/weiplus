package id2;

/* loaded from: classes8.dex */
public final class s4 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f372329d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f372330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f372330e = "266";
    }

    public static final void O6(id2.s4 s4Var, int i17, yz5.l lVar) {
        s4Var.getClass();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        id2.k4 k4Var = new id2.k4(i17, lVar);
        hb2.h hVar = hb2.h.f361580e;
        hVar.getClass();
        bw5.br brVar = new bw5.br();
        brVar.f107330d = i17;
        boolean[] zArr = brVar.f107332f;
        zArr[1] = true;
        brVar.f107331e = linkedList;
        zArr[2] = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hb2.h.f361581f, "modifyPlayHistorySet op_type:" + brVar.f107330d);
        hb2.w0.m(hVar, brVar, k4Var, false, false, null, null, 60, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85302i0).mo141623x754a37bb()).r()).intValue() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRecentWatchSettingUIC", "Recent watch experiment is close");
            android.view.View findViewById = contentView.findViewById(com.p314xaae8f345.mm.R.id.f568076ux1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveRecentWatchSettingUIC", "onViewCreated", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveRecentWatchSettingUIC", "onViewCreated", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        boolean z17 = dk2.ef.C;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRecentWatchSettingUIC", "recentWatchEnable from backend: " + z17);
        cl0.g gVar = new cl0.g();
        gVar.h("switch_status", java.lang.String.valueOf(z17 ? 1 : 0));
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        java.lang.String str = this.f372330e;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.a(str, "", b52.b.b(), "person_page_more_recent_switch", gVar2);
        android.view.View findViewById2 = contentView.findViewById(com.p314xaae8f345.mm.R.id.f568079ux4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById2;
        this.f372329d = viewOnClickListenerC22631x1cc07cc8;
        viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_RECENT_WATCH_SETTING_BOOLEAN_SYNC, z17));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = this.f372329d;
        if (viewOnClickListenerC22631x1cc07cc82 != null) {
            viewOnClickListenerC22631x1cc07cc82.m81396xb3e0a10a(new id2.n4(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f372330e = "266";
    }
}

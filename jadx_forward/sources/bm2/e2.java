package bm2;

/* loaded from: classes3.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.b2 f103392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.c2 f103393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.f2 f103394f;

    public e2(bm2.b2 b2Var, bm2.c2 c2Var, bm2.f2 f2Var) {
        this.f103392d = b2Var;
        this.f103393e = c2Var;
        this.f103394f = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDefinitionAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("item click:");
        bm2.b2 b2Var = this.f103392d;
        sb6.append(b2Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDefinitionAdapter", sb6.toString());
        if (!b2Var.f103321d) {
            android.content.Context context = this.f103393e.f3639x46306858.getContext();
            boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            bm2.f2 f2Var = this.f103394f;
            f2Var.getClass();
            zl2.r4 r4Var = zl2.r4.f555483a;
            boolean z17 = r4Var.I0().getBoolean("LIVE_DEFINITION_GUIDE_PANEL_SHOW_KEY", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDefinitionAdapter", "isOnWifi:" + m40093xb9aa8b5f + ", level:" + b2Var + ".liveUrlInfo.level, isEnableShowGuide:" + z17);
            if (m40093xb9aa8b5f && z17 && b2Var.f103319b.f391130b == 5) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 2, 0, false, false);
                z2Var.u(ym5.x.a(context, 314.0f));
                z2Var.y(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                z2Var.z(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abu));
                z2Var.x(1);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332(context);
                c22632xdab56332.setText(com.p314xaae8f345.mm.R.C30867xcad56011.niq);
                c22632xdab56332.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                com.p314xaae8f345.mm.ui.fk.b(c22632xdab56332);
                c22632xdab56332.setTextSize(17.0f);
                z2Var.j(c22632xdab56332);
                z2Var.F = new bm2.d2(z2Var, f2Var, b2Var);
                z2Var.C();
                f2Var.getClass();
                r4Var.I0().putBoolean("LIVE_DEFINITION_GUIDE_PANEL_SHOW_KEY", false);
            } else {
                yz5.l lVar = f2Var.f103416e;
                if (lVar != null) {
                    lVar.mo146xb9724478(b2Var);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDefinitionAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package bm2;

/* loaded from: classes3.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.b2 f21859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.c2 f21860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.f2 f21861f;

    public e2(bm2.b2 b2Var, bm2.c2 c2Var, bm2.f2 f2Var) {
        this.f21859d = b2Var;
        this.f21860e = c2Var;
        this.f21861f = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDefinitionAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("item click:");
        bm2.b2 b2Var = this.f21859d;
        sb6.append(b2Var);
        com.tencent.mars.xlog.Log.i("FinderLiveDefinitionAdapter", sb6.toString());
        if (!b2Var.f21788d) {
            android.content.Context context = this.f21860e.itemView.getContext();
            boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a);
            bm2.f2 f2Var = this.f21861f;
            f2Var.getClass();
            zl2.r4 r4Var = zl2.r4.f473950a;
            boolean z17 = r4Var.I0().getBoolean("LIVE_DEFINITION_GUIDE_PANEL_SHOW_KEY", true);
            com.tencent.mars.xlog.Log.i("FinderLiveDefinitionAdapter", "isOnWifi:" + isWifi + ", level:" + b2Var + ".liveUrlInfo.level, isEnableShowGuide:" + z17);
            if (isWifi && z17 && b2Var.f21786b.f309597b == 5) {
                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 0, false, false);
                z2Var.u(ym5.x.a(context, 314.0f));
                z2Var.y(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490454vi));
                z2Var.z(context.getColor(com.tencent.mm.R.color.abu));
                z2Var.x(1);
                com.tencent.mm.ui.widget.MMTextView mMTextView = new com.tencent.mm.ui.widget.MMTextView(context);
                mMTextView.setText(com.tencent.mm.R.string.niq);
                mMTextView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
                com.tencent.mm.ui.fk.b(mMTextView);
                mMTextView.setTextSize(17.0f);
                z2Var.j(mMTextView);
                z2Var.F = new bm2.d2(z2Var, f2Var, b2Var);
                z2Var.C();
                f2Var.getClass();
                r4Var.I0().putBoolean("LIVE_DEFINITION_GUIDE_PANEL_SHOW_KEY", false);
            } else {
                yz5.l lVar = f2Var.f21883e;
                if (lVar != null) {
                    lVar.invoke(b2Var);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDefinitionAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

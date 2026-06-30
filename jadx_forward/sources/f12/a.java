package f12;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13252x1a51290c f340100d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13252x1a51290c activityC13252x1a51290c) {
        this.f340100d = activityC13252x1a51290c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/eggspring/ui/SpringCardActivity$boundView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13252x1a51290c activityC13252x1a51290c = this.f340100d;
        sb6.append(activityC13252x1a51290c.f178967g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpringCardActivity", sb6.toString());
        if (activityC13252x1a51290c.f178967g) {
            yj0.a.h(this, "com/tencent/mm/plugin/eggspring/ui/SpringCardActivity$boundView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        activityC13252x1a51290c.f178967g = true;
        pm0.v.C(activityC13252x1a51290c.f178969i);
        pm0.v.U(1000L, activityC13252x1a51290c.f178969i);
        int color = activityC13252x1a51290c.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6x);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("customize_status_bar_color", color);
        intent.putExtra("webview_bg_color_rsID", com.p314xaae8f345.mm.R.C30859x5a72f63.a6x);
        intent.putExtra("from_shortcut", true);
        intent.putExtra("disable_minimize", true);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        j45.l.n(activityC13252x1a51290c, "webview", ".ui.tools.WebViewUI", intent, 1001);
        activityC13252x1a51290c.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        yj0.a.h(this, "com/tencent/mm/plugin/eggspring/ui/SpringCardActivity$boundView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

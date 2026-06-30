package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public final class pk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b f242980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f242981e;

    public pk(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b activityC17451x47a8746b, android.widget.TextView textView) {
        this.f242980d = activityC17451x47a8746b;
        this.f242981e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b.f242130g;
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f242980d.f242131d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        intent.putExtra("rawUrl", (java.lang.String) mo141623x754a37bb);
        intent.putExtra("show_feedback", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", false);
        j45.l.j(this.f242981e.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967 c6991x7b759967 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6991x7b759967();
        c6991x7b759967.f143055d = 151L;
        c6991x7b759967.k();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

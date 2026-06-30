package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class ok implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b f242930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f242931b;

    public ok(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b activityC17451x47a8746b, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f242930a = activityC17451x47a8746b;
        this.f242931b = c0Var;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$onCreate$2", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        int scrollY = view.getScrollY();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b activityC17451x47a8746b = this.f242930a;
        int b17 = i65.a.b(activityC17451x47a8746b.mo55332x76847179(), 80);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f242931b;
        if (scrollY > b17) {
            if (c0Var.f391645d) {
                activityC17451x47a8746b.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iwa);
                activityC17451x47a8746b.mo64405x4dab7448(activityC17451x47a8746b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
                activityC17451x47a8746b.m78605xc85f0ffa();
                c0Var.f391645d = false;
            }
        } else if (!c0Var.f391645d) {
            activityC17451x47a8746b.mo54450xbf7c1df6("");
            activityC17451x47a8746b.mo64405x4dab7448(activityC17451x47a8746b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            activityC17451x47a8746b.m78554x41d7d42(activityC17451x47a8746b.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            activityC17451x47a8746b.m78605xc85f0ffa();
            c0Var.f391645d = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$onCreate$2", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}

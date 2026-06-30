package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes5.dex */
public class a4 implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 f254461a;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9) {
        this.f254461a = activityC18580x3cc47ed9;
    }

    @Override // android.view.View.OnScrollChangeListener
    public void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        int scrollY = view.getScrollY();
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9 = this.f254461a;
        if (scrollY > i65.a.b(activityC18580x3cc47ed9.mo55332x76847179(), 144)) {
            activityC18580x3cc47ed9.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.izu);
            activityC18580x3cc47ed9.mo64405x4dab7448(activityC18580x3cc47ed9.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            activityC18580x3cc47ed9.m78605xc85f0ffa();
        } else {
            activityC18580x3cc47ed9.mo54450xbf7c1df6("");
            activityC18580x3cc47ed9.mo64405x4dab7448(activityC18580x3cc47ed9.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            activityC18580x3cc47ed9.m78554x41d7d42(activityC18580x3cc47ed9.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            activityC18580x3cc47ed9.m78605xc85f0ffa();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}

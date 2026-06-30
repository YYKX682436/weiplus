package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes5.dex */
public class y2 implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a f156183a;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a) {
        this.f156183a = activityC11497x3bc191a;
    }

    @Override // android.view.View.OnScrollChangeListener
    public void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a = this.f156183a;
        if (i18 == 0) {
            activityC11497x3bc191a.mo78530x8b45058f();
        } else {
            activityC11497x3bc191a.m78599xdf056fb4();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletSelectAddrUI$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}

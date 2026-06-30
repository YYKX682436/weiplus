package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class j6 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f255537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 f255538e;

    public j6(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9) {
        this.f255537d = viewGroup;
        this.f255538e = activityC18635xb8188ef9;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View mo50154xfb86a31b;
        android.view.View mo50154xfb86a31b2;
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.ViewGroup viewGroup = this.f255537d;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = this.f255538e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l5 l5Var = activityC18635xb8188ef9.f255089x;
        if (l5Var != null && (mo50154xfb86a31b = l5Var.mo50154xfb86a31b()) != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.a(activityC18635xb8188ef9);
            i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
            int k17 = ((((i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) - com.p314xaae8f345.mm.ui.bl.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) - activityC18635xb8188ef9.e7().getHeight()) - i65.a.a(mo50154xfb86a31b.getContext(), 248.0f)) - i65.a.a(mo50154xfb86a31b.getContext(), 32.0f)) - com.p314xaae8f345.mm.ui.bl.c(mo50154xfb86a31b.getContext());
            if (k17 <= 0) {
                k17 = ym5.x.a(mo50154xfb86a31b.getContext(), 300.0f);
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, k17);
            layoutParams.addRule(9);
            layoutParams.addRule(12);
            mo50154xfb86a31b.setLayoutParams(layoutParams);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l5 l5Var2 = activityC18635xb8188ef9.f255089x;
            if (l5Var2 != null && (mo50154xfb86a31b2 = l5Var2.mo50154xfb86a31b()) != null) {
                mo50154xfb86a31b2.requestLayout();
            }
            mo50154xfb86a31b.setOutlineProvider(new bk4.e2(true, false, i65.a.b(mo50154xfb86a31b.getContext(), 12)));
            mo50154xfb86a31b.setClipToOutline(true);
            viewGroup.addView(mo50154xfb86a31b);
            mo50154xfb86a31b.setTranslationY(k17);
        }
        return true;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class p1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f207343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f207345f;

    public p1(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160, int i17) {
        this.f207343d = view;
        this.f207344e = activityC14945x8c20f160;
        this.f207345f = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f207343d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160 = this.f207344e;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(activityC14945x8c20f160.mo55332x76847179()) + com.p314xaae8f345.mm.ui.bl.a(activityC14945x8c20f160.mo55332x76847179()) + this.f207345f;
        android.view.ViewGroup.LayoutParams layoutParams = activityC14945x8c20f160.mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.h0r).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin = h17;
        android.view.ViewGroup.LayoutParams layoutParams2 = activityC14945x8c20f160.mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.f568710ns4).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams2).topMargin = h17;
        return true;
    }
}

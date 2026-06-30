package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class h9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f171288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewParent f171289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j9 f171290f;

    public h9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j9 j9Var, int i17, android.view.ViewParent viewParent) {
        this.f171290f = j9Var;
        this.f171288d = i17;
        this.f171289e = viewParent;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        int i17 = this.f171288d;
        int argb = android.graphics.Color.argb(intValue, android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j9 j9Var = this.f171290f;
        j9Var.f171342d.C.setBackgroundColor(argb);
        j9Var.f171342d.B(argb, !r2.Q(), true);
        if (intValue == 0) {
            j9Var.f171342d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g9(this));
        }
    }
}

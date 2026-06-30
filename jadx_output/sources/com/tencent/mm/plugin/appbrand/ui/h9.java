package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class h9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewParent f89756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.j9 f89757f;

    public h9(com.tencent.mm.plugin.appbrand.ui.j9 j9Var, int i17, android.view.ViewParent viewParent) {
        this.f89757f = j9Var;
        this.f89755d = i17;
        this.f89756e = viewParent;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        int i17 = this.f89755d;
        int argb = android.graphics.Color.argb(intValue, android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17));
        com.tencent.mm.plugin.appbrand.ui.j9 j9Var = this.f89757f;
        j9Var.f89809d.C.setBackgroundColor(argb);
        j9Var.f89809d.B(argb, !r2.Q(), true);
        if (intValue == 0) {
            j9Var.f89809d.post(new com.tencent.mm.plugin.appbrand.ui.g9(this));
        }
    }
}

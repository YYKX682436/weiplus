package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class i9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.j9 f89781e;

    public i9(com.tencent.mm.plugin.appbrand.ui.j9 j9Var, int i17) {
        this.f89781e = j9Var;
        this.f89780d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int bgColor;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.appbrand.ui.j9 j9Var = this.f89781e;
        android.widget.TextView textView = j9Var.f89809d.A;
        int round = java.lang.Math.round(255.0f * floatValue);
        int i17 = this.f89780d;
        textView.setTextColor(android.graphics.Color.argb(round, android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17)));
        j9Var.f89809d.B.setAlpha(floatValue);
        j9Var.f89809d.f89630z.setAlpha(floatValue);
        j9Var.f89809d.H.setAlpha(floatValue);
        com.tencent.mm.plugin.appbrand.ui.c9 c9Var = j9Var.f89809d;
        bgColor = c9Var.getBgColor();
        c9Var.B(bgColor, !j9Var.f89809d.Q(), true);
    }
}

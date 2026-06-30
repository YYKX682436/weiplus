package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class i9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f171313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j9 f171314e;

    public i9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j9 j9Var, int i17) {
        this.f171314e = j9Var;
        this.f171313d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int m52961x319751e8;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j9 j9Var = this.f171314e;
        android.widget.TextView textView = j9Var.f171342d.A;
        int round = java.lang.Math.round(255.0f * floatValue);
        int i17 = this.f171313d;
        textView.setTextColor(android.graphics.Color.argb(round, android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17)));
        j9Var.f171342d.B.setAlpha(floatValue);
        j9Var.f171342d.f171163z.setAlpha(floatValue);
        j9Var.f171342d.H.setAlpha(floatValue);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9 c9Var = j9Var.f171342d;
        m52961x319751e8 = c9Var.m52961x319751e8();
        c9Var.B(m52961x319751e8, !j9Var.f171342d.Q(), true);
    }
}

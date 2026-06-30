package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class f4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wd f86607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f86608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f86609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86610g;

    public f4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.w2 w2Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var2) {
        this.f86610g = i3Var;
        this.f86607d = wdVar;
        this.f86608e = w2Var;
        this.f86609f = w2Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f86610g.m(this.f86607d, this.f86608e, this.f86609f, (int) (valueAnimator.getAnimatedFraction() * 100.0f));
    }
}

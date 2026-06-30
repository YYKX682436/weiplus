package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class d4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f86519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f86520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86521c;

    public d4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.Runnable runnable, com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        this.f86521c = i3Var;
        this.f86519a = runnable;
        this.f86520b = w2Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        if (this.f86519a != null) {
            com.tencent.mm.plugin.appbrand.page.c4 c4Var = new com.tencent.mm.plugin.appbrand.page.c4(this);
            if (animation.getStartTime() == Long.MIN_VALUE) {
                c4Var.run();
            } else if (!this.f86521c.f86701d) {
                this.f86521c.post(c4Var);
            }
        } else {
            com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f86520b;
            int i17 = com.tencent.mm.plugin.appbrand.page.i3.f86700J;
            w2Var.setTag(com.tencent.mm.R.id.f483175yo, null);
        }
        this.f86520b.setIsAnimating(false);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}

package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class b4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f86425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f86426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86427f;

    public b4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var, java.lang.Runnable runnable) {
        this.f86427f = i3Var;
        this.f86425d = w2Var;
        this.f86426e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f86425d;
        int i17 = com.tencent.mm.plugin.appbrand.page.i3.f86700J;
        w2Var.setTag(com.tencent.mm.R.id.f483175yo, null);
        java.lang.Runnable runnable = this.f86426e;
        if (runnable != null) {
            this.f86427f.removeCallbacks(runnable);
            if (!this.f86427f.f86701d) {
                this.f86426e.run();
            }
        }
        this.f86425d.setIsAnimating(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        int i17 = com.tencent.mm.plugin.appbrand.page.i3.f86700J;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f86425d;
        w2Var.setTag(com.tencent.mm.R.id.f483175yo, null);
        if (this.f86426e != null) {
            this.f86427f.post(new com.tencent.mm.plugin.appbrand.page.a4(this));
        }
        w2Var.setIsAnimating(false);
    }
}

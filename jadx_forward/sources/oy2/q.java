package oy2;

/* loaded from: classes8.dex */
public final class q implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca f431531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f431532e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca abstractC15503x81b4b9ca, java.lang.Runnable runnable) {
        this.f431531d = abstractC15503x81b4b9ca;
        this.f431532e = runnable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationCancel ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca abstractC15503x81b4b9ca = this.f431531d;
        sb6.append(abstractC15503x81b4b9ca.getTranslationY());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WebViewFrameLayout", sb6.toString());
        abstractC15503x81b4b9ca.m63419x9e6c4d1c(false);
        abstractC15503x81b4b9ca.m63426xc2c0d5fd(0.0f);
        abstractC15503x81b4b9ca.getClass();
        java.lang.Runnable runnable = this.f431532e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationEnd : ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca abstractC15503x81b4b9ca = this.f431531d;
        sb6.append(abstractC15503x81b4b9ca.getTranslationY());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WebViewFrameLayout", sb6.toString());
        abstractC15503x81b4b9ca.m63419x9e6c4d1c(false);
        abstractC15503x81b4b9ca.m63426xc2c0d5fd(0.0f);
        abstractC15503x81b4b9ca.e();
        java.lang.Runnable runnable = this.f431532e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAnimationStart ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca abstractC15503x81b4b9ca = this.f431531d;
        sb6.append(abstractC15503x81b4b9ca.getTranslationY());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WebViewFrameLayout", sb6.toString());
        abstractC15503x81b4b9ca.m63419x9e6c4d1c(true);
        abstractC15503x81b4b9ca.m63426xc2c0d5fd(0.0f);
        abstractC15503x81b4b9ca.f();
    }
}

package hf2;

/* loaded from: classes3.dex */
public final class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.x f362557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f362558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f362559f;

    public c(hf2.x xVar, float f17, float f18) {
        this.f362557d = xVar;
        this.f362558e = f17;
        this.f362559f = f18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362557d.f362714m, "modifyPluginAlpha fromAlpha:" + this.f362558e + " toAlpha:" + this.f362559f + " onAnimationEnd");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362557d.f362714m, "modifyPluginAlpha fromAlpha:" + this.f362558e + " toAlpha:" + this.f362559f + " onAnimationStart");
    }
}

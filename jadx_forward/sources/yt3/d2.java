package yt3;

/* loaded from: classes3.dex */
public final class d2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.f2 f546936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f546937b;

    public d2(yt3.f2 f2Var, int i17) {
        this.f546936a = f2Var;
        this.f546937b = i17;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f546936a.f546974d.setVisibility(this.f546937b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}

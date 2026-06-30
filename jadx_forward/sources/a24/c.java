package a24;

/* loaded from: classes3.dex */
public final class c implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f82406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.AlphaAnimation f82407b;

    public c(android.view.View view, android.view.animation.AlphaAnimation alphaAnimation) {
        this.f82406a = view;
        this.f82407b = alphaAnimation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new a24.b(this.f82406a, this.f82407b), 600L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
    }
}

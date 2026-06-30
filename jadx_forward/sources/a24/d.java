package a24;

/* loaded from: classes3.dex */
public final class d implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow f82408a;

    public d(android.widget.PopupWindow popupWindow) {
        this.f82408a = popupWindow;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        this.f82408a.dismiss();
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

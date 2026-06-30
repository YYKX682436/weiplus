package a24;

/* loaded from: classes3.dex */
public final class d implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow f875a;

    public d(android.widget.PopupWindow popupWindow) {
        this.f875a = popupWindow;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        this.f875a.dismiss();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
    }
}

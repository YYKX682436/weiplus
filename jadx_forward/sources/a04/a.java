package a04;

/* loaded from: classes15.dex */
public final class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2042xac8f1cfd.C17322xb99fb086 f82004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f82005e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2042xac8f1cfd.C17322xb99fb086 c17322xb99fb086, android.animation.Animator.AnimatorListener animatorListener) {
        this.f82004d = c17322xb99fb086;
        this.f82005e = animatorListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2042xac8f1cfd.C17322xb99fb086 c17322xb99fb086 = this.f82004d;
        android.widget.TextView textView = c17322xb99fb086.f241054f;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelButton");
            throw null;
        }
        textView.setAlpha(0.0f);
        android.widget.TextView textView2 = c17322xb99fb086.f241054f;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelButton");
            throw null;
        }
        e04.i3.b(textView2, true, null);
        android.animation.Animator.AnimatorListener animatorListener = this.f82005e;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animation);
        }
    }
}

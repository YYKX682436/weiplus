package df2;

/* loaded from: classes3.dex */
public final class b8 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f311320d;

    public b8(df2.s8 s8Var) {
        this.f311320d = s8Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        df2.s8 s8Var = this.f311320d;
        android.widget.TextView textView = s8Var.f312838q;
        java.lang.CharSequence text = textView != null ? textView.getText() : null;
        android.widget.TextView textView2 = s8Var.f312835p;
        if (textView2 != null) {
            textView2.setText(text);
        }
        android.widget.ScrollView scrollView = s8Var.f312839r;
        if (scrollView == null) {
            return;
        }
        scrollView.setScrollY(0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}

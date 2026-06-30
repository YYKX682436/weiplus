package df5;

/* loaded from: classes15.dex */
public final class s1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.u1 f313738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f313740f;

    public s1(df5.u1 u1Var, int i17, int i18) {
        this.f313738d = u1Var;
        this.f313739e = i17;
        this.f313740f = i18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        df5.u1 u1Var = this.f313738d;
        if (u1Var.f313757e == animation) {
            u1Var.f313757e = null;
        }
        if (this.f313739e != u1Var.f313755c) {
            return;
        }
        int i17 = this.f313740f;
        u1Var.f313760h = i17;
        android.widget.TextView textView = u1Var.f313758f;
        if (textView != null) {
            java.lang.CharSequence text = textView.getText();
            android.text.Spannable spannable = text instanceof android.text.Spannable ? (android.text.Spannable) text : null;
            if (spannable != null) {
                int i18 = 0;
                while (i18 < 3) {
                    df5.q1 q1Var = u1Var.f313761i[i18];
                    q1Var.f313728d = i18 < i17 ? 255 : 0;
                    u1Var.a(spannable, q1Var);
                    i18++;
                }
            }
        }
        java.lang.Runnable runnable = u1Var.f313756d;
        android.os.Handler handler = u1Var.f313753a;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        df5.t1 t1Var = new df5.t1(u1Var, u1Var.f313755c);
        u1Var.f313756d = t1Var;
        handler.postDelayed(t1Var, 150L);
    }
}

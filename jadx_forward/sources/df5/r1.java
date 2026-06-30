package df5;

/* loaded from: classes15.dex */
public final class r1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f313731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df5.u1 f313732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f313733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f313734g;

    public r1(int i17, df5.u1 u1Var, int i18, int i19) {
        this.f313731d = i17;
        this.f313732e = u1Var;
        this.f313733f = i18;
        this.f313734g = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        df5.u1 u1Var = this.f313732e;
        if (this.f313731d != u1Var.f313755c) {
            anim.cancel();
            return;
        }
        java.lang.Object animatedValue = anim.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.widget.TextView textView = u1Var.f313758f;
        if (textView == null) {
            return;
        }
        java.lang.CharSequence text = textView.getText();
        android.text.Spannable spannable = text instanceof android.text.Spannable ? (android.text.Spannable) text : null;
        if (spannable == null) {
            return;
        }
        int i17 = this.f313733f;
        int i18 = this.f313734g;
        df5.q1[] q1VarArr = u1Var.f313761i;
        if (i18 <= i17) {
            int f17 = e06.p.f((int) ((1.0f - floatValue) * 255), 0, 255);
            for (int i19 = 0; i19 < 3; i19++) {
                df5.q1 q1Var = q1VarArr[i19];
                q1Var.f313728d = f17;
                u1Var.a(spannable, q1Var);
            }
            return;
        }
        int f18 = e06.p.f((int) (floatValue * 255), 0, 255);
        int i27 = 0;
        while (i27 < 3) {
            df5.q1 q1Var2 = q1VarArr[i27];
            q1Var2.f313728d = i27 < i17 ? 255 : i27 == i17 ? f18 : 0;
            u1Var.a(spannable, q1Var2);
            i27++;
        }
    }
}

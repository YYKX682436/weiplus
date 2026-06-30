package df2;

/* loaded from: classes3.dex */
public final class o7 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f312464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f312465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f312466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f312467g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f312468h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f312469i;

    public o7(df2.s8 s8Var, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, int i17, long j17, android.widget.TextView textView) {
        this.f312464d = s8Var;
        this.f312465e = z17;
        this.f312466f = f0Var;
        this.f312467g = i17;
        this.f312468h = j17;
        this.f312469i = textView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f312469i.setScrollX(0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        df2.s8 s8Var = this.f312464d;
        android.animation.ObjectAnimator objectAnimator = s8Var.f312836p0;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        android.animation.ObjectAnimator objectAnimator2 = s8Var.f312836p0;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        s8Var.f312836p0 = null;
        if (this.f312465e) {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f312466f;
            int i17 = f0Var.f391649d;
            int i18 = this.f312467g;
            float a76 = ((i17 + i18) / (((i17 * 2) - df2.s8.a7(s8Var)) + i18)) * ((float) this.f312468h);
            int[] iArr = new int[2];
            iArr[0] = f0Var.f391649d - df2.s8.a7(s8Var);
            int a77 = ((f0Var.f391649d * 2) - df2.s8.a7(s8Var)) + i18;
            iArr[1] = a77 >= 0 ? a77 : 0;
            android.widget.TextView textView = this.f312469i;
            s8Var.f312836p0 = android.animation.ObjectAnimator.ofInt(textView, "scrollX", iArr);
            android.animation.ObjectAnimator objectAnimator3 = s8Var.f312836p0;
            if (objectAnimator3 != null) {
                objectAnimator3.setDuration(a76);
            }
            android.animation.ObjectAnimator objectAnimator4 = s8Var.f312836p0;
            if (objectAnimator4 != null) {
                objectAnimator4.setRepeatCount(-1);
            }
            android.animation.ObjectAnimator objectAnimator5 = s8Var.f312836p0;
            if (objectAnimator5 != null) {
                objectAnimator5.setInterpolator(new android.view.animation.LinearInterpolator());
            }
            android.animation.ObjectAnimator objectAnimator6 = s8Var.f312836p0;
            if (objectAnimator6 != null) {
                objectAnimator6.addListener(new df2.n7(textView));
            }
            android.animation.ObjectAnimator objectAnimator7 = s8Var.f312836p0;
            if (objectAnimator7 != null) {
                objectAnimator7.start();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }
}

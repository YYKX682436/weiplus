package rf2;

/* loaded from: classes10.dex */
public final class j implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.q f476306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f476307e;

    public j(rf2.q qVar, v65.n nVar) {
        this.f476306d = qVar;
        this.f476307e = nVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f476307e.a(jz5.f0.f384359a);
        rf2.q qVar = this.f476306d;
        qVar.f476386d.post(new rf2.i(qVar));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        rf2.q qVar = this.f476306d;
        android.view.View view = qVar.f476387e.f312214r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultWinnerPage$doFreeGiftAnim$2$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultWinnerPage$doFreeGiftAnim$2$1$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = qVar.B;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
    }
}

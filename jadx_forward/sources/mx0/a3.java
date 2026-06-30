package mx0;

/* loaded from: classes5.dex */
public final class a3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f413355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f413356e;

    public a3(android.animation.AnimatorListenerAdapter animatorListenerAdapter, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f413355d = animatorListenerAdapter;
        this.f413356e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordButton", "playReverseAni no record >> end");
        this.f413355d.onAnimationEnd(animation);
        this.f413356e.setListener(null);
    }
}

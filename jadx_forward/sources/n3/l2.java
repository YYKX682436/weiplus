package n3;

/* loaded from: classes14.dex */
public class l2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n3.s2 f415898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f415899e;

    public l2(n3.n2 n2Var, n3.s2 s2Var, android.view.View view) {
        this.f415898d = s2Var;
        this.f415899e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        n3.s2 s2Var = this.f415898d;
        s2Var.f415939a.d(1.0f);
        n3.o2.e(this.f415899e, s2Var);
    }
}

package z26;

/* loaded from: classes15.dex */
public class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab f551360d;

    public a(me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab c29141x858f5ab) {
        this.f551360d = c29141x858f5ab;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f551360d.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

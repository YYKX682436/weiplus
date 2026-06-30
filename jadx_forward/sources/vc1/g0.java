package vc1;

/* loaded from: classes13.dex */
public class g0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.j2 f516500d;

    public g0(vc1.p1 p1Var, vc1.j2 j2Var) {
        this.f516500d = j2Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        vc1.j2 j2Var = this.f516500d;
        if (j2Var != null) {
            j2Var.a(true);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

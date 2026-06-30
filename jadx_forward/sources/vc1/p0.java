package vc1;

/* loaded from: classes13.dex */
public class p0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516591e;

    public p0(vc1.p1 p1Var, java.lang.String str) {
        this.f516591e = p1Var;
        this.f516590d = str;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        synchronized (this.f516591e.f516627r) {
            this.f516591e.f516627r.remove(this.f516590d);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        synchronized (this.f516591e.f516627r) {
            this.f516591e.f516627r.remove(this.f516590d);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

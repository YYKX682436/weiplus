package xt2;

/* loaded from: classes10.dex */
public final class s1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.u1 f538536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f538537e;

    public s1(xt2.u1 u1Var, v65.n nVar) {
        this.f538536d = u1Var;
        this.f538537e = nVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View childAt;
        xt2.u1 u1Var = this.f538536d;
        android.view.ViewGroup viewGroup = u1Var.f538578i;
        if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
            android.view.ViewGroup viewGroup2 = u1Var.f538578i;
            if (viewGroup2 != null) {
                viewGroup2.removeView(childAt);
            }
            android.view.ViewGroup viewGroup3 = u1Var.f538578i;
            if (viewGroup3 != null) {
                viewGroup3.addView(childAt);
            }
        }
        android.widget.ScrollView scrollView = u1Var.f538574e;
        if (scrollView != null) {
            scrollView.setScrollY(0);
        }
        this.f538537e.a(jz5.f0.f384359a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

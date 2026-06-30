package ac2;

/* loaded from: classes2.dex */
public final class c extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.g f3014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f3015e;

    public c(ac2.g gVar, androidx.recyclerview.widget.k3 k3Var) {
        this.f3014d = gVar;
        this.f3015e = k3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f3014d.getClass();
        androidx.recyclerview.widget.k3 k3Var = this.f3015e;
        in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
        if (s0Var != null) {
            sc2.m3.A.d(s0Var, "pullDownOtherViews");
        }
    }
}

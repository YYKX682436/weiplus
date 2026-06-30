package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class w0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f93789t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f93790u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 f93791v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18, float f17, float f18, float f19, float f27, int i19, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2) {
        super(k3Var, i17, i18, f17, f18, f19, f27);
        this.f93791v = g1Var;
        this.f93789t = i19;
        this.f93790u = k3Var2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.d1, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        if (this.f93529q) {
            return;
        }
        int i17 = this.f93789t;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f93790u;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var = this.f93791v;
        if (i17 <= 0) {
            g1Var.f93574s.mo8113xb4407692(g1Var.f93579x, k3Var);
        } else {
            ((java.util.ArrayList) g1Var.f93562d).add(k3Var.f3639x46306858);
            this.f93526n = true;
            if (i17 > 0) {
                g1Var.f93579x.post(new p012xc85e97e9.p103xe821e364.p104xd1075a44.x0(g1Var, this, i17));
            }
        }
        android.view.View view = g1Var.C;
        android.view.View view2 = k3Var.f3639x46306858;
        if (view == view2) {
            g1Var.m(view2);
        }
    }
}

package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class w0 extends androidx.recyclerview.widget.d1 {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12256t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f12257u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.g1 f12258v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(androidx.recyclerview.widget.g1 g1Var, androidx.recyclerview.widget.k3 k3Var, int i17, int i18, float f17, float f18, float f19, float f27, int i19, androidx.recyclerview.widget.k3 k3Var2) {
        super(k3Var, i17, i18, f17, f18, f19, f27);
        this.f12258v = g1Var;
        this.f12256t = i19;
        this.f12257u = k3Var2;
    }

    @Override // androidx.recyclerview.widget.d1, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        if (this.f11996q) {
            return;
        }
        int i17 = this.f12256t;
        androidx.recyclerview.widget.k3 k3Var = this.f12257u;
        androidx.recyclerview.widget.g1 g1Var = this.f12258v;
        if (i17 <= 0) {
            g1Var.f12041s.clearView(g1Var.f12046x, k3Var);
        } else {
            ((java.util.ArrayList) g1Var.f12029d).add(k3Var.itemView);
            this.f11993n = true;
            if (i17 > 0) {
                g1Var.f12046x.post(new androidx.recyclerview.widget.x0(g1Var, this, i17));
            }
        }
        android.view.View view = g1Var.C;
        android.view.View view2 = k3Var.itemView;
        if (view == view2) {
            g1Var.m(view2);
        }
    }
}

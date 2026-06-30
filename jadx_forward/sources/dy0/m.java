package dy0;

/* loaded from: classes10.dex */
public final class m extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final int f326091n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, int i17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f326091n = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void e(android.view.View targetView, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 action) {
        int e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f93584c;
        if (layoutManager == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 v1Var = layoutManager.getF204840r() ? new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(layoutManager) : layoutManager.getF180019n() ? new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(layoutManager) : null;
        if (v1Var == null) {
            e17 = 0;
        } else {
            e17 = (v1Var.e(targetView) + (v1Var.c(targetView) / 2)) - (layoutManager.m8009xf2b87f0() ? v1Var.k() + (v1Var.l() / 2) : v1Var.f() / 2);
        }
        int i17 = this.f326091n;
        int max = i17 <= 0 ? 1 : java.lang.Math.max(k(e17), i17);
        boolean f204840r = layoutManager.getF204840r();
        android.view.animation.DecelerateInterpolator decelerateInterpolator = this.f93709i;
        if (f204840r) {
            action.b(0, e17, max, decelerateInterpolator);
        } else {
            action.b(e17, 0, max, decelerateInterpolator);
        }
    }
}

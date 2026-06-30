package mx0;

/* loaded from: classes10.dex */
public final class z9 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ mx0.aa f414011n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(mx0.aa aaVar, android.content.Context context) {
        super(context);
        this.f414011n = aaVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void e(android.view.View targetView, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 action) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager;
        int[] c17;
        java.lang.Integer S;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        mx0.aa aaVar = this.f414011n;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = aaVar.f413372f;
        if (c1163xf1deaba4 == null || (layoutManager = c1163xf1deaba4.getLayoutManager()) == null || (S = kz5.z.S((c17 = aaVar.c(layoutManager, targetView)), 0)) == null) {
            return;
        }
        int intValue = S.intValue();
        java.lang.Integer S2 = kz5.z.S(c17, 1);
        if (S2 != null) {
            int intValue2 = S2.intValue();
            int abs = java.lang.Math.abs(intValue);
            int abs2 = java.lang.Math.abs(intValue2);
            if (abs < abs2) {
                abs = abs2;
            }
            int k17 = k(abs);
            android.view.animation.DecelerateInterpolator decelerateInterpolator = this.f93709i;
            if (k17 > 0) {
                action.b(intValue, intValue2, k17, decelerateInterpolator);
            } else {
                action.b(intValue, intValue2, 1, decelerateInterpolator);
            }
        }
    }
}

package e32;

/* loaded from: classes10.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e32.e f328635n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e32.e eVar, android.content.Context context) {
        super(context);
        this.f328635n = eVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void e(android.view.View targetView, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        e32.e eVar = this.f328635n;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = eVar.f328636f;
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutManager() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layoutManager);
            int[] c17 = eVar.c(layoutManager, targetView);
            int i17 = c17[0];
            int i18 = c17[1];
            int k17 = k(java.lang.Math.max(java.lang.Math.abs(i17), java.lang.Math.abs(i18)));
            android.view.animation.DecelerateInterpolator decelerateInterpolator = this.f93709i;
            if (k17 > 0) {
                action.b(i17, i18, k17, decelerateInterpolator);
            } else {
                action.b(i17, i18, 1, decelerateInterpolator);
            }
        }
    }
}

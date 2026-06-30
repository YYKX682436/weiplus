package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes10.dex */
public class q3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.r3 f93735n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(p012xc85e97e9.p103xe821e364.p104xd1075a44.r3 r3Var, android.content.Context context) {
        super(context);
        this.f93735n = r3Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void e(android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 e3Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.r3 r3Var = this.f93735n;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = r3Var.f93745a;
        if (c1163xf1deaba4 == null) {
            return;
        }
        int[] c17 = r3Var.c(c1163xf1deaba4.getLayoutManager(), view);
        int i17 = c17[0];
        int i18 = c17[1];
        int k17 = k(java.lang.Math.max(java.lang.Math.abs(i17), java.lang.Math.abs(i18)));
        if (k17 > 0) {
            e3Var.b(i17, i18, k17, this.f93709i);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}

package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes10.dex */
public class x1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 f93804n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 y1Var, android.content.Context context) {
        super(context);
        this.f93804n = y1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void e(android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 e3Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 y1Var = this.f93804n;
        int[] c17 = y1Var.c(y1Var.f93745a.getLayoutManager(), view);
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

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int l(int i17) {
        return java.lang.Math.min(100, super.l(i17));
    }
}

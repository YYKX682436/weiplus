package hn4;

/* loaded from: classes10.dex */
public class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ hn4.d f364078n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hn4.d dVar, android.content.Context context) {
        super(context);
        this.f364078n = dVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void e(android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 e3Var) {
        hn4.d dVar = this.f364078n;
        int[] c17 = dVar.c(dVar.f374494a.getLayoutManager(), view);
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

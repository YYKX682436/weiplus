package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public class q3 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.r3 f12202n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(androidx.recyclerview.widget.r3 r3Var, android.content.Context context) {
        super(context);
        this.f12202n = r3Var;
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void e(android.view.View view, androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.e3 e3Var) {
        androidx.recyclerview.widget.r3 r3Var = this.f12202n;
        androidx.recyclerview.widget.RecyclerView recyclerView = r3Var.f12212a;
        if (recyclerView == null) {
            return;
        }
        int[] c17 = r3Var.c(recyclerView.getLayoutManager(), view);
        int i17 = c17[0];
        int i18 = c17[1];
        int k17 = k(java.lang.Math.max(java.lang.Math.abs(i17), java.lang.Math.abs(i18)));
        if (k17 > 0) {
            e3Var.b(i17, i18, k17, this.f12176i);
        }
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}

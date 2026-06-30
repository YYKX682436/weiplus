package n3;

/* loaded from: classes14.dex */
public class z0 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public n3.g3 f415984d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f415985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n3.k0 f415986f;

    public z0(android.view.View view, n3.k0 k0Var) {
        this.f415985e = view;
        this.f415986f = k0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        n3.g3 i17 = n3.g3.i(windowInsets, view);
        int i18 = android.os.Build.VERSION.SDK_INT;
        n3.k0 k0Var = this.f415986f;
        if (i18 < 30) {
            n3.a1.a(windowInsets, this.f415985e);
            if (i17.m148927xb2c87fbf(this.f415984d)) {
                return k0Var.a(view, i17).h();
            }
        }
        this.f415984d = i17;
        n3.g3 a17 = k0Var.a(view, i17);
        if (i18 >= 30) {
            return a17.h();
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.y0.c(view);
        return a17.h();
    }
}

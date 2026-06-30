package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class u0 extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.y0 f90758a;

    public u0(p012xc85e97e9.p016x746ad0e3.app.y0 y0Var) {
        this.f90758a = y0Var;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        android.view.View view2;
        p012xc85e97e9.p016x746ad0e3.app.y0 y0Var = this.f90758a;
        if (y0Var.f90785o && (view2 = y0Var.f90777g) != null) {
            view2.setTranslationY(0.0f);
            y0Var.f90774d.setTranslationY(0.0f);
        }
        y0Var.f90774d.setVisibility(8);
        y0Var.f90774d.m2597x1acfd12b(false);
        y0Var.f90790t = null;
        n.a aVar = y0Var.f90781k;
        if (aVar != null) {
            aVar.d(y0Var.f90780j);
            y0Var.f90780j = null;
            y0Var.f90781k = null;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd = y0Var.f90773c;
        if (c0074x22961cbd != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.y0.c(c0074x22961cbd);
        }
    }
}

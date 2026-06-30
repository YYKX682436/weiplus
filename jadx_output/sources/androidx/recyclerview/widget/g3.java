package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public abstract class g3 {

    /* renamed from: b, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f12050b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView.LayoutManager f12051c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12052d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12053e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f12054f;

    /* renamed from: a, reason: collision with root package name */
    public int f12049a = -1;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.e3 f12055g = new androidx.recyclerview.widget.e3(0, 0);

    public android.graphics.PointF a(int i17) {
        java.lang.Object obj = this.f12051c;
        if (obj instanceof androidx.recyclerview.widget.f3) {
            return ((androidx.recyclerview.widget.f3) obj).a(i17);
        }
        return null;
    }

    public void b(int i17, int i18) {
        android.graphics.PointF a17;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12050b;
        if (!this.f12053e || this.f12049a == -1 || recyclerView == null) {
            f();
        }
        if (this.f12052d && this.f12054f == null && this.f12051c != null && (a17 = a(this.f12049a)) != null) {
            float f17 = a17.x;
            if (f17 != 0.0f || a17.y != 0.0f) {
                recyclerView.Z0((int) java.lang.Math.signum(f17), (int) java.lang.Math.signum(a17.y), null);
            }
        }
        this.f12052d = false;
        android.view.View view = this.f12054f;
        androidx.recyclerview.widget.e3 e3Var = this.f12055g;
        if (view != null) {
            if (this.f12050b.v0(view) == this.f12049a) {
                e(this.f12054f, recyclerView.F1, e3Var);
                e3Var.a(recyclerView);
                f();
            } else {
                this.f12054f = null;
            }
        }
        if (this.f12053e) {
            androidx.recyclerview.widget.h3 h3Var = recyclerView.F1;
            androidx.recyclerview.widget.o1 o1Var = (androidx.recyclerview.widget.o1) this;
            if (o1Var.f12050b.f11902s.getChildCount() == 0) {
                o1Var.f();
            } else {
                int i19 = o1Var.f12179l;
                int i27 = i19 - i17;
                if (i19 * i27 <= 0) {
                    i27 = 0;
                }
                o1Var.f12179l = i27;
                int i28 = o1Var.f12180m;
                int i29 = i28 - i18;
                if (i28 * i29 <= 0) {
                    i29 = 0;
                }
                o1Var.f12180m = i29;
                if (i27 == 0 && i29 == 0) {
                    android.graphics.PointF a18 = o1Var.a(o1Var.f12049a);
                    if (a18 != null) {
                        if (a18.x != 0.0f || a18.y != 0.0f) {
                            float f18 = a18.y;
                            float sqrt = (float) java.lang.Math.sqrt((r9 * r9) + (f18 * f18));
                            float f19 = a18.x / sqrt;
                            a18.x = f19;
                            float f27 = a18.y / sqrt;
                            a18.y = f27;
                            o1Var.f12177j = a18;
                            o1Var.f12179l = (int) (f19 * 10000.0f);
                            o1Var.f12180m = (int) (f27 * 10000.0f);
                            e3Var.b((int) (o1Var.f12179l * 1.2f), (int) (o1Var.f12180m * 1.2f), (int) (o1Var.l(10000) * 1.2f), o1Var.f12175h);
                        }
                    }
                    e3Var.f12014d = o1Var.f12049a;
                    o1Var.f();
                }
            }
            boolean z17 = e3Var.f12014d >= 0;
            e3Var.a(recyclerView);
            if (z17) {
                if (!this.f12053e) {
                    f();
                } else {
                    this.f12052d = true;
                    recyclerView.C1.b();
                }
            }
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void e(android.view.View view, androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.e3 e3Var);

    public final void f() {
        if (this.f12053e) {
            this.f12053e = false;
            d();
            this.f12050b.F1.f12059a = -1;
            this.f12054f = null;
            this.f12049a = -1;
            this.f12052d = false;
            this.f12051c.onSmoothScrollerStopped(this);
            this.f12051c = null;
            this.f12050b = null;
        }
    }
}

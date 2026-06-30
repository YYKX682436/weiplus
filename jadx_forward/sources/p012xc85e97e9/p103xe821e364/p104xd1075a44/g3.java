package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes10.dex */
public abstract class g3 {

    /* renamed from: b, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f93583b;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f93584c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f93585d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93586e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f93587f;

    /* renamed from: a, reason: collision with root package name */
    public int f93582a = -1;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 f93588g = new p012xc85e97e9.p103xe821e364.p104xd1075a44.e3(0, 0);

    public android.graphics.PointF a(int i17) {
        java.lang.Object obj = this.f93584c;
        if (obj instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) {
            return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.f3) obj).a(i17);
        }
        return null;
    }

    public void b(int i17, int i18) {
        android.graphics.PointF a17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93583b;
        if (!this.f93586e || this.f93582a == -1 || c1163xf1deaba4 == null) {
            f();
        }
        if (this.f93585d && this.f93587f == null && this.f93584c != null && (a17 = a(this.f93582a)) != null) {
            float f17 = a17.x;
            if (f17 != 0.0f || a17.y != 0.0f) {
                c1163xf1deaba4.Z0((int) java.lang.Math.signum(f17), (int) java.lang.Math.signum(a17.y), null);
            }
        }
        this.f93585d = false;
        android.view.View view = this.f93587f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 e3Var = this.f93588g;
        if (view != null) {
            if (this.f93583b.v0(view) == this.f93582a) {
                e(this.f93587f, c1163xf1deaba4.F1, e3Var);
                e3Var.a(c1163xf1deaba4);
                f();
            } else {
                this.f93587f = null;
            }
        }
        if (this.f93586e) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var = c1163xf1deaba4.F1;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 o1Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.o1) this;
            if (o1Var.f93583b.f93435s.m8008x3d79f549() == 0) {
                o1Var.f();
            } else {
                int i19 = o1Var.f93712l;
                int i27 = i19 - i17;
                if (i19 * i27 <= 0) {
                    i27 = 0;
                }
                o1Var.f93712l = i27;
                int i28 = o1Var.f93713m;
                int i29 = i28 - i18;
                if (i28 * i29 <= 0) {
                    i29 = 0;
                }
                o1Var.f93713m = i29;
                if (i27 == 0 && i29 == 0) {
                    android.graphics.PointF a18 = o1Var.a(o1Var.f93582a);
                    if (a18 != null) {
                        if (a18.x != 0.0f || a18.y != 0.0f) {
                            float f18 = a18.y;
                            float sqrt = (float) java.lang.Math.sqrt((r9 * r9) + (f18 * f18));
                            float f19 = a18.x / sqrt;
                            a18.x = f19;
                            float f27 = a18.y / sqrt;
                            a18.y = f27;
                            o1Var.f93710j = a18;
                            o1Var.f93712l = (int) (f19 * 10000.0f);
                            o1Var.f93713m = (int) (f27 * 10000.0f);
                            e3Var.b((int) (o1Var.f93712l * 1.2f), (int) (o1Var.f93713m * 1.2f), (int) (o1Var.l(10000) * 1.2f), o1Var.f93708h);
                        }
                    }
                    e3Var.f93547d = o1Var.f93582a;
                    o1Var.f();
                }
            }
            boolean z17 = e3Var.f93547d >= 0;
            e3Var.a(c1163xf1deaba4);
            if (z17) {
                if (!this.f93586e) {
                    f();
                } else {
                    this.f93585d = true;
                    c1163xf1deaba4.C1.b();
                }
            }
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void e(android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 e3Var);

    public final void f() {
        if (this.f93586e) {
            this.f93586e = false;
            d();
            this.f93583b.F1.f93592a = -1;
            this.f93587f = null;
            this.f93582a = -1;
            this.f93585d = false;
            this.f93584c.m8070xe1c0c406(this);
            this.f93584c = null;
            this.f93583b = null;
        }
    }
}

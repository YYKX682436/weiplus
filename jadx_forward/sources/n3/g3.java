package n3;

/* loaded from: classes14.dex */
public class g3 {

    /* renamed from: b, reason: collision with root package name */
    public static final n3.g3 f415870b;

    /* renamed from: a, reason: collision with root package name */
    public final n3.d3 f415871a;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            f415870b = n3.c3.f415860q;
        } else {
            f415870b = n3.d3.f415861b;
        }
    }

    public g3(android.view.WindowInsets windowInsets) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            this.f415871a = new n3.c3(this, windowInsets);
            return;
        }
        if (i17 >= 29) {
            this.f415871a = new n3.b3(this, windowInsets);
        } else if (i17 >= 28) {
            this.f415871a = new n3.a3(this, windowInsets);
        } else {
            this.f415871a = new n3.z2(this, windowInsets);
        }
    }

    public static n3.g3 i(android.view.WindowInsets windowInsets, android.view.View view) {
        windowInsets.getClass();
        n3.g3 g3Var = new n3.g3(windowInsets);
        if (view != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(view)) {
                n3.g3 a17 = n3.b1.a(view);
                n3.d3 d3Var = g3Var.f415871a;
                d3Var.s(a17);
                d3Var.d(view.getRootView());
            }
        }
        return g3Var;
    }

    public e3.d a(int i17) {
        return this.f415871a.g(i17);
    }

    public int b() {
        return this.f415871a.l().f328580d;
    }

    public int c() {
        return this.f415871a.l().f328577a;
    }

    public int d() {
        return this.f415871a.l().f328579c;
    }

    public int e() {
        return this.f415871a.l().f328578b;
    }

    /* renamed from: equals */
    public boolean m148927xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3.g3)) {
            return false;
        }
        return m3.c.a(this.f415871a, ((n3.g3) obj).f415871a);
    }

    public boolean f(int i17) {
        return this.f415871a.p(i17);
    }

    public n3.g3 g(int i17, int i18, int i19, int i27) {
        int i28 = android.os.Build.VERSION.SDK_INT;
        n3.x2 w2Var = i28 >= 30 ? new n3.w2(this) : i28 >= 29 ? new n3.v2(this) : new n3.u2(this);
        w2Var.g(e3.d.b(i17, i18, i19, i27));
        return w2Var.b();
    }

    public android.view.WindowInsets h() {
        n3.d3 d3Var = this.f415871a;
        if (d3Var instanceof n3.y2) {
            return ((n3.y2) d3Var).f415979c;
        }
        return null;
    }

    /* renamed from: hashCode */
    public int m148928x8cdac1b() {
        n3.d3 d3Var = this.f415871a;
        if (d3Var == null) {
            return 0;
        }
        return d3Var.mo148919x8cdac1b();
    }

    public g3(n3.g3 g3Var) {
        if (g3Var != null) {
            n3.d3 d3Var = g3Var.f415871a;
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 >= 30 && (d3Var instanceof n3.c3)) {
                this.f415871a = new n3.c3(this, (n3.c3) d3Var);
            } else if (i17 >= 29 && (d3Var instanceof n3.b3)) {
                this.f415871a = new n3.b3(this, (n3.b3) d3Var);
            } else if (i17 >= 28 && (d3Var instanceof n3.a3)) {
                this.f415871a = new n3.a3(this, (n3.a3) d3Var);
            } else if (d3Var instanceof n3.z2) {
                this.f415871a = new n3.z2(this, (n3.z2) d3Var);
            } else if (d3Var instanceof n3.y2) {
                this.f415871a = new n3.y2(this, (n3.y2) d3Var);
            } else {
                this.f415871a = new n3.d3(this);
            }
            d3Var.e(this);
            return;
        }
        this.f415871a = new n3.d3(this);
    }
}

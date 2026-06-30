package androidx.fragment.app;

/* loaded from: classes14.dex */
public abstract class i2 {

    /* renamed from: b, reason: collision with root package name */
    public int f11345b;

    /* renamed from: c, reason: collision with root package name */
    public int f11346c;

    /* renamed from: d, reason: collision with root package name */
    public int f11347d;

    /* renamed from: e, reason: collision with root package name */
    public int f11348e;

    /* renamed from: f, reason: collision with root package name */
    public int f11349f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11350g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f11352i;

    /* renamed from: j, reason: collision with root package name */
    public int f11353j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f11354k;

    /* renamed from: l, reason: collision with root package name */
    public int f11355l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f11356m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f11357n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f11358o;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f11360q;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f11344a = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f11351h = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11359p = false;

    public i2(androidx.fragment.app.u0 u0Var, java.lang.ClassLoader classLoader) {
    }

    public void b(androidx.fragment.app.h2 h2Var) {
        this.f11344a.add(h2Var);
        h2Var.f11330c = this.f11345b;
        h2Var.f11331d = this.f11346c;
        h2Var.f11332e = this.f11347d;
        h2Var.f11333f = this.f11348e;
    }

    public androidx.fragment.app.i2 c(java.lang.String str) {
        if (!this.f11351h) {
            throw new java.lang.IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f11350g = true;
        this.f11352i = str;
        return this;
    }

    public abstract int d();

    public abstract int e();

    public abstract void f();

    public abstract void g();

    public abstract void h(int i17, androidx.fragment.app.Fragment fragment, java.lang.String str, int i18);

    public abstract androidx.fragment.app.i2 i(androidx.fragment.app.Fragment fragment);

    public abstract androidx.fragment.app.i2 j(androidx.fragment.app.Fragment fragment);

    public androidx.fragment.app.i2 k(int i17, androidx.fragment.app.Fragment fragment, java.lang.String str) {
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Must use non-zero containerViewId");
        }
        h(i17, fragment, str, 2);
        return this;
    }

    public androidx.fragment.app.i2 l(int i17, int i18, int i19, int i27) {
        this.f11345b = i17;
        this.f11346c = i18;
        this.f11347d = i19;
        this.f11348e = i27;
        return this;
    }

    public abstract androidx.fragment.app.i2 m(androidx.fragment.app.Fragment fragment, androidx.lifecycle.n nVar);

    public abstract androidx.fragment.app.i2 n(androidx.fragment.app.Fragment fragment);
}

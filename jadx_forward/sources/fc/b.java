package fc;

/* loaded from: classes16.dex */
public abstract class b implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public transient int f342433d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f342434e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f342435f;

    /* renamed from: g, reason: collision with root package name */
    public final float f342436g = 0.8f;

    /* renamed from: h, reason: collision with root package name */
    public int f342437h;

    public b() {
        m(((int) (4 / 0.8f)) + 1);
    }

    public void clear() {
        this.f342433d = 0;
        this.f342434e = d();
        this.f342435f = 0;
    }

    /* renamed from: clone */
    public java.lang.Object mo129315x5a5dd5d() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    public abstract int d();

    public final void e() {
        if (this.f342435f <= this.f342433d || d() <= 42) {
            return;
        }
        k(fc.a.a(((int) (this.f342433d / this.f342436g)) + 2));
        g(d());
    }

    public final void g(int i17) {
        this.f342437h = java.lang.Math.min(i17 - 1, (int) (i17 * this.f342436g));
        this.f342434e = i17 - this.f342433d;
        this.f342435f = 0;
    }

    public void h(int i17) {
        int i18 = this.f342437h;
        int i19 = this.f342433d;
        if (i17 > i18 - i19) {
            k(fc.a.a(((int) (i17 + (i19 / this.f342436g))) + 2));
            g(d());
        }
    }

    /* renamed from: isEmpty */
    public boolean m129316x7aab3243() {
        return this.f342433d == 0;
    }

    public final void j(boolean z17) {
        if (z17) {
            this.f342434e--;
        } else {
            this.f342435f--;
        }
        int i17 = this.f342433d + 1;
        this.f342433d = i17;
        if (i17 > this.f342437h || this.f342434e == 0) {
            k(fc.a.a(d() << 1));
            g(d());
        }
    }

    public abstract void k(int i17);

    public abstract void l(int i17);

    public abstract int m(int i17);

    /* renamed from: size */
    public int m129317x35e001() {
        return this.f342433d;
    }
}

package xe0;

/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: e, reason: collision with root package name */
    public static final xe0.t0 f535328e = new xe0.t0(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f535329a;

    /* renamed from: b, reason: collision with root package name */
    public final int f535330b;

    /* renamed from: c, reason: collision with root package name */
    public final int f535331c;

    /* renamed from: d, reason: collision with root package name */
    public final int f535332d;

    public t0(int i17, int i18, int i19, int i27) {
        this.f535329a = i17;
        this.f535330b = i18;
        this.f535331c = i19;
        this.f535332d = i27;
    }

    /* renamed from: equals */
    public boolean m175415xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe0.t0)) {
            return false;
        }
        xe0.t0 t0Var = (xe0.t0) obj;
        return this.f535329a == t0Var.f535329a && this.f535330b == t0Var.f535330b && this.f535331c == t0Var.f535331c && this.f535332d == t0Var.f535332d;
    }

    /* renamed from: hashCode */
    public int m175416x8cdac1b() {
        return (((((this.f535329a * 31) + this.f535330b) * 31) + this.f535331c) * 31) + this.f535332d;
    }
}

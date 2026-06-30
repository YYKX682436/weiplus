package kw2;

/* loaded from: classes14.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f394430a;

    /* renamed from: b, reason: collision with root package name */
    public final int f394431b;

    /* renamed from: c, reason: collision with root package name */
    public final int f394432c;

    /* renamed from: d, reason: collision with root package name */
    public final int f394433d;

    public c0(int i17, int i18, int i19, int i27) {
        this.f394430a = i17;
        this.f394431b = i18;
        this.f394432c = i19;
        this.f394433d = i27;
    }

    public final int a() {
        return this.f394433d;
    }

    public final int b() {
        return this.f394431b;
    }

    public final int c() {
        return this.f394432c;
    }

    public final int d() {
        return this.f394430a;
    }

    /* renamed from: equals */
    public boolean m144485xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw2.c0)) {
            return false;
        }
        kw2.c0 c0Var = (kw2.c0) obj;
        return this.f394430a == c0Var.f394430a && this.f394431b == c0Var.f394431b && this.f394432c == c0Var.f394432c && this.f394433d == c0Var.f394433d;
    }

    /* renamed from: hashCode */
    public int m144486x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f394430a) * 31) + java.lang.Integer.hashCode(this.f394431b)) * 31) + java.lang.Integer.hashCode(this.f394432c)) * 31) + java.lang.Integer.hashCode(this.f394433d);
    }

    /* renamed from: toString */
    public java.lang.String m144487x9616526c() {
        return "RangeCounts(zeroToX=" + this.f394430a + ", xToY=" + this.f394431b + ", yToZ=" + this.f394432c + ", greaterOrEqualToZ=" + this.f394433d + ')';
    }
}

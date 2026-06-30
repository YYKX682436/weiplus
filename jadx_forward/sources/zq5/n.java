package zq5;

/* loaded from: classes15.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final zq5.n f556614e = new zq5.n(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f556615a;

    /* renamed from: b, reason: collision with root package name */
    public final float f556616b;

    /* renamed from: c, reason: collision with root package name */
    public final float f556617c;

    /* renamed from: d, reason: collision with root package name */
    public final float f556618d;

    public n(float f17, float f18, float f19, float f27) {
        this.f556615a = f17;
        this.f556616b = f18;
        this.f556617c = f19;
        this.f556618d = f27;
    }

    /* renamed from: equals */
    public boolean m179333xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq5.n)) {
            return false;
        }
        zq5.n nVar = (zq5.n) obj;
        return java.lang.Float.compare(this.f556615a, nVar.f556615a) == 0 && java.lang.Float.compare(this.f556616b, nVar.f556616b) == 0 && java.lang.Float.compare(this.f556617c, nVar.f556617c) == 0 && java.lang.Float.compare(this.f556618d, nVar.f556618d) == 0;
    }

    /* renamed from: hashCode */
    public int m179334x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f556615a) * 31) + java.lang.Float.hashCode(this.f556616b)) * 31) + java.lang.Float.hashCode(this.f556617c)) * 31) + java.lang.Float.hashCode(this.f556618d);
    }

    /* renamed from: toString */
    public java.lang.String m179335x9616526c() {
        return "RectCompat.fromLTRB(" + zq5.b.e(this.f556615a, 1) + ", " + zq5.b.e(this.f556616b, 1) + ", " + zq5.b.e(this.f556617c, 1) + ", " + zq5.b.e(this.f556618d, 1) + ')';
    }
}

package ey2;

/* loaded from: classes2.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f339011a;

    /* renamed from: b, reason: collision with root package name */
    public final int f339012b;

    /* renamed from: c, reason: collision with root package name */
    public int f339013c;

    /* renamed from: d, reason: collision with root package name */
    public long f339014d;

    /* renamed from: e, reason: collision with root package name */
    public long f339015e;

    /* renamed from: f, reason: collision with root package name */
    public float f339016f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public long f339017g = java.lang.System.currentTimeMillis();

    /* renamed from: h, reason: collision with root package name */
    public int f339018h = 1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f339019i;

    public q2(long j17, int i17) {
        this.f339011a = j17;
        this.f339012b = i17;
    }

    /* renamed from: equals */
    public boolean m128372xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.q2)) {
            return false;
        }
        ey2.q2 q2Var = (ey2.q2) obj;
        return this.f339011a == q2Var.f339011a && this.f339012b == q2Var.f339012b;
    }

    /* renamed from: hashCode */
    public int m128373x8cdac1b() {
        return (java.lang.Long.hashCode(this.f339011a) * 31) + java.lang.Integer.hashCode(this.f339012b);
    }

    /* renamed from: toString */
    public java.lang.String m128374x9616526c() {
        return "Cache(feedId=" + this.f339011a + ", tabType=" + this.f339012b + ')';
    }
}

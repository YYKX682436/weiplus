package qc0;

/* loaded from: classes5.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f442896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f442897b;

    /* renamed from: c, reason: collision with root package name */
    public final float f442898c;

    /* renamed from: d, reason: collision with root package name */
    public final long f442899d;

    /* renamed from: e, reason: collision with root package name */
    public final int f442900e;

    /* renamed from: f, reason: collision with root package name */
    public final int f442901f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f442902g;

    /* renamed from: h, reason: collision with root package name */
    public final int f442903h;

    /* renamed from: i, reason: collision with root package name */
    public final int f442904i;

    /* renamed from: j, reason: collision with root package name */
    public final int f442905j;

    /* renamed from: k, reason: collision with root package name */
    public final int f442906k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b f442907l;

    public d1(int i17, int i18, float f17, long j17, int i19, int i27, boolean z17, int i28, int i29, int i37, int i38) {
        this.f442896a = i17;
        this.f442897b = i18;
        this.f442898c = f17;
        this.f442899d = j17;
        this.f442900e = i19;
        this.f442901f = i27;
        this.f442902g = z17;
        this.f442903h = i28;
        this.f442904i = i29;
        this.f442905j = i37;
        this.f442906k = i38;
    }

    public final boolean a() {
        return this.f442896a > 0 && this.f442897b > 0 && this.f442899d > 0;
    }

    /* renamed from: equals */
    public boolean m159757xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0.d1)) {
            return false;
        }
        qc0.d1 d1Var = (qc0.d1) obj;
        return this.f442896a == d1Var.f442896a && this.f442897b == d1Var.f442897b && java.lang.Float.compare(this.f442898c, d1Var.f442898c) == 0 && this.f442899d == d1Var.f442899d && this.f442900e == d1Var.f442900e && this.f442901f == d1Var.f442901f && this.f442902g == d1Var.f442902g && this.f442903h == d1Var.f442903h && this.f442904i == d1Var.f442904i && this.f442905j == d1Var.f442905j && this.f442906k == d1Var.f442906k;
    }

    /* renamed from: hashCode */
    public int m159758x8cdac1b() {
        return (((((((((((((((((((java.lang.Integer.hashCode(this.f442896a) * 31) + java.lang.Integer.hashCode(this.f442897b)) * 31) + java.lang.Float.hashCode(this.f442898c)) * 31) + java.lang.Long.hashCode(this.f442899d)) * 31) + java.lang.Integer.hashCode(this.f442900e)) * 31) + java.lang.Integer.hashCode(this.f442901f)) * 31) + java.lang.Boolean.hashCode(this.f442902g)) * 31) + java.lang.Integer.hashCode(this.f442903h)) * 31) + java.lang.Integer.hashCode(this.f442904i)) * 31) + java.lang.Integer.hashCode(this.f442905j)) * 31) + java.lang.Integer.hashCode(this.f442906k);
    }

    /* renamed from: toString */
    public java.lang.String m159759x9616526c() {
        return "[width:" + this.f442896a + ",height:" + this.f442897b + ",fps:" + this.f442898c + ",duration:" + this.f442899d + ']';
    }
}

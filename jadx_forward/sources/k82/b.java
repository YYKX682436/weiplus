package k82;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f386404a;

    /* renamed from: b, reason: collision with root package name */
    public final long f386405b;

    /* renamed from: c, reason: collision with root package name */
    public final int f386406c;

    /* renamed from: d, reason: collision with root package name */
    public final int f386407d;

    /* renamed from: e, reason: collision with root package name */
    public int f386408e;

    /* renamed from: g, reason: collision with root package name */
    public long f386410g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f386411h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f386412i;

    /* renamed from: j, reason: collision with root package name */
    public long f386413j;

    /* renamed from: k, reason: collision with root package name */
    public long f386414k;

    /* renamed from: l, reason: collision with root package name */
    public int f386415l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f386416m;

    /* renamed from: f, reason: collision with root package name */
    public final long f386409f = java.lang.System.currentTimeMillis();

    /* renamed from: n, reason: collision with root package name */
    public long f386417n = -1;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f386418o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f386419p = "";

    public b(long j17, long j18, int i17, int i18) {
        this.f386404a = j17;
        this.f386405b = j18;
        this.f386406c = i17;
        this.f386407d = i18;
    }

    /* renamed from: equals */
    public boolean m142105xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k82.b)) {
            return false;
        }
        k82.b bVar = (k82.b) obj;
        return this.f386404a == bVar.f386404a && this.f386405b == bVar.f386405b && this.f386406c == bVar.f386406c && this.f386407d == bVar.f386407d;
    }

    /* renamed from: hashCode */
    public int m142106x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f386404a) * 31) + java.lang.Long.hashCode(this.f386405b)) * 31) + java.lang.Integer.hashCode(this.f386406c)) * 31) + java.lang.Integer.hashCode(this.f386407d);
    }

    /* renamed from: toString */
    public java.lang.String m142107x9616526c() {
        return "ReportData(localId=" + this.f386404a + ", favId=" + this.f386405b + ", favType=" + this.f386406c + ", scene=" + this.f386407d + ')';
    }
}

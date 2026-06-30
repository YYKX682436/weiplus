package tr5;

/* loaded from: classes13.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f503008a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f503009b;

    /* renamed from: c, reason: collision with root package name */
    public final int f503010c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f503011d;

    /* renamed from: e, reason: collision with root package name */
    public final tr5.n f503012e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f503013f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f503014g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f503015h;

    /* renamed from: i, reason: collision with root package name */
    public final int f503016i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f503017j;

    /* renamed from: k, reason: collision with root package name */
    public final int f503018k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f503019l;

    /* renamed from: m, reason: collision with root package name */
    public final int f503020m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f503021n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f503022o;

    public f0(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, tr5.n nVar, java.lang.String str3, boolean z17, boolean z18, int i18, boolean z19, int i19, boolean z27, int i27, boolean z28, tr5.d0 d0Var) {
        this.f503008a = context;
        this.f503009b = str;
        this.f503010c = i17;
        this.f503011d = str2;
        this.f503012e = nVar;
        this.f503013f = str3;
        this.f503014g = z17;
        this.f503015h = z18;
        this.f503016i = i18;
        this.f503017j = z19;
        this.f503018k = i19;
        this.f503019l = z27;
        this.f503020m = i27;
        this.f503021n = z28;
        this.f503022o = str;
    }

    /* renamed from: equals */
    public boolean m166982xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tr5.f0.class != obj.getClass()) {
            return false;
        }
        tr5.f0 f0Var = (tr5.f0) obj;
        return this.f503010c == f0Var.f503010c && this.f503014g == f0Var.f503014g && this.f503015h == f0Var.f503015h && this.f503016i == f0Var.f503016i && this.f503017j == f0Var.f503017j && this.f503018k == f0Var.f503018k && this.f503019l == f0Var.f503019l && this.f503020m == f0Var.f503020m && this.f503021n == f0Var.f503021n && sr5.a.b(this.f503008a, f0Var.f503008a) && sr5.a.b(this.f503009b, f0Var.f503009b) && sr5.a.b(this.f503011d, f0Var.f503011d) && sr5.a.b(this.f503012e, f0Var.f503012e) && sr5.a.b(this.f503013f, f0Var.f503013f);
    }

    /* renamed from: hashCode */
    public int m166983x8cdac1b() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f503008a, this.f503009b, java.lang.Integer.valueOf(this.f503010c), this.f503011d, this.f503012e, this.f503013f, java.lang.Boolean.valueOf(this.f503014g), java.lang.Boolean.valueOf(this.f503015h), java.lang.Integer.valueOf(this.f503016i), java.lang.Boolean.valueOf(this.f503017j), java.lang.Integer.valueOf(this.f503018k), java.lang.Boolean.valueOf(this.f503019l), java.lang.Integer.valueOf(this.f503020m), java.lang.Boolean.valueOf(this.f503021n)});
    }

    /* renamed from: toString */
    public java.lang.String m166984x9616526c() {
        return "LookupParameters{appContext=" + this.f503008a + ", hostname='" + this.f503009b + "', timeoutMills=" + this.f503010c + ", dnsIp=" + this.f503011d + ", lookupExtra=" + this.f503012e + ", channel='" + this.f503013f + "', fallback2Local=" + this.f503014g + ", blockFirst=" + this.f503015h + ", family=" + this.f503016i + ", ignoreCurNetStack=" + this.f503017j + ", customNetStack=" + this.f503018k + ", enableAsyncLookup=" + this.f503019l + ", curRetryTime=" + this.f503020m + ", netChangeLookup=" + this.f503021n + '}';
    }
}

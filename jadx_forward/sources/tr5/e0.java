package tr5;

/* loaded from: classes13.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f502992a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f502993b;

    /* renamed from: c, reason: collision with root package name */
    public int f502994c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f502995d;

    /* renamed from: e, reason: collision with root package name */
    public tr5.n f502996e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f502997f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f502998g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f502999h;

    /* renamed from: i, reason: collision with root package name */
    public int f503000i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f503001j;

    /* renamed from: k, reason: collision with root package name */
    public int f503002k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f503003l;

    /* renamed from: m, reason: collision with root package name */
    public int f503004m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f503005n;

    public e0() {
        this.f502994c = -1;
        this.f502998g = true;
        this.f502999h = false;
        this.f503000i = 3;
        this.f503001j = false;
        this.f503002k = 0;
        this.f503003l = false;
        this.f503004m = 0;
        this.f503005n = false;
    }

    public tr5.f0 a() {
        android.content.Context context = this.f502992a;
        if (context == null) {
            throw new java.lang.IllegalStateException("mAppContext".concat(" is not initialized yet"));
        }
        java.lang.String str = this.f502993b;
        if (str == null) {
            throw new java.lang.IllegalStateException("mHostname".concat(" is not initialized yet"));
        }
        int i17 = this.f502994c;
        if (-1 == i17) {
            throw new java.lang.IllegalStateException("mTimeoutMills".concat(" is not initialized yet"));
        }
        java.lang.String str2 = this.f502995d;
        if (str2 == null) {
            throw new java.lang.IllegalStateException("mDnsIp".concat(" is not initialized yet"));
        }
        tr5.n nVar = this.f502996e;
        if (nVar == null) {
            throw new java.lang.IllegalStateException("mLookupExtra".concat(" is not initialized yet"));
        }
        java.lang.String str3 = this.f502997f;
        if (str3 != null) {
            return new tr5.f0(context, str, i17, str2, nVar, str3, this.f502998g, this.f502999h, this.f503000i, this.f503001j, this.f503002k, this.f503003l, this.f503004m, this.f503005n, null);
        }
        throw new java.lang.IllegalStateException("mChannel".concat(" is not initialized yet"));
    }

    public tr5.e0 b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("channel".concat(" can not be empty"));
        }
        this.f502997f = str;
        return this;
    }

    public tr5.e0 c(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context".concat(" can not be null"));
        }
        this.f502992a = context.getApplicationContext();
        return this;
    }

    public tr5.e0 d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("dnsIp".concat(" can not be empty"));
        }
        this.f502995d = str;
        return this;
    }

    public tr5.e0 e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("hostname".concat(" can not be empty"));
        }
        this.f502993b = str;
        return this;
    }

    public tr5.e0 f(tr5.n nVar) {
        if (nVar == null) {
            throw new java.lang.IllegalArgumentException("lookupExtra".concat(" can not be null"));
        }
        this.f502996e = nVar;
        return this;
    }

    public tr5.e0 g(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("timeoutMills".concat(" can not less than 0"));
        }
        this.f502994c = i17;
        return this;
    }

    public e0(tr5.f0 f0Var) {
        this.f502994c = -1;
        this.f502998g = true;
        this.f502999h = false;
        this.f503000i = 3;
        this.f503001j = false;
        this.f503002k = 0;
        this.f503003l = false;
        this.f503004m = 0;
        this.f503005n = false;
        this.f502992a = f0Var.f503008a;
        this.f502993b = f0Var.f503009b;
        this.f502994c = f0Var.f503010c;
        this.f502995d = f0Var.f503011d;
        this.f502996e = f0Var.f503012e;
        this.f502997f = f0Var.f503013f;
        this.f502998g = f0Var.f503014g;
        this.f502999h = f0Var.f503015h;
        this.f503000i = f0Var.f503016i;
        this.f503001j = f0Var.f503017j;
        this.f503002k = f0Var.f503018k;
        this.f503003l = f0Var.f503019l;
        this.f503004m = f0Var.f503020m;
        this.f503005n = f0Var.f503021n;
    }
}

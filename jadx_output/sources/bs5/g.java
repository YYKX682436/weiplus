package bs5;

/* loaded from: classes13.dex */
public class g extends fs5.a implements java.io.Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final bs5.g f24027w;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24028h;

    /* renamed from: i, reason: collision with root package name */
    public int f24029i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f24030m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f24031n;

    /* renamed from: o, reason: collision with root package name */
    public transient java.util.Map f24032o;

    /* renamed from: p, reason: collision with root package name */
    public long f24033p;

    /* renamed from: q, reason: collision with root package name */
    public long f24034q;

    /* renamed from: r, reason: collision with root package name */
    public int f24035r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24036s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f24037t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24038u;

    /* renamed from: v, reason: collision with root package name */
    public int f24039v;

    static {
        bs5.g gVar = new bs5.g();
        f24027w = gVar;
        gVar.f24029i = 1;
    }

    public g() {
        this.f24028h = false;
        this.f24029i = 2;
        this.f24030m = " ";
        this.f24031n = "0";
        this.f24032o = new java.util.HashMap();
        this.f24033p = 0L;
        this.f24034q = 0L;
        this.f24035r = 0;
        this.f24036s = false;
        this.f24037t = false;
        this.f24038u = false;
    }

    @Override // fs5.a, tr5.q
    public boolean d() {
        return tr5.c.f421455a != this.f266347d;
    }

    @Override // tr5.q
    public boolean g() {
        return this.f24028h;
    }

    public long i(java.util.Map map) {
        if (map.isEmpty()) {
            return 0L;
        }
        java.util.Iterator it = map.keySet().iterator();
        int i17 = 6000;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) map.get((java.lang.String) it.next())).intValue();
            cs5.a aVar = cs5.a.f222126d;
            if (!(intValue < 0)) {
                i17 = java.lang.Math.min(intValue, i17);
            }
        }
        long j17 = i17;
        this.f24034q = (java.lang.System.currentTimeMillis() - j17) - 5000;
        return java.lang.System.currentTimeMillis() + (j17 * 1000);
    }

    public java.lang.String toString() {
        return "Statistics{errorCode=" + this.f24029i + ", errorMsg='" + this.f24030m + "', statusCode=" + this.f24039v + ", clientIp='" + this.f24031n + "', ttl=" + this.f24032o + ", expiredTime=" + this.f24033p + ", beginTime=" + this.f24034q + ", retryTimes=" + this.f24035r + ", cached=" + this.f24036s + ", asyncLookup=" + this.f24037t + ", netChangeLookup=" + this.f24038u + ", ips=" + java.util.Arrays.toString(this.f266347d) + ", costTimeMills=" + this.f266349f + ", startLookupTimeMills=" + this.f266350g + '}';
    }

    public g(java.lang.String[] strArr, java.lang.String str, java.util.Map map) {
        this.f24028h = false;
        this.f24029i = 2;
        this.f24030m = " ";
        this.f24031n = "0";
        this.f24032o = new java.util.HashMap();
        this.f24033p = 0L;
        this.f24034q = 0L;
        this.f24035r = 0;
        this.f24036s = false;
        this.f24037t = false;
        this.f24038u = false;
        if (strArr != null) {
            if (!android.text.TextUtils.isEmpty(str)) {
                if (!map.isEmpty()) {
                    this.f266347d = strArr;
                    this.f24031n = str;
                    this.f24032o = map;
                    this.f24033p = i(map);
                    return;
                }
                throw new java.lang.IllegalArgumentException("ttl".concat(" is invalid"));
            }
            throw new java.lang.IllegalArgumentException("clientIp".concat(" can not be empty"));
        }
        throw new java.lang.IllegalArgumentException("ips".concat(" can not be null"));
    }
}

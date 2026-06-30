package bs5;

/* loaded from: classes13.dex */
public class g extends fs5.a implements java.io.Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final bs5.g f105560w;

    /* renamed from: h, reason: collision with root package name */
    public boolean f105561h;

    /* renamed from: i, reason: collision with root package name */
    public int f105562i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f105563m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f105564n;

    /* renamed from: o, reason: collision with root package name */
    public transient java.util.Map f105565o;

    /* renamed from: p, reason: collision with root package name */
    public long f105566p;

    /* renamed from: q, reason: collision with root package name */
    public long f105567q;

    /* renamed from: r, reason: collision with root package name */
    public int f105568r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f105569s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f105570t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f105571u;

    /* renamed from: v, reason: collision with root package name */
    public int f105572v;

    static {
        bs5.g gVar = new bs5.g();
        f105560w = gVar;
        gVar.f105562i = 1;
    }

    public g() {
        this.f105561h = false;
        this.f105562i = 2;
        this.f105563m = " ";
        this.f105564n = "0";
        this.f105565o = new java.util.HashMap();
        this.f105566p = 0L;
        this.f105567q = 0L;
        this.f105568r = 0;
        this.f105569s = false;
        this.f105570t = false;
        this.f105571u = false;
    }

    @Override // fs5.a, tr5.q
    public boolean d() {
        return tr5.c.f502988a != this.f347880d;
    }

    @Override // tr5.q
    public boolean g() {
        return this.f105561h;
    }

    public long i(java.util.Map map) {
        if (map.isEmpty()) {
            return 0L;
        }
        java.util.Iterator it = map.keySet().iterator();
        int i17 = 6000;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) map.get((java.lang.String) it.next())).intValue();
            cs5.a aVar = cs5.a.f303659d;
            if (!(intValue < 0)) {
                i17 = java.lang.Math.min(intValue, i17);
            }
        }
        long j17 = i17;
        this.f105567q = (java.lang.System.currentTimeMillis() - j17) - 5000;
        return java.lang.System.currentTimeMillis() + (j17 * 1000);
    }

    /* renamed from: toString */
    public java.lang.String m11138x9616526c() {
        return "Statistics{errorCode=" + this.f105562i + ", errorMsg='" + this.f105563m + "', statusCode=" + this.f105572v + ", clientIp='" + this.f105564n + "', ttl=" + this.f105565o + ", expiredTime=" + this.f105566p + ", beginTime=" + this.f105567q + ", retryTimes=" + this.f105568r + ", cached=" + this.f105569s + ", asyncLookup=" + this.f105570t + ", netChangeLookup=" + this.f105571u + ", ips=" + java.util.Arrays.toString(this.f347880d) + ", costTimeMills=" + this.f347882f + ", startLookupTimeMills=" + this.f347883g + '}';
    }

    public g(java.lang.String[] strArr, java.lang.String str, java.util.Map map) {
        this.f105561h = false;
        this.f105562i = 2;
        this.f105563m = " ";
        this.f105564n = "0";
        this.f105565o = new java.util.HashMap();
        this.f105566p = 0L;
        this.f105567q = 0L;
        this.f105568r = 0;
        this.f105569s = false;
        this.f105570t = false;
        this.f105571u = false;
        if (strArr != null) {
            if (!android.text.TextUtils.isEmpty(str)) {
                if (!map.isEmpty()) {
                    this.f347880d = strArr;
                    this.f105564n = str;
                    this.f105565o = map;
                    this.f105566p = i(map);
                    return;
                }
                throw new java.lang.IllegalArgumentException("ttl".concat(" is invalid"));
            }
            throw new java.lang.IllegalArgumentException("clientIp".concat(" can not be empty"));
        }
        throw new java.lang.IllegalArgumentException("ips".concat(" can not be null"));
    }
}

package kr5;

/* loaded from: classes13.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f393079a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f393080b;

    /* renamed from: c, reason: collision with root package name */
    public final bs5.q f393081c;

    /* renamed from: d, reason: collision with root package name */
    public final int f393082d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f393083e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f393084f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f393085g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f393086h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f393087i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f393088j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f393089k;

    /* renamed from: l, reason: collision with root package name */
    public final int f393090l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f393091m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f393092n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f393093o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f393094p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f393095q = false;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f393096r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f393097s;

    public g(int i17, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.util.Set set, java.util.Set set2, boolean z18, java.util.Set set3, java.util.Set set4, java.lang.String str6, boolean z19, boolean z27, int i19, lr5.b bVar, kr5.q qVar, java.util.List list, java.util.List list2, boolean z28, boolean z29, java.lang.String str7, java.lang.Boolean bool, kr5.e eVar) {
        this.f393079a = i17;
        this.f393080b = str;
        this.f393081c = new bs5.q(str3, str4, str5);
        this.f393082d = i18;
        this.f393083e = set;
        this.f393084f = set2;
        this.f393086h = z18;
        this.f393085g = set3;
        this.f393087i = str6;
        this.f393088j = z19;
        this.f393089k = z27;
        this.f393090l = i19;
        this.f393091m = list;
        this.f393092n = list2;
        this.f393093o = z28;
        this.f393094p = z29;
        this.f393096r = str7;
        this.f393097s = bool.booleanValue();
    }

    /* renamed from: toString */
    public java.lang.String m144246x9616526c() {
        return "DnsConfig{logLevel=" + this.f393079a + ", appId='" + this.f393080b + "', userId='', lookupExtra=" + this.f393081c + ", timeoutMills=" + this.f393082d + ", protectedDomains=" + sr5.a.e(this.f393083e) + ", preLookupDomains=" + sr5.a.e(this.f393084f) + ", enablePersistentCache=" + this.f393086h + ", persistentCacheDomains=" + sr5.a.e(this.f393085g) + ", IpRankItems=" + sr5.a.e(null) + ", channel='" + this.f393087i + "', enableReport='" + this.f393088j + "', blockFirst=" + this.f393089k + ", customNetStack=" + this.f393090l + ", executorSupplier=null, lookedUpListener=null, logNodes=" + sr5.a.e(this.f393091m) + ", reporters=" + sr5.a.e(this.f393092n) + ", useExpiredIpEnable=" + this.f393093o + ", cachedIpEnable=" + this.f393094p + ", enableDomainServer=" + this.f393095q + ", routeIp=" + this.f393096r + ", experimentalBuglyEnable=" + this.f393097s + '}';
    }
}

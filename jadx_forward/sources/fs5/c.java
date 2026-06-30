package fs5;

/* loaded from: classes13.dex */
public final class c implements tr5.y {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f347885d;

    /* renamed from: n, reason: collision with root package name */
    public tr5.z f347892n;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f347886e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f347887f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f347888g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f347889h = -1;

    /* renamed from: i, reason: collision with root package name */
    public wr5.a f347890i = wr5.a.f530477h;

    /* renamed from: m, reason: collision with root package name */
    public bs5.g f347891m = bs5.g.f105560w;

    /* renamed from: o, reason: collision with root package name */
    public boolean f347893o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f347894p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f347895q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f347896r = false;

    public c(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context".concat(" can not be null"));
        }
        int a17 = sr5.g.a(context);
        this.f347885d = a17 != 1 ? a17 != 2 ? a17 != 3 ? a17 != 4 ? a17 != 5 ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "ethernet" : "wifi" : "4G" : "3G" : "2G";
    }

    @Override // tr5.y
    public void a(tr5.z zVar) {
        if (zVar == null) {
            throw new java.lang.IllegalArgumentException("ipSet".concat(" can not be null"));
        }
        this.f347892n = zVar;
    }

    @Override // tr5.q
    public boolean b() {
        return this.f347894p;
    }

    @Override // tr5.y
    public void c(tr5.r rVar, tr5.q qVar) {
        if (rVar == null) {
            throw new java.lang.IllegalArgumentException("dns".concat(" can not be null"));
        }
        if (qVar == null) {
            throw new java.lang.IllegalArgumentException("stat".concat(" can not be null"));
        }
        or5.b.d("%s.merge(%s, %s) called", super.toString(), rVar, qVar);
        boolean z17 = false;
        if (this.f347895q) {
            this.f347893o = this.f347893o && qVar.d();
        } else {
            this.f347893o = qVar.d();
            this.f347895q = true;
        }
        if (this.f347894p && qVar.b()) {
            z17 = true;
        }
        this.f347894p = z17;
        this.f347896r = qVar.g();
        if ("Local".equals(rVar.mo11135x730bcac6().f503023a)) {
            this.f347890i = (wr5.a) qVar;
        } else {
            this.f347891m = (bs5.g) qVar;
        }
        ((lr5.d) lr5.e.f402303c).execute(new fs5.b(this, new tr5.g0(tr5.z.f503041g, this)));
    }

    @Override // tr5.q
    public boolean d() {
        return this.f347893o;
    }

    @Override // tr5.y
    public java.lang.String e() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            tr5.z zVar = this.f347892n;
            jSONObject.put("v4_ips", zVar == null ? "" : sr5.a.f(zVar.f503042d, ","));
            tr5.z zVar2 = this.f347892n;
            jSONObject.put("v6_ips", zVar2 == null ? "" : sr5.a.f(zVar2.f503043e, ","));
            java.lang.String str = this.f347887f;
            if (str == null) {
                str = "";
            }
            jSONObject.put("request_name", str);
            jSONObject.put("ttl", java.lang.String.valueOf(this.f347891m.f105565o));
            jSONObject.put("client_ip", java.lang.String.valueOf(this.f347891m.f105564n));
            jSONObject.put("expired_time", java.lang.String.valueOf(this.f347891m.f105566p));
            return jSONObject.toString();
        } catch (java.lang.Exception e17) {
            or5.b.b("exception: %s", e17);
            return "";
        }
    }

    @Override // tr5.y
    public void f(tr5.a0 a0Var) {
        if (a0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupContext".concat(" can not be null"));
        }
        tr5.f0 f0Var = a0Var.f502973a;
        this.f347886e = f0Var.f503009b;
        this.f347887f = f0Var.f503022o;
        this.f347888g = f0Var.f503013f;
        this.f347889h = a0Var.a();
    }

    @Override // tr5.q
    public boolean g() {
        return this.f347896r;
    }

    /* renamed from: toString */
    public java.lang.String m130339x9616526c() {
        return super.toString() + "{netType='" + this.f347885d + "', hostname='" + this.f347886e + "', requestHostname='" + this.f347887f + "', channel='" + this.f347888g + "', curNetStack=" + this.f347889h + ", localDnsStat=" + this.f347890i + ", restDnsStat=" + this.f347891m + ", ipSet=" + this.f347892n + ", lookupSuccess=" + this.f347893o + ", lookupGetEmptyResponse=" + this.f347894p + ", hasBeenMerge=" + this.f347895q + '}';
    }
}

package ad1;

/* loaded from: classes7.dex */
public class a implements gb1.m {

    /* renamed from: d, reason: collision with root package name */
    public final int f84631d;

    /* renamed from: e, reason: collision with root package name */
    public final uh1.o f84632e;

    /* renamed from: h, reason: collision with root package name */
    public final gb1.a f84635h;

    /* renamed from: f, reason: collision with root package name */
    public boolean f84633f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f84634g = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f84636i = new java.util.concurrent.atomic.AtomicBoolean(false);

    public a(int i17, uh1.o oVar, gb1.a aVar) {
        this.f84631d = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateRequestTask", "BaseCreateRequestTask<init>, programType:%d", java.lang.Integer.valueOf(i17));
        this.f84631d = i17;
        this.f84632e = oVar;
        this.f84635h = aVar;
    }

    @Override // gb1.m
    public java.lang.String a() {
        return "requestTaskId";
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, java.lang.String str2, int i17, java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseCreateRequestTask", "sendFailMsg, requestTaskId = %s, errMsg = %s, errno = %d", str, str2, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("requestTaskId", str);
        hashMap.put("state", "fail");
        hashMap.put("errno", java.lang.Integer.valueOf(i17));
        hashMap.put("errMsg", str2);
        if (map != null && map.size() > 0) {
            hashMap.put("clientInfo", map);
        }
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        ad1.c cVar = new ad1.c();
        cVar.p(lVar);
        cVar.r(jSONObject);
        cVar.n(this.f84635h.a(str));
    }

    @Override // gb1.m
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        if (!this.f84636i.getAndSet(true)) {
            uh1.o oVar = this.f84632e;
            if (oVar != null) {
                this.f84633f = oVar.a(lVar.mo48798x74292566());
                this.f84634g = oVar.b(lVar.mo48798x74292566());
            }
            if (this.f84633f || this.f84634g) {
                uh1.a aVar = (uh1.a) lVar.b(uh1.a.class);
                fp.d0.o(org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154080xdba63de6());
                if (aVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseCreateRequestTask", "setupRequestMode config not found, setUserCertVerify false appId(%s)", lVar.mo48798x74292566());
                    com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37958xae0bceea(false);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateRequestTask", "setupRequestMode(%b),appId(%s)", java.lang.Boolean.valueOf(aVar.H), lVar.mo48798x74292566());
                    com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37958xae0bceea(aVar.H);
                }
            }
        }
        ad1.b bVar = new ad1.b(this, new java.lang.ref.WeakReference(lVar), java.lang.System.currentTimeMillis(), str, lVar);
        java.lang.String optString = jSONObject.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseCreateRequestTask", "url is null");
            b(lVar, str, "url is null or nil", 600005, null);
            return;
        }
        uh1.a aVar2 = (uh1.a) lVar.b(uh1.a.class);
        int optInt = jSONObject.optInt("timeout", 0);
        if (optInt <= 0) {
            optInt = uh1.j0.n(aVar2, 0);
        }
        int i17 = optInt > 0 ? optInt : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        if (aVar2.f509278i <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateRequestTask", "maxRequestConcurrent <= 0 use default concurrent");
        }
        java.util.Map g17 = uh1.j0.g(jSONObject, aVar2);
        boolean z17 = jSONObject.optBoolean("__skipDomainCheck__") ? false : aVar2.f509273d;
        java.lang.String str2 = null;
        if (z17 && !uh1.j0.A(aVar2.f509282p, optString, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateRequestTask", "not in domain url %s", optString);
            try {
                str2 = new java.net.URL(optString).getHost();
            } catch (java.net.MalformedURLException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseCreateRequestTask", e17, "get url host fail Exception", new java.lang.Object[0]);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                b(lVar, str, "url not in domain list", 600002, null);
                return;
            }
            b(lVar, str, "url not in domain list:" + str2, 600002, null);
            return;
        }
        uh1.t tVar = uh1.s.f509433a;
        final ad1.C0007x2ca3e0 c0007x2ca3e0 = new ad1.C0007x2ca3e0(this);
        tVar.getClass();
        iz5.a.g(null, lVar instanceof uh1.u);
        uh1.z zVar = (uh1.z) tVar.f509436a;
        zVar.getClass();
        uh1.q qVar = (uh1.q) ((uh1.w) zVar.f509479b.computeIfAbsent(uh1.a0.a((uh1.u) lVar), new java.util.function.Function() { // from class: uh1.z$$a
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                ad1.a aVar3 = ((ad1.C0007x2ca3e0) uh1.x.this).f84637a;
                aVar3.getClass();
                return new uh1.q((uh1.u) obj, aVar3.f84631d, aVar3.f84633f, aVar3.f84634g);
            }
        }));
        if (jSONObject.optBoolean("useHttpdnsRetry", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateRequestTask", "use httpdns retry taskId:%s", str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateRequestTask", "request requestTaskId:%s,configTimeout: %d,timeout: %d,inputTimeout: %d,url:%s", str, java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(jSONObject.optInt("timeout", 0)), optString);
        if (qVar == null) {
            b(lVar, str, "create request error", 600004, null);
        } else if (z17) {
            qVar.g(lVar, i17, jSONObject, g17, aVar2.f509282p, bVar, str, ad1.e.f26x24728b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateRequestTask", "debug type, do not verify domains");
            qVar.g(lVar, i17, jSONObject, g17, null, bVar, str, ad1.e.f26x24728b);
        }
    }

    @Override // gb1.m
    /* renamed from: getTaskId */
    public java.lang.String mo1076x30961476() {
        return ((uh1.a0) uh1.s.f509433a.f509436a).f509293a.incrementAndGet() + "";
    }
}

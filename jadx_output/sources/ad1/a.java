package ad1;

/* loaded from: classes7.dex */
public class a implements gb1.m {

    /* renamed from: d, reason: collision with root package name */
    public final int f3098d;

    /* renamed from: e, reason: collision with root package name */
    public final uh1.o f3099e;

    /* renamed from: h, reason: collision with root package name */
    public final gb1.a f3102h;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3100f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3101g = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f3103i = new java.util.concurrent.atomic.AtomicBoolean(false);

    public a(int i17, uh1.o oVar, gb1.a aVar) {
        this.f3098d = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateRequestTask", "BaseCreateRequestTask<init>, programType:%d", java.lang.Integer.valueOf(i17));
        this.f3098d = i17;
        this.f3099e = oVar;
        this.f3102h = aVar;
    }

    @Override // gb1.m
    public java.lang.String a() {
        return "requestTaskId";
    }

    public final void b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2, int i17, java.util.Map map) {
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseCreateRequestTask", "sendFailMsg, requestTaskId = %s, errMsg = %s, errno = %d", str, str2, java.lang.Integer.valueOf(i17));
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
        cVar.n(this.f3102h.a(str));
    }

    @Override // gb1.m
    public void d(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        if (!this.f3103i.getAndSet(true)) {
            uh1.o oVar = this.f3099e;
            if (oVar != null) {
                this.f3100f = oVar.a(lVar.getAppId());
                this.f3101g = oVar.b(lVar.getAppId());
            }
            if (this.f3100f || this.f3101g) {
                uh1.a aVar = (uh1.a) lVar.b(uh1.a.class);
                fp.d0.o(org.chromium.net.impl.CronetLibraryLoader.libraryName());
                if (aVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BaseCreateRequestTask", "setupRequestMode config not found, setUserCertVerify false appId(%s)", lVar.getAppId());
                    com.tencent.mars.cdn.CronetLogic.setUserCertVerify(false);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateRequestTask", "setupRequestMode(%b),appId(%s)", java.lang.Boolean.valueOf(aVar.H), lVar.getAppId());
                    com.tencent.mars.cdn.CronetLogic.setUserCertVerify(aVar.H);
                }
            }
        }
        ad1.b bVar = new ad1.b(this, new java.lang.ref.WeakReference(lVar), java.lang.System.currentTimeMillis(), str, lVar);
        java.lang.String optString = jSONObject.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseCreateRequestTask", "url is null");
            b(lVar, str, "url is null or nil", 600005, null);
            return;
        }
        uh1.a aVar2 = (uh1.a) lVar.b(uh1.a.class);
        int optInt = jSONObject.optInt("timeout", 0);
        if (optInt <= 0) {
            optInt = uh1.j0.n(aVar2, 0);
        }
        int i17 = optInt > 0 ? optInt : com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        if (aVar2.f427745i <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateRequestTask", "maxRequestConcurrent <= 0 use default concurrent");
        }
        java.util.Map g17 = uh1.j0.g(jSONObject, aVar2);
        boolean z17 = jSONObject.optBoolean("__skipDomainCheck__") ? false : aVar2.f427740d;
        java.lang.String str2 = null;
        if (z17 && !uh1.j0.A(aVar2.f427749p, optString, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateRequestTask", "not in domain url %s", optString);
            try {
                str2 = new java.net.URL(optString).getHost();
            } catch (java.net.MalformedURLException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseCreateRequestTask", e17, "get url host fail Exception", new java.lang.Object[0]);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                b(lVar, str, "url not in domain list", 600002, null);
                return;
            }
            b(lVar, str, "url not in domain list:" + str2, 600002, null);
            return;
        }
        uh1.t tVar = uh1.s.f427900a;
        final ad1.a$$a a__a = new ad1.a$$a(this);
        tVar.getClass();
        iz5.a.g(null, lVar instanceof uh1.u);
        uh1.z zVar = (uh1.z) tVar.f427903a;
        zVar.getClass();
        uh1.q qVar = (uh1.q) ((uh1.w) zVar.f427946b.computeIfAbsent(uh1.a0.a((uh1.u) lVar), new java.util.function.Function() { // from class: uh1.z$$a
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                ad1.a aVar3 = ((ad1.a$$a) uh1.x.this).f3104a;
                aVar3.getClass();
                return new uh1.q((uh1.u) obj, aVar3.f3098d, aVar3.f3100f, aVar3.f3101g);
            }
        }));
        if (jSONObject.optBoolean("useHttpdnsRetry", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateRequestTask", "use httpdns retry taskId:%s", str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateRequestTask", "request requestTaskId:%s,configTimeout: %d,timeout: %d,inputTimeout: %d,url:%s", str, java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(jSONObject.optInt("timeout", 0)), optString);
        if (qVar == null) {
            b(lVar, str, "create request error", 600004, null);
        } else if (z17) {
            qVar.g(lVar, i17, jSONObject, g17, aVar2.f427749p, bVar, str, ad1.e.NAME);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateRequestTask", "debug type, do not verify domains");
            qVar.g(lVar, i17, jSONObject, g17, null, bVar, str, ad1.e.NAME);
        }
    }

    @Override // gb1.m
    public java.lang.String getTaskId() {
        return ((uh1.a0) uh1.s.f427900a.f427903a).f427760a.incrementAndGet() + "";
    }
}

package uh1;

/* loaded from: classes7.dex */
public final class q implements uh1.w {

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f509386m = "";

    /* renamed from: n, reason: collision with root package name */
    public static int f509387n;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f509388b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f509389c = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f509390d = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: e, reason: collision with root package name */
    public final int f509391e;

    /* renamed from: f, reason: collision with root package name */
    public final javax.net.ssl.SSLContext f509392f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f509393g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f509394h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f509395i;

    /* renamed from: j, reason: collision with root package name */
    public final int f509396j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f509397k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f509398l;

    public q(uh1.u uVar, int i17, boolean z17, boolean z18) {
        this.f509396j = 0;
        this.f509397k = false;
        this.f509398l = false;
        this.f509394h = new java.lang.ref.WeakReference(uVar);
        java.lang.String mo48798x74292566 = uVar.mo48798x74292566();
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f509395i = mo48798x74292566 == null ? "" : mo48798x74292566;
        uh1.a aVar = (uh1.a) uVar.b(uh1.a.class);
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkRequest", "<init> hy: config not found, appId(%s)", uVar.mo48798x74292566());
            this.f509393g = "";
            return;
        }
        this.f509391e = aVar.f509278i;
        this.f509393g = aVar.B;
        this.f509392f = uh1.j0.p(aVar);
        this.f509396j = i17;
        this.f509397k = z17;
        this.f509398l = z18;
    }

    public static void a(uh1.q qVar, uh1.r rVar) {
        java.lang.Runnable runnable;
        qVar.getClass();
        if (rVar == null || rVar.f509426v || (runnable = rVar.f509419o) == null) {
            return;
        }
        if (runnable instanceof wu5.b) {
            ((wu5.b) runnable).b();
        }
        rVar.f509426v = true;
        rVar.f509419o = null;
    }

    public static void b(uh1.q qVar, uh1.r rVar) {
        java.lang.String str;
        qVar.getClass();
        uh1.n nVar = rVar.f509409e;
        java.util.ArrayList arrayList = rVar.f509411g;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (arrayList != null && !uh1.j0.A(arrayList, rVar.f509407c, false)) {
            try {
                str = new java.net.URL(rVar.f509407c).getHost();
            } catch (java.net.MalformedURLException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandNetworkRequest", e17, "get redirect url host fail Exception", new java.lang.Object[0]);
                str = null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                qVar.c(nVar, "fail", "redirect url not in domain list", rVar.f509414j, null, 600002, null);
            } else {
                qVar.c(nVar, "fail", "redirect url not in domain list:" + str, rVar.f509414j, null, 600002, null);
            }
            ((ch1.e) ((uh1.h1) nd.f.d(uh1.h1.class, true))).b(qVar.f509395i, rVar.f509418n, rVar.f509408d, rVar.f509407c, 0L, 0L, 0, 2, rVar.c(), java.lang.System.currentTimeMillis(), "", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "sendCronetRequest not in domain url:%s,host:%s", rVar.f509407c, str);
            return;
        }
        java.lang.System.currentTimeMillis();
        uh1.p pVar = new uh1.p();
        uh1.j0.E(1095L, 0L, 1L);
        uh1.j jVar = new uh1.j(qVar, rVar, nVar, currentTimeMillis, pVar);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        cronetRequestParams.url = rVar.f509407c;
        cronetRequestParams.f18180xcb7ef180 = rVar.f509414j;
        cronetRequestParams.f18166x25da56ad = false;
        cronetRequestParams.f18159x6574fc6c = rVar.f509406b;
        cronetRequestParams.f18174xbfc5d0e1 = rVar.f509408d;
        cronetRequestParams.f18183xeddcaf63 = rVar.f509421q;
        cronetRequestParams.f18185xf72c4065 = rVar.f509422r;
        cronetRequestParams.f18184x1eb6f2fa = rVar.f509423s;
        cronetRequestParams.f18175xe83ff3e6 = true;
        cronetRequestParams.f18173x74c0bbcb = 0;
        cronetRequestParams.f18168x1292e644 = rVar.A;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f509427w) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f509429y)) {
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HostIPHint hostIPHint = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HostIPHint();
            cronetRequestParams.f18171xab1787f6 = hostIPHint;
            hostIPHint.f18217x417c7694 = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HostIpMap[1];
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HostIpMap hostIpMap = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HostIpMap();
            hostIpMap.f18218x30f5a8 = rVar.f509429y;
            hostIpMap.f134056ip = rVar.f509427w;
            hostIpMap.f18219x349881 = rVar.f509428x;
            cronetRequestParams.f18167xdeb9da8d = rVar.f509430z;
            cronetRequestParams.f18171xab1787f6.f18217x417c7694[0] = hostIpMap;
        }
        java.util.Map<java.lang.String, java.lang.String> map = rVar.f509410f;
        if (map.containsKey("Accept-Encoding")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "startCronetHttpsRequest Accept-Encoding:%s", map.get("Accept-Encoding"));
        } else {
            map.put("Accept-Encoding", "gzip,compress,br,deflate");
        }
        map.put("charset", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        map.put("User-Agent", qVar.f509393g);
        if (qVar.e(rVar.f509408d)) {
            map.put("Content-Length", java.lang.Integer.toString(rVar.f509406b.length));
        }
        cronetRequestParams.m37968xeb7416ae(map);
        ad1.b bVar = (ad1.b) nVar;
        bVar.a(uh1.j0.e(uh1.j0.H(map), 1), 0);
        uh1.k kVar = new uh1.k(qVar, rVar, bVar);
        rVar.f509419o = kVar;
        ((ku5.t0) ku5.t0.f394148d).k(kVar, rVar.f509405a);
        if (rVar.f509425u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "startCronetHttpsRequest with chunked");
            cronetRequestParams.f18181xe78dee5f = 10;
        } else {
            cronetRequestParams.f18181xe78dee5f = 1;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37962x5ffa1e0c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37962x5ffa1e0c(cronetRequestParams, jVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "sendCronetRequest prepare to send https request taskid:%s,requestid:%s,timeout:%d,url:%s", rVar.f509414j, m37962x5ffa1e0c.f18158xcb7ef180, java.lang.Integer.valueOf(rVar.f509405a), rVar.f509407c);
        if (m37962x5ffa1e0c.f18157x23aa2e05 == 0) {
            rVar.f509416l = m37962x5ffa1e0c.f18158xcb7ef180;
            uh1.j0.E(1095L, 7L, 1L);
            return;
        }
        if (!rVar.f509420p) {
            rVar.f509420p = true;
            qVar.c(bVar, "fail", "call request error:" + m37962x5ffa1e0c.f18157x23aa2e05, rVar.f509414j, null, 600004, null);
        }
        uh1.j0.E(1095L, 2L, 1L);
    }

    public final void c(uh1.n nVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.net.HttpURLConnection httpURLConnection, int i17, java.util.Map map) {
        f(str3, httpURLConnection);
        ((ad1.b) nVar).b(str, str2, i17, map);
    }

    public final void d(uh1.n nVar, java.lang.String str, java.lang.Object obj, int i17, org.json.JSONObject jSONObject, java.lang.String str2, java.net.HttpURLConnection httpURLConnection, java.util.Map map, java.util.Map map2) {
        f(str2, httpURLConnection);
        ad1.b bVar = (ad1.b) nVar;
        bVar.getClass();
        int length = (obj == null || !(obj instanceof java.nio.ByteBuffer)) ? (obj == null || !(obj instanceof java.lang.String)) ? 0 : ((java.lang.String) obj).length() : ((java.nio.ByteBuffer) obj).array().length;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) bVar.f84638a.get();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = bVar.f84639b;
        java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis - j17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(length);
        java.lang.String str3 = bVar.f84640c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateRequestTask", "onRequestResultWithCode, time: %d, data size: %d,requestTaskId %s", valueOf, valueOf2, str3);
        if (lVar == null) {
            return;
        }
        uh1.q a17 = uh1.s.f509433a.a(lVar);
        if (a17 == null || !((java.util.concurrent.ConcurrentSkipListSet) a17.f509389c).contains(str3)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("requestTaskId", str3);
            if (str.equalsIgnoreCase("ok")) {
                hashMap.put("state", ya.b.f77504xbb80cbe3);
                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, obj);
                if (map != null && map.size() > 0) {
                    hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, map);
                }
            } else {
                hashMap.put("state", "fail");
            }
            hashMap.put("statusCode", java.lang.Integer.valueOf(i17));
            if (jSONObject != null) {
                hashMap.put("header", jSONObject);
            }
            if (map2 != null && map2.size() > 0) {
                map2.put("invokeTime", java.lang.Long.valueOf(j17));
                map2.put("wxlibCallbackTimestamp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                hashMap.put("clientInfo", map2);
            }
            ad1.c cVar = new ad1.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(lVar.mo50357xcd94f799(), hashMap, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) lVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class));
            ad1.a aVar = bVar.f84642e;
            if ((obj != null && (obj instanceof java.lang.String)) || d17 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.OK) {
                java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
                cVar.p(lVar);
                cVar.f163907f = jSONObject2;
                cVar.n(aVar.f84635h.a(str3));
            } else if (d17 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.b(lVar, ad1.c.f22x24728b);
            }
            aVar.f84635h.b(str3);
        }
    }

    public final boolean e(java.lang.String str) {
        int i17 = this.f509396j;
        return ((i17 == 0 && this.f509397k) || (i17 == 1 && this.f509398l)) ? str.equalsIgnoreCase("POST") || str.equalsIgnoreCase("PUT") || str.equalsIgnoreCase("DELETE") || str.equalsIgnoreCase("PATCH") : str.equalsIgnoreCase("POST") || str.equalsIgnoreCase("PUT") || str.equalsIgnoreCase("DELETE");
    }

    public final void f(java.lang.String str, java.net.HttpURLConnection httpURLConnection) {
        synchronized (this) {
            if (str != null) {
                synchronized (this.f509388b) {
                    java.util.Iterator it = this.f509388b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        uh1.r rVar = (uh1.r) it.next();
                        if (str.equals(rVar.f509414j)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "lm:real removeTask %s", rVar.f509414j);
                            this.f509388b.remove(rVar);
                            break;
                        }
                    }
                }
            }
        }
        if (httpURLConnection != null) {
            try {
                httpURLConnection.getInputStream().close();
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandNetworkRequest", e17, "removeTask Exception: id %s", str);
            }
        }
    }

    /* renamed from: finalize */
    public void m168042xd764dc1e() {
        mo168031x41012807();
        super.finalize();
    }

    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, org.json.JSONObject jSONObject, java.util.Map map, java.util.ArrayList arrayList, uh1.n nVar, java.lang.String str, java.lang.String str2) {
        ((java.util.concurrent.ConcurrentSkipListSet) this.f509390d).add(str);
        uh1.l lVar2 = new uh1.l(this, str, lVar, jSONObject, nVar, i17, arrayList, str2, map);
        ((ku5.t0) ku5.t0.f394148d).g(new uh1.m(this, lVar2, str));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    public final void h(uh1.r r66) {
        /*
            Method dump skipped, instructions count: 11549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uh1.q.h(uh1.r):void");
    }

    @Override // uh1.w
    /* renamed from: release */
    public void mo168031x41012807() {
        synchronized (this.f509388b) {
            this.f509388b.clear();
        }
        ((java.util.concurrent.ConcurrentSkipListSet) this.f509390d).clear();
        ((java.util.concurrent.ConcurrentSkipListSet) this.f509389c).clear();
    }
}

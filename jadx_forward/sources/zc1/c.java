package zc1;

/* loaded from: classes7.dex */
public class c implements gb1.m {

    /* renamed from: d, reason: collision with root package name */
    public final uh1.e f552931d;

    /* renamed from: f, reason: collision with root package name */
    public final gb1.a f552933f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f552932e = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f552934g = new java.util.concurrent.atomic.AtomicBoolean(false);

    public c(uh1.e eVar, gb1.a aVar) {
        this.f552931d = eVar;
        this.f552933f = aVar;
    }

    public static boolean b(zc1.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        cVar.getClass();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.i.f509331b;
        uh1.f a17 = uh1.h.f509328a.a(lVar.mo48798x74292566());
        if (a17 == null || !a17.f509323g.contains(str)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateDownloadTask", "download abort %s", str);
        return true;
    }

    @Override // gb1.m
    public java.lang.String a() {
        return "downloadTaskId";
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r27, uh1.a r28, boolean r29, org.json.JSONObject r30, int r31, java.util.Map r32, uh1.d r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc1.c.c(com.tencent.mm.plugin.appbrand.jsapi.l, uh1.a, boolean, org.json.JSONObject, int, java.util.Map, uh1.d, java.lang.String):void");
    }

    @Override // gb1.m
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        if (!this.f552934g.getAndSet(true)) {
            if (this.f552931d != null) {
                lVar.mo48798x74292566();
                this.f552932e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.vf.a(3);
            }
            if (this.f552932e) {
                uh1.a aVar = (uh1.a) lVar.b(uh1.a.class);
                fp.d0.o(org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154080xdba63de6());
                if (aVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseCreateDownloadTask", "setupRequestMode config not found, setUserCertVerify false appId(%s)", lVar.mo48798x74292566());
                    com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37958xae0bceea(false);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateDownloadTask", "setupRequestMode(%b),appId(%s)", java.lang.Boolean.valueOf(aVar.H), lVar.mo48798x74292566());
                    com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37958xae0bceea(aVar.H);
                }
            }
        }
        lVar.mo48798x74292566();
        zc1.a aVar2 = new zc1.a(this, jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1), lVar, str);
        uh1.a aVar3 = (uh1.a) lVar.b(uh1.a.class);
        java.util.Map g17 = uh1.j0.g(jSONObject, aVar3);
        java.lang.String optString = jSONObject.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateDownloadTask", "url is null");
            e(lVar, str, "url is null or nil", 600005);
            return;
        }
        boolean z17 = jSONObject.optBoolean("__skipDomainCheck__") ? false : aVar3.f509273d;
        if (z17 && !uh1.j0.A(aVar3.f509285s, optString, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateDownloadTask", "not in domain url %s", optString);
            e(lVar, str, "url not in domain list", 600002);
            return;
        }
        if (aVar3.f509281o <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateDownloadTask", "maxDownloadConcurrent <= 0 ");
        }
        int optInt = jSONObject.optInt("timeout", 0);
        if (optInt <= 0) {
            optInt = uh1.j0.n(aVar3, 3);
        }
        if (optInt <= 0) {
            optInt = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        }
        c(lVar, aVar3, z17, jSONObject, optInt, g17, aVar2, str);
    }

    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseCreateDownloadTask", "sendFailMsg, downloadTaskId = %s, errMsg = %s, errno = %d", str, str2, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadTaskId", str);
        hashMap.put("state", "fail");
        hashMap.put("errno", java.lang.Integer.valueOf(i17));
        hashMap.put("errMsg", str2);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        zc1.b bVar = new zc1.b();
        bVar.p(lVar);
        bVar.r(jSONObject);
        bVar.n(this.f552933f.a(str));
    }

    @Override // gb1.m
    /* renamed from: getTaskId */
    public java.lang.String mo1076x30961476() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.i.f509331b;
        uh1.h.f509328a.getClass();
        sb6.append(uh1.i.f509331b.incrementAndGet());
        sb6.append("");
        return sb6.toString();
    }
}

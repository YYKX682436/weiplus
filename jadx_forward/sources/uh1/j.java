package uh1;

/* loaded from: classes7.dex */
public class j implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh1.r f509336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uh1.n f509337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f509338c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uh1.p f509339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh1.q f509340e;

    public j(uh1.q qVar, uh1.r rVar, uh1.n nVar, long j17, uh1.p pVar) {
        this.f509340e = qVar;
        this.f509336a = rVar;
        this.f509337b = nVar;
        this.f509338c = j17;
        this.f509339d = pVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveChunkedData */
    public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17) {
        uh1.r rVar = this.f509336a;
        java.lang.String str = rVar.f509414j;
        if (chunkedData == null || chunkedData.f18148x2eefaa == null || j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandNetworkRequest", "onCronetReceiveChunkedData invaild length length:%d,taskid is %s,cronettaskid is %s", java.lang.Long.valueOf(j17), rVar.f509414j, rVar.f509416l);
            return;
        }
        uh1.q.a(this.f509340e, rVar);
        java.nio.ByteBuffer e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(chunkedData.f18148x2eefaa);
        ad1.b bVar = (ad1.b) this.f509337b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) bVar.f84638a.get();
        if (lVar == null) {
            return;
        }
        uh1.q a17 = uh1.s.f509433a.a(lVar);
        java.lang.String str2 = bVar.f84640c;
        if (a17 == null || !((java.util.concurrent.ConcurrentSkipListSet) a17.f509389c).contains(str2)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("requestTaskId", str2);
            hashMap.put("state", "chunked");
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, e17);
            ad1.c cVar = new ad1.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(lVar.getF229341e(), hashMap, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) lVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class));
            if (d17 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.OK) {
                if (d17 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.b(lVar, ad1.c.f22x24728b);
                }
            } else {
                java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
                cVar.p(lVar);
                cVar.f163907f = jSONObject;
                cVar.n(bVar.f84642e.f84635h.a(str2));
            }
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveHeader */
    public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader, int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        uh1.r rVar = this.f509336a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "cronet file request onCronetReceiveHeader status %d,protocol %s,taskid:%s,CronetRequestId:%s", valueOf, str, rVar.f509414j, rVar.f509416l);
        org.json.JSONObject e17 = uh1.j0.e(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37942x641bb0c1(responseHeader), 2);
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                e17.put("protocol", str);
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandNetworkRequest", e18, "JSONException: request onCronetReceiveHeader put protocol error", new java.lang.Object[0]);
        }
        ((ad1.b) this.f509337b).a(e17, i17);
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        int i17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cronetTaskResult.f18200x139cb015);
        java.lang.String str3 = cronetTaskResult.f18201x5336c059;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cronetTaskResult.f18207xec0a8ff);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(cronetTaskResult.f18209x953f8a7);
        uh1.r rVar = this.f509336a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "cronet onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d,totalReceiveByte:%d,taskid:%s,CronetRequestId:%s", valueOf, str3, valueOf2, valueOf3, rVar.f509414j, rVar.f509416l);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.WebPageProfile webPageProfile = cronetTaskResult.f18214x153dd026;
        if (webPageProfile != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "cronet onCronetTaskCompleted profile, protocol:%s, ip:%s, port:%d", webPageProfile.f18246xc50a8e98, webPageProfile.f18244xc4ddaa09, java.lang.Integer.valueOf(webPageProfile.f18245x349881));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "cronet profile is empty");
        }
        uh1.q qVar = this.f509340e;
        uh1.q.a(qVar, rVar);
        if (cronetTaskResult.f18200x139cb015 == 0) {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> m37976xd962a517 = cronetTaskResult.m37976xd962a517();
            org.json.JSONObject e17 = uh1.j0.e(m37976xd962a517, 2);
            int i18 = cronetTaskResult.f18207xec0a8ff;
            if (i18 != 200) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkRequest", "cronet failed code: %d,url is %s", java.lang.Integer.valueOf(i18), rVar.f509407c);
                if (uh1.j0.B(i18)) {
                    java.lang.String str4 = cronetTaskResult.f18203xbc380d75;
                    if (rVar.B) {
                        try {
                            e17.put("Location", str4);
                        } catch (org.json.JSONException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandNetworkRequest", e18, "JSONException: request onCronetReceiveHeader put Location error", new java.lang.Object[0]);
                        }
                        ((ad1.b) this.f509337b).a(e17, i18);
                        if (rVar.f509420p) {
                            i17 = i18;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkRequest", "cronet onC2CDownloadCompleted manual redirect already callback");
                        } else {
                            rVar.f509420p = true;
                            if (rVar.f509424t) {
                                i17 = i18;
                                this.f509340e.d(this.f509337b, "ok", "", i18, e17, rVar.f509414j, null, uh1.j0.k(cronetTaskResult.f18214x153dd026), null);
                            } else {
                                i17 = i18;
                                this.f509340e.d(this.f509337b, "ok", "", i17, e17, rVar.f509414j, null, null, null);
                            }
                        }
                    } else {
                        i17 = i18;
                        int i19 = rVar.f509412h;
                        if (!android.text.TextUtils.isEmpty(str4)) {
                            if (i19 > 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "cronet redirect(%d) URL(%s) to URL(%s)", java.lang.Integer.valueOf(i19), rVar.f509407c, str4);
                                rVar.f509407c = str4;
                                rVar.f509412h = i19 - 1;
                                uh1.q.b(qVar, rVar);
                                return;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandNetworkRequest", "cronet reach the max redirect count(%d)", 15);
                            if (rVar.f509420p) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkRequest", "cronet onC2CDownloadCompleted max redirect already callback");
                            } else {
                                rVar.f509420p = true;
                                if (rVar.f509424t) {
                                    this.f509340e.d(this.f509337b, "ok", "reach the max redirect count 15", i17, e17, rVar.f509414j, null, uh1.j0.k(cronetTaskResult.f18214x153dd026), null);
                                } else {
                                    this.f509340e.d(this.f509337b, "ok", "reach the max redirect count 15", i17, e17, rVar.f509414j, null, null, null);
                                }
                            }
                            uh1.j0.E(1095L, 1L, 1L);
                            return;
                        }
                    }
                } else {
                    i17 = i18;
                }
                uh1.j0.E(1095L, 3L, 1L);
            } else {
                i17 = i18;
            }
            java.lang.Object e19 = "arraybuffer".equals(rVar.f509413i) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(cronetTaskResult.f18198x2eefaa) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w3.a(cronetTaskResult.m37974x3a5e0c51());
            if (rVar.f509420p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkRequest", "cronet onC2CDownloadCompleted if already callback");
            } else {
                rVar.f509420p = true;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("beginCGITimestamp", java.lang.Long.valueOf(this.f509338c));
                hashMap.put("CGICallbackTimestamp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                java.util.HashMap hashMap2 = new java.util.HashMap();
                if (m37976xd962a517 != null) {
                    for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : m37976xd962a517.entrySet()) {
                        java.lang.String key = entry.getKey();
                        java.util.List<java.lang.String> value = entry.getValue();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(key) && value != null && !value.isEmpty()) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(value.get(0));
                            for (int i27 = 1; i27 < value.size(); i27++) {
                                sb6.append(",");
                                sb6.append(value.get(i27));
                            }
                            hashMap2.put(key, sb6.toString());
                        }
                    }
                }
                java.lang.System.currentTimeMillis();
                qVar.getClass();
                if (rVar.f509424t) {
                    this.f509340e.d(this.f509337b, "ok", e19, cronetTaskResult.f18207xec0a8ff, e17, rVar.f509414j, null, uh1.j0.k(cronetTaskResult.f18214x153dd026), hashMap);
                } else {
                    this.f509340e.d(this.f509337b, "ok", e19, cronetTaskResult.f18207xec0a8ff, e17, rVar.f509414j, null, null, hashMap);
                }
            }
            java.lang.System.currentTimeMillis();
            uh1.j0.E(1095L, 8L, 1L);
            ((ch1.e) ((uh1.h1) nd.f.d(uh1.h1.class, true))).b(qVar.f509395i, rVar.f509418n, rVar.f509408d, rVar.f509407c, rVar.d(), cronetTaskResult.f18209x953f8a7, i17, 1, rVar.c(), java.lang.System.currentTimeMillis(), "", "");
        } else {
            if (rVar.f509420p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkRequest", "onC2CDownloadCompleted else already callback");
            } else {
                rVar.f509420p = true;
                java.util.HashMap hashMap3 = new java.util.HashMap();
                hashMap3.put("requestURL", rVar.f509407c);
                java.lang.String str5 = cronetTaskResult.f18200x139cb015 + ":" + cronetTaskResult.f18201x5336c059;
                java.lang.System.currentTimeMillis();
                qVar.getClass();
                this.f509340e.c(this.f509337b, "fail", str5, rVar.f509414j, null, 600001, hashMap3);
            }
            ((ch1.e) ((uh1.h1) nd.f.d(uh1.h1.class, true))).b(qVar.f509395i, rVar.f509418n, rVar.f509408d, rVar.f509407c, rVar.d(), 0L, 0, 2, rVar.c(), java.lang.System.currentTimeMillis(), "", "");
            uh1.j0.E(1095L, 5L, 1L);
        }
        ((java.util.concurrent.ConcurrentSkipListSet) qVar.f509389c).remove(rVar.f509414j);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
        uh1.q qVar = this.f509340e;
        uh1.u uVar = (uh1.u) qVar.f509394h.get();
        uh1.r rVar = this.f509336a;
        if (uVar != null) {
            int ordinal = uVar.mo48799xc0ccc466().ordinal();
            if (!(ordinal == 2 || ordinal == 3)) {
                if (rVar.f509420p) {
                    return;
                }
                long j17 = cronetDownloadProgress.f18156xdd8f6e6c;
                uh1.n nVar = this.f509337b;
                uh1.p pVar = this.f509339d;
                if (j17 > 0) {
                    long j18 = cronetDownloadProgress.f18155xf006a00e;
                    if (j18 > j17) {
                        pVar.f509383a = 100;
                    } else {
                        pVar.f509383a = (int) ((100 * j18) / j17);
                    }
                    int i17 = pVar.f509384b;
                    int i18 = pVar.f509383a;
                    if (i17 != i18) {
                        ((ad1.b) nVar).c(rVar.f509414j, rVar.f509407c, i18, j18, j17);
                        pVar.f509384b = pVar.f509383a;
                    }
                } else {
                    long j19 = pVar.f509385c;
                    long j27 = cronetDownloadProgress.f18155xf006a00e;
                    if (j19 != j27) {
                        ((ad1.b) nVar).c(rVar.f509414j, rVar.f509407c, 0, j27, 0L);
                        pVar.f509385c = cronetDownloadProgress.f18155xf006a00e;
                    }
                }
                if (pVar.f509383a == 100) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "cronet request size %d, totalSize %d, percent = %d", java.lang.Long.valueOf(cronetDownloadProgress.f18155xf006a00e), java.lang.Long.valueOf(cronetDownloadProgress.f18156xdd8f6e6c), java.lang.Integer.valueOf(pVar.f509383a));
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkRequest", "onDownloadProgressChanged shouldStopTask fileKey:%s,taskid is %s,cronettaskid is %s", str, rVar.f509414j, rVar.f509416l);
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(rVar.f509416l);
        if (rVar.f509420p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkRequest", "onDownloadProgressChanged already callback");
        } else {
            rVar.f509420p = true;
            this.f509340e.c(this.f509337b, "fail", "fail:network interrupted error", rVar.f509414j, null, 600003, null);
        }
        uh1.q.a(qVar, rVar);
    }
}

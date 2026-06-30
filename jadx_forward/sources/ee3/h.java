package ee3;

/* loaded from: classes7.dex */
public class h implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wu5.b f333139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ee3.i f333140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ee3.j f333141c;

    public h(ee3.j jVar, wu5.b bVar, ee3.i iVar) {
        this.f333141c = jVar;
        this.f333139a = bVar;
        this.f333140b = iVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveChunkedData */
    public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveHeader */
    public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader, int i17, java.lang.String str) {
        long j17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        ee3.j jVar = this.f333141c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet file download onCronetReceiveHeader status %d,protocol %s,taskid:%s,CronetRequestId:%s", valueOf, str, jVar.f333157t, jVar.f333158u);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> m37942x641bb0c1 = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37942x641bb0c1(responseHeader);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (m37942x641bb0c1 != null) {
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : m37942x641bb0c1.entrySet()) {
                java.lang.String key = entry.getKey();
                java.util.List<java.lang.String> value = entry.getValue();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(key) && value != null && !value.isEmpty()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(value.get(0));
                    for (int i18 = 1; i18 < value.size(); i18++) {
                        sb6.append(",");
                        sb6.append(value.get(i18));
                    }
                    try {
                        jSONObject.put(key, sb6.toString());
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicBrushNetworkUtil", e17, "JSONException: getHeaderJsonObject put header error", new java.lang.Object[0]);
                    }
                }
            }
        }
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                jSONObject.put("protocol", str);
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicBrushDownloadWorker", e18, "JSONException: download onCronetReceiveHeader put protocol error", new java.lang.Object[0]);
        }
        this.f333141c.f333146f.g(jSONObject, i17);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> it = m37942x641bb0c1.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                j17 = 0;
                break;
            }
            java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> next = it.next();
            java.lang.String key2 = next.getKey();
            java.util.List<java.lang.String> value2 = next.getValue();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(key2) && value2 != null && !value2.isEmpty()) {
                if (key2.equals("Content-Length")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "onCronetReceiveHeader Content-Length:%s", value2.get(0));
                    j17 = java.lang.Long.parseLong(value2.get(0));
                    break;
                }
                if (key2.equals("content-length")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "onCronetReceiveHeader content-length:%s", value2.get(0));
                    j17 = java.lang.Long.parseLong(value2.get(0));
                    break;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetReceiveHeader contentLength:%d", java.lang.Long.valueOf(j17));
        if (j17 <= 0 || this.f333141c.f333155r <= 0 || j17 <= this.f333141c.f333155r) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "onCronetReceiveHeader before actually read stream, contentLength %d exceed limit", java.lang.Long.valueOf(j17));
        if (this.f333141c.f333148h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetReceiveHeader max file size already callback");
        } else {
            this.f333141c.f333148h = true;
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f333141c.f333158u);
            ee3.j jVar2 = this.f333141c;
            jVar2.f333146f.d(jVar2.f333151n, jVar2.f333150m, "fail:exceed max file size", 303301);
        }
        wu5.b bVar = this.f333139a;
        if (bVar == null) {
            return -1;
        }
        bVar.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetReceiveHeader exceed max file size TimerTask cancel");
        return -1;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cronetTaskResult.f18200x139cb015);
        java.lang.String str3 = cronetTaskResult.f18201x5336c059;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cronetTaskResult.f18207xec0a8ff);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(cronetTaskResult.f18209x953f8a7);
        ee3.j jVar = this.f333141c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d,totalReceiveByte:%d,taskid:%s,CronetRequestId:%s,fileKey:%s", valueOf, str3, valueOf2, valueOf3, jVar.f333157t, jVar.f333158u, str);
        wu5.b bVar = this.f333139a;
        if (bVar != null) {
            bVar.b();
        }
        ((ku5.t0) ku5.t0.f394148d).g(new ee3.g(this, cronetTaskResult));
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
        int i17;
        ee3.j jVar = this.f333141c;
        lc3.h0 h0Var = jVar.f333145e;
        if (h0Var != null && ((i17 = ((sc3.k1) h0Var).G) == 8 || i17 == 16)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicBrushDownloadWorker", "onDownloadProgressChanged shouldStopTask fileKey:%s,taskid %s,CronetRequestId:%s", str, jVar.f333157t, jVar.f333158u);
            if (this.f333141c.f333148h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushDownloadWorker", "onDownloadProgressChanged already callback");
            } else {
                this.f333141c.f333148h = true;
                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f333141c.f333158u);
                ee3.j jVar2 = this.f333141c;
                jVar2.f333146f.d(jVar2.f333151n, jVar2.f333150m, "fail:network interrupted error", 300003);
            }
            wu5.b bVar = this.f333139a;
            if (bVar != null) {
                bVar.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet onDownloadProgressChanged shouldStopTask TimerTask cancel");
                return;
            }
            return;
        }
        if (cronetDownloadProgress.f18155xf006a00e > 0 && jVar.f333155r > 0 && (cronetDownloadProgress.f18155xf006a00e > this.f333141c.f333155r || cronetDownloadProgress.f18156xdd8f6e6c > this.f333141c.f333155r)) {
            if (this.f333141c.f333148h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushDownloadWorker", "cronet onDownloadProgressChanged max file size already callback");
                return;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(cronetDownloadProgress.f18155xf006a00e);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(cronetDownloadProgress.f18156xdd8f6e6c);
            ee3.j jVar3 = this.f333141c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "onDownloadProgressChanged currentWriteByte %d or progress.totalByte %d exceed limit,fileKey:%s,taskid %s,CronetRequestId:%s", valueOf, valueOf2, str, jVar3.f333157t, jVar3.f333158u);
            this.f333141c.f333148h = true;
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f333141c.f333158u);
            ee3.j jVar4 = this.f333141c;
            jVar4.f333146f.d(jVar4.f333151n, jVar4.f333150m, "fail:exceed max file size", 303301);
            wu5.b bVar2 = this.f333139a;
            if (bVar2 != null) {
                bVar2.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet onDownloadProgressChanged exceed max file size TimerTask cancel");
                return;
            }
            return;
        }
        if (cronetDownloadProgress.f18156xdd8f6e6c <= 0 || !this.f333141c.f333147g) {
            return;
        }
        long j17 = cronetDownloadProgress.f18156xdd8f6e6c;
        if (j17 > 0) {
            long j18 = cronetDownloadProgress.f18155xf006a00e;
            if (j18 > j17) {
                this.f333140b.f333142a = 100;
            } else {
                this.f333140b.f333142a = (int) ((100 * j18) / j17);
            }
            ee3.i iVar = this.f333140b;
            int i18 = iVar.f333143b;
            int i19 = iVar.f333142a;
            if (i18 != i19) {
                ee3.j jVar5 = this.f333141c;
                jVar5.f333146f.f(jVar5.f333151n, jVar5.f333150m, i19, j18, j17);
                ee3.i iVar2 = this.f333140b;
                iVar2.f333143b = iVar2.f333142a;
            }
        } else {
            ee3.j jVar6 = this.f333141c;
            jVar6.f333146f.f(jVar6.f333151n, jVar6.f333150m, this.f333140b.f333142a, cronetDownloadProgress.f18155xf006a00e, 0L);
        }
        if (this.f333140b.f333142a == 100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushDownloadWorker", "cronet download size %d, totalSize %d, percent = %d", java.lang.Long.valueOf(cronetDownloadProgress.f18155xf006a00e), java.lang.Long.valueOf(cronetDownloadProgress.f18156xdd8f6e6c), java.lang.Integer.valueOf(this.f333140b.f333142a));
        }
    }
}

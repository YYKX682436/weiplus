package wh1;

/* loaded from: classes7.dex */
public class c implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wu5.b f527453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wh1.d f527454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wh1.e f527455c;

    public c(wh1.e eVar, wu5.b bVar, wh1.d dVar) {
        this.f527455c = eVar;
        this.f527453a = bVar;
        this.f527454b = dVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveChunkedData */
    public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveHeader */
    public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader, int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        wh1.e eVar = this.f527455c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "cronet file upload onCronetReceiveHeader status %d,protocol %s,taskid:%s,CronetRequestId:%s", valueOf, str, eVar.f527474w, eVar.f527476y);
        org.json.JSONObject e17 = uh1.j0.e(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37942x641bb0c1(responseHeader), 2);
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                e17.put("protocol", str);
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandNetworkUploadWorker", e18, "JSONException: upload onCronetReceiveHeader put protocol error", new java.lang.Object[0]);
        }
        ((uh1.b0) eVar.f527460f).d(e17);
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
        if (uh1.j0.G(this.f527455c.f527459e)) {
            wh1.e eVar = this.f527455c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandNetworkUploadWorker", "onCronetReceiveUploadProgress shouldStopTask taskid %s,CronetRequestId:%s", eVar.f527474w, eVar.f527476y);
            if (this.f527455c.f527462h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkUploadWorker", "onCronetReceiveUploadProgress already callback");
            } else {
                this.f527455c.f527462h = true;
                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f527455c.f527476y);
                wh1.e eVar2 = this.f527455c;
                ((uh1.b0) eVar2.f527460f).a(eVar2.f527466o, eVar2.f527464m, "fail:network interrupted error", 600003);
            }
            wu5.b bVar = this.f527453a;
            if (bVar != null) {
                bVar.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "cronet onCronetReceiveUploadProgress shouldStopTask TimerTask cancel");
                return;
            }
            return;
        }
        if (j18 <= 0 || !this.f527455c.f527461g) {
            return;
        }
        if (j18 > 0) {
            if (j17 > j18) {
                this.f527454b.f527456a = 100;
            } else {
                this.f527454b.f527456a = (int) ((100 * j17) / j18);
            }
            wh1.d dVar = this.f527454b;
            int i17 = dVar.f527457b;
            int i18 = dVar.f527456a;
            if (i17 != i18) {
                wh1.e eVar3 = this.f527455c;
                wh1.f fVar = eVar3.f527460f;
                ((uh1.b0) fVar).e(eVar3.f527466o, eVar3.f527464m, i18, j17, j18);
                wh1.d dVar2 = this.f527454b;
                dVar2.f527457b = dVar2.f527456a;
            }
        } else {
            wh1.e eVar4 = this.f527455c;
            wh1.f fVar2 = eVar4.f527460f;
            ((uh1.b0) fVar2).e(eVar4.f527466o, eVar4.f527464m, this.f527454b.f527456a, j17, 0L);
        }
        if (this.f527454b.f527456a == 100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "cronet upload size %d, totalSize %d, percent = %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f527454b.f527456a));
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        wu5.b bVar = this.f527453a;
        if (bVar != null) {
            bVar.b();
        }
        ((ku5.t0) ku5.t0.f394148d).g(new wh1.b(this, cronetTaskResult));
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
    }
}

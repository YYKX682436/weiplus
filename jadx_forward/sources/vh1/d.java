package vh1;

/* loaded from: classes7.dex */
public class d implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wu5.b f518546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh1.e f518547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vh1.f f518548c;

    public d(vh1.f fVar, wu5.b bVar, vh1.e eVar) {
        this.f518548c = fVar;
        this.f518546a = bVar;
        this.f518547b = eVar;
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
        vh1.f fVar = this.f518548c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "cronet file download onCronetReceiveHeader status %d,protocol %s,taskid:%s,CronetRequestId:%s", valueOf, str, fVar.f518566v, fVar.f518568x);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> m37942x641bb0c1 = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37942x641bb0c1(responseHeader);
        org.json.JSONObject e17 = uh1.j0.e(m37942x641bb0c1, 2);
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                e17.put("protocol", str);
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandDownloadWorker", e18, "JSONException: download onCronetReceiveHeader put protocol error", new java.lang.Object[0]);
        }
        this.f518548c.f518553f.a(e17);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> it = m37942x641bb0c1.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                j17 = 0;
                break;
            }
            java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> next = it.next();
            java.lang.String key = next.getKey();
            java.util.List<java.lang.String> value = next.getValue();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(key) && value != null && !value.isEmpty()) {
                if (key.equals("Content-Length")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "onCronetReceiveHeader Content-Length:%s", value.get(0));
                    j17 = java.lang.Long.parseLong(value.get(0));
                    break;
                }
                if (key.equals("content-length")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "onCronetReceiveHeader content-length:%s", value.get(0));
                    j17 = java.lang.Long.parseLong(value.get(0));
                    break;
                }
            }
        }
        if (j17 > 0) {
            uh1.j0.E(1197L, 16L, j17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetReceiveHeader contentLength fail");
        }
        if (j17 <= 0 || this.f518548c.f518564t <= 0 || j17 <= this.f518548c.f518564t) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "onCronetReceiveHeader, contentLength %d exceed limit", java.lang.Long.valueOf(j17));
        if (this.f518548c.f518555h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetReceiveHeader max file size already callback");
        } else {
            this.f518548c.f518555h = true;
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f518548c.f518568x);
            vh1.f fVar2 = this.f518548c;
            fVar2.f518553f.d(fVar2.f518557m, fVar2.f518556i, "fail:exceed max file size", 603301);
        }
        wu5.b bVar = this.f518546a;
        if (bVar == null) {
            return -1;
        }
        bVar.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "cronet onCronetReceiveHeader exceed max file size TimerTask cancel");
        return -1;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        wu5.b bVar = this.f518546a;
        if (bVar != null) {
            bVar.b();
        }
        ((ku5.t0) ku5.t0.f394148d).g(new vh1.c(this, cronetTaskResult));
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
        if (uh1.j0.G(this.f518548c.f518552e)) {
            vh1.f fVar = this.f518548c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandDownloadWorker", "onDownloadProgressChanged shouldStopTask taskid %s,CronetRequestId:%s", fVar.f518566v, fVar.f518568x);
            if (this.f518548c.f518555h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDownloadWorker", "onDownloadProgressChanged already callback");
            } else {
                this.f518548c.f518555h = true;
                com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f518548c.f518568x);
                vh1.f fVar2 = this.f518548c;
                fVar2.f518553f.d(fVar2.f518557m, fVar2.f518556i, "fail:network interrupted error", 600003);
            }
            wu5.b bVar = this.f518546a;
            if (bVar != null) {
                bVar.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "cronet onDownloadProgressChanged shouldStopTask TimerTask cancel");
                return;
            }
            return;
        }
        if (cronetDownloadProgress.f18155xf006a00e > 0 && this.f518548c.f518564t > 0 && (cronetDownloadProgress.f18155xf006a00e > this.f518548c.f518564t || cronetDownloadProgress.f18156xdd8f6e6c > this.f518548c.f518564t)) {
            if (this.f518548c.f518555h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDownloadWorker", "cronet onDownloadProgressChanged max file size already callback");
                return;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(cronetDownloadProgress.f18155xf006a00e);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(cronetDownloadProgress.f18156xdd8f6e6c);
            vh1.f fVar3 = this.f518548c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "onDownloadProgressChanged writeByte %d or totalByte %d exceed limit,taskid %s,CronetRequestId:%s", valueOf, valueOf2, fVar3.f518566v, fVar3.f518568x);
            this.f518548c.f518555h = true;
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f518548c.f518568x);
            vh1.f fVar4 = this.f518548c;
            fVar4.f518553f.d(fVar4.f518557m, fVar4.f518556i, "fail:exceed max file size", 603301);
            wu5.b bVar2 = this.f518546a;
            if (bVar2 != null) {
                bVar2.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "cronet onDownloadProgressChanged exceed max file size TimerTask cancel");
                return;
            }
            return;
        }
        if (cronetDownloadProgress.f18156xdd8f6e6c <= 0 || !this.f518548c.f518554g) {
            return;
        }
        long j17 = cronetDownloadProgress.f18156xdd8f6e6c;
        if (j17 > 0) {
            long j18 = cronetDownloadProgress.f18155xf006a00e;
            if (j18 > j17) {
                this.f518547b.f518549a = 100;
            } else {
                this.f518547b.f518549a = (int) ((100 * j18) / j17);
            }
            vh1.e eVar = this.f518547b;
            int i17 = eVar.f518550b;
            int i18 = eVar.f518549a;
            if (i17 != i18) {
                vh1.f fVar5 = this.f518548c;
                fVar5.f518553f.f(fVar5.f518557m, fVar5.f518556i, i18, j18, j17);
                vh1.e eVar2 = this.f518547b;
                eVar2.f518550b = eVar2.f518549a;
            }
        } else {
            vh1.f fVar6 = this.f518548c;
            fVar6.f518553f.f(fVar6.f518557m, fVar6.f518556i, this.f518547b.f518549a, cronetDownloadProgress.f18155xf006a00e, 0L);
        }
        if (this.f518547b.f518549a == 100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDownloadWorker", "cronet download size %d, totalSize %d, percent = %d", java.lang.Long.valueOf(cronetDownloadProgress.f18155xf006a00e), java.lang.Long.valueOf(cronetDownloadProgress.f18156xdd8f6e6c), java.lang.Integer.valueOf(this.f518547b.f518549a));
        }
    }
}

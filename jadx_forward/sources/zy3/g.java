package zy3;

/* loaded from: classes7.dex */
public final class g implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy3.h f559183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f559184b;

    public g(zy3.h hVar, long j17) {
        this.f559183a = hVar;
        this.f559184b = j17;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveChunkedData */
    public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveHeader */
    public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader, int i17, java.lang.String str) {
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        zy3.h hVar = this.f559183a;
        if (cronetTaskResult == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(hVar.f559185a, "result is null");
            zy3.f fVar = hVar.f559186b;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f559185a, "cronet onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d", java.lang.Integer.valueOf(cronetTaskResult.f18200x139cb015), cronetTaskResult.f18201x5336c059, java.lang.Integer.valueOf(cronetTaskResult.f18207xec0a8ff));
        if (cronetTaskResult.f18200x139cb015 != 0) {
            zy3.f fVar2 = hVar.f559186b;
            return;
        }
        org.json.JSONObject e17 = uh1.j0.e(cronetTaskResult.m37976xd962a517(), 2);
        int i17 = cronetTaskResult.f18207xec0a8ff;
        if (i17 != 200) {
            java.lang.String str3 = "cronet failed codoe: " + i17 + ",url: " + hVar.f559187c.url;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(hVar.f559185a, str3);
            zy3.f fVar3 = hVar.f559186b;
            if (fVar3 != null) {
                ((zy3.i) fVar3).a("fail", str3, i17, e17, null, null);
                return;
            }
            return;
        }
        java.lang.String m37974x3a5e0c51 = cronetTaskResult.m37974x3a5e0c51();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cronet request time", "request time is " + (java.lang.System.currentTimeMillis() - this.f559184b));
        zy3.f fVar4 = hVar.f559186b;
        if (fVar4 != null) {
            ((zy3.i) fVar4).a("ok", m37974x3a5e0c51, cronetTaskResult.f18207xec0a8ff, e17, null, null);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
    }
}

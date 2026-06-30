package mx4;

/* loaded from: classes7.dex */
public final class a implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f414165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f414166b;

    public a(nw4.k kVar, nw4.y2 y2Var) {
        this.f414165a = kVar;
        this.f414166b = y2Var;
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
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        boolean z17 = false;
        if (cronetTaskResult != null && cronetTaskResult.f18200x139cb015 == 0) {
            z17 = true;
        }
        nw4.y2 y2Var = this.f414166b;
        nw4.k kVar = this.f414165a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicLiveCardDevTools.JsApiHandleDynamicCardDebugAction", "download debugPkgPath success!");
            kVar.f422396d.e(y2Var.f422546c, "handleDynamicCardDebugAction:ok", null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download debugPkgPath fail errCode:");
        sb6.append(cronetTaskResult != null ? java.lang.Integer.valueOf(cronetTaskResult.f18200x139cb015) : null);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicLiveCardDevTools.JsApiHandleDynamicCardDebugAction", sb6.toString());
        kVar.f422396d.e(y2Var.f422546c, "handleDynamicCardDebugAction:fail", null);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadProgressChanged fileKey:");
        sb6.append(str);
        sb6.append(" currentWriteBytes:");
        sb6.append(cronetDownloadProgress != null ? java.lang.Long.valueOf(cronetDownloadProgress.f18155xf006a00e) : null);
        sb6.append(" totalBytes:");
        sb6.append(cronetDownloadProgress != null ? java.lang.Long.valueOf(cronetDownloadProgress.f18156xdd8f6e6c) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicLiveCardDevTools.JsApiHandleDynamicCardDebugAction", sb6.toString());
    }
}

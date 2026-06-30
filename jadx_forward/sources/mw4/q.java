package mw4;

/* loaded from: classes7.dex */
public final class q implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f413321a;

    public q(yz5.l lVar) {
        this.f413321a = lVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveChunkedData */
    public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveHeader */
    public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader, int i17, java.lang.String protocol) {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap[] headerMapArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(protocol, "protocol");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCronetReceiveHeader: ");
        sb6.append((responseHeader == null || (headerMapArr = responseHeader.f18226x2f676f86) == null) ? null : kz5.z.d0(headerMapArr, ", ", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMpVideoInterceptor", sb6.toString());
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String protocol) {
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HeaderMap[] headerMapArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(protocol, "protocol");
        this.f413321a.mo146xb9724478(cronetTaskResult);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCronetTaskCompleted: ");
        sb6.append((cronetTaskResult == null || (headerMapArr = cronetTaskResult.f18202x2f676f86) == null) ? null : kz5.z.d0(headerMapArr, ", ", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMpVideoInterceptor", sb6.toString());
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
    }
}

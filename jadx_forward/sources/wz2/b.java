package wz2;

/* loaded from: classes7.dex */
public final class b implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {
    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveChunkedData */
    public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData data, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveHeader */
    public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader header, int i17, java.lang.String protocol) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(protocol, "protocol");
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String filekey, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult result, java.lang.String protocol) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filekey, "filekey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(protocol, "protocol");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FaceUtilNew", "reportTimeCostByHttp completed: %s", result.toString());
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String filekey, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress progress) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filekey, "filekey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(progress, "progress");
    }
}

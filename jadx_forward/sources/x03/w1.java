package x03;

/* loaded from: classes15.dex */
public final class w1 implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final x03.j f532689d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f532690e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f532691f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f532692g;

    public w1(x03.j cdnService, java.lang.String tempSavePath, java.lang.String finalSavePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnService, "cdnService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempSavePath, "tempSavePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finalSavePath, "finalSavePath");
        this.f532689d = cdnService;
        this.f532690e = tempSavePath;
        this.f532691f = finalSavePath;
        this.f532692g = "MicroMsg.FlutterCdnService";
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        boolean z17 = false;
        if (c2CDownloadResult != null && c2CDownloadResult.f17871x139cb015 == 0) {
            z17 = true;
        }
        if (z17) {
            java.lang.String str2 = this.f532692g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PreviewMetaCallback.onC2CDownloadCompleted success mediaId:");
            sb6.append(str);
            sb6.append(" fileId: ");
            sb6.append(c2CDownloadResult != null ? c2CDownloadResult.f17875xb4089397 : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        } else {
            java.lang.String str3 = this.f532692g;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("PreviewMetaCallback.onC2CDownloadCompleted error mediaId:");
            sb7.append(str);
            sb7.append(" result: ");
            sb7.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.f17871x139cb015) : null);
            sb7.append(" fileId: ");
            sb7.append(c2CDownloadResult != null ? c2CDownloadResult.f17875xb4089397 : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, sb7.toString());
        }
        ((ku5.t0) ku5.t0.f394148d).q(new x03.v1(this, str));
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
        this.f532689d.mo563x617c4940(str, j17, j18, z17);
    }
}

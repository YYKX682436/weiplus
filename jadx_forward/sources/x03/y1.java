package x03;

/* loaded from: classes15.dex */
public final class y1 implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final x03.j f532703d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f532704e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f532705f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f532706g;

    /* renamed from: h, reason: collision with root package name */
    public final long f532707h;

    public y1(x03.j cdnService, java.lang.String tempSavePath, java.lang.String finalSavePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnService, "cdnService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempSavePath, "tempSavePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finalSavePath, "finalSavePath");
        this.f532703d = cdnService;
        this.f532704e = tempSavePath;
        this.f532705f = finalSavePath;
        this.f532706g = "MicroMsg.FlutterCdnService";
        this.f532707h = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f532707h;
        java.lang.Long valueOf = c2CDownloadResult != null ? java.lang.Long.valueOf(c2CDownloadResult.f17873xd4282b9d) : null;
        boolean z17 = false;
        if (c2CDownloadResult != null && c2CDownloadResult.f17871x139cb015 == 0) {
            z17 = true;
        }
        if (z17) {
            java.lang.String str2 = this.f532706g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PreviewSegmentCallback.onC2CDownloadCompleted success.mediaId:");
            sb6.append(str);
            sb6.append(" fileSize: ");
            sb6.append(valueOf);
            sb6.append(" costTime: ");
            sb6.append(currentTimeMillis);
            sb6.append(" fileId: ");
            sb6.append(c2CDownloadResult != null ? c2CDownloadResult.f17875xb4089397 : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        } else {
            java.lang.String str3 = this.f532706g;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("PreviewSegmentCallback.onC2CDownloadCompleted error. mediaId:");
            sb7.append(str);
            sb7.append(" fileSize: ");
            sb7.append(valueOf);
            sb7.append(" costTime: ");
            sb7.append(currentTimeMillis);
            sb7.append(" resultCode: ");
            sb7.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.f17871x139cb015) : null);
            sb7.append(" fileId: ");
            sb7.append(c2CDownloadResult != null ? c2CDownloadResult.f17875xb4089397 : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, sb7.toString());
        }
        ((ku5.t0) ku5.t0.f394148d).q(new x03.x1(this, str, c2CDownloadResult));
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
        this.f532703d.mo563x617c4940(str, j17, j18, z17);
    }
}

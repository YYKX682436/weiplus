package ha3;

/* loaded from: classes15.dex */
public final class q0 implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final ha3.i0 f361456d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f361457e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f361458f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f361459g;

    /* renamed from: h, reason: collision with root package name */
    public final long f361460h;

    public q0(ha3.i0 cdnService, java.lang.String tempSavePath, java.lang.String finalSavePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnService, "cdnService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempSavePath, "tempSavePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finalSavePath, "finalSavePath");
        this.f361456d = cdnService;
        this.f361457e = tempSavePath;
        this.f361458f = finalSavePath;
        this.f361459g = "MicroMsg.FlutterCdnService";
        this.f361460h = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f361460h;
        java.lang.Long valueOf = c2CDownloadResult != null ? java.lang.Long.valueOf(c2CDownloadResult.f17873xd4282b9d) : null;
        boolean z17 = false;
        if (c2CDownloadResult != null && c2CDownloadResult.f17871x139cb015 == 0) {
            z17 = true;
        }
        if (z17) {
            java.lang.String str2 = this.f361459g;
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
            java.lang.String str3 = this.f361459g;
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
        ((ku5.t0) ku5.t0.f394148d).q(new ha3.p0(this, str, c2CDownloadResult));
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
        this.f361456d.mo563x617c4940(str, j17, j18, z17);
    }
}

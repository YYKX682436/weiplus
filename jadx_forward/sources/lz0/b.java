package lz0;

/* loaded from: classes5.dex */
public final class b implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f403847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403848e;

    public b(p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str) {
        this.f403847d = qVar;
        this.f403848e = str;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        boolean z17 = false;
        if (c2CDownloadResult != null && c2CDownloadResult.f17871x139cb015 == 0) {
            z17 = true;
        }
        p3325xe03a0797.p3326xc267989b.q qVar = this.f403847d;
        if (!z17) {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).s("", null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.vfs.q7.c("maas_template_cover") + '/');
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(this.f403848e.getBytes());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMD5String(...)");
        sb6.append(b17);
        ((p3325xe03a0797.p3326xc267989b.r) qVar).s(sb6.toString(), null);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
    }
}

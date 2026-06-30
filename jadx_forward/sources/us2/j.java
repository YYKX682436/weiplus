package us2;

/* loaded from: classes5.dex */
public final class j implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vt3.p f512027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f512028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f512029f;

    public j(vt3.p pVar, p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str) {
        this.f512027d = pVar;
        this.f512028e = qVar;
        this.f512029f = str;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onC2CDownloadCompleted] templateId:");
        vt3.p pVar = this.f512027d;
        sb6.append(pVar.f521553b);
        sb6.append(" errorCode:");
        sb6.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.f17871x139cb015) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", sb6.toString());
        boolean z17 = c2CDownloadResult != null && c2CDownloadResult.f17871x139cb015 == 0;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f512028e;
        if (!z17) {
            us2.u uVar = us2.u.f512081a;
            ((yy0.o7) ((pp0.m0) i95.n0.c(pp0.m0.class))).Di("mjpublisher_sc_download_template", pVar.f521553b, "Error", kz5.b1.e(new jz5.l(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(c2CDownloadResult != null ? c2CDownloadResult.f17871x139cb015 : 0))));
            ((p3325xe03a0797.p3326xc267989b.r) qVar).s(null, null);
            return;
        }
        us2.u uVar2 = us2.u.f512081a;
        java.lang.String str2 = pVar.f521553b;
        pp0.m0 m0Var = (pp0.m0) i95.n0.c(pp0.m0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m0Var);
        pp0.m0.ee(m0Var, "mjpublisher_sc_download_template", str2, "Completed", null, 8, null);
        ((p3325xe03a0797.p3326xc267989b.r) qVar).s(this.f512029f, null);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
    }
}

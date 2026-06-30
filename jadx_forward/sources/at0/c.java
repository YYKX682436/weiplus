package at0;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f95091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f95092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f95093f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f95094g;

    public c(at0.n nVar, android.graphics.SurfaceTexture surfaceTexture, java.lang.Float f17, yz5.l lVar) {
        this.f95091d = nVar;
        this.f95092e = surfaceTexture;
        this.f95093f = f17;
        this.f95094g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at0.p pVar;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        at0.n nVar = this.f95091d;
        nVar.f95144s = elapsedRealtime;
        nVar.g("StartPreviewTimeStamp", java.lang.Long.valueOf(nVar.f95144s));
        nVar.f95127b.r(this.f95092e, nVar.f95126a.g(), this.f95093f, nVar.f95126a.mo54901x6fcd4039());
        if (!((ts0.b) nVar.f95127b).G() && !nVar.f95126a.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markGpuCropFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 10L, 1L);
        }
        yz5.l lVar = this.f95094g;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(((ts0.b) nVar.f95127b).G()));
        }
        nVar.getClass();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        nVar.g("PreviewSuccessTImeStamp", java.lang.Long.valueOf(elapsedRealtime2));
        nVar.g("CameraFirstFrameCost", java.lang.Long.valueOf(elapsedRealtime2 - nVar.f95144s));
        ts0.c z18 = nVar.f95127b.z();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "afterStartPreview, cameraConfig:" + z18);
        if (z18 != null) {
            gt0.a aVar = nVar.f95126a;
            aVar.mo54891x9333e172().w(z18);
            nVar.a();
            nVar.b(z18);
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mo54902x402de963 = aVar.mo54902x402de963();
            ms0.c cVar = nVar.f95146u;
            if ((cVar == null ? true : cVar instanceof at0.p) && (pVar = (at0.p) cVar) != null) {
                int i17 = mo54902x402de963.f152724d;
                int i18 = mo54902x402de963.f152725e;
                boolean z19 = nVar.f95143r;
                pVar.f95156w = i17;
                pVar.f95157x = i18;
                pVar.f95158y = z19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.AbsSurfaceRenderer", "setOutputTextureInfo size:[" + i17 + ", " + i18 + "], outputMirror:" + pVar.f95158y);
            }
            if (nVar.f95142q) {
                return;
            }
            nVar.f95140o.a(!nVar.f95131f && aVar.m(), z18);
        }
    }
}

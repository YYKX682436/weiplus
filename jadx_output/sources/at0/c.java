package at0;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f13558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f13559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f13560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f13561g;

    public c(at0.n nVar, android.graphics.SurfaceTexture surfaceTexture, java.lang.Float f17, yz5.l lVar) {
        this.f13558d = nVar;
        this.f13559e = surfaceTexture;
        this.f13560f = f17;
        this.f13561g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at0.p pVar;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        at0.n nVar = this.f13558d;
        nVar.f13611s = elapsedRealtime;
        nVar.g("StartPreviewTimeStamp", java.lang.Long.valueOf(nVar.f13611s));
        nVar.f13594b.r(this.f13559e, nVar.f13593a.g(), this.f13560f, nVar.f13593a.getResolutionLimit());
        if (!((ts0.b) nVar.f13594b).G() && !nVar.f13593a.g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markGpuCropFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 10L, 1L);
        }
        yz5.l lVar = this.f13561g;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(((ts0.b) nVar.f13594b).G()));
        }
        nVar.getClass();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        nVar.g("PreviewSuccessTImeStamp", java.lang.Long.valueOf(elapsedRealtime2));
        nVar.g("CameraFirstFrameCost", java.lang.Long.valueOf(elapsedRealtime2 - nVar.f13611s));
        ts0.c z18 = nVar.f13594b.z();
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "afterStartPreview, cameraConfig:" + z18);
        if (z18 != null) {
            gt0.a aVar = nVar.f13593a;
            aVar.getCameraPreviewView().w(z18);
            nVar.a();
            nVar.b(z18);
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = aVar.getVideoTransPara();
            ms0.c cVar = nVar.f13613u;
            if ((cVar == null ? true : cVar instanceof at0.p) && (pVar = (at0.p) cVar) != null) {
                int i17 = videoTransPara.f71191d;
                int i18 = videoTransPara.f71192e;
                boolean z19 = nVar.f13610r;
                pVar.f13623w = i17;
                pVar.f13624x = i18;
                pVar.f13625y = z19;
                com.tencent.mars.xlog.Log.i("MicroMsg.Media.AbsSurfaceRenderer", "setOutputTextureInfo size:[" + i17 + ", " + i18 + "], outputMirror:" + pVar.f13625y);
            }
            if (nVar.f13609q) {
                return;
            }
            nVar.f13607o.a(!nVar.f13598f && aVar.m(), z18);
        }
    }
}

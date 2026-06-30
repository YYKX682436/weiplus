package co0;

/* loaded from: classes3.dex */
public final class p implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co0.s f43728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f43729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f43730f;

    public p(co0.s sVar, go0.q1 q1Var, long j17) {
        this.f43728d = sVar;
        this.f43729e = q1Var;
        this.f43730f = j17;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", "float onSurfaceTextureAvailable, surface:" + surface + ", size:[" + i17 + ", " + i18 + ']');
        go0.q1 renderSurface = this.f43729e;
        kotlin.jvm.internal.o.f(renderSurface, "$renderSurface");
        go0.i0.b(renderSurface, surface, false, 2, null);
        renderSurface.d(i17, i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int elapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - this.f43730f);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorMiniViewCost is " + elapsedRealtime);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.m(1383, 21, 22, elapsedRealtime, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", "float onSurfaceTextureDestroyed");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        if (this.f43728d.D.i()) {
            return;
        }
        this.f43729e.d(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}

package co0;

/* loaded from: classes3.dex */
public final class k implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f43721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f43722e;

    public k(go0.q1 q1Var, long j17) {
        this.f43721d = q1Var;
        this.f43722e = j17;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", "customRender onSurfaceTextureAvailable, size:[%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        go0.q1 renderSurface = this.f43721d;
        kotlin.jvm.internal.o.f(renderSurface, "$renderSurface");
        go0.i0.b(renderSurface, new android.view.Surface(surfaceTexture), false, 2, null);
        renderSurface.d(i17, i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int elapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - this.f43722e);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorMaxiViewCost is " + elapsedRealtime);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.m(1383, 18, 19, elapsedRealtime, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", "customRender onSurfaceTextureDestroyed");
        go0.q1 q1Var = this.f43721d;
        q1Var.getClass();
        q1Var.c(new go0.n1(q1Var));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", "customRender onSurfaceTextureSizeChanged, size:[%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f43721d.d(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}

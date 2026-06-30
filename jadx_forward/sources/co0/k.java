package co0;

/* loaded from: classes3.dex */
public final class k implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f125254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f125255e;

    public k(go0.q1 q1Var, long j17) {
        this.f125254d = q1Var;
        this.f125255e = j17;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "customRender onSurfaceTextureAvailable, size:[%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        go0.q1 renderSurface = this.f125254d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(renderSurface, "$renderSurface");
        go0.i0.b(renderSurface, new android.view.Surface(surfaceTexture), false, 2, null);
        renderSurface.d(i17, i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int elapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - this.f125255e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorMaxiViewCost is " + elapsedRealtime);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(1383, 18, 19, elapsedRealtime, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "customRender onSurfaceTextureDestroyed");
        go0.q1 q1Var = this.f125254d;
        q1Var.getClass();
        q1Var.c(new go0.n1(q1Var));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "customRender onSurfaceTextureSizeChanged, size:[%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f125254d.d(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}

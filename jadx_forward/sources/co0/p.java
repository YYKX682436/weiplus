package co0;

/* loaded from: classes3.dex */
public final class p implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co0.s f125261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f125262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f125263f;

    public p(co0.s sVar, go0.q1 q1Var, long j17) {
        this.f125261d = sVar;
        this.f125262e = q1Var;
        this.f125263f = j17;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "float onSurfaceTextureAvailable, surface:" + surface + ", size:[" + i17 + ", " + i18 + ']');
        go0.q1 renderSurface = this.f125262e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(renderSurface, "$renderSurface");
        go0.i0.b(renderSurface, surface, false, 2, null);
        renderSurface.d(i17, i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int elapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - this.f125263f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorMiniViewCost is " + elapsedRealtime);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(1383, 21, 22, elapsedRealtime, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "float onSurfaceTextureDestroyed");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        if (this.f125261d.D.i()) {
            return;
        }
        this.f125262e.d(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}

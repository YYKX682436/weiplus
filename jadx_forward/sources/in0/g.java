package in0;

/* loaded from: classes3.dex */
public final class g implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f374282d;

    public g(go0.q1 q1Var) {
        this.f374282d = q1Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "customRender onSurfaceTextureAvailable, size:[%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        go0.q1 renderSurface = this.f374282d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(renderSurface, "$renderSurface");
        go0.i0.b(renderSurface, new android.view.Surface(surfaceTexture), false, 2, null);
        renderSurface.d(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "customRender onSurfaceTextureDestroyed");
        go0.q1 q1Var = this.f374282d;
        q1Var.getClass();
        q1Var.c(new go0.n1(q1Var));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "customRender onSurfaceTextureSizeChanged, size:[%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f374282d.d(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}

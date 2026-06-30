package yp;

/* loaded from: classes10.dex */
public class n implements yp.j, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.TextureView f545923d;

    /* renamed from: e, reason: collision with root package name */
    public yp.i f545924e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f545925f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f545926g = false;

    public n(android.view.TextureView textureView, boolean z17) {
        this.f545925f = z17;
        this.f545923d = textureView;
        textureView.setOpaque(false);
        textureView.setSurfaceTextureListener(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextureDanmakuView", java.lang.String.format("init textureview useSurfaceTextureUpdatedForCallback:%b,danmakuViewChangedhaveCallback:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f545926g)));
    }

    @Override // yp.j
    public void a(yp.i iVar) {
        this.f545924e = iVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextureDanmakuView", "setCallBack");
    }

    @Override // yp.j
    public float b() {
        return this.f545923d.getY();
    }

    @Override // yp.j
    /* renamed from: getView */
    public android.view.View mo177446xfb86a31b() {
        return this.f545923d;
    }

    @Override // yp.j
    /* renamed from: lockCanvas */
    public android.graphics.Canvas mo177447x18d65a63() {
        return this.f545923d.lockCanvas();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f545926g = true;
        this.f545923d.setOpaque(false);
        yp.i iVar = this.f545924e;
        if (iVar != null) {
            iVar.b();
            this.f545924e.c();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextureDanmakuView", java.lang.String.format("onSurfaceTextureAvailable width=%d,height=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        yp.i iVar = this.f545924e;
        if (iVar != null) {
            iVar.a();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextureDanmakuView", "onSurfaceTextureDestroyed");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f545926g = true;
        yp.i iVar = this.f545924e;
        if (iVar != null) {
            iVar.c();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextureDanmakuView", java.lang.String.format("onSurfaceTextureSizeChanged width=%d,height=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        if (!this.f545925f || this.f545926g) {
            return;
        }
        this.f545926g = true;
        yp.i iVar = this.f545924e;
        if (iVar != null) {
            iVar.c();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextureDanmakuView", "onSurfaceTextureUpdated");
    }

    @Override // yp.j
    /* renamed from: setOnTouchListener */
    public void mo177448xcc7da8b2(android.view.View.OnTouchListener onTouchListener) {
        this.f545923d.setOnTouchListener(onTouchListener);
    }

    @Override // yp.j
    /* renamed from: unlock */
    public void mo177449xcde7df44() {
    }

    @Override // yp.j
    /* renamed from: unlockCanvasAndPost */
    public void mo177450x65a3f1bb(android.graphics.Canvas canvas) {
        this.f545923d.unlockCanvasAndPost(canvas);
    }
}

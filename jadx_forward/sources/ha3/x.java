package ha3;

/* loaded from: classes15.dex */
public final class x implements um5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.d0 f361492d;

    public x(ha3.d0 d0Var) {
        this.f361492d = d0Var;
    }

    @Override // um5.e
    public void a(android.graphics.SurfaceTexture surfaceTexture) {
        ha3.d0 d0Var = this.f361492d;
        kk4.c cVar = d0Var.f361348e;
        if (cVar != null) {
            ((kk4.f0) cVar).mo100970x42c875eb(null);
        }
        android.view.Surface surface = d0Var.f361360q;
        if (surface != null) {
            surface.release();
        }
        d0Var.f361360q = null;
    }

    @Override // um5.e
    public void b(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "onSurfaceAvailable width: " + i17 + ", height: " + i18);
        if (surfaceTexture != null) {
            android.view.Surface surface = new android.view.Surface(surfaceTexture);
            ha3.d0 d0Var = this.f361492d;
            d0Var.f361360q = surface;
            kk4.c cVar = d0Var.f361348e;
            if (cVar != null) {
                ((kk4.f0) cVar).mo100970x42c875eb(d0Var.f361360q);
            }
        }
    }

    @Override // um5.e
    public void c(android.graphics.SurfaceTexture surfaceTexture) {
    }
}

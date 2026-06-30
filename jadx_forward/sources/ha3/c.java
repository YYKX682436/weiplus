package ha3;

/* loaded from: classes15.dex */
public final class c implements um5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.g f361336d;

    public c(ha3.g gVar) {
        this.f361336d = gVar;
    }

    @Override // um5.e
    public void a(android.graphics.SurfaceTexture surfaceTexture) {
        ha3.g gVar = this.f361336d;
        m8.i0 i0Var = gVar.f361390h;
        if (i0Var != null) {
            i0Var.i();
            i0Var.l(null, false);
        }
        android.view.Surface surface = gVar.f361398p;
        if (surface != null) {
            surface.release();
        }
        gVar.f361398p = null;
    }

    @Override // um5.e
    public void b(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoHDRPlayer", "onSurfaceAvailable width: " + i17 + ", height: " + i18);
        if (surfaceTexture != null) {
            android.view.Surface surface = new android.view.Surface(surfaceTexture);
            ha3.g gVar = this.f361336d;
            gVar.f361398p = surface;
            m8.i0 i0Var = gVar.f361390h;
            if (i0Var != null) {
                i0Var.i();
                i0Var.l(surface, false);
            }
        }
    }

    @Override // um5.e
    public void c(android.graphics.SurfaceTexture surfaceTexture) {
    }
}

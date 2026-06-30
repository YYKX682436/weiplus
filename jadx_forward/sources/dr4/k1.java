package dr4;

/* loaded from: classes14.dex */
public final class k1 implements y03.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dr4.q f324189b;

    public k1(dr4.p1 p1Var, dr4.q qVar) {
        this.f324188a = p1Var;
        this.f324189b = qVar;
    }

    @Override // y03.i
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "onSurfaceTextureSizeChanged: width=" + i17 + ", height=" + i18);
        this.f324188a.j(this.f324189b, i17, i18, 0);
    }

    @Override // y03.i
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPRenderMgr", "onSurfaceTextureDestroy");
        dr4.x1 x1Var = this.f324188a.f324241g;
        if (x1Var != null) {
            x1Var.c(this.f324189b, 0);
        }
    }

    public void c(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "onSurfaceTextureReady: " + surfaceTexture);
        this.f324188a.k(this.f324189b, 0);
    }
}

package dr4;

/* loaded from: classes14.dex */
public final class l1 implements y03.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dr4.q f324196b;

    public l1(dr4.p1 p1Var, dr4.q qVar) {
        this.f324195a = p1Var;
        this.f324196b = qVar;
    }

    @Override // y03.i
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "onSurfaceTextureSizeChanged: width=" + i17 + ", height=" + i18);
        this.f324195a.j(this.f324196b, i17, i18, 1);
    }

    @Override // y03.i
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPRenderMgr", "onSurfaceTextureDestroy");
        dr4.x1 x1Var = this.f324195a.f324241g;
        if (x1Var != null) {
            x1Var.c(this.f324196b, 1);
        }
    }

    public void c(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "onSurfaceTextureReady: " + surfaceTexture);
        this.f324195a.k(this.f324196b, 1);
    }
}

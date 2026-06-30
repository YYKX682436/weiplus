package zn0;

/* loaded from: classes3.dex */
public class c0 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f555860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zn0.a0 f555861f;

    public c0(zn0.a0 a0Var, java.lang.String str, go0.q1 q1Var) {
        this.f555861f = a0Var;
        this.f555859d = str;
        this.f555860e = q1Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "customRender onSurfaceTextureAvailable, size:[%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f555861f.p(this.f555859d);
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        go0.q1 q1Var = this.f555860e;
        q1Var.a(surface, false);
        q1Var.d(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "customRender onSurfaceTextureDestroyed");
        this.f555861f.p(this.f555859d);
        go0.q1 q1Var = this.f555860e;
        q1Var.getClass();
        q1Var.c(new go0.n1(q1Var));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCRemoteUserManager", "customRender onSurfaceTextureSizeChanged, size:[%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f555860e.d(i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }
}

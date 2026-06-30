package k63;

/* loaded from: classes14.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k63.p0 f386109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k63.p0 p0Var) {
        super(1);
        this.f386109d = p0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        k63.p0 p0Var = this.f386109d;
        if (surfaceTexture != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainRenderMgrService", "get surface");
            p0Var.a(new android.view.Surface(surfaceTexture));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameLiveMainRenderMgrService", "renderMgr get surfaceTexture is null");
            p0Var.a(null);
        }
        return f0Var2;
    }
}

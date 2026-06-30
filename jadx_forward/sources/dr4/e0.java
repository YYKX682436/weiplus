package dr4;

/* loaded from: classes14.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f324157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dr4.n0 f324158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ is0.c f324159f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.graphics.SurfaceTexture surfaceTexture, dr4.n0 n0Var, is0.c cVar) {
        super(0);
        this.f324157d = surfaceTexture;
        this.f324158e = n0Var;
        this.f324159f = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            this.f324157d.updateTexImage();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteWindowSurfaceRenderer", "error happened in update tex image");
        }
        dr4.n0 n0Var = this.f324158e;
        dr4.r1 r1Var = n0Var.f324219l;
        if (r1Var != null) {
            r1Var.E(1);
        }
        dr4.r1 r1Var2 = n0Var.f324219l;
        if (r1Var2 != null) {
            r1Var2.s(90);
        }
        dr4.r1 r1Var3 = n0Var.f324219l;
        if (r1Var3 != null) {
            r1Var3.j(false);
        }
        n0Var.i(this.f324159f);
        return jz5.f0.f384359a;
    }
}

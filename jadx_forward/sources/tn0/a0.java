package tn0;

/* loaded from: classes3.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(tn0.w0 w0Var) {
        super(1);
        this.f502182d = w0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "startPreviewToRemote onViewCreated");
        tn0.w0 w0Var = this.f502182d;
        w0Var.f502304r.a(surfaceTexture, w0Var.L());
        return jz5.f0.f384359a;
    }
}

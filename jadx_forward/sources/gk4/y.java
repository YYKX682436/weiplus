package gk4;

/* loaded from: classes10.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f354170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f354171e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.graphics.SurfaceTexture surfaceTexture, gk4.h0 h0Var) {
        super(0);
        this.f354170d = surfaceTexture;
        this.f354171e = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gk4.h0 h0Var = this.f354171e;
        android.graphics.SurfaceTexture surfaceTexture = this.f354170d;
        try {
            surfaceTexture.updateTexImage();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(h0Var.f354089a, e17, "updateTexImage error", new java.lang.Object[0]);
        }
        gk4.h0.b(h0Var, surfaceTexture.getTimestamp());
        return jz5.f0.f384359a;
    }
}

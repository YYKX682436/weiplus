package gk4;

/* loaded from: classes10.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f354168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f354169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.graphics.SurfaceTexture surfaceTexture, gk4.h0 h0Var) {
        super(0);
        this.f354168d = surfaceTexture;
        this.f354169e = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gk4.h0 h0Var = this.f354169e;
        android.graphics.SurfaceTexture surfaceTexture = this.f354168d;
        if (surfaceTexture != null) {
            h0Var.f354095g = rs0.g.n(rs0.i.f480829a, new android.view.Surface(surfaceTexture), null, 0, 0, null, 28, null);
        } else {
            h0Var.f354095g = rs0.g.o(rs0.i.f480829a, null, 1, null);
        }
        return jz5.f0.f384359a;
    }
}

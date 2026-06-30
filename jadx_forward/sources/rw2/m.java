package rw2;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f482149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rw2.t f482150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.graphics.SurfaceTexture surfaceTexture, rw2.t tVar) {
        super(0);
        this.f482149d = surfaceTexture;
        this.f482150e = tVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.SurfaceTexture surfaceTexture = this.f482149d;
        surfaceTexture.updateTexImage();
        rw2.t.a(this.f482150e, surfaceTexture.getTimestamp());
        return jz5.f0.f384359a;
    }
}

package df;

/* loaded from: classes15.dex */
public final class r extends bj0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.z f311074d;

    public r(df.z zVar) {
        this.f311074d = zVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        df.z zVar = this.f311074d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(surface, zVar.f311151g)) {
            df.z.a(zVar, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        return false;
    }

    @Override // bj0.a, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}

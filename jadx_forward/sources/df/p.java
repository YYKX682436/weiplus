package df;

/* loaded from: classes15.dex */
public final class p extends bj0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.z f311063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 f311064e;

    public p(df.z zVar, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4) {
        this.f311063d = zVar;
        this.f311064e = c28552x398ac0c4;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        df.z zVar = this.f311063d;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 m124147x19cc2a81 = zVar.m124147x19cc2a81();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4 c28552x398ac0c4 = this.f311064e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m124147x19cc2a81, c28552x398ac0c4) && c28552x398ac0c4.mo137196x1f8c622()) {
            df.z.a(zVar, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311063d.m124147x19cc2a81(), this.f311064e);
        return false;
    }
}

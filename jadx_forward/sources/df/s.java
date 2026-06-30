package df;

/* loaded from: classes15.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344 f311078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df.z f311079e;

    public s(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344 interfaceC28651x6b183344, df.z zVar) {
        this.f311078d = interfaceC28651x6b183344;
        this.f311079e = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344 interfaceC28651x6b183344 = this.f311078d;
        ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.TextureViewSurfaceTextureListenerC28577x96fffc8a) interfaceC28651x6b183344).setSurfaceTextureListener(new df.f1(((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.TextureViewSurfaceTextureListenerC28577x96fffc8a) interfaceC28651x6b183344).getSurfaceTextureListener(), new df.r(this.f311079e)));
    }
}

package df;

/* loaded from: classes15.dex */
public final class t implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344 f311083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df.z f311084e;

    public t(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344 interfaceC28651x6b183344, df.z zVar) {
        this.f311083d = interfaceC28651x6b183344;
        this.f311084e = zVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        df.z zVar = this.f311084e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311083d, zVar.f311151g)) {
            df.z.a(zVar, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}

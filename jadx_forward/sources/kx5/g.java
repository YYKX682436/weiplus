package kx5;

/* loaded from: classes15.dex */
public class g implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f394832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kx5.m f394834c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kx5.n f394835d;

    public g(kx5.n nVar, java.lang.Runnable runnable, java.lang.String str, kx5.m mVar) {
        this.f394835d = nVar;
        this.f394832a = runnable;
        this.f394833b = str;
        this.f394834c = mVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: error */
    public void mo65718x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        nx5.c.b("WxaRouter.WxaRouter", "invokeMethod %s error. code: %s, message: %s, details: %s", this.f394833b, str, str2, obj.toString());
        ((kx5.c) this.f394834c).a();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: notImplemented */
    public void mo65719xbc9fa82f() {
        nx5.c.b("WxaRouter.WxaRouter", "invokeMethod %s notImplemented", this.f394833b);
        ((kx5.c) this.f394834c).a();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: success */
    public void mo65720x90b54003(java.lang.Object obj) {
        this.f394835d.f394852i.removeCallbacks(this.f394832a);
        nx5.c.c("WxaRouter.WxaRouter", "invokeMethod %s success", this.f394833b);
        ((kx5.c) this.f394834c).a();
    }
}

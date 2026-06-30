package lx5;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f403692b;

    /* renamed from: c, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f403693c;

    /* renamed from: e, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f403695e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f403691a = true;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f403694d = new java.util.concurrent.LinkedBlockingQueue();

    public b(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str) {
        lx5.a aVar = new lx5.a(this);
        this.f403695e = aVar;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(interfaceC28679x1b8c77f2, str);
        this.f403692b = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(aVar);
    }

    public void a(java.lang.String str, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        if (this.f403691a) {
            this.f403692b.m138439xd8c5c779(str, obj, result);
            nx5.c.a("WxaRouter.SafeMethodChannel", "invokeMethod invoke method %s", str);
        } else {
            this.f403694d.offer(new lx5.c(str, obj, result));
            nx5.c.a("WxaRouter.SafeMethodChannel", "invokeMethod add invoke method %s", str);
        }
    }
}

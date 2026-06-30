package yx5;

/* loaded from: classes13.dex */
public class c implements zx5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yx5.d f549515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yx5.b f549516b;

    public c(yx5.b bVar, yx5.d dVar) {
        this.f549516b = bVar;
        this.f549515a = dVar;
    }

    @Override // zx5.b
    public void a(zx5.t tVar) {
        by5.c4.f("RemoteThrottleConfigFetcher", "fetch throttle config, onTaskFailed, get config fail, retCode:" + tVar.f558794c);
        yx5.b bVar = this.f549516b;
        bVar.getClass();
        yu5.c.a(new yx5.RunnableC30823x2d183f(tVar, this.f549515a));
        bVar.f549512a = false;
    }

    @Override // zx5.b
    public void b(zx5.s sVar) {
    }

    @Override // zx5.b
    public void c() {
        by5.c4.f("RemoteThrottleConfigFetcher", "fetch throttle config, onTaskStarted");
    }

    @Override // zx5.b
    public void d(zx5.t tVar) {
        by5.c4.f("RemoteThrottleConfigFetcher", "fetch throttle config, onTaskFailed, get config success, retCode:" + tVar.f558794c);
        yx5.b bVar = this.f549516b;
        bVar.getClass();
        yu5.c.a(new yx5.RunnableC30823x2d183f(tVar, this.f549515a));
        bVar.f549512a = false;
    }
}

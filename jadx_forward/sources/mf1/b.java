package mf1;

/* loaded from: classes7.dex */
public class b extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mf1.k f407559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf1.h f407560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Timer f407561f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf1.c f407562g;

    public b(mf1.c cVar, mf1.k kVar, mf1.h hVar, java.util.Timer timer) {
        this.f407562g = cVar;
        this.f407559d = kVar;
        this.f407560e = hVar;
        this.f407561f = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        mf1.k kVar = this.f407559d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkWcWssSocket", "connect response time out taskid:%s", kVar.mo147253x30961476());
        ((yc1.o) this.f407560e).c("connect response time out");
        kVar.mo147252x5a5ddf8();
        this.f407562g.h(kVar);
        cancel();
        this.f407561f.cancel();
    }
}

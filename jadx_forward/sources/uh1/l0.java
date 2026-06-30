package uh1;

/* loaded from: classes7.dex */
public class l0 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mf1.k f509364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf1.h f509365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Timer f509366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uh1.q0 f509367g;

    public l0(uh1.q0 q0Var, mf1.k kVar, mf1.h hVar, java.util.Timer timer) {
        this.f509367g = q0Var;
        this.f509364d = kVar;
        this.f509365e = hVar;
        this.f509366f = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkWebSocket", "connect response time out");
        mf1.k kVar = this.f509364d;
        kVar.mo147252x5a5ddf8();
        this.f509367g.i(kVar);
        ((yc1.o) this.f509365e).c("connect response time out");
        cancel();
        this.f509366f.cancel();
    }
}

package sg0;

/* loaded from: classes8.dex */
public final class n1 implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.a2 f489291d;

    public n1(sg0.a2 a2Var) {
        this.f489291d = a2Var;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onAppBackground");
        sg0.a2 a2Var = this.f489291d;
        a2Var.oj(1);
        a2Var.Zi(true);
        a2Var.f489206n.sendEmptyMessageDelayed(101, 5000L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onAppBackground, start check release store!");
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        sg0.a2 a2Var = this.f489291d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onAppForeground ".concat(a2Var.f489203h ? "cool start" : "hot start"));
        if (a2Var.f489203h) {
            a2Var.f489206n.sendEmptyMessageDelayed(1, 2000L);
        } else {
            a2Var.Zi(false);
        }
        a2Var.oj(101);
    }
}

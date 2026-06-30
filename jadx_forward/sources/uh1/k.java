package uh1;

/* loaded from: classes7.dex */
public class k extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh1.r f509344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uh1.n f509345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uh1.q f509346g;

    public k(uh1.q qVar, uh1.r rVar, uh1.n nVar) {
        this.f509346g = qVar;
        this.f509344e = rVar;
        this.f509345f = nVar;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "AppBrandNetworkRequest@" + this.f509344e.f509414j;
    }

    @Override // java.lang.Runnable
    public void run() {
        uh1.r rVar = this.f509344e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkRequest", "call cronet time out taskid:%s,timeout:%d,url:%s", rVar.f509414j, java.lang.Integer.valueOf(rVar.f509405a), rVar.f509407c);
        if (rVar.f509420p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNetworkRequest", "call cronet time out already callback");
        } else {
            rVar.f509420p = true;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("requestURL", rVar.f509407c);
            this.f509346g.c(this.f509345f, "fail", "fail:time out", rVar.f509414j, null, 5, hashMap);
        }
        uh1.j0.E(1095L, 6L, 1L);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f509416l)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(rVar.f509416l);
    }
}

package cv4;

/* loaded from: classes8.dex */
public final class m implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cv4.n f304124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304125e;

    public m(cv4.n nVar, java.lang.String str) {
        this.f304124d = nVar;
        this.f304125e = str;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.f03 I0;
        cv4.n nVar = this.f304124d;
        nVar.getClass();
        u83.c cVar = new u83.c();
        java.lang.String str = this.f304125e;
        cVar.j(str);
        cVar.l(false);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(str);
            u83.a A = (L0 == null || (I0 = L0.I0(str)) == null) ? null : nVar.A(str, L0, I0, L0.K.size());
            if (A != null) {
                cVar.l(true);
                cVar.k(A);
            }
        }
        org.json.JSONObject mo126745xcc31ba03 = cVar.mo126745xcc31ba03();
        mo126745xcc31ba03.putOpt("retCode", "0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiObserveUniformReddot", "observeUniformReddot, result: " + mo126745xcc31ba03);
        long j17 = nVar.f224975e.f380557a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiObserveUniformReddot", "notifyJSEvent, liteAppUuid: " + j17 + ", funcName: onUniformReddotDataChanged, paramsJson: " + mo126745xcc31ba03);
        try {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(j17, "onUniformReddotDataChanged", mo126745xcc31ba03);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiObserveUniformReddot", e17, "notifyJSEvent", new java.lang.Object[0]);
        }
    }
}

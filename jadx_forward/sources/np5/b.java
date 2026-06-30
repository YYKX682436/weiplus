package np5;

/* loaded from: classes9.dex */
public class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 f420347g;

    /* renamed from: d, reason: collision with root package name */
    public int f420348d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p f420349e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f420350f;

    public b(com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f420350f = u0Var;
    }

    public boolean a(com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p pVar) {
        com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 c22898xca8246e1 = f420347g;
        int i17 = (c22898xca8246e1 == null || !c22898xca8246e1.b()) ? 0 : f420347g.f295577d;
        com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 c22898xca8246e12 = f420347g;
        int i18 = (c22898xca8246e12 == null || !c22898xca8246e12.b()) ? 0 : f420347g.f295578e;
        int i19 = this.f420348d + 1;
        this.f420348d = i19;
        if (i19 > i18) {
            return false;
        }
        this.f420349e = pVar;
        pVar.m83052xd700b33f(true);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(385, this);
        this.f420349e.m83049xd0c8fdce();
        int i27 = this.f420348d;
        pVar.m83056xac5f2d6b(i27, i27 >= i18 ? 1 : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doLoopDelayScene,delay = %s queryOrderCount %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        gm0.j1.i();
        gm0.j1.n().f354821b.h(pVar, i17 * 1000);
        return true;
    }

    public void b(int i17, int i18, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback errCode = " + i18 + "errType = " + i17);
        if (this.f420349e != null && jSONObject != null && i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback mScene !=null");
            this.f420349e.mo1065x5f9cdc6f(i18, str, jSONObject);
            this.f420350f.mo815x76e0bfae(i17, i18, str, this.f420349e);
        } else if (this.f420350f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback mRealCallback !=null");
            this.f420350f.mo815x76e0bfae(i17, i18, str, this.f420349e);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback reset");
        this.f420348d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p) {
            if (m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.c) {
                com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 c22898xca8246e1 = ((rr4.d) ((com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.c) m1Var)).f480766m;
                if (c22898xca8246e1.b()) {
                    f420347g = c22898xca8246e1;
                }
            }
            gm0.j1.i();
            gm0.j1.n().f354821b.q(385, this);
            com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p pVar = (com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p) m1Var;
            if (pVar.m83048x52260e22()) {
                if (this.f420349e.m83043x632cb163()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "PaySuccess ok");
                    b(i17, i18, str, pVar.f295588m);
                    return;
                }
                if (this.f420349e.m83042x2e74bed0()) {
                    com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 c22898xca8246e12 = f420347g;
                    if (this.f420348d < ((c22898xca8246e12 == null || !c22898xca8246e12.b()) ? 0 : f420347g.f295578e)) {
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f420349e.m83042x2e74bed0());
                        com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.C22898xca8246e1 c22898xca8246e13 = f420347g;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "try isServerDelayQuery true svrcanRetry %s localCanRetry %s", valueOf, java.lang.Boolean.valueOf(this.f420348d < ((c22898xca8246e13 == null || !c22898xca8246e13.b()) ? 0 : f420347g.f295578e)));
                        if (a(this.f420349e)) {
                            return;
                        }
                        b(i17, i18, f420347g.f295579f, pVar.f295588m);
                        return;
                    }
                }
                if (!pVar.m83005xab5ceedf()) {
                    java.lang.String str2 = f420347g.f295579f;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "PaySuccess error %s", str2);
                    b(i17, i18, str2, pVar.f295588m);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "try svr no resp");
                    if (a(this.f420349e)) {
                        return;
                    }
                    b(i17, i18, f420347g.f295579f, pVar.f295588m);
                }
            }
        }
    }
}

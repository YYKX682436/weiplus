package dd;

/* loaded from: classes9.dex */
public final class x implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f310430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dd.y f310431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ss4.v f310432f;

    public x(yz5.p pVar, dd.y yVar, ss4.v vVar) {
        this.f310430d = pVar;
        this.f310431e = yVar;
        this.f310432f = vVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeixinPayService.WalletAreaChangeImpl", "[changeWalletAreaFromMainlandToHK] onSceneEnd");
        if (m1Var instanceof ss4.v) {
            yz5.p pVar = this.f310430d;
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeixinPayService.WalletAreaChangeImpl", "NetSceneSetUserWallet response fail, callback fail");
                if (pVar != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt("errmsg", "fail");
                    pVar.mo149xb9724478(jSONObject, java.lang.Boolean.FALSE);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeixinPayService.WalletAreaChangeImpl", "NetSceneSetUserWallet response succ");
            gm0.j1.u().c().w(339975, 4);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 8);
            c01.je.m(8);
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            xp1.d.f();
            dd.y yVar = this.f310431e;
            int i19 = yVar.f310433a;
            dd.v[] vVarArr = dd.v.f310428d;
            if (i19 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeixinPayService.WalletAreaChangeImpl", "[changeWalletAreaFromMainlandToHK] notify mainland offline, open hk offline");
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                m27539xaf65a0fc.mo27566xe4673800("func_name", "OfflineUIPageShouldDismiss");
                ((h45.q) i95.n0.c(h45.q.class)).mo24783x40cf7c9f(m27539xaf65a0fc);
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc2 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                m27539xaf65a0fc2.mo27556xf2e34299("jump_from_mainland_offline", true);
                m27539xaf65a0fc2.mo27566xe4673800("succ_liteapp_open_info", yVar.f310434b);
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27496xef221a95("hkoffline", m27539xaf65a0fc2, dd.w.f310429a);
            }
            if (pVar != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.putOpt("errmsg", "ok");
                pVar.mo149xb9724478(jSONObject2, java.lang.Boolean.FALSE);
            }
        }
        gm0.j1.d().q(this.f310432f.mo808xfb85f7b0(), this);
    }
}

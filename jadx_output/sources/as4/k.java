package as4;

/* loaded from: classes9.dex */
public class k extends as4.c {
    @Override // as4.c, as4.b
    public void J(java.util.Map map) {
        map.put("busi_scene", this.B.f179545g);
    }

    @Override // as4.c, com.tencent.mm.wallet_core.tenpay.model.o, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 24L, 1L, false);
        return super.doScene(sVar, u0Var);
    }

    @Override // as4.c, as4.b, com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return zd1.o.CTRL_INDEX;
    }

    @Override // as4.c, as4.b, com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/snslqtpaybindauthen";
    }

    @Override // as4.c, as4.b, com.tencent.mm.wallet_core.tenpay.model.p, com.tencent.mm.wallet_core.tenpay.model.r, com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.onGYNetEnd(i17, str, jSONObject);
        if (i17 != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 25L, 1L, false);
        }
    }
}

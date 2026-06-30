package as4;

/* loaded from: classes9.dex */
public class c extends as4.b {
    public c(com.tencent.mm.plugin.wallet_core.model.Authen authen, com.tencent.mm.plugin.wallet_core.model.Orders orders, boolean z17) {
        super(authen, orders, false);
    }

    @Override // as4.b
    public void J(java.util.Map map) {
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        return super.doScene(sVar, u0Var);
    }

    @Override // as4.b, com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1600;
    }

    @Override // as4.b, com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 120;
    }

    @Override // as4.b, com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/banpaybindauthen";
    }

    @Override // as4.b, com.tencent.mm.wallet_core.tenpay.model.p, com.tencent.mm.wallet_core.tenpay.model.r, com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.onGYNetEnd(i17, str, jSONObject);
    }
}

package at4;

/* loaded from: classes9.dex */
public class w1 implements com.tencent.mm.wallet_core.ui.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ at4.x1 f13985a;

    public w1(at4.x1 x1Var) {
        this.f13985a = x1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.p1
    public void a(java.lang.Object obj) {
        at4.x1 x1Var = this.f13985a;
        if (obj == null || !(obj instanceof java.lang.Double)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUserInfoManger", "hy: no balance info. set to negative");
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = x1Var.f13999h;
            if (bankcard != null) {
                bankcard.O2 = -1.0d;
                return;
            }
            return;
        }
        java.lang.Double d17 = (java.lang.Double) obj;
        if (d17.doubleValue() < 0.0d) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
        }
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = x1Var.f13999h;
        if (bankcard2 != null) {
            bankcard2.O2 = d17.doubleValue();
        }
    }
}

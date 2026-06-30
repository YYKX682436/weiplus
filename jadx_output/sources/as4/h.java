package as4;

/* loaded from: classes9.dex */
public class h extends as4.b {
    @Override // as4.b, com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1972;
    }

    @Override // as4.b, com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinepayauthen";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public boolean isBlock() {
        com.tencent.mm.plugin.wallet_core.model.Authen authen = this.B;
        return authen == null || authen.f179557v.K == 1;
    }
}

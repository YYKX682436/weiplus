package as4;

/* loaded from: classes9.dex */
public class d extends as4.b {
    @Override // as4.b, com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return com.tencent.nativecrash.NativeCrash.DEFAULT_SHORT_FLAGS;
    }

    @Override // as4.b, com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/dc_authen";
    }
}

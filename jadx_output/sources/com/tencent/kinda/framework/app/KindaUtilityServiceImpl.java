package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaUtilityServiceImpl implements com.tencent.kinda.gen.KUtilityService {
    @Override // com.tencent.kinda.gen.KUtilityService
    public java.lang.String get3DesEncryptResult(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        java.lang.String desedeEncode = new com.tenpay.ndk.Encrypt().desedeEncode(str);
        return com.tencent.mm.sdk.platformtools.t8.K0(desedeEncode) ? "" : desedeEncode;
    }

    @Override // com.tencent.kinda.gen.KUtilityService
    public java.lang.String qmfCardStrLimitLen(java.lang.String str, int i17) {
        return i17 < 0 ? str : com.tencent.mm.wallet_core.ui.r1.C0(str, i17);
    }
}

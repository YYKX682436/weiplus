package com.tencent.kinda.framework.module.impl;

/* loaded from: classes12.dex */
public class RsaCryptUtilImpl implements com.tencent.kinda.gen.RsaCryptUtil {
    private static final java.lang.String TAG = "MicroMsg.RsaCryptUtilImpl";

    @Override // com.tencent.kinda.gen.RsaCryptUtil
    public com.tencent.kinda.gen.RsaEncryptResult rsaPublicEncryptPemkey(java.lang.String str, java.lang.String str2) {
        com.tencent.kinda.gen.RsaEncryptResult rsaEncryptResult = new com.tencent.kinda.gen.RsaEncryptResult();
        if (com.tencent.mm.sdk.platformtools.t8.N0(str, str2)) {
            com.tencent.mars.xlog.Log.w(TAG, "input is null");
            rsaEncryptResult.mRet = 0;
            return rsaEncryptResult;
        }
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        boolean rsaPublicEncryptPemkey = com.tencent.mm.protocal.MMProtocalJni.rsaPublicEncryptPemkey(str.getBytes(), pByteArray, str2.getBytes());
        if (rsaPublicEncryptPemkey && !com.tencent.mm.sdk.platformtools.t8.M0(pByteArray.value)) {
            rsaEncryptResult.mBase64Str = android.util.Base64.encodeToString(pByteArray.value, 2);
        }
        rsaEncryptResult.mRet = !rsaPublicEncryptPemkey ? 1 : 0;
        return rsaEncryptResult;
    }
}

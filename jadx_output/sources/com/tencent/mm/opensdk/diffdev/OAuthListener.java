package com.tencent.mm.opensdk.diffdev;

/* loaded from: classes15.dex */
public interface OAuthListener {
    void onAuthFinish(com.tencent.mm.opensdk.diffdev.OAuthErrCode oAuthErrCode, java.lang.String str);

    void onAuthGotQrcode(java.lang.String str, byte[] bArr);

    void onQrcodeScanned();
}

package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class cw {
    private static com.tencent.mapsdk.core.components.protocol.jce.sso.Package a(byte[] bArr) {
        com.tencent.mapsdk.core.components.protocol.jce.sso.Package r07 = new com.tencent.mapsdk.core.components.protocol.jce.sso.Package();
        com.tencent.mapsdk.internal.m mVar = new com.tencent.mapsdk.internal.m(bArr);
        mVar.a(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        r07.readFrom(mVar);
        com.tencent.mapsdk.internal.m mVar2 = new com.tencent.mapsdk.internal.m(r07.head);
        com.tencent.mapsdk.core.components.protocol.jce.sso.Header header = new com.tencent.mapsdk.core.components.protocol.jce.sso.Header();
        header.readFrom(mVar2);
        if (header.stResult.iErrCode == 0) {
            return r07;
        }
        throw new java.lang.Exception(header.stResult.strErrDesc);
    }

    private static com.tencent.mapsdk.core.components.protocol.jce.sso.Package a(com.tencent.mapsdk.internal.p pVar, int i17, java.lang.String str) {
        pVar.display(new java.lang.StringBuilder(), 0);
        com.tencent.mapsdk.core.components.protocol.jce.sso.Package r07 = new com.tencent.mapsdk.core.components.protocol.jce.sso.Package();
        r07.shVer = (short) 0;
        r07.eCmd = i17;
        r07.strSubCmd = str;
        r07.iSeqNo = 0;
        r07.cEncodeType = (byte) 0;
        r07.sAppId = "0";
        r07.uin = "0";
        com.tencent.mapsdk.core.components.protocol.jce.sso.Header header = new com.tencent.mapsdk.core.components.protocol.jce.sso.Header();
        header.lCurrTime = java.lang.System.currentTimeMillis();
        r07.head = header.toByteArray();
        r07.busiBuff = pVar.toByteArray(com.tencent.mapsdk.internal.rv.f51270c);
        return r07;
    }
}

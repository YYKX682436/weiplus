package com.tencent.mapsdk.core.components.protocol.jce.conf;

/* loaded from: classes13.dex */
public final class SCFileUpdateRsp extends com.qq.taf.jce.MapJceStruct {

    /* renamed from: a, reason: collision with root package name */
    static java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp> f48689a = new java.util.ArrayList<>();
    public int iRet;
    public java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp> vItems;

    static {
        f48689a.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp());
    }

    public SCFileUpdateRsp() {
        this.iRet = 0;
        this.vItems = null;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String className() {
        return "MapConfProtocol.SCFileUpdateRsp";
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(com.tencent.mapsdk.internal.m mVar) {
        this.iRet = mVar.a(this.iRet, 0, true);
        this.vItems = (java.util.ArrayList) mVar.a((com.tencent.mapsdk.internal.m) f48689a, 1, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SCFileUpdateRsp{iRet=");
        stringBuffer.append(this.iRet);
        stringBuffer.append(", vItems=");
        stringBuffer.append(this.vItems);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a(this.iRet, 0);
        java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp> arrayList = this.vItems;
        if (arrayList != null) {
            nVar.a((java.util.Collection) arrayList, 1);
        }
    }

    public SCFileUpdateRsp(int i17, java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp> arrayList) {
        this.iRet = i17;
        this.vItems = arrayList;
    }
}

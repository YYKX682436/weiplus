package com.tencent.mapsdk.core.components.protocol.jce.conf;

/* loaded from: classes13.dex */
public final class FileUpdateReq extends com.qq.taf.jce.MapJceStruct {
    public int iVersion;
    public java.lang.String sMd5;
    public java.lang.String sName;

    public FileUpdateReq() {
        this.sName = "";
        this.iVersion = 0;
        this.sMd5 = "";
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String className() {
        return "MapConfProtocol.FileUpdateReq";
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(com.tencent.mapsdk.internal.m mVar) {
        this.sName = mVar.b(0, true);
        this.iVersion = mVar.a(this.iVersion, 1, true);
        this.sMd5 = mVar.b(2, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FileUpdateReq{sName='");
        stringBuffer.append(this.sName);
        stringBuffer.append("', iVersion=");
        stringBuffer.append(this.iVersion);
        stringBuffer.append(", sMd5='");
        stringBuffer.append(this.sMd5);
        stringBuffer.append("'}");
        return stringBuffer.toString();
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a(this.sName, 0);
        nVar.a(this.iVersion, 1);
        java.lang.String str = this.sMd5;
        if (str != null) {
            nVar.a(str, 2);
        }
    }

    public FileUpdateReq(java.lang.String str, int i17, java.lang.String str2) {
        this.sName = str;
        this.iVersion = i17;
        this.sMd5 = str2;
    }
}

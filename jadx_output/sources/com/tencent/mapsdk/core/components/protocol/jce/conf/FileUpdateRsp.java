package com.tencent.mapsdk.core.components.protocol.jce.conf;

/* loaded from: classes13.dex */
public final class FileUpdateRsp extends com.qq.taf.jce.MapJceStruct {
    public int iFileSize;
    public int iFileUpdated;
    public int iRet;
    public int iVersion;
    public java.lang.String sMd5;
    public java.lang.String sName;
    public java.lang.String sUpdateUrl;

    public FileUpdateRsp() {
        this.sName = "";
        this.iRet = 0;
        this.iVersion = 0;
        this.iFileUpdated = 0;
        this.sUpdateUrl = "";
        this.sMd5 = "";
        this.iFileSize = 0;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String className() {
        return "MapConfProtocol.FileUpdateRsp";
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(com.tencent.mapsdk.internal.m mVar) {
        this.sName = mVar.b(0, true);
        this.iRet = mVar.a(this.iRet, 1, true);
        this.iVersion = mVar.a(this.iVersion, 2, true);
        this.iFileUpdated = mVar.a(this.iFileUpdated, 3, false);
        this.sUpdateUrl = mVar.b(4, false);
        this.sMd5 = mVar.b(5, false);
        this.iFileSize = mVar.a(this.iFileSize, 6, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FileUpdateRsp{sName='");
        stringBuffer.append(this.sName);
        stringBuffer.append("', iRet=");
        stringBuffer.append(this.iRet);
        stringBuffer.append(", iVersion=");
        stringBuffer.append(this.iVersion);
        stringBuffer.append(", iFileUpdated=");
        stringBuffer.append(this.iFileUpdated);
        stringBuffer.append(", sUpdateUrl='");
        stringBuffer.append(this.sUpdateUrl);
        stringBuffer.append("', sMd5='");
        stringBuffer.append(this.sMd5);
        stringBuffer.append("', iFileSize=");
        stringBuffer.append(this.iFileSize);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a(this.sName, 0);
        nVar.a(this.iRet, 1);
        nVar.a(this.iVersion, 2);
        nVar.a(this.iFileUpdated, 3);
        java.lang.String str = this.sUpdateUrl;
        if (str != null) {
            nVar.a(str, 4);
        }
        java.lang.String str2 = this.sMd5;
        if (str2 != null) {
            nVar.a(str2, 5);
        }
        nVar.a(this.iFileSize, 6);
    }

    public FileUpdateRsp(java.lang.String str, int i17, int i18, int i19, java.lang.String str2, java.lang.String str3, int i27) {
        this.sName = str;
        this.iRet = i17;
        this.iVersion = i18;
        this.iFileUpdated = i19;
        this.sUpdateUrl = str2;
        this.sMd5 = str3;
        this.iFileSize = i27;
    }
}

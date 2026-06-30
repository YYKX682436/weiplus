package com.tencent.mapsdk.core.components.protocol.jce.conf;

/* loaded from: classes13.dex */
public final class CSFileUpdateReq extends com.qq.taf.jce.MapJceStruct {

    /* renamed from: a, reason: collision with root package name */
    static java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq> f48688a = new java.util.ArrayList<>();
    public java.lang.String sAppId;
    public java.lang.String sCity;
    public java.lang.String sEngineVersion;
    public java.lang.String sId;
    public java.lang.String sSDKVersion;
    public java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq> vItems;

    static {
        f48688a.add(new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq());
    }

    public CSFileUpdateReq() {
        this.vItems = null;
        this.sAppId = "";
        this.sSDKVersion = "";
        this.sCity = "";
        this.sEngineVersion = "";
        this.sId = "";
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String className() {
        return "MapConfProtocol.CSFileUpdateReq";
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(com.tencent.mapsdk.internal.m mVar) {
        this.vItems = (java.util.ArrayList) mVar.a((com.tencent.mapsdk.internal.m) f48688a, 0, true);
        this.sAppId = mVar.b(1, false);
        this.sSDKVersion = mVar.b(2, false);
        this.sCity = mVar.b(3, false);
        this.sEngineVersion = mVar.b(4, false);
        this.sId = mVar.b(5, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CSFileUpdateReq{vItems=");
        stringBuffer.append(this.vItems);
        stringBuffer.append(", sAppId='");
        stringBuffer.append(this.sAppId);
        stringBuffer.append("', sSDKVersion='");
        stringBuffer.append(this.sSDKVersion);
        stringBuffer.append("', sCity='");
        stringBuffer.append(this.sCity);
        stringBuffer.append("', sEngineVersion='");
        stringBuffer.append(this.sEngineVersion);
        stringBuffer.append("', sId='");
        stringBuffer.append(this.sId);
        stringBuffer.append("'}");
        return stringBuffer.toString();
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a((java.util.Collection) this.vItems, 0);
        java.lang.String str = this.sAppId;
        if (str != null) {
            nVar.a(str, 1);
        }
        java.lang.String str2 = this.sSDKVersion;
        if (str2 != null) {
            nVar.a(str2, 2);
        }
        java.lang.String str3 = this.sCity;
        if (str3 != null) {
            nVar.a(str3, 3);
        }
        java.lang.String str4 = this.sEngineVersion;
        if (str4 != null) {
            nVar.a(str4, 4);
        }
        java.lang.String str5 = this.sId;
        if (str5 != null) {
            nVar.a(str5, 5);
        }
    }

    public CSFileUpdateReq(java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq> arrayList, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.vItems = arrayList;
        this.sAppId = str;
        this.sSDKVersion = str2;
        this.sCity = str3;
        this.sEngineVersion = str4;
        this.sId = str5;
    }
}

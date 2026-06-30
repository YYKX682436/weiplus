package com.tencent.mapsdk.core.components.protocol.jce.sso;

/* loaded from: classes13.dex */
public final class Header extends com.qq.taf.jce.MapJceStruct implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static com.tencent.mapsdk.core.components.protocol.jce.sso.CmdResult f48697a = null;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f48698b = true;
    public long lCurrTime;
    public com.tencent.mapsdk.core.components.protocol.jce.sso.CmdResult stResult;
    public java.lang.String strChannel;
    public java.lang.String strFr;
    public java.lang.String strImei;
    public java.lang.String strImsi;
    public java.lang.String strLC;
    public java.lang.String strMachineModel;
    public java.lang.String strMobver;
    public java.lang.String strNettp;
    public java.lang.String strOfflineVersion;
    public java.lang.String strOsVersion;
    public java.lang.String strPf;
    public java.lang.String strSessionId;
    public java.lang.String strSoftVersion;
    public java.lang.String strToken;
    public java.lang.String strUserNetType;
    public long uAccIp;

    public Header() {
        this.lCurrTime = 0L;
        this.stResult = null;
        this.uAccIp = 0L;
        this.strSessionId = "";
        this.strLC = "";
        this.strToken = "";
        this.strFr = "";
        this.strPf = "";
        this.strImei = "";
        this.strMobver = "";
        this.strNettp = "";
        this.strImsi = "";
        this.strOsVersion = "";
        this.strSoftVersion = "";
        this.strOfflineVersion = "";
        this.strChannel = "";
        this.strMachineModel = "";
        this.strUserNetType = "";
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String className() {
        return "sosomap.Header";
    }

    public final java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f48698b) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(java.lang.StringBuilder sb6, int i17) {
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(sb6, i17);
        kVar.a(this.lCurrTime, "lCurrTime");
        kVar.a((com.tencent.mapsdk.internal.p) this.stResult, "stResult");
        kVar.a(this.uAccIp, "uAccIp");
        kVar.a(this.strSessionId, "strSessionId");
        kVar.a(this.strLC, "strLC");
        kVar.a(this.strToken, "strToken");
        kVar.a(this.strFr, "strFr");
        kVar.a(this.strPf, "strPf");
        kVar.a(this.strImei, "strImei");
        kVar.a(this.strMobver, "strMobver");
        kVar.a(this.strNettp, "strNettp");
        kVar.a(this.strImsi, "strImsi");
        kVar.a(this.strOsVersion, "strOsVersion");
        kVar.a(this.strSoftVersion, "strSoftVersion");
        kVar.a(this.strOfflineVersion, "strOfflineVersion");
        kVar.a(this.strChannel, "strChannel");
        kVar.a(this.strMachineModel, "strMachineModel");
        kVar.a(this.strUserNetType, "strUserNetType");
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(sb6, i17);
        kVar.a(this.lCurrTime, true);
        kVar.a((com.tencent.mapsdk.internal.p) this.stResult, true);
        kVar.a(this.uAccIp, true);
        kVar.a(this.strSessionId, true);
        kVar.a(this.strLC, true);
        kVar.a(this.strToken, true);
        kVar.a(this.strFr, true);
        kVar.a(this.strPf, true);
        kVar.a(this.strImei, true);
        kVar.a(this.strMobver, true);
        kVar.a(this.strNettp, true);
        kVar.a(this.strImsi, true);
        kVar.a(this.strOsVersion, true);
        kVar.a(this.strSoftVersion, true);
        kVar.a(this.strOfflineVersion, true);
        kVar.a(this.strChannel, true);
        kVar.a(this.strMachineModel, true);
        kVar.a(this.strUserNetType, false);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.mapsdk.core.components.protocol.jce.sso.Header header = (com.tencent.mapsdk.core.components.protocol.jce.sso.Header) obj;
        return com.tencent.mapsdk.internal.q.a(this.lCurrTime, header.lCurrTime) && com.tencent.mapsdk.internal.q.a(this.stResult, header.stResult) && com.tencent.mapsdk.internal.q.a(this.uAccIp, header.uAccIp) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strSessionId, (java.lang.Object) header.strSessionId) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strLC, (java.lang.Object) header.strLC) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strToken, (java.lang.Object) header.strToken) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strFr, (java.lang.Object) header.strFr) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strPf, (java.lang.Object) header.strPf) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strImei, (java.lang.Object) header.strImei) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strMobver, (java.lang.Object) header.strMobver) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strNettp, (java.lang.Object) header.strNettp) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strImsi, (java.lang.Object) header.strImsi) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strOsVersion, (java.lang.Object) header.strOsVersion) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strSoftVersion, (java.lang.Object) header.strSoftVersion) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strOfflineVersion, (java.lang.Object) header.strOfflineVersion) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strChannel, (java.lang.Object) header.strChannel) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strMachineModel, (java.lang.Object) header.strMachineModel) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strUserNetType, (java.lang.Object) header.strUserNetType);
    }

    public final int hashCode() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(com.tencent.mapsdk.internal.m mVar) {
        this.lCurrTime = mVar.a(this.lCurrTime, 0, true);
        if (f48697a == null) {
            f48697a = new com.tencent.mapsdk.core.components.protocol.jce.sso.CmdResult();
        }
        this.stResult = (com.tencent.mapsdk.core.components.protocol.jce.sso.CmdResult) mVar.a((com.tencent.mapsdk.internal.p) f48697a, 1, false);
        this.uAccIp = mVar.a(this.uAccIp, 2, false);
        this.strSessionId = mVar.b(3, false);
        this.strLC = mVar.b(4, false);
        this.strToken = mVar.b(5, false);
        this.strFr = mVar.b(6, false);
        this.strPf = mVar.b(7, false);
        this.strImei = mVar.b(8, false);
        this.strMobver = mVar.b(9, false);
        this.strNettp = mVar.b(10, false);
        this.strImsi = mVar.b(11, false);
        this.strOsVersion = mVar.b(12, false);
        this.strSoftVersion = mVar.b(13, false);
        this.strOfflineVersion = mVar.b(14, false);
        this.strChannel = mVar.b(15, false);
        this.strMachineModel = mVar.b(16, false);
        this.strUserNetType = mVar.b(17, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a(this.lCurrTime, 0);
        com.tencent.mapsdk.core.components.protocol.jce.sso.CmdResult cmdResult = this.stResult;
        if (cmdResult != null) {
            nVar.a((com.tencent.mapsdk.internal.p) cmdResult, 1);
        }
        nVar.a(this.uAccIp, 2);
        java.lang.String str = this.strSessionId;
        if (str != null) {
            nVar.a(str, 3);
        }
        java.lang.String str2 = this.strLC;
        if (str2 != null) {
            nVar.a(str2, 4);
        }
        java.lang.String str3 = this.strToken;
        if (str3 != null) {
            nVar.a(str3, 5);
        }
        java.lang.String str4 = this.strFr;
        if (str4 != null) {
            nVar.a(str4, 6);
        }
        java.lang.String str5 = this.strPf;
        if (str5 != null) {
            nVar.a(str5, 7);
        }
        java.lang.String str6 = this.strImei;
        if (str6 != null) {
            nVar.a(str6, 8);
        }
        java.lang.String str7 = this.strMobver;
        if (str7 != null) {
            nVar.a(str7, 9);
        }
        java.lang.String str8 = this.strNettp;
        if (str8 != null) {
            nVar.a(str8, 10);
        }
        java.lang.String str9 = this.strImsi;
        if (str9 != null) {
            nVar.a(str9, 11);
        }
        java.lang.String str10 = this.strOsVersion;
        if (str10 != null) {
            nVar.a(str10, 12);
        }
        java.lang.String str11 = this.strSoftVersion;
        if (str11 != null) {
            nVar.a(str11, 13);
        }
        java.lang.String str12 = this.strOfflineVersion;
        if (str12 != null) {
            nVar.a(str12, 14);
        }
        java.lang.String str13 = this.strChannel;
        if (str13 != null) {
            nVar.a(str13, 15);
        }
        java.lang.String str14 = this.strMachineModel;
        if (str14 != null) {
            nVar.a(str14, 16);
        }
        java.lang.String str15 = this.strUserNetType;
        if (str15 != null) {
            nVar.a(str15, 17);
        }
    }

    public Header(long j17, com.tencent.mapsdk.core.components.protocol.jce.sso.CmdResult cmdResult, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15) {
        this.lCurrTime = j17;
        this.stResult = cmdResult;
        this.uAccIp = j18;
        this.strSessionId = str;
        this.strLC = str2;
        this.strToken = str3;
        this.strFr = str4;
        this.strPf = str5;
        this.strImei = str6;
        this.strMobver = str7;
        this.strNettp = str8;
        this.strImsi = str9;
        this.strOsVersion = str10;
        this.strSoftVersion = str11;
        this.strOfflineVersion = str12;
        this.strChannel = str13;
        this.strMachineModel = str14;
        this.strUserNetType = str15;
    }
}

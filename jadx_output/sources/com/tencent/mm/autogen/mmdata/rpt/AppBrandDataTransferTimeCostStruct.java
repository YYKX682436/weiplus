package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class AppBrandDataTransferTimeCostStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f55133d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f55134e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f55135f = "";

    @Override // jx3.a
    public int g() {
        return 17948;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55133d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f55134e);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f55135f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f55133d);
        stringBuffer.append("\r\nTimeCostMs:0\r\nTransferPath:");
        stringBuffer.append(this.f55134e);
        stringBuffer.append("\r\nTransferSuccess:0\r\nisNeedTransfer:0\r\nerrorMsg:");
        stringBuffer.append(this.f55135f);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes13.dex */
public final class AppBrandVideoPreLoadReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55261d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f55262e = 0;

    /* renamed from: f, reason: collision with root package name */
    public cm.a f55263f;

    @Override // jx3.a
    public int g() {
        return 15586;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55261d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55262e);
        stringBuffer.append(",");
        cm.a aVar = this.f55263f;
        stringBuffer.append(aVar != null ? aVar.f43012d : -1);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Url:");
        stringBuffer.append(this.f55261d);
        stringBuffer.append("\r\nDownLoadCostStampMs:");
        stringBuffer.append(this.f55262e);
        stringBuffer.append("\r\nPreLoadStatus:");
        stringBuffer.append(this.f55263f);
        return stringBuffer.toString();
    }
}

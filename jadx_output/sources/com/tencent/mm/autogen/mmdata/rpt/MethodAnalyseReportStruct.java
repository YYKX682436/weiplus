package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class MethodAnalyseReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59212d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f59213e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f59214f = "";

    /* renamed from: g, reason: collision with root package name */
    public final int f59215g = -1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59216h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f59217i = -1;

    @Override // jx3.a
    public int g() {
        return 27450;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59212d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59213e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59214f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59215g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59216h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59217i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MethodName:");
        stringBuffer.append(this.f59212d);
        stringBuffer.append("\r\nMethodCostMs:");
        stringBuffer.append(this.f59213e);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f59214f);
        stringBuffer.append("\r\nFrameIndex:");
        stringBuffer.append(this.f59215g);
        stringBuffer.append("\r\nMethodTrace:");
        stringBuffer.append(this.f59216h);
        stringBuffer.append("\r\nEnableImrove:");
        stringBuffer.append(this.f59217i);
        return stringBuffer.toString();
    }
}

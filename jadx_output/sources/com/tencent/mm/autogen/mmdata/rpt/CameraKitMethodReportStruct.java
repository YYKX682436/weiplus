package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class CameraKitMethodReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55547d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f55548e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final int f55549f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f55550g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55551h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55552i = "";

    @Override // jx3.a
    public int g() {
        return 27195;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55547d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55548e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55549f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55550g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55551h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55552i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MethodName:");
        stringBuffer.append(this.f55547d);
        stringBuffer.append("\r\nCostMs:");
        stringBuffer.append(this.f55548e);
        stringBuffer.append("\r\nErrorCode:");
        stringBuffer.append(this.f55549f);
        stringBuffer.append("\r\nErrorMsg:");
        stringBuffer.append(this.f55550g);
        stringBuffer.append("\r\nCpuInfo:");
        stringBuffer.append(this.f55551h);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f55552i);
        return stringBuffer.toString();
    }
}

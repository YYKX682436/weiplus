package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WxImeCommandTokenReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f62995f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62993d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62994e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62996g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62997h = "";

    @Override // jx3.a
    public int g() {
        return 29960;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62993d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62994e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62995f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62996g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62997h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CurrentImePackageName:");
        stringBuffer.append(this.f62993d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f62994e);
        stringBuffer.append("\r\nResult:");
        stringBuffer.append(this.f62995f);
        stringBuffer.append("\r\nToken:");
        stringBuffer.append(this.f62996g);
        stringBuffer.append("\r\nCommandId:");
        stringBuffer.append(this.f62997h);
        return stringBuffer.toString();
    }
}

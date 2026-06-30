package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WxAssistantReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f62990d = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f62991f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f62992g = "";

    @Override // jx3.a
    public int g() {
        return 35856;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62990d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62991f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62992g);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionId:");
        stringBuffer.append(this.f62990d);
        stringBuffer.append("\r\naction:0\r\nappId:");
        stringBuffer.append(this.f62991f);
        stringBuffer.append("\r\npath:");
        stringBuffer.append(this.f62992g);
        stringBuffer.append("\r\ncost:0");
        return stringBuffer.toString();
    }
}

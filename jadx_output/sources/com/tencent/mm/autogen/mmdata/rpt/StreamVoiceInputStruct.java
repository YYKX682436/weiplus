package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class StreamVoiceInputStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60988d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60989e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60990f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60991g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60992h = "";

    @Override // jx3.a
    public int g() {
        return 15493;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60988d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60989e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60990f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60991g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60992h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("LogType:");
        stringBuffer.append(this.f60988d);
        stringBuffer.append("\r\nWechatLanguage:");
        stringBuffer.append(this.f60989e);
        stringBuffer.append("\r\nInputLanguage:");
        stringBuffer.append(this.f60990f);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f60991g);
        stringBuffer.append("\r\nWording:");
        stringBuffer.append(this.f60992h);
        return stringBuffer.toString();
    }
}

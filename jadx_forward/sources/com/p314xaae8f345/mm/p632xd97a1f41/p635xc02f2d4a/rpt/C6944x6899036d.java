package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StreamVoiceInputStruct */
/* loaded from: classes15.dex */
public final class C6944x6899036d extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142521d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142522e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142523f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142524g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f142525h = "";

    @Override // jx3.a
    public int g() {
        return 15493;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142521d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142522e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142523f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142524g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142525h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("LogType:");
        stringBuffer.append(this.f142521d);
        stringBuffer.append("\r\nWechatLanguage:");
        stringBuffer.append(this.f142522e);
        stringBuffer.append("\r\nInputLanguage:");
        stringBuffer.append(this.f142523f);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f142524g);
        stringBuffer.append("\r\nWording:");
        stringBuffer.append(this.f142525h);
        return stringBuffer.toString();
    }
}

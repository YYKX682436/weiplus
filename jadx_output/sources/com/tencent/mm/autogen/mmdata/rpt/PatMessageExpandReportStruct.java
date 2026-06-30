package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class PatMessageExpandReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f59840d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59841e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59842f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f59843g;

    @Override // jx3.a
    public int g() {
        return 19963;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59840d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59841e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59842f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59843g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f59840d);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f59841e);
        stringBuffer.append("\r\nChatUsername:");
        stringBuffer.append(this.f59842f);
        stringBuffer.append("\r\nMessageCount:");
        stringBuffer.append(this.f59843g);
        return stringBuffer.toString();
    }
}

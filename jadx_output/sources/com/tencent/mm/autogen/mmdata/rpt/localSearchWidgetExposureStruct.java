package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class localSearchWidgetExposureStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f63129d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f63130e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f63131f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f63132g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f63133h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f63134i = "";

    @Override // jx3.a
    public int g() {
        return 16032;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f63129d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63130e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63131f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63132g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63133h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63134i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:0\r\ncontent:");
        stringBuffer.append(this.f63129d);
        stringBuffer.append("\r\nsearchid:");
        stringBuffer.append(this.f63130e);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f63131f);
        stringBuffer.append("\r\nquery:");
        stringBuffer.append(this.f63132g);
        stringBuffer.append("\r\nresulttype:");
        stringBuffer.append(this.f63133h);
        stringBuffer.append("\r\nresultsubtypelist:");
        stringBuffer.append(this.f63134i);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class SavedHelloMsgReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60155d;

    /* renamed from: e, reason: collision with root package name */
    public long f60156e;

    @Override // jx3.a
    public int g() {
        return 28239;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60155d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60156e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f60155d);
        stringBuffer.append("\r\ncontentStatus:");
        stringBuffer.append(this.f60156e);
        return stringBuffer.toString();
    }
}

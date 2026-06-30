package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsBeforePostImageInfoStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60462d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60463e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f60464f = 0;

    @Override // jx3.a
    public int g() {
        return 15987;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60462d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60463e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60464f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Entrance:");
        stringBuffer.append(this.f60462d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f60463e);
        stringBuffer.append("\r\nClickTimeStampMs:");
        stringBuffer.append(this.f60464f);
        return stringBuffer.toString();
    }
}

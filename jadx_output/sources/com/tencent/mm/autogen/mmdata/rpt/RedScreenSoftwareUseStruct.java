package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class RedScreenSoftwareUseStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59939d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59940e = "";

    @Override // jx3.a
    public int g() {
        return 24112;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59939d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59940e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppType:");
        stringBuffer.append(this.f59939d);
        stringBuffer.append("\r\nPackageName:");
        stringBuffer.append(this.f59940e);
        return stringBuffer.toString();
    }
}

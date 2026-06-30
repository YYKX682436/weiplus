package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class CameraxDowngradeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55578d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55579e = "";

    @Override // jx3.a
    public int g() {
        return 37041;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55578d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55579e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExceptionTime:");
        stringBuffer.append(this.f55578d);
        stringBuffer.append("\r\nSystemVersion:");
        stringBuffer.append(this.f55579e);
        return stringBuffer.toString();
    }
}

package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SdkCgiReportErrorReportStruct */
/* loaded from: classes3.dex */
public final class C6847x6bd30ef2 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f141690d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141691e = "";

    @Override // jx3.a
    public int g() {
        return 30513;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141690d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141691e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ErrorType:");
        stringBuffer.append(this.f141690d);
        stringBuffer.append("\r\nErrorSource:");
        stringBuffer.append(this.f141691e);
        return stringBuffer.toString();
    }
}

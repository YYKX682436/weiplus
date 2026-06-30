package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class OCRCrashReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59744d = "";

    @Override // jx3.a
    public int g() {
        return 29649;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59744d);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Path:");
        stringBuffer.append(this.f59744d);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.OCRCrashReportStruct p(java.lang.String str) {
        this.f59744d = b("Path", str, true);
        return this;
    }
}

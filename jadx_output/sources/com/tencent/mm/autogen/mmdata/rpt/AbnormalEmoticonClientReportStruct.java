package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class AbnormalEmoticonClientReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55013d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f55014e;

    @Override // jx3.a
    public int g() {
        return 24826;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55013d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55014e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Md5:");
        stringBuffer.append(this.f55013d);
        stringBuffer.append("\r\nReason:");
        stringBuffer.append(this.f55014e);
        return stringBuffer.toString();
    }
}

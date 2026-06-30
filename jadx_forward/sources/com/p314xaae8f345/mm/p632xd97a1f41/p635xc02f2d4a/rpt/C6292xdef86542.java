package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AbnormalEmoticonClientReportStruct */
/* loaded from: classes4.dex */
public final class C6292xdef86542 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f136546d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f136547e;

    @Override // jx3.a
    public int g() {
        return 24826;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136546d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136547e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Md5:");
        stringBuffer.append(this.f136546d);
        stringBuffer.append("\r\nReason:");
        stringBuffer.append(this.f136547e);
        return stringBuffer.toString();
    }
}

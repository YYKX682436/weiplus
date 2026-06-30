package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class SolitaireTipsShowReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60851d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f60852e = 0;

    @Override // jx3.a
    public int g() {
        return 18257;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60851d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60852e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f60851d);
        stringBuffer.append("\r\nOperateType:");
        stringBuffer.append(this.f60852e);
        return stringBuffer.toString();
    }
}

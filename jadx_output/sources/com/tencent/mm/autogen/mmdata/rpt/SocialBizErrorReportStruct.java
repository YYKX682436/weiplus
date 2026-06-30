package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SocialBizErrorReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60810d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f60811e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60812f = "";

    @Override // jx3.a
    public int g() {
        return 31506;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60810d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60811e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60812f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f60810d);
        stringBuffer.append("\r\nErrorType:");
        stringBuffer.append(this.f60811e);
        stringBuffer.append("\r\nErrorMsg:");
        stringBuffer.append(this.f60812f);
        return stringBuffer.toString();
    }
}

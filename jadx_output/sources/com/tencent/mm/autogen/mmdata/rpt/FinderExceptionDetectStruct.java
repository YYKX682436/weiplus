package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderExceptionDetectStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f56726e;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56725d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56727f = "";

    @Override // jx3.a
    public int g() {
        return 20889;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56725d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56726e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56727f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InnerVersion:");
        stringBuffer.append(this.f56725d);
        stringBuffer.append("\r\nexceptionType:");
        stringBuffer.append(this.f56726e);
        stringBuffer.append("\r\nexceptionValue:");
        stringBuffer.append(this.f56727f);
        return stringBuffer.toString();
    }
}

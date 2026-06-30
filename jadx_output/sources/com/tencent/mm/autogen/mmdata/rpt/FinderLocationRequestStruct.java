package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderLocationRequestStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57411d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57412e = "";

    @Override // jx3.a
    public int g() {
        return 19954;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57411d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57412e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f57411d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f57412e);
        return stringBuffer.toString();
    }
}

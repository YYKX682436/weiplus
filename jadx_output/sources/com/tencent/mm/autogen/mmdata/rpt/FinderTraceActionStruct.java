package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderTraceActionStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f57933e;

    /* renamed from: h, reason: collision with root package name */
    public long f57936h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57932d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57934f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57935g = "";

    @Override // jx3.a
    public int g() {
        return 19433;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57932d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57933e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57934f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57935g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57936h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f57932d);
        stringBuffer.append("\r\nActionTime:");
        stringBuffer.append(this.f57933e);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f57934f);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f57935g);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f57936h);
        return stringBuffer.toString();
    }
}

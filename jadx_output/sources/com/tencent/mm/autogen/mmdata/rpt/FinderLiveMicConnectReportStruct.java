package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderLiveMicConnectReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57173d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57174e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57175f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57176g = "";

    @Override // jx3.a
    public int g() {
        return 28323;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57173d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57174e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57175f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57176g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("opType:");
        stringBuffer.append(this.f57173d);
        stringBuffer.append("\r\nopMsg:");
        stringBuffer.append(this.f57174e);
        stringBuffer.append("\r\nuserId:");
        stringBuffer.append(this.f57175f);
        stringBuffer.append("\r\nliveId:");
        stringBuffer.append(this.f57176g);
        return stringBuffer.toString();
    }
}

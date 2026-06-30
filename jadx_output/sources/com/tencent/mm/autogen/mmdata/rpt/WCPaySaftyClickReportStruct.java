package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WCPaySaftyClickReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62116d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62117e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f62118f = 0;

    @Override // jx3.a
    public int g() {
        return 15661;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62116d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62117e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62118f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ClickScene:");
        stringBuffer.append(this.f62116d);
        stringBuffer.append("\r\nReportValue:");
        stringBuffer.append(this.f62117e);
        stringBuffer.append("\r\nEntryScene:");
        stringBuffer.append(this.f62118f);
        return stringBuffer.toString();
    }
}

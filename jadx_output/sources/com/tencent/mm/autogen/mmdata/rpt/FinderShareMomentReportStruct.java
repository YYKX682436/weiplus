package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class FinderShareMomentReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57821d;

    /* renamed from: g, reason: collision with root package name */
    public long f57824g;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57822e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57823f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57825h = "";

    @Override // jx3.a
    public int g() {
        return 21181;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57821d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57822e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57823f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57824g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57825h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ForwardType:");
        stringBuffer.append(this.f57821d);
        stringBuffer.append("\r\nFeedid:");
        stringBuffer.append(this.f57822e);
        stringBuffer.append("\r\nPublishid:");
        stringBuffer.append(this.f57823f);
        stringBuffer.append("\r\nOutcome:");
        stringBuffer.append(this.f57824g);
        stringBuffer.append("\r\nMonmentSessionId:");
        stringBuffer.append(this.f57825h);
        return stringBuffer.toString();
    }
}

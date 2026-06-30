package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderShareMomentReportStruct */
/* loaded from: classes4.dex */
public final class C6585x76586362 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f139354d;

    /* renamed from: g, reason: collision with root package name */
    public long f139357g;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139355e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139356f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139358h = "";

    @Override // jx3.a
    public int g() {
        return 21181;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139354d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139355e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139356f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139357g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139358h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ForwardType:");
        stringBuffer.append(this.f139354d);
        stringBuffer.append("\r\nFeedid:");
        stringBuffer.append(this.f139355e);
        stringBuffer.append("\r\nPublishid:");
        stringBuffer.append(this.f139356f);
        stringBuffer.append("\r\nOutcome:");
        stringBuffer.append(this.f139357g);
        stringBuffer.append("\r\nMonmentSessionId:");
        stringBuffer.append(this.f139358h);
        return stringBuffer.toString();
    }
}

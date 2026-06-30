package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CircleSearchKvReportStruct */
/* loaded from: classes11.dex */
public final class C6374x19de00c extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f137215e;

    /* renamed from: f, reason: collision with root package name */
    public int f137216f;

    /* renamed from: g, reason: collision with root package name */
    public long f137217g;

    /* renamed from: h, reason: collision with root package name */
    public int f137218h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137214d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f137219i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f137220j = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f137221k = "";

    @Override // jx3.a
    public int g() {
        return 33399;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137214d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137215e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137216f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137217g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137218h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137219i);
        stringBuffer.append(",");
        stringBuffer.append(this.f137220j);
        stringBuffer.append(",");
        stringBuffer.append(this.f137221k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f137214d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f137215e);
        stringBuffer.append("\r\nentrances:");
        stringBuffer.append(this.f137216f);
        stringBuffer.append("\r\naction_timestampms:");
        stringBuffer.append(this.f137217g);
        stringBuffer.append("\r\naction_type:");
        stringBuffer.append(this.f137218h);
        stringBuffer.append("\r\naction_value:");
        stringBuffer.append(this.f137219i);
        stringBuffer.append("\r\nsearchid:");
        stringBuffer.append(this.f137220j);
        stringBuffer.append("\r\nrequestid:");
        stringBuffer.append(this.f137221k);
        return stringBuffer.toString();
    }
}

package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AudioRouteReportStruct */
/* loaded from: classes14.dex */
public final class C6330x511aadfc extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f136874d;

    /* renamed from: e, reason: collision with root package name */
    public int f136875e;

    /* renamed from: f, reason: collision with root package name */
    public int f136876f;

    /* renamed from: h, reason: collision with root package name */
    public int f136878h;

    /* renamed from: i, reason: collision with root package name */
    public long f136879i;

    /* renamed from: j, reason: collision with root package name */
    public int f136880j;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f136877g = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f136881k = "";

    @Override // jx3.a
    public int g() {
        return 28590;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136874d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136875e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136876f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136877g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136878h);
        stringBuffer.append(",");
        stringBuffer.append(this.f136879i);
        stringBuffer.append(",");
        stringBuffer.append(this.f136880j);
        stringBuffer.append(",");
        stringBuffer.append(this.f136881k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReportType:");
        stringBuffer.append(this.f136874d);
        stringBuffer.append("\r\nUseCase:");
        stringBuffer.append(this.f136875e);
        stringBuffer.append("\r\nPortType:");
        stringBuffer.append(this.f136876f);
        stringBuffer.append("\r\nRouteTo:");
        stringBuffer.append(this.f136877g);
        stringBuffer.append("\r\nOpType:");
        stringBuffer.append(this.f136878h);
        stringBuffer.append("\r\nPrevDeviceTillTime:");
        stringBuffer.append(this.f136879i);
        stringBuffer.append("\r\nErrorCode:");
        stringBuffer.append(this.f136880j);
        stringBuffer.append("\r\nCurrentDevice:");
        stringBuffer.append(this.f136881k);
        return stringBuffer.toString();
    }
}

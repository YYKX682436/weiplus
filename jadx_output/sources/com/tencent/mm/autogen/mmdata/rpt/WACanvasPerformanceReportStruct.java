package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WACanvasPerformanceReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f61912e;

    /* renamed from: f, reason: collision with root package name */
    public long f61913f;

    /* renamed from: g, reason: collision with root package name */
    public long f61914g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61911d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61915h = "";

    @Override // jx3.a
    public int g() {
        return 23423;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61911d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61912e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61913f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61914g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61915h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f61911d);
        stringBuffer.append("\r\nEventType:");
        stringBuffer.append(this.f61912e);
        stringBuffer.append("\r\nEventTimeStamp:");
        stringBuffer.append(this.f61913f);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f61914g);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f61915h);
        return stringBuffer.toString();
    }
}

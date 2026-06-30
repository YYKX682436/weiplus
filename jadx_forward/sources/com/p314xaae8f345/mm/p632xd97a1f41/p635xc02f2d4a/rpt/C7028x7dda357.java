package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WACanvasPerformanceReportStruct */
/* loaded from: classes7.dex */
public final class C7028x7dda357 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f143445e;

    /* renamed from: f, reason: collision with root package name */
    public long f143446f;

    /* renamed from: g, reason: collision with root package name */
    public long f143447g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143444d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143448h = "";

    @Override // jx3.a
    public int g() {
        return 23423;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143444d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143445e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143446f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143447g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143448h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f143444d);
        stringBuffer.append("\r\nEventType:");
        stringBuffer.append(this.f143445e);
        stringBuffer.append("\r\nEventTimeStamp:");
        stringBuffer.append(this.f143446f);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f143447g);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f143448h);
        return stringBuffer.toString();
    }
}

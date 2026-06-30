package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BindPhoneGuidancePageReportStruct */
/* loaded from: classes5.dex */
public final class C6337xa96d9601 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f136916d;

    /* renamed from: e, reason: collision with root package name */
    public long f136917e;

    /* renamed from: f, reason: collision with root package name */
    public long f136918f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f136919g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f136920h = "";

    @Override // jx3.a
    public int g() {
        return 23947;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136916d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136917e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136918f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136919g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136920h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f136916d);
        stringBuffer.append("\r\nPageID:");
        stringBuffer.append(this.f136917e);
        stringBuffer.append("\r\nModuleID:");
        stringBuffer.append(this.f136918f);
        stringBuffer.append("\r\nActionInfo:");
        stringBuffer.append(this.f136919g);
        stringBuffer.append("\r\nGuidanceScene:");
        stringBuffer.append(this.f136920h);
        return stringBuffer.toString();
    }
}

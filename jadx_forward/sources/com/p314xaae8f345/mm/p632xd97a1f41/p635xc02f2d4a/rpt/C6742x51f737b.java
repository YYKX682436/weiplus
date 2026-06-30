package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MethodAnalyseReportStruct */
/* loaded from: classes.dex */
public final class C6742x51f737b extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140745d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f140746e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f140747f = "";

    /* renamed from: g, reason: collision with root package name */
    public final int f140748g = -1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140749h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f140750i = -1;

    @Override // jx3.a
    public int g() {
        return 27450;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140745d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140746e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140747f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140748g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140749h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140750i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MethodName:");
        stringBuffer.append(this.f140745d);
        stringBuffer.append("\r\nMethodCostMs:");
        stringBuffer.append(this.f140746e);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f140747f);
        stringBuffer.append("\r\nFrameIndex:");
        stringBuffer.append(this.f140748g);
        stringBuffer.append("\r\nMethodTrace:");
        stringBuffer.append(this.f140749h);
        stringBuffer.append("\r\nEnableImrove:");
        stringBuffer.append(this.f140750i);
        return stringBuffer.toString();
    }
}

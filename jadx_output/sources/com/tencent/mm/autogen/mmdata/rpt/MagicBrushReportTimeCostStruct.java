package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class MagicBrushReportTimeCostStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f59064f;

    /* renamed from: g, reason: collision with root package name */
    public long f59065g;

    /* renamed from: i, reason: collision with root package name */
    public long f59067i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59062d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59063e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59066h = "";

    @Override // jx3.a
    public int g() {
        return 26777;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59062d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59063e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59064f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59065g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59066h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59067i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionID:");
        stringBuffer.append(this.f59062d);
        stringBuffer.append("\r\nBizName:");
        stringBuffer.append(this.f59063e);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f59064f);
        stringBuffer.append("\r\nCostTime:");
        stringBuffer.append(this.f59065g);
        stringBuffer.append("\r\nExtras:");
        stringBuffer.append(this.f59066h);
        stringBuffer.append("\r\nAppStatus:");
        stringBuffer.append(this.f59067i);
        return stringBuffer.toString();
    }
}

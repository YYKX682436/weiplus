package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class F2FMoneyRemindStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f56131d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56132e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56133f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f56134g = 0;

    @Override // jx3.a
    public int g() {
        return 18885;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56131d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56132e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56133f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56134g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f56131d);
        stringBuffer.append("\r\nF2FId:");
        stringBuffer.append(this.f56132e);
        stringBuffer.append("\r\nQrCodeId:");
        stringBuffer.append(this.f56133f);
        stringBuffer.append("\r\nTotalAmount:");
        stringBuffer.append(this.f56134g);
        return stringBuffer.toString();
    }
}

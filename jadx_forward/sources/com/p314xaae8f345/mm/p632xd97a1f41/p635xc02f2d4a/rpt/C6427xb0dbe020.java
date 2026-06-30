package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.F2FMoneyRemindStruct */
/* loaded from: classes9.dex */
public final class C6427xb0dbe020 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f137664d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f137665e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f137666f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f137667g = 0;

    @Override // jx3.a
    public int g() {
        return 18885;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137664d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137665e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137666f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137667g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f137664d);
        stringBuffer.append("\r\nF2FId:");
        stringBuffer.append(this.f137665e);
        stringBuffer.append("\r\nQrCodeId:");
        stringBuffer.append(this.f137666f);
        stringBuffer.append("\r\nTotalAmount:");
        stringBuffer.append(this.f137667g);
        return stringBuffer.toString();
    }
}

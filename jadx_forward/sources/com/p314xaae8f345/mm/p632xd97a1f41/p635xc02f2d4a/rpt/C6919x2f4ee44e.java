package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SolitaireDropReportStruct */
/* loaded from: classes5.dex */
public final class C6919x2f4ee44e extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142368d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142369e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f142370f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f142371g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f142372h = "";

    @Override // jx3.a
    public int g() {
        return 18252;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142368d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142369e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142370f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142371g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142372h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f142368d);
        stringBuffer.append("\r\nLaunchUserName:");
        stringBuffer.append(this.f142369e);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f142370f);
        stringBuffer.append("\r\nreason:");
        stringBuffer.append(this.f142371g);
        stringBuffer.append("\r\nIdentifier:");
        stringBuffer.append(this.f142372h);
        return stringBuffer.toString();
    }
}

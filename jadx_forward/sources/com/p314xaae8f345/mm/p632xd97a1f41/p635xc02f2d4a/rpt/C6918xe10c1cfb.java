package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SolitaireClickReportStruct */
/* loaded from: classes5.dex */
public final class C6918xe10c1cfb extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142363d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f142364e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f142365f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f142366g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f142367h = "";

    @Override // jx3.a
    public int g() {
        return 18258;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142363d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142364e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142365f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142366g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142367h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f142363d);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f142364e);
        stringBuffer.append("\r\nClickType:");
        stringBuffer.append(this.f142365f);
        stringBuffer.append("\r\nSourceType:");
        stringBuffer.append(this.f142366g);
        stringBuffer.append("\r\nIdentifier:");
        stringBuffer.append(this.f142367h);
        return stringBuffer.toString();
    }
}

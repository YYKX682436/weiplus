package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SolitaireFormatInputEnterReportStruct */
/* loaded from: classes5.dex */
public final class C6920x30febe4 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142373d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f142374e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f142375f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f142376g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f142377h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f142378i = "";

    @Override // jx3.a
    public int g() {
        return 18256;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142373d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142374e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142375f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142376g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142377h);
        stringBuffer.append(",");
        stringBuffer.append(this.f142378i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f142373d);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f142374e);
        stringBuffer.append("\r\nEnterScene:");
        stringBuffer.append(this.f142375f);
        stringBuffer.append("\r\nExitType:");
        stringBuffer.append(this.f142376g);
        stringBuffer.append("\r\nOperateType:");
        stringBuffer.append(this.f142377h);
        stringBuffer.append("\r\nIdentifier:");
        stringBuffer.append(this.f142378i);
        return stringBuffer.toString();
    }
}

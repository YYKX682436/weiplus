package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WAKoubeiEventReportStruct */
/* loaded from: classes7.dex */
public final class C7033xa441dce4 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143487d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143488e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143489f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f143490g;

    /* renamed from: h, reason: collision with root package name */
    public long f143491h;

    @Override // jx3.a
    public int g() {
        return 31125;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143487d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143488e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143489f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143490g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143491h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appid:");
        stringBuffer.append(this.f143487d);
        stringBuffer.append("\r\npagePath:");
        stringBuffer.append(this.f143488e);
        stringBuffer.append("\r\nsessionBuffer:");
        stringBuffer.append(this.f143489f);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f143490g);
        stringBuffer.append("\r\nsource:");
        stringBuffer.append(this.f143491h);
        return stringBuffer.toString();
    }
}

package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SolitaireMsgFoldClickStruct */
/* loaded from: classes5.dex */
public final class C6921x82d9e311 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142379d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f142380e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142381f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f142382g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f142383h = 0;

    @Override // jx3.a
    public int g() {
        return 19964;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142379d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142380e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142381f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142382g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142383h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f142379d);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f142380e);
        stringBuffer.append("\r\nIdentifier:");
        stringBuffer.append(this.f142381f);
        stringBuffer.append("\r\nDisplayCount:");
        stringBuffer.append(this.f142382g);
        stringBuffer.append("\r\nHideCount:");
        stringBuffer.append(this.f142383h);
        return stringBuffer.toString();
    }
}

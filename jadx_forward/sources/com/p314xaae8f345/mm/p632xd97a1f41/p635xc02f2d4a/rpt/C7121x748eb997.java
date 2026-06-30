package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppTradeCommentReportStruct */
/* loaded from: classes7.dex */
public final class C7121x748eb997 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f144405d;

    /* renamed from: e, reason: collision with root package name */
    public int f144406e;

    /* renamed from: f, reason: collision with root package name */
    public int f144407f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f144408g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f144409h = "";

    @Override // jx3.a
    public int g() {
        return 27948;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144405d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144406e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144407f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144408g);
        stringBuffer.append(",");
        stringBuffer.append(this.f144409h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f144405d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f144406e);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f144407f);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f144408g);
        stringBuffer.append("\r\nActionNote:");
        stringBuffer.append(this.f144409h);
        return stringBuffer.toString();
    }
}

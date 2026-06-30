package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class NewPoiDetailFinderStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59720d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f59721e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f59722f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f59723g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f59724h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f59725i = "";

    @Override // jx3.a
    public int g() {
        return 22116;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,0,0,");
        stringBuffer.append(this.f59720d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59721e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59722f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59723g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59724h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59725i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:0\r\nactionTS:0\r\nduration:0\r\nDynamicState:0\r\nContextid:");
        stringBuffer.append(this.f59720d);
        stringBuffer.append("\r\nSessionid:");
        stringBuffer.append(this.f59721e);
        stringBuffer.append("\r\nPOIID:");
        stringBuffer.append(this.f59722f);
        stringBuffer.append("\r\nPOIDetail:");
        stringBuffer.append(this.f59723g);
        stringBuffer.append("\r\nfinderusername:");
        stringBuffer.append(this.f59724h);
        stringBuffer.append("\r\nsourceid:");
        stringBuffer.append(this.f59725i);
        return stringBuffer.toString();
    }
}

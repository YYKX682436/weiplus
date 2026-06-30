package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class MegaVideoClickInfoStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59147d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f59148e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f59149f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f59150g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f59151h = "";

    @Override // jx3.a
    public int g() {
        return 21152;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59147d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59148e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59149f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59150g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59151h);
        stringBuffer.append(",0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Feedid:");
        stringBuffer.append(this.f59147d);
        stringBuffer.append("\r\nLongVideoId:");
        stringBuffer.append(this.f59148e);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f59149f);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f59150g);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f59151h);
        stringBuffer.append("\r\nClickType:0\r\nLongvideoLen:0\r\nIsHaveGuide:0\r\nPlayLen:0");
        return stringBuffer.toString();
    }
}

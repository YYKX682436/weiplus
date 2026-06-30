package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MegaVideoClickInfoStruct */
/* loaded from: classes.dex */
public final class C6732xaa70f782 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f140680d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f140681e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f140682f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f140683g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f140684h = "";

    @Override // jx3.a
    public int g() {
        return 21152;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140680d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140681e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140682f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140683g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140684h);
        stringBuffer.append(",0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Feedid:");
        stringBuffer.append(this.f140680d);
        stringBuffer.append("\r\nLongVideoId:");
        stringBuffer.append(this.f140681e);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f140682f);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f140683g);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f140684h);
        stringBuffer.append("\r\nClickType:0\r\nLongvideoLen:0\r\nIsHaveGuide:0\r\nPlayLen:0");
        return stringBuffer.toString();
    }
}

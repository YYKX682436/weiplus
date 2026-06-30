package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class MegaVideoBulletActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59140d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f59141e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f59142f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f59143g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f59144h = "";

    @Override // jx3.a
    public int g() {
        return 21153;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59140d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59141e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59142f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59143g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59144h);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Feedid:");
        stringBuffer.append(this.f59140d);
        stringBuffer.append("\r\nLongVideoId:");
        stringBuffer.append(this.f59141e);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f59142f);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f59143g);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f59144h);
        stringBuffer.append("\r\nActiontype:0");
        return stringBuffer.toString();
    }
}

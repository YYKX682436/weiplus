package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class WC_MOMENTS_INPUT_ARER_LOGStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f62202d;

    /* renamed from: h, reason: collision with root package name */
    public int f62206h;

    /* renamed from: i, reason: collision with root package name */
    public int f62207i;

    /* renamed from: j, reason: collision with root package name */
    public int f62208j;

    /* renamed from: l, reason: collision with root package name */
    public int f62210l;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62203e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62204f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62205g = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f62209k = "";

    @Override // jx3.a
    public int g() {
        return 27790;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62202d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62203e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62204f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62205g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62206h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62207i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62208j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62209k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62210l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("contextType:");
        stringBuffer.append(this.f62202d);
        stringBuffer.append("\r\nsessionID:");
        stringBuffer.append(this.f62203e);
        stringBuffer.append("\r\nfeedID:");
        stringBuffer.append(this.f62204f);
        stringBuffer.append("\r\ncommentID:");
        stringBuffer.append(this.f62205g);
        stringBuffer.append("\r\nopResult:");
        stringBuffer.append(this.f62206h);
        stringBuffer.append("\r\nwordCount:");
        stringBuffer.append(this.f62207i);
        stringBuffer.append("\r\nlineCount:");
        stringBuffer.append(this.f62208j);
        stringBuffer.append("\r\ncontextScreenHeightRatio:");
        stringBuffer.append(this.f62209k);
        stringBuffer.append("\r\nwordLimiedToastCount:");
        stringBuffer.append(this.f62210l);
        return stringBuffer.toString();
    }
}

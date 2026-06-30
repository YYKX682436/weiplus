package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderUnflodActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57952d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57953e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57954f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57955g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57956h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f57957i;

    /* renamed from: j, reason: collision with root package name */
    public long f57958j;

    /* renamed from: k, reason: collision with root package name */
    public long f57959k;

    /* renamed from: l, reason: collision with root package name */
    public long f57960l;

    @Override // jx3.a
    public int g() {
        return 20044;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57952d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57953e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57954f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57955g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57956h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57957i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57958j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57959k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57960l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f57952d);
        stringBuffer.append("\r\nSessionid:");
        stringBuffer.append(this.f57953e);
        stringBuffer.append("\r\nContextid:");
        stringBuffer.append(this.f57954f);
        stringBuffer.append("\r\nClickTabContextid:");
        stringBuffer.append(this.f57955g);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f57956h);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f57957i);
        stringBuffer.append("\r\nHasWording:0\r\nClickAction:");
        stringBuffer.append(this.f57958j);
        stringBuffer.append("\r\nActionStatus:");
        stringBuffer.append(this.f57959k);
        stringBuffer.append("\r\nwordingtype:");
        stringBuffer.append(this.f57960l);
        return stringBuffer.toString();
    }
}

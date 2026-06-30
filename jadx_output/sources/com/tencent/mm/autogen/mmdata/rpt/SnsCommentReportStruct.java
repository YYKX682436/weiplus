package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsCommentReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f60500f;

    /* renamed from: g, reason: collision with root package name */
    public int f60501g;

    /* renamed from: h, reason: collision with root package name */
    public int f60502h;

    /* renamed from: k, reason: collision with root package name */
    public int f60505k;

    /* renamed from: l, reason: collision with root package name */
    public int f60506l;

    /* renamed from: m, reason: collision with root package name */
    public int f60507m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60498d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60499e = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60503i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60504j = "";

    @Override // jx3.a
    public int g() {
        return 35136;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60498d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60499e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60500f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60501g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60502h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60503i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60504j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60505k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60506l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60507m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FeedId:");
        stringBuffer.append(this.f60498d);
        stringBuffer.append("\r\nCommentId:");
        stringBuffer.append(this.f60499e);
        stringBuffer.append("\r\nCommentType:");
        stringBuffer.append(this.f60500f);
        stringBuffer.append("\r\nCommentState:");
        stringBuffer.append(this.f60501g);
        stringBuffer.append("\r\nResult:");
        stringBuffer.append(this.f60502h);
        stringBuffer.append("\r\nEmojiMd5:");
        stringBuffer.append(this.f60503i);
        stringBuffer.append("\r\nMediaId:");
        stringBuffer.append(this.f60504j);
        stringBuffer.append("\r\nWidth:");
        stringBuffer.append(this.f60505k);
        stringBuffer.append("\r\nHeight:");
        stringBuffer.append(this.f60506l);
        stringBuffer.append("\r\nPlatform:");
        stringBuffer.append(this.f60507m);
        return stringBuffer.toString();
    }
}

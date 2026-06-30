package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class StorySnsHeaderExposeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60967d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60968e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f60969f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60970g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f60971h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f60972i = 0;

    @Override // jx3.a
    public int g() {
        return 16843;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60967d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60968e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60969f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60970g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60971h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60972i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EnterObjectId:");
        stringBuffer.append(this.f60967d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f60968e);
        stringBuffer.append("\r\nExposeUinCount:");
        stringBuffer.append(this.f60969f);
        stringBuffer.append("\r\nExposeUinList:");
        stringBuffer.append(this.f60970g);
        stringBuffer.append("\r\nExposeNewVideoCount:");
        stringBuffer.append(this.f60971h);
        stringBuffer.append("\r\nInteractiveUserCount:");
        stringBuffer.append(this.f60972i);
        return stringBuffer.toString();
    }
}

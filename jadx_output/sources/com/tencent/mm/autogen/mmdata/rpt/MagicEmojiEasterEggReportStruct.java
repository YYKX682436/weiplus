package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class MagicEmojiEasterEggReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f59087f;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59085d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59086e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59088g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59089h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f59090i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f59091j = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f59092k = "";

    @Override // jx3.a
    public int g() {
        return 28254;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59085d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59086e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59087f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59088g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59089h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59090i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59091j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59092k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("keyword:");
        stringBuffer.append(this.f59085d);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f59086e);
        stringBuffer.append("\r\nactiontype:");
        stringBuffer.append(this.f59087f);
        stringBuffer.append("\r\nchatid:");
        stringBuffer.append(this.f59088g);
        stringBuffer.append("\r\nactivityid:");
        stringBuffer.append(this.f59089h);
        stringBuffer.append("\r\next1:");
        stringBuffer.append(this.f59090i);
        stringBuffer.append("\r\next2:");
        stringBuffer.append(this.f59091j);
        stringBuffer.append("\r\nrandomSeed:");
        stringBuffer.append(this.f59092k);
        return stringBuffer.toString();
    }
}

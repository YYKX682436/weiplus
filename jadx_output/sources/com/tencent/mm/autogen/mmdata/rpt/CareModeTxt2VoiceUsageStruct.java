package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class CareModeTxt2VoiceUsageStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55581d;

    /* renamed from: e, reason: collision with root package name */
    public long f55582e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f55583f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f55584g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f55585h;

    /* renamed from: i, reason: collision with root package name */
    public long f55586i;

    /* renamed from: j, reason: collision with root package name */
    public long f55587j;

    @Override // jx3.a
    public int g() {
        return 25904;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55581d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55582e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55583f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55584g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55585h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55586i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55587j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sentenceCount:");
        stringBuffer.append(this.f55581d);
        stringBuffer.append("\r\nidentifyCount:");
        stringBuffer.append(this.f55582e);
        stringBuffer.append("\r\nidentifyLangArray:");
        stringBuffer.append(this.f55583f);
        stringBuffer.append("\r\nunidentifyLangArray:");
        stringBuffer.append(this.f55584g);
        stringBuffer.append("\r\nchatType:");
        stringBuffer.append(this.f55585h);
        stringBuffer.append("\r\nmsgid:");
        stringBuffer.append(this.f55586i);
        stringBuffer.append("\r\nreportSource:");
        stringBuffer.append(this.f55587j);
        return stringBuffer.toString();
    }
}

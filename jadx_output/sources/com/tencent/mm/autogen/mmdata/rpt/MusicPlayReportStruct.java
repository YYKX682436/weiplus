package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class MusicPlayReportStruct extends jx3.a {

    /* renamed from: i, reason: collision with root package name */
    public long f59432i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59427d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59428e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59429f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59430g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59431h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f59433j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59434k = "";

    @Override // jx3.a
    public int g() {
        return 24576;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59427d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59428e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59429f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59430g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59431h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59432i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59433j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59434k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f59427d);
        stringBuffer.append("\r\nSongName:");
        stringBuffer.append(this.f59428e);
        stringBuffer.append("\r\nSinger:");
        stringBuffer.append(this.f59429f);
        stringBuffer.append("\r\nWebUrl:");
        stringBuffer.append(this.f59430g);
        stringBuffer.append("\r\nDataUrl:");
        stringBuffer.append(this.f59431h);
        stringBuffer.append("\r\nLength:");
        stringBuffer.append(this.f59432i);
        stringBuffer.append("\r\nPlayTrace:");
        stringBuffer.append(this.f59433j);
        stringBuffer.append("\r\nAppid:");
        stringBuffer.append(this.f59434k);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct p(java.lang.String str) {
        this.f59433j = b("PlayTrace", str, true);
        return this;
    }
}

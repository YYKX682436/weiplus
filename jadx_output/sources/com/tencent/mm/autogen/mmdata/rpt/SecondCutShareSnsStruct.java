package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SecondCutShareSnsStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60171d;

    /* renamed from: f, reason: collision with root package name */
    public long f60173f;

    /* renamed from: h, reason: collision with root package name */
    public long f60175h;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60172e = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f60174g = "";

    /* renamed from: i, reason: collision with root package name */
    public long f60176i = -1;

    /* renamed from: j, reason: collision with root package name */
    public long f60177j = -1;

    @Override // jx3.a
    public int g() {
        return 21746;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60171d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60172e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60173f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60174g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60175h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60176i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60177j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Type:");
        stringBuffer.append(this.f60171d);
        stringBuffer.append("\r\nPublishid:");
        stringBuffer.append(this.f60172e);
        stringBuffer.append("\r\nOutcome:");
        stringBuffer.append(this.f60173f);
        stringBuffer.append("\r\nMonmentSessionId:");
        stringBuffer.append(this.f60174g);
        stringBuffer.append("\r\ntemplateType:");
        stringBuffer.append(this.f60175h);
        stringBuffer.append("\r\nIsThumbExit:");
        stringBuffer.append(this.f60176i);
        stringBuffer.append("\r\nIsThumbBlack:");
        stringBuffer.append(this.f60177j);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WAKoubeiEventReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61954d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61955e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61956f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f61957g;

    /* renamed from: h, reason: collision with root package name */
    public long f61958h;

    @Override // jx3.a
    public int g() {
        return 31125;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61954d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61955e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61956f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61957g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61958h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appid:");
        stringBuffer.append(this.f61954d);
        stringBuffer.append("\r\npagePath:");
        stringBuffer.append(this.f61955e);
        stringBuffer.append("\r\nsessionBuffer:");
        stringBuffer.append(this.f61956f);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f61957g);
        stringBuffer.append("\r\nsource:");
        stringBuffer.append(this.f61958h);
        return stringBuffer.toString();
    }
}

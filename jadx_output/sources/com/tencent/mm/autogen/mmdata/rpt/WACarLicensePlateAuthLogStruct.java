package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WACarLicensePlateAuthLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61916d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f61917e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f61918f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f61919g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f61920h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f61921i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f61922j = 0;

    @Override // jx3.a
    public int g() {
        return 23342;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61916d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61917e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61918f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61919g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61920h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61921i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61922j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f61916d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f61917e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f61918f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f61919g);
        stringBuffer.append("\r\nCallPageType:");
        stringBuffer.append(this.f61920h);
        stringBuffer.append("\r\nHalfPageOperation:");
        stringBuffer.append(this.f61921i);
        stringBuffer.append("\r\nLicensePlateOperation:");
        stringBuffer.append(this.f61922j);
        return stringBuffer.toString();
    }
}

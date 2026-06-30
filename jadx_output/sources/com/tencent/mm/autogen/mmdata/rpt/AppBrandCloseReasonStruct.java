package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class AppBrandCloseReasonStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f55128e;

    /* renamed from: f, reason: collision with root package name */
    public long f55129f;

    /* renamed from: g, reason: collision with root package name */
    public long f55130g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55127d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55131h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55132i = "";

    @Override // jx3.a
    public int g() {
        return 21804;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55127d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55128e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55129f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55130g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55131h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55132i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appId:");
        stringBuffer.append(this.f55127d);
        stringBuffer.append("\r\nappType:");
        stringBuffer.append(this.f55128e);
        stringBuffer.append("\r\naliveTime:");
        stringBuffer.append(this.f55129f);
        stringBuffer.append("\r\nreason:");
        stringBuffer.append(this.f55130g);
        stringBuffer.append("\r\nflags:");
        stringBuffer.append(this.f55131h);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f55132i);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeappJsApiScanCodePathErrorStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f62934f;

    /* renamed from: g, reason: collision with root package name */
    public long f62935g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62932d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62933e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62936h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62937i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62938j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f62939k = "";

    @Override // jx3.a
    public int g() {
        return 35155;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62932d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62933e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62934f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62935g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62936h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62937i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62938j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62939k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f62932d);
        stringBuffer.append("\r\nAppUsername:");
        stringBuffer.append(this.f62933e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62934f);
        stringBuffer.append("\r\nAppVersionType:");
        stringBuffer.append(this.f62935g);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f62936h);
        stringBuffer.append("\r\ndecodePath:");
        stringBuffer.append(this.f62937i);
        stringBuffer.append("\r\ndoubleDecodePath:");
        stringBuffer.append(this.f62938j);
        stringBuffer.append("\r\nresult:");
        stringBuffer.append(this.f62939k);
        return stringBuffer.toString();
    }
}

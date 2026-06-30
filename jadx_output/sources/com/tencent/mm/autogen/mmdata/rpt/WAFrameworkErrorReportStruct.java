package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WAFrameworkErrorReportStruct extends jx3.a {

    /* renamed from: h, reason: collision with root package name */
    public long f61947h;

    /* renamed from: j, reason: collision with root package name */
    public long f61949j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61943d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61944e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61945f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f61946g = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61948i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f61950k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f61951l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f61952m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f61953n = 0;

    @Override // jx3.a
    public int g() {
        return 31226;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61943d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61944e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61945f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61946g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61947h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61948i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61949j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61950k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61951l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61952m);
        stringBuffer.append(",");
        stringBuffer.append(this.f61953n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f61943d);
        stringBuffer.append("\r\nAppid:");
        stringBuffer.append(this.f61944e);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f61945f);
        stringBuffer.append("\r\nAppServiceType:");
        stringBuffer.append(this.f61946g);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f61947h);
        stringBuffer.append("\r\nSceneNote:");
        stringBuffer.append(this.f61948i);
        stringBuffer.append("\r\nWeAppVersion:");
        stringBuffer.append(this.f61949j);
        stringBuffer.append("\r\nPublibVersionStr:");
        stringBuffer.append(this.f61950k);
        stringBuffer.append("\r\nNetworkType:");
        stringBuffer.append(this.f61951l);
        stringBuffer.append("\r\nErrorStack:");
        stringBuffer.append(this.f61952m);
        stringBuffer.append("\r\nErrorTimestamp:");
        stringBuffer.append(this.f61953n);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityAndroidWebViewPreInitCostStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.r f62399g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62396d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62397e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62398f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62400h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62401i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62402j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62403k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62404l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f62405m = 0;

    @Override // jx3.a
    public int g() {
        return 16899;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62396d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62397e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62398f);
        stringBuffer.append(",");
        cm.r rVar = this.f62399g;
        stringBuffer.append(rVar != null ? rVar.f43193d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62400h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62401i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62402j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62403k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62404l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62405m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62396d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62397e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62398f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62399g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62400h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62401i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62402j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62403k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62404l);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f62405m);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class WeAppQualitySytemPreDownloadCodeCgiStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62810d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62811e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62812f;

    /* renamed from: g, reason: collision with root package name */
    public long f62813g;

    /* renamed from: h, reason: collision with root package name */
    public long f62814h;

    /* renamed from: i, reason: collision with root package name */
    public long f62815i;

    /* renamed from: j, reason: collision with root package name */
    public long f62816j;

    /* renamed from: k, reason: collision with root package name */
    public int f62817k;

    /* renamed from: l, reason: collision with root package name */
    public long f62818l;

    @Override // jx3.a
    public int g() {
        return 18866;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62810d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62811e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62812f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62813g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62814h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62815i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62816j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62817k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62818l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("UserName:");
        stringBuffer.append(this.f62810d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62811e);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62812f);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62813g);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62814h);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62815i);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62816j);
        stringBuffer.append("\r\nRet:");
        stringBuffer.append(this.f62817k);
        stringBuffer.append("\r\nNetworkType:");
        stringBuffer.append(this.f62818l);
        return stringBuffer.toString();
    }
}

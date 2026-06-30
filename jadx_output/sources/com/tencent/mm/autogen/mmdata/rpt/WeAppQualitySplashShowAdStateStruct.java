package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualitySplashShowAdStateStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62704d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62705e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62706f;

    /* renamed from: g, reason: collision with root package name */
    public long f62707g;

    /* renamed from: h, reason: collision with root package name */
    public long f62708h;

    /* renamed from: i, reason: collision with root package name */
    public long f62709i;

    /* renamed from: j, reason: collision with root package name */
    public long f62710j;

    /* renamed from: k, reason: collision with root package name */
    public long f62711k;

    /* renamed from: l, reason: collision with root package name */
    public long f62712l;

    @Override // jx3.a
    public int g() {
        return 33080;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62704d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62705e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62706f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62707g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62708h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62709i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62710j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62711k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62712l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f62704d);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f62705e);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62706f);
        stringBuffer.append("\r\nAppOpenMode:");
        stringBuffer.append(this.f62707g);
        stringBuffer.append("\r\nTimeStampInMs:");
        stringBuffer.append(this.f62708h);
        stringBuffer.append("\r\nShowAdState:");
        stringBuffer.append(this.f62709i);
        stringBuffer.append("\r\nAppExitMidway:");
        stringBuffer.append(this.f62710j);
        stringBuffer.append("\r\nExtra1:");
        stringBuffer.append(this.f62711k);
        stringBuffer.append("\r\nPreloadStatus:");
        stringBuffer.append(this.f62712l);
        return stringBuffer.toString();
    }
}

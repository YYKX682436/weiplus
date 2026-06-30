package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityPreloadOpenRateStatisStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62639d;

    /* renamed from: e, reason: collision with root package name */
    public long f62640e;

    /* renamed from: f, reason: collision with root package name */
    public long f62641f;

    /* renamed from: h, reason: collision with root package name */
    public long f62643h;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62642g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62644i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62645j = "";

    @Override // jx3.a
    public int g() {
        return 18852;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62639d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62640e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62641f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62642g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62643h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62644i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62645j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("visitScene:");
        stringBuffer.append(this.f62639d);
        stringBuffer.append("\r\nbusinessScene:");
        stringBuffer.append(this.f62640e);
        stringBuffer.append("\r\ninnerScene:");
        stringBuffer.append(this.f62641f);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62642g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62643h);
        stringBuffer.append("\r\npath:");
        stringBuffer.append(this.f62644i);
        stringBuffer.append("\r\nopenRate:");
        stringBuffer.append(this.f62645j);
        return stringBuffer.toString();
    }
}

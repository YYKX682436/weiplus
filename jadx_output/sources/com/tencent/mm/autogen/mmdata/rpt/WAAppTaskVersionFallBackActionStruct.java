package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WAAppTaskVersionFallBackActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61893d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61894e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f61895f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f61896g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f61897h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f61898i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f61899j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f61900k = "";

    /* renamed from: l, reason: collision with root package name */
    public long f61901l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f61902m = "";

    @Override // jx3.a
    public int g() {
        return 20572;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61893d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61894e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61895f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61896g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61897h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61898i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61899j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61900k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61901l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61902m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Appid:");
        stringBuffer.append(this.f61893d);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f61894e);
        stringBuffer.append("\r\nOpenScene:");
        stringBuffer.append(this.f61895f);
        stringBuffer.append("\r\nTargetAppVersion:");
        stringBuffer.append(this.f61896g);
        stringBuffer.append("\r\nLocalAppVersion:");
        stringBuffer.append(this.f61897h);
        stringBuffer.append("\r\nFallbackScene:");
        stringBuffer.append(this.f61898i);
        stringBuffer.append("\r\nWaitTimeInMs:");
        stringBuffer.append(this.f61899j);
        stringBuffer.append("\r\nNetType:");
        stringBuffer.append(this.f61900k);
        stringBuffer.append("\r\nIsWeakNet:");
        stringBuffer.append(this.f61901l);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f61902m);
        return stringBuffer.toString();
    }
}

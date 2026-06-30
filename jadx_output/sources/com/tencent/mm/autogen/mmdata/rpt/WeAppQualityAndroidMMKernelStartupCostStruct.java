package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityAndroidMMKernelStartupCostStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.n f62360g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62357d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62358e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62359f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62361h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62362i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62363j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62364k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62365l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f62366m = 0;

    @Override // jx3.a
    public int g() {
        return 16900;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62357d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62358e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62359f);
        stringBuffer.append(",");
        cm.n nVar = this.f62360g;
        stringBuffer.append(nVar != null ? nVar.f43153d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62361h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62362i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62363j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62364k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62365l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62366m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62357d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62358e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62359f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62360g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62361h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62362i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62363j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62364k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62365l);
        stringBuffer.append("\r\nBootstepType:");
        stringBuffer.append(this.f62366m);
        return stringBuffer.toString();
    }
}

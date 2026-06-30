package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityAndroidProcessStartCostStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.q f62389g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62386d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62387e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62388f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62390h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62391i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62392j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62393k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62394l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f62395m = 0;

    @Override // jx3.a
    public int g() {
        return 16898;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62386d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62387e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62388f);
        stringBuffer.append(",");
        cm.q qVar = this.f62389g;
        stringBuffer.append(qVar != null ? qVar.f43183d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62390h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62391i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62392j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62393k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62394l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62395m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62386d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62387e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62388f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62389g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62390h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62391i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62392j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62393k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62394l);
        stringBuffer.append("\r\nisFromAndroidRecents:");
        stringBuffer.append(this.f62395m);
        return stringBuffer.toString();
    }
}

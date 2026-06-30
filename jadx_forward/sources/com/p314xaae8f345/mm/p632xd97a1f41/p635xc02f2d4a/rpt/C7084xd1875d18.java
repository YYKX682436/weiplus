package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidProcessStartCostStruct */
/* loaded from: classes7.dex */
public final class C7084xd1875d18 extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.q f143922g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143919d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143920e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f143921f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f143923h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f143924i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f143925j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f143926k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f143927l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f143928m = 0;

    @Override // jx3.a
    public int g() {
        return 16898;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143919d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143920e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143921f);
        stringBuffer.append(",");
        cm.q qVar = this.f143922g;
        stringBuffer.append(qVar != null ? qVar.f124716d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f143923h);
        stringBuffer.append(",");
        stringBuffer.append(this.f143924i);
        stringBuffer.append(",");
        stringBuffer.append(this.f143925j);
        stringBuffer.append(",");
        stringBuffer.append(this.f143926k);
        stringBuffer.append(",");
        stringBuffer.append(this.f143927l);
        stringBuffer.append(",");
        stringBuffer.append(this.f143928m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f143919d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f143920e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f143921f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f143922g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f143923h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f143924i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f143925j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f143926k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f143927l);
        stringBuffer.append("\r\nisFromAndroidRecents:");
        stringBuffer.append(this.f143928m);
        return stringBuffer.toString();
    }
}

package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidMMKernelStartupCostStruct */
/* loaded from: classes7.dex */
public final class C7081xbeaf759f extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.n f143893g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143890d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143891e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f143892f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f143894h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f143895i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f143896j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f143897k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f143898l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f143899m = 0;

    @Override // jx3.a
    public int g() {
        return 16900;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143890d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143891e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143892f);
        stringBuffer.append(",");
        cm.n nVar = this.f143893g;
        stringBuffer.append(nVar != null ? nVar.f124686d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f143894h);
        stringBuffer.append(",");
        stringBuffer.append(this.f143895i);
        stringBuffer.append(",");
        stringBuffer.append(this.f143896j);
        stringBuffer.append(",");
        stringBuffer.append(this.f143897k);
        stringBuffer.append(",");
        stringBuffer.append(this.f143898l);
        stringBuffer.append(",");
        stringBuffer.append(this.f143899m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f143890d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f143891e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f143892f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f143893g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f143894h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f143895i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f143896j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f143897k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f143898l);
        stringBuffer.append("\r\nBootstepType:");
        stringBuffer.append(this.f143899m);
        return stringBuffer.toString();
    }
}

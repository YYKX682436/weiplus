package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidMagicBrushCreateCostStruct */
/* loaded from: classes7.dex */
public final class C7082x5c0bc5ce extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public cm.o f143902f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143900d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143901e = "";

    /* renamed from: g, reason: collision with root package name */
    public long f143903g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f143904h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f143905i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f143906j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f143907k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f143908l = 0;

    @Override // jx3.a
    public int g() {
        return 17111;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143900d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143901e);
        stringBuffer.append(",");
        cm.o oVar = this.f143902f;
        stringBuffer.append(oVar != null ? oVar.f124696d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f143903g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143904h);
        stringBuffer.append(",");
        stringBuffer.append(this.f143905i);
        stringBuffer.append(",");
        stringBuffer.append(this.f143906j);
        stringBuffer.append(",");
        stringBuffer.append(this.f143907k);
        stringBuffer.append(",");
        stringBuffer.append(this.f143908l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f143900d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f143901e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f143902f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f143903g);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f143904h);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f143905i);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f143906j);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f143907k);
        stringBuffer.append("\r\nIsPreload:");
        stringBuffer.append(this.f143908l);
        return stringBuffer.toString();
    }
}

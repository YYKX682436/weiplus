package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAppServiceUSageStruct */
/* loaded from: classes7.dex */
public final class C7087x83d63936 extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.t f143955g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143952d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143953e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f143954f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f143956h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f143957i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f143958j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f143959k = 0;

    @Override // jx3.a
    public int g() {
        return 16369;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143952d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143953e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143954f);
        stringBuffer.append(",");
        cm.t tVar = this.f143955g;
        stringBuffer.append(tVar != null ? tVar.f124745d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f143956h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f143957i);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f143958j);
        stringBuffer.append(",");
        stringBuffer.append(this.f143959k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f143952d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f143953e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f143954f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f143955g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f143956h);
        stringBuffer.append("\r\nCostTimeMs:0\r\nScene:");
        stringBuffer.append(this.f143957i);
        stringBuffer.append("\r\nStartTimeStampMs:0\r\nEndTimeStampMs:0\r\nisPreload:");
        stringBuffer.append(this.f143958j);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f143959k);
        return stringBuffer.toString();
    }
}

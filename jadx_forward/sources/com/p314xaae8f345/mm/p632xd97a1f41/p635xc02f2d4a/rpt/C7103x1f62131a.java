package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityRuntimeStateStruct */
/* loaded from: classes7.dex */
public final class C7103x1f62131a extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.c0 f144182g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144179d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144180e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f144181f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f144183h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f144184i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f144185j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f144186k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f144187l = "";

    /* renamed from: m, reason: collision with root package name */
    public long f144188m = 0;

    @Override // jx3.a
    public int g() {
        return 18032;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144179d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144180e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144181f);
        stringBuffer.append(",");
        cm.c0 c0Var = this.f144182g;
        stringBuffer.append(c0Var != null ? c0Var.f124577d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f144183h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f144184i);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f144185j);
        stringBuffer.append(",");
        stringBuffer.append(this.f144186k);
        stringBuffer.append(",");
        stringBuffer.append(this.f144187l);
        stringBuffer.append(",");
        stringBuffer.append(this.f144188m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f144179d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f144180e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f144181f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f144182g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f144183h);
        stringBuffer.append("\r\nCostTimeMs:0\r\nScene:");
        stringBuffer.append(this.f144184i);
        stringBuffer.append("\r\nStartTimeStampMs:0\r\nEndTimeStampMs:0\r\nprocessNum:");
        stringBuffer.append(this.f144185j);
        stringBuffer.append("\r\nruntimeNum:");
        stringBuffer.append(this.f144186k);
        stringBuffer.append("\r\ndistribution:");
        stringBuffer.append(this.f144187l);
        stringBuffer.append("\r\nmmtoolsAlive:");
        stringBuffer.append(this.f144188m);
        return stringBuffer.toString();
    }
}

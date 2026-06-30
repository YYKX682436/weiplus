package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WxaRecentTaskPanelReportStruct */
/* loaded from: classes15.dex */
public final class C7149xf56ff60d extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f144578f;

    /* renamed from: i, reason: collision with root package name */
    public long f144581i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144576d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144577e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f144579g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f144580h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f144582j = "";

    @Override // jx3.a
    public int g() {
        return 35188;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144576d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144577e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144578f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144579g);
        stringBuffer.append(",");
        stringBuffer.append(this.f144580h);
        stringBuffer.append(",");
        stringBuffer.append(this.f144581i);
        stringBuffer.append(",");
        stringBuffer.append(this.f144582j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f144576d);
        stringBuffer.append("\r\nTaskSessionId:");
        stringBuffer.append(this.f144577e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f144578f);
        stringBuffer.append("\r\nActionNote:");
        stringBuffer.append(this.f144579g);
        stringBuffer.append("\r\nActionScene:");
        stringBuffer.append(this.f144580h);
        stringBuffer.append("\r\nActionTime:");
        stringBuffer.append(this.f144581i);
        stringBuffer.append("\r\nExtraData:");
        stringBuffer.append(this.f144582j);
        return stringBuffer.toString();
    }
}

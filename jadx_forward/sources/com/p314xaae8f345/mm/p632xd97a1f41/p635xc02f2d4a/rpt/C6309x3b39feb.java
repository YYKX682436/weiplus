package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandCloseReasonStruct */
/* loaded from: classes7.dex */
public final class C6309x3b39feb extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f136661e;

    /* renamed from: f, reason: collision with root package name */
    public long f136662f;

    /* renamed from: g, reason: collision with root package name */
    public long f136663g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f136660d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f136664h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f136665i = "";

    @Override // jx3.a
    public int g() {
        return 21804;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136660d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136661e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136662f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136663g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136664h);
        stringBuffer.append(",");
        stringBuffer.append(this.f136665i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appId:");
        stringBuffer.append(this.f136660d);
        stringBuffer.append("\r\nappType:");
        stringBuffer.append(this.f136661e);
        stringBuffer.append("\r\naliveTime:");
        stringBuffer.append(this.f136662f);
        stringBuffer.append("\r\nreason:");
        stringBuffer.append(this.f136663g);
        stringBuffer.append("\r\nflags:");
        stringBuffer.append(this.f136664h);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f136665i);
        return stringBuffer.toString();
    }
}

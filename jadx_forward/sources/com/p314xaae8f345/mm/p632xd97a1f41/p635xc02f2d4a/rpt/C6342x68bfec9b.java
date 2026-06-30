package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BizMyBizListReportStruct */
/* loaded from: classes11.dex */
public final class C6342x68bfec9b extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f136929d;

    /* renamed from: e, reason: collision with root package name */
    public long f136930e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f136931f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f136932g;

    /* renamed from: h, reason: collision with root package name */
    public long f136933h;

    @Override // jx3.a
    public int g() {
        return 27270;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136929d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136930e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136931f);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f136932g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136933h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("actionType:");
        stringBuffer.append(this.f136929d);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f136930e);
        stringBuffer.append("\r\nbizusername:");
        stringBuffer.append(this.f136931f);
        stringBuffer.append("\r\nexposeMsTime:0\r\nclickMsTime:");
        stringBuffer.append(this.f136932g);
        stringBuffer.append("\r\nisStar:");
        stringBuffer.append(this.f136933h);
        return stringBuffer.toString();
    }
}

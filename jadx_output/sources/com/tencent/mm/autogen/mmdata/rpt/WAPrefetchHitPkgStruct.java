package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WAPrefetchHitPkgStruct extends jx3.a {

    /* renamed from: i, reason: collision with root package name */
    public long f62026i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62021d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62022e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62023f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f62024g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62025h = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62027j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f62028k = "";

    @Override // jx3.a
    public int g() {
        return 16634;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62021d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62022e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62023f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62024g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62025h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62026i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62027j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62028k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Username:");
        stringBuffer.append(this.f62021d);
        stringBuffer.append("\r\nAppid:");
        stringBuffer.append(this.f62022e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62023f);
        stringBuffer.append("\r\nIsFirstHit:");
        stringBuffer.append(this.f62024g);
        stringBuffer.append("\r\nReportId:");
        stringBuffer.append(this.f62025h);
        stringBuffer.append("\r\nPackageType:");
        stringBuffer.append(this.f62026i);
        stringBuffer.append("\r\nModuleName:");
        stringBuffer.append(this.f62027j);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f62028k);
        return stringBuffer.toString();
    }
}

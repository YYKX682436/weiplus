package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class BrandTmplExposeReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55457d;

    /* renamed from: e, reason: collision with root package name */
    public long f55458e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55459f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55460g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55461h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55462i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f55463j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f55464k = "";

    @Override // jx3.a
    public int g() {
        return 28222;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55457d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55458e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55459f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55460g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55461h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55462i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55463j);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f55464k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("opType:");
        stringBuffer.append(this.f55457d);
        stringBuffer.append("\r\nopTime:");
        stringBuffer.append(this.f55458e);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f55459f);
        stringBuffer.append("\r\ntemplateId:");
        stringBuffer.append(this.f55460g);
        stringBuffer.append("\r\ntemplateTitle:");
        stringBuffer.append(this.f55461h);
        stringBuffer.append("\r\ntemplateContent:");
        stringBuffer.append(this.f55462i);
        stringBuffer.append("\r\ncomplainReason:");
        stringBuffer.append(this.f55463j);
        stringBuffer.append("\r\nisAgreeScreenshot:0\r\nisComplainSuccess:0\r\nobjectType:");
        stringBuffer.append(this.f55464k);
        return stringBuffer.toString();
    }
}

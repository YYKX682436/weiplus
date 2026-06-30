package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppCapsuleMutationReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62225d;

    /* renamed from: e, reason: collision with root package name */
    public long f62226e;

    /* renamed from: f, reason: collision with root package name */
    public long f62227f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62228g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62229h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62230i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62231j = "";

    /* renamed from: k, reason: collision with root package name */
    public long f62232k;

    @Override // jx3.a
    public int g() {
        return 31623;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62225d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62226e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62227f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62228g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62229h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62230i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62231j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62232k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f62225d);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f62226e);
        stringBuffer.append("\r\ncoexist_type:");
        stringBuffer.append(this.f62227f);
        stringBuffer.append("\r\nappid:");
        stringBuffer.append(this.f62228g);
        stringBuffer.append("\r\npath:");
        stringBuffer.append(this.f62229h);
        stringBuffer.append("\r\nquery:");
        stringBuffer.append(this.f62230i);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f62231j);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f62232k);
        return stringBuffer.toString();
    }
}

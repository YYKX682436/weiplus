package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class ExptAppReportDeleteStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56124d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f56125e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f56126f;

    @Override // jx3.a
    public int g() {
        return 28374;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56124d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56125e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56126f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExptAppId:");
        stringBuffer.append(this.f56124d);
        stringBuffer.append("\r\nExptSeq:");
        stringBuffer.append(this.f56125e);
        stringBuffer.append("\r\nUseFlag:");
        stringBuffer.append(this.f56126f);
        return stringBuffer.toString();
    }
}

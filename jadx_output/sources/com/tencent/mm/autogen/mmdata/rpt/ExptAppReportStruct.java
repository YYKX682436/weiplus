package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class ExptAppReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f56127d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f56128e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f56129f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f56130g;

    @Override // jx3.a
    public int g() {
        return 19988;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56127d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56128e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56129f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56130g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExptAppId:");
        stringBuffer.append(this.f56127d);
        stringBuffer.append("\r\nExptSeq:");
        stringBuffer.append(this.f56128e);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f56129f);
        stringBuffer.append("\r\nUseFlag:");
        stringBuffer.append(this.f56130g);
        return stringBuffer.toString();
    }
}

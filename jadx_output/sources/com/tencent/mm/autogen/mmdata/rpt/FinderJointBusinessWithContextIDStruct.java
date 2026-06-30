package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderJointBusinessWithContextIDStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56986d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56987e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56988f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56989g = "";

    @Override // jx3.a
    public int g() {
        return 21140;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56986d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56987e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56988f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56989g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("contextid:");
        stringBuffer.append(this.f56986d);
        stringBuffer.append("\r\nReportExtraInfo:");
        stringBuffer.append(this.f56987e);
        stringBuffer.append("\r\nEnterSourceFeedid:");
        stringBuffer.append(this.f56988f);
        stringBuffer.append("\r\nEnterSourceUsername:");
        stringBuffer.append(this.f56989g);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class MsgFullScreenOperateReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59267d;

    /* renamed from: e, reason: collision with root package name */
    public long f59268e;

    /* renamed from: f, reason: collision with root package name */
    public long f59269f;

    @Override // jx3.a
    public int g() {
        return 17560;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59267d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59268e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59269f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReportType:");
        stringBuffer.append(this.f59267d);
        stringBuffer.append("\r\nMediaType:");
        stringBuffer.append(this.f59268e);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f59269f);
        return stringBuffer.toString();
    }
}

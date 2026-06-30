package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class FTSBuildInfoReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56135d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f56136e;

    @Override // jx3.a
    public int g() {
        return 31418;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56135d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56136e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f56135d);
        stringBuffer.append("\r\nActionTime:");
        stringBuffer.append(this.f56136e);
        return stringBuffer.toString();
    }
}

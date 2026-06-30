package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class KMusicSdkDataReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58549d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58550e = "";

    @Override // jx3.a
    public int g() {
        return 33147;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58549d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58550e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Type:");
        stringBuffer.append(this.f58549d);
        stringBuffer.append("\r\nResult:");
        stringBuffer.append(this.f58550e);
        return stringBuffer.toString();
    }
}

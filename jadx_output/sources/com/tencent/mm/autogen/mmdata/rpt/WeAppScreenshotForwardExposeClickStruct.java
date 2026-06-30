package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class WeAppScreenshotForwardExposeClickStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62868d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62869e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62870f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62871g = "";

    @Override // jx3.a
    public int g() {
        return 29454;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62868d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62869e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62870f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62871g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f62868d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f62869e);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62870f);
        stringBuffer.append("\r\nEnterPath:");
        stringBuffer.append(this.f62871g);
        return stringBuffer.toString();
    }
}

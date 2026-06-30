package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class AlarmCrashStatisticsStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55032d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55033e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f55034f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55035g = "";

    @Override // jx3.a
    public int g() {
        return 19574;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55032d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55033e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55034f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55035g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Requestcode:");
        stringBuffer.append(this.f55032d);
        stringBuffer.append("\r\nProcessName:");
        stringBuffer.append(this.f55033e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f55034f);
        stringBuffer.append("\r\nStack:");
        stringBuffer.append(this.f55035g);
        return stringBuffer.toString();
    }
}

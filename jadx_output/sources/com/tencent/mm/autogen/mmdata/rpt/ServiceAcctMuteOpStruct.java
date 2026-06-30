package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class ServiceAcctMuteOpStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60235d;

    /* renamed from: e, reason: collision with root package name */
    public long f60236e;

    /* renamed from: f, reason: collision with root package name */
    public long f60237f;

    @Override // jx3.a
    public int g() {
        return 25901;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60235d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60236e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60237f);
        stringBuffer.append(",0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f60235d);
        stringBuffer.append("\r\nActionTs:");
        stringBuffer.append(this.f60236e);
        stringBuffer.append("\r\nServiceUnReadReddotNumber:");
        stringBuffer.append(this.f60237f);
        stringBuffer.append("\r\nServiceAcctCount:0\r\nEnableNumberNoticeAcctCount:0\r\nEnableNumberNoticeAcctCountFromSearch:0");
        return stringBuffer.toString();
    }
}

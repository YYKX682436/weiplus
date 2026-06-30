package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ServiceAcctMuteOpStruct */
/* loaded from: classes8.dex */
public final class C6858x7a92a6b7 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f141768d;

    /* renamed from: e, reason: collision with root package name */
    public long f141769e;

    /* renamed from: f, reason: collision with root package name */
    public long f141770f;

    @Override // jx3.a
    public int g() {
        return 25901;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141768d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141769e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141770f);
        stringBuffer.append(",0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f141768d);
        stringBuffer.append("\r\nActionTs:");
        stringBuffer.append(this.f141769e);
        stringBuffer.append("\r\nServiceUnReadReddotNumber:");
        stringBuffer.append(this.f141770f);
        stringBuffer.append("\r\nServiceAcctCount:0\r\nEnableNumberNoticeAcctCount:0\r\nEnableNumberNoticeAcctCountFromSearch:0");
        return stringBuffer.toString();
    }
}

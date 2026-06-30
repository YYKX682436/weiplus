package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class WCPayF2FVoicePushReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62093d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62094e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62095f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f62096g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62097h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f62098i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62099j = "";

    /* renamed from: k, reason: collision with root package name */
    public long f62100k = 0;

    @Override // jx3.a
    public int g() {
        return 14404;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62093d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62094e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62095f);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62096g);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62097h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62098i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62099j);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62100k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f62093d);
        stringBuffer.append("\r\nBiilNo:");
        stringBuffer.append(this.f62094e);
        stringBuffer.append("\r\nfailReason:");
        stringBuffer.append(this.f62095f);
        stringBuffer.append("\r\nplayerErrCode:0\r\ntype:");
        stringBuffer.append(this.f62096g);
        stringBuffer.append("\r\nretCode:0\r\ncontent:");
        stringBuffer.append(this.f62097h);
        stringBuffer.append("\r\namount:");
        stringBuffer.append(this.f62098i);
        stringBuffer.append("\r\npackId:");
        stringBuffer.append(this.f62099j);
        stringBuffer.append("\r\nversionId:0\r\nsessionType:");
        stringBuffer.append(this.f62100k);
        return stringBuffer.toString();
    }
}

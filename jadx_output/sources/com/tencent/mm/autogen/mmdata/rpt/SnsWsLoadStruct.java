package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsWsLoadStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60803d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f60804e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f60805f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f60806g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f60807h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f60808i = -1;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60809j = "";

    @Override // jx3.a
    public int g() {
        return 36016;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60803d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60804e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60805f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60806g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60807h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60808i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60809j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReqStartTimeMs:");
        stringBuffer.append(this.f60803d);
        stringBuffer.append("\r\nReqEndTimeMs:");
        stringBuffer.append(this.f60804e);
        stringBuffer.append("\r\nUserWaitTimeMs:");
        stringBuffer.append(this.f60805f);
        stringBuffer.append("\r\nPageIndex:");
        stringBuffer.append(this.f60806g);
        stringBuffer.append("\r\nReqCount:");
        stringBuffer.append(this.f60807h);
        stringBuffer.append("\r\nRspCount:");
        stringBuffer.append(this.f60808i);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f60809j);
        return stringBuffer.toString();
    }
}

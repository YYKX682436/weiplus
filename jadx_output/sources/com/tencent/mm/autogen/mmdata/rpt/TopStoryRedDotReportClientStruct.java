package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class TopStoryRedDotReportClientStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61325d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61326e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f61327f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f61328g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f61329h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f61330i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f61331j = "";

    /* renamed from: k, reason: collision with root package name */
    public long f61332k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f61333l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f61334m = 0;

    @Override // jx3.a
    public int g() {
        return 16654;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61325d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f61326e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61327f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61328g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61329h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61330i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61331j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61332k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61333l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61334m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RedDotId:");
        stringBuffer.append(this.f61325d);
        stringBuffer.append("\r\nRedDotTs:0\r\nNetType:");
        stringBuffer.append(this.f61326e);
        stringBuffer.append("\r\nOpType:");
        stringBuffer.append(this.f61327f);
        stringBuffer.append("\r\nRedDotType:");
        stringBuffer.append(this.f61328g);
        stringBuffer.append("\r\nRedDotCnt:");
        stringBuffer.append(this.f61329h);
        stringBuffer.append("\r\nRedDotConsumeTs:");
        stringBuffer.append(this.f61330i);
        stringBuffer.append("\r\nNotShowReason:");
        stringBuffer.append(this.f61331j);
        stringBuffer.append("\r\nSnsRedDotType:");
        stringBuffer.append(this.f61332k);
        stringBuffer.append("\r\nSnsRedDotCnt:");
        stringBuffer.append(this.f61333l);
        stringBuffer.append("\r\nReddotSeq:");
        stringBuffer.append(this.f61334m);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class PreloadClientReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59850d;

    /* renamed from: e, reason: collision with root package name */
    public long f59851e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59852f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59853g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f59854h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f59855i;

    /* renamed from: j, reason: collision with root package name */
    public long f59856j;

    /* renamed from: k, reason: collision with root package name */
    public long f59857k;

    /* renamed from: l, reason: collision with root package name */
    public long f59858l;

    /* renamed from: m, reason: collision with root package name */
    public long f59859m;

    /* renamed from: n, reason: collision with root package name */
    public long f59860n;

    @Override // jx3.a
    public int g() {
        return 27004;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59850d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59851e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59852f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59853g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59854h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f59855i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59856j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59857k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59858l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59859m);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f59860n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f59850d);
        stringBuffer.append("\r\nMediaType:");
        stringBuffer.append(this.f59851e);
        stringBuffer.append("\r\nChatName:");
        stringBuffer.append(this.f59852f);
        stringBuffer.append("\r\nMsgID:");
        stringBuffer.append(this.f59853g);
        stringBuffer.append("\r\nMediaID:");
        stringBuffer.append(this.f59854h);
        stringBuffer.append("\r\nIsFirstClkOrExpo:0\r\nPreloadStatus:");
        stringBuffer.append(this.f59855i);
        stringBuffer.append("\r\nClientPreloadPriority:");
        stringBuffer.append(this.f59856j);
        stringBuffer.append("\r\nServerPreloadPriority:");
        stringBuffer.append(this.f59857k);
        stringBuffer.append("\r\nResourceStatus:");
        stringBuffer.append(this.f59858l);
        stringBuffer.append("\r\nMsgCreateTime:");
        stringBuffer.append(this.f59859m);
        stringBuffer.append("\r\nMsgReceiveTime:0\r\npd:");
        stringBuffer.append(this.f59860n);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct p(java.lang.String str) {
        this.f59852f = b("ChatName", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct q(java.lang.String str) {
        this.f59853g = b("MsgID", str, true);
        return this;
    }
}

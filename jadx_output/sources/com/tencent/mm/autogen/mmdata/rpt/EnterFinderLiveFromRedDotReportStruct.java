package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class EnterFinderLiveFromRedDotReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56096d;

    /* renamed from: e, reason: collision with root package name */
    public long f56097e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56098f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56099g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56100h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56101i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f56102j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f56103k = "";

    @Override // jx3.a
    public int g() {
        return 23083;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56096d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56097e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56098f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56099g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56100h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56101i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56102j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56103k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f56096d);
        stringBuffer.append("\r\nErrorReason:");
        stringBuffer.append(this.f56097e);
        stringBuffer.append("\r\nFeedID:");
        stringBuffer.append(this.f56098f);
        stringBuffer.append("\r\nLiveID:");
        stringBuffer.append(this.f56099g);
        stringBuffer.append("\r\nRedDotTipsID:");
        stringBuffer.append(this.f56100h);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f56101i);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f56102j);
        stringBuffer.append("\r\nReportExtInfo:");
        stringBuffer.append(this.f56103k);
        return stringBuffer.toString();
    }
}

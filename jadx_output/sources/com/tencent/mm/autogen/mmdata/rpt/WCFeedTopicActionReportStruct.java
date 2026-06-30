package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class WCFeedTopicActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62066d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62067e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62068f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62069g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f62070h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62071i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62072j = "";

    /* renamed from: k, reason: collision with root package name */
    public long f62073k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f62074l = "";

    /* renamed from: m, reason: collision with root package name */
    public long f62075m = 0;

    @Override // jx3.a
    public int g() {
        return 21192;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62066d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62067e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62068f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62069g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62070h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62071i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62072j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62073k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62074l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62075m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionScene:");
        stringBuffer.append(this.f62066d);
        stringBuffer.append("\r\nEnterSource:");
        stringBuffer.append(this.f62067e);
        stringBuffer.append("\r\nFeedAuthorUsername:");
        stringBuffer.append(this.f62068f);
        stringBuffer.append("\r\nFeedID:");
        stringBuffer.append(this.f62069g);
        stringBuffer.append("\r\nFeedAuthorType:");
        stringBuffer.append(this.f62070h);
        stringBuffer.append("\r\nCreatedCommentID:");
        stringBuffer.append(this.f62071i);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f62072j);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f62073k);
        stringBuffer.append("\r\nQueryKey:");
        stringBuffer.append(this.f62074l);
        stringBuffer.append("\r\nActionTimeStamp:");
        stringBuffer.append(this.f62075m);
        return stringBuffer.toString();
    }
}

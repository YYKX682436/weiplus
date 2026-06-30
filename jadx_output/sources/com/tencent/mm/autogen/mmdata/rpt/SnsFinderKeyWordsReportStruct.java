package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class SnsFinderKeyWordsReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60573d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60574e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60575f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60576g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60577h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f60578i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f60579j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f60580k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f60581l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f60582m = 0;

    @Override // jx3.a
    public int g() {
        return 23569;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60573d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60574e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60575f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60576g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60577h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60578i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60579j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60580k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60581l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60582m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionID:");
        stringBuffer.append(this.f60573d);
        stringBuffer.append("\r\nFeedID:");
        stringBuffer.append(this.f60574e);
        stringBuffer.append("\r\nFeedUin:");
        stringBuffer.append(this.f60575f);
        stringBuffer.append("\r\nCreatedCommentID:");
        stringBuffer.append(this.f60576g);
        stringBuffer.append("\r\nHotWord:");
        stringBuffer.append(this.f60577h);
        stringBuffer.append("\r\nHotWordCnt:");
        stringBuffer.append(this.f60578i);
        stringBuffer.append("\r\nHotWordNo:");
        stringBuffer.append(this.f60579j);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f60580k);
        stringBuffer.append("\r\nFeedAuthorType:");
        stringBuffer.append(this.f60581l);
        stringBuffer.append("\r\nTagSource:");
        stringBuffer.append(this.f60582m);
        return stringBuffer.toString();
    }
}

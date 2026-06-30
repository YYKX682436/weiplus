package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct */
/* loaded from: classes5.dex */
public final class C6710xe2d6917f extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f140505g;

    /* renamed from: h, reason: collision with root package name */
    public long f140506h;

    /* renamed from: i, reason: collision with root package name */
    public long f140507i;

    /* renamed from: j, reason: collision with root package name */
    public long f140508j;

    /* renamed from: k, reason: collision with root package name */
    public long f140509k;

    /* renamed from: n, reason: collision with root package name */
    public int f140512n;

    /* renamed from: d, reason: collision with root package name */
    public int f140502d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140503e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140504f = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f140510l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f140511m = "";

    @Override // jx3.a
    public int g() {
        return 31178;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140502d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140503e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140504f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140505g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140506h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140507i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f140508j);
        stringBuffer.append(",");
        stringBuffer.append(this.f140509k);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f140510l);
        stringBuffer.append(",");
        stringBuffer.append(this.f140511m);
        stringBuffer.append(",");
        stringBuffer.append(this.f140512n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("result:");
        stringBuffer.append(this.f140502d);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f140503e);
        stringBuffer.append("\r\nmaasSessionKey:");
        stringBuffer.append(this.f140504f);
        stringBuffer.append("\r\nclientPicProcessConsuming:");
        stringBuffer.append(this.f140505g);
        stringBuffer.append("\r\nclientPicUploadConsuming:");
        stringBuffer.append(this.f140506h);
        stringBuffer.append("\r\nAiTimeConsuming:");
        stringBuffer.append(this.f140507i);
        stringBuffer.append("\r\nSpamTimeConsuming:0\r\nclientPicDownloadConsuming:");
        stringBuffer.append(this.f140508j);
        stringBuffer.append("\r\nmaasGenerateConsuming:");
        stringBuffer.append(this.f140509k);
        stringBuffer.append("\r\nEnd2EndTimeConsuming:0\r\nQueueTimeConsuming:0\r\nfailReason:");
        stringBuffer.append(this.f140510l);
        stringBuffer.append("\r\nTaskId:");
        stringBuffer.append(this.f140511m);
        stringBuffer.append("\r\nReportScene:");
        stringBuffer.append(this.f140512n);
        return stringBuffer.toString();
    }
}

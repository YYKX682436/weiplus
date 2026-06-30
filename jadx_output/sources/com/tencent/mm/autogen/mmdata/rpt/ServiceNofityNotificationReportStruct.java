package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class ServiceNofityNotificationReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60238d;

    /* renamed from: e, reason: collision with root package name */
    public long f60239e;

    /* renamed from: i, reason: collision with root package name */
    public long f60243i;

    /* renamed from: j, reason: collision with root package name */
    public long f60244j;

    /* renamed from: k, reason: collision with root package name */
    public long f60245k;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60240f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60241g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60242h = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f60246l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f60247m = "";

    @Override // jx3.a
    public int g() {
        return 32761;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60238d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60239e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60240f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60241g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60242h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60243i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60244j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60245k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60246l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60247m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OpType:");
        stringBuffer.append(this.f60238d);
        stringBuffer.append("\r\nOpTimestamp:");
        stringBuffer.append(this.f60239e);
        stringBuffer.append("\r\nUserName:");
        stringBuffer.append(this.f60240f);
        stringBuffer.append("\r\nMsgId:");
        stringBuffer.append(this.f60241g);
        stringBuffer.append("\r\nContent:");
        stringBuffer.append(this.f60242h);
        stringBuffer.append("\r\nNoticeTimestamp:");
        stringBuffer.append(this.f60243i);
        stringBuffer.append("\r\nNoticeType:");
        stringBuffer.append(this.f60244j);
        stringBuffer.append("\r\nAccountType:");
        stringBuffer.append(this.f60245k);
        stringBuffer.append("\r\nliveId:");
        stringBuffer.append(this.f60246l);
        stringBuffer.append("\r\nfeedId:");
        stringBuffer.append(this.f60247m);
        return stringBuffer.toString();
    }
}

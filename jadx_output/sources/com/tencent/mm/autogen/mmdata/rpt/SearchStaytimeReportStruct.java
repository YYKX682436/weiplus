package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class SearchStaytimeReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f60162f;

    /* renamed from: h, reason: collision with root package name */
    public long f60164h;

    /* renamed from: i, reason: collision with root package name */
    public long f60165i;

    /* renamed from: j, reason: collision with root package name */
    public long f60166j;

    /* renamed from: l, reason: collision with root package name */
    public long f60168l;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60160d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60161e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60163g = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f60167k = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f60169m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f60170n = "";

    @Override // jx3.a
    public int g() {
        return 25114;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60160d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60161e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60162f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60163g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60164h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60165i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60166j);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60167k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60168l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60169m);
        stringBuffer.append(",");
        stringBuffer.append(this.f60170n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Query:");
        stringBuffer.append(this.f60160d);
        stringBuffer.append("\r\nSearchId:");
        stringBuffer.append(this.f60161e);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f60162f);
        stringBuffer.append("\r\nParentSearchId:");
        stringBuffer.append(this.f60163g);
        stringBuffer.append("\r\nReqBusinessType:");
        stringBuffer.append(this.f60164h);
        stringBuffer.append("\r\nEventId:");
        stringBuffer.append(this.f60165i);
        stringBuffer.append("\r\nEventTimeStamp:");
        stringBuffer.append(this.f60166j);
        stringBuffer.append("\r\nStayTime:0\r\nExtInfo:");
        stringBuffer.append(this.f60167k);
        stringBuffer.append("\r\nPageType:");
        stringBuffer.append(this.f60168l);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f60169m);
        stringBuffer.append("\r\nRequestId:");
        stringBuffer.append(this.f60170n);
        return stringBuffer.toString();
    }
}

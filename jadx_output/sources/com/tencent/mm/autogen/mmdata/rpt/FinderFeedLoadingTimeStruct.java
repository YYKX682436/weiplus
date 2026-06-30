package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class FinderFeedLoadingTimeStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f56824f;

    /* renamed from: g, reason: collision with root package name */
    public long f56825g;

    /* renamed from: h, reason: collision with root package name */
    public long f56826h;

    /* renamed from: i, reason: collision with root package name */
    public long f56827i;

    /* renamed from: j, reason: collision with root package name */
    public long f56828j;

    /* renamed from: l, reason: collision with root package name */
    public long f56830l;

    /* renamed from: m, reason: collision with root package name */
    public long f56831m;

    /* renamed from: n, reason: collision with root package name */
    public long f56832n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56822d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56823e = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f56829k = "";

    @Override // jx3.a
    public int g() {
        return 20672;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56822d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56823e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56824f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56825g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56826h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56827i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56828j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56829k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56830l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56831m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56832n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Sessionid:");
        stringBuffer.append(this.f56822d);
        stringBuffer.append("\r\nClickTabContextid:");
        stringBuffer.append(this.f56823e);
        stringBuffer.append("\r\nCommentScene:");
        stringBuffer.append(this.f56824f);
        stringBuffer.append("\r\nCgiType:");
        stringBuffer.append(this.f56825g);
        stringBuffer.append("\r\nLoadingTime:");
        stringBuffer.append(this.f56826h);
        stringBuffer.append("\r\nStartCgiTimestamp:");
        stringBuffer.append(this.f56827i);
        stringBuffer.append("\r\nstatus:");
        stringBuffer.append(this.f56828j);
        stringBuffer.append("\r\nExtraInfo:");
        stringBuffer.append(this.f56829k);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f56830l);
        stringBuffer.append("\r\npullType:");
        stringBuffer.append(this.f56831m);
        stringBuffer.append("\r\nEndCgiTimestamp:");
        stringBuffer.append(this.f56832n);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderTagClickStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f57897f;

    /* renamed from: h, reason: collision with root package name */
    public long f57899h;

    /* renamed from: k, reason: collision with root package name */
    public long f57902k;

    /* renamed from: l, reason: collision with root package name */
    public long f57903l;

    /* renamed from: m, reason: collision with root package name */
    public long f57904m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57895d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57896e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57898g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57900i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f57901j = "";

    @Override // jx3.a
    public int g() {
        return 19186;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57895d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57896e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57897f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57898g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57899h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57900i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57901j);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f57902k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57903l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57904m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f57895d);
        stringBuffer.append("\r\nCurrentPageName:");
        stringBuffer.append(this.f57896e);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f57897f);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f57898g);
        stringBuffer.append("\r\nfeedtype:");
        stringBuffer.append(this.f57899h);
        stringBuffer.append("\r\nTag:");
        stringBuffer.append(this.f57900i);
        stringBuffer.append("\r\nTagId:");
        stringBuffer.append(this.f57901j);
        stringBuffer.append("\r\nIsPoi:0\r\nTagFeedCnt:0\r\nFeedLikeCount:");
        stringBuffer.append(this.f57902k);
        stringBuffer.append("\r\nFeedCommentCount:");
        stringBuffer.append(this.f57903l);
        stringBuffer.append("\r\nFeedFriLikeCount:");
        stringBuffer.append(this.f57904m);
        return stringBuffer.toString();
    }
}

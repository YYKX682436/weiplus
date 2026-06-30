package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderCommentResourceLoadingStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f56686f;

    /* renamed from: g, reason: collision with root package name */
    public long f56687g;

    /* renamed from: h, reason: collision with root package name */
    public long f56688h;

    /* renamed from: j, reason: collision with root package name */
    public long f56690j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56684d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56685e = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56689i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f56691k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f56692l = "";

    @Override // jx3.a
    public int g() {
        return 33864;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56684d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56685e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56686f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56687g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56688h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56689i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56690j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56691k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56692l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FeedId:");
        stringBuffer.append(this.f56684d);
        stringBuffer.append("\r\nCommentId:");
        stringBuffer.append(this.f56685e);
        stringBuffer.append("\r\nContentType:");
        stringBuffer.append(this.f56686f);
        stringBuffer.append("\r\nLoadFail:");
        stringBuffer.append(this.f56687g);
        stringBuffer.append("\r\nLoadTimeMs:");
        stringBuffer.append(this.f56688h);
        stringBuffer.append("\r\nUrl:");
        stringBuffer.append(this.f56689i);
        stringBuffer.append("\r\nIsThumbUrl:");
        stringBuffer.append(this.f56690j);
        stringBuffer.append("\r\nEmoticonMd5:");
        stringBuffer.append(this.f56691k);
        stringBuffer.append("\r\nToken:");
        stringBuffer.append(this.f56692l);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct p(java.lang.String str) {
        this.f56685e = b("CommentId", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct q(java.lang.String str) {
        this.f56684d = b("FeedId", str, true);
        return this;
    }
}

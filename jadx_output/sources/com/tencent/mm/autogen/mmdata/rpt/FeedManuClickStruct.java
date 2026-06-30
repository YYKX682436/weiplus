package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FeedManuClickStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f56368f;

    /* renamed from: g, reason: collision with root package name */
    public long f56369g;

    /* renamed from: h, reason: collision with root package name */
    public long f56370h;

    /* renamed from: j, reason: collision with root package name */
    public long f56372j;

    /* renamed from: k, reason: collision with root package name */
    public long f56373k;

    /* renamed from: l, reason: collision with root package name */
    public long f56374l;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56366d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56367e = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56371i = "";

    @Override // jx3.a
    public int g() {
        return 19185;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56366d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56367e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56368f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56369g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56370h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56371i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56372j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56373k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56374l);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f56366d);
        stringBuffer.append("\r\nFeedId:");
        stringBuffer.append(this.f56367e);
        stringBuffer.append("\r\nFeedLikeCount:");
        stringBuffer.append(this.f56368f);
        stringBuffer.append("\r\nFeedCommentCount:");
        stringBuffer.append(this.f56369g);
        stringBuffer.append("\r\nFeedFriLikeCount:");
        stringBuffer.append(this.f56370h);
        stringBuffer.append("\r\nCurrentPageName:");
        stringBuffer.append(this.f56371i);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f56372j);
        stringBuffer.append("\r\nFeedType:");
        stringBuffer.append(this.f56373k);
        stringBuffer.append("\r\nCommentScene:");
        stringBuffer.append(this.f56374l);
        stringBuffer.append("\r\nInnerVersion:0");
        return stringBuffer.toString();
    }
}

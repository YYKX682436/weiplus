package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderFeedAvatarClickStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f56767f;

    /* renamed from: h, reason: collision with root package name */
    public long f56769h;

    /* renamed from: i, reason: collision with root package name */
    public long f56770i;

    /* renamed from: j, reason: collision with root package name */
    public long f56771j;

    /* renamed from: l, reason: collision with root package name */
    public long f56773l;

    /* renamed from: m, reason: collision with root package name */
    public long f56774m;

    /* renamed from: n, reason: collision with root package name */
    public long f56775n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56765d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56766e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56768g = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f56772k = "";

    @Override // jx3.a
    public int g() {
        return 19405;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f56765d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56766e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56767f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56768g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56769h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56770i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56771j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56772k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56773l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56774m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56775n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ClickAvatarScene:0\r\nSessionId:");
        stringBuffer.append(this.f56765d);
        stringBuffer.append("\r\nFinderUsername:");
        stringBuffer.append(this.f56766e);
        stringBuffer.append("\r\nFinderRole:");
        stringBuffer.append(this.f56767f);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f56768g);
        stringBuffer.append("\r\nRole:");
        stringBuffer.append(this.f56769h);
        stringBuffer.append("\r\nFeedLikeCount:");
        stringBuffer.append(this.f56770i);
        stringBuffer.append("\r\nFeedCommentCount:");
        stringBuffer.append(this.f56771j);
        stringBuffer.append("\r\nFeedId:");
        stringBuffer.append(this.f56772k);
        stringBuffer.append("\r\nFeedScene:");
        stringBuffer.append(this.f56773l);
        stringBuffer.append("\r\nNewAvatarClickScene:");
        stringBuffer.append(this.f56774m);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f56775n);
        return stringBuffer.toString();
    }
}

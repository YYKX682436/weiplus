package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsAlbumFeedBehaviourStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f60445e;

    /* renamed from: g, reason: collision with root package name */
    public long f60447g;

    /* renamed from: h, reason: collision with root package name */
    public long f60448h;

    /* renamed from: i, reason: collision with root package name */
    public long f60449i;

    /* renamed from: j, reason: collision with root package name */
    public long f60450j;

    /* renamed from: k, reason: collision with root package name */
    public long f60451k;

    /* renamed from: l, reason: collision with root package name */
    public long f60452l;

    /* renamed from: m, reason: collision with root package name */
    public long f60453m;

    /* renamed from: n, reason: collision with root package name */
    public long f60454n;

    /* renamed from: o, reason: collision with root package name */
    public long f60455o;

    /* renamed from: p, reason: collision with root package name */
    public long f60456p;

    /* renamed from: q, reason: collision with root package name */
    public long f60457q;

    /* renamed from: r, reason: collision with root package name */
    public long f60458r;

    /* renamed from: s, reason: collision with root package name */
    public long f60459s;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60444d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60446f = "";

    /* renamed from: t, reason: collision with root package name */
    public long f60460t = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f60461u = "";

    @Override // jx3.a
    public int g() {
        return 18849;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60444d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60445e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60446f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60447g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60448h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60449i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60450j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60451k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60452l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60453m);
        stringBuffer.append(",");
        stringBuffer.append(this.f60454n);
        stringBuffer.append(",");
        stringBuffer.append(this.f60455o);
        stringBuffer.append(",");
        stringBuffer.append(this.f60456p);
        stringBuffer.append(",");
        stringBuffer.append(this.f60457q);
        stringBuffer.append(",");
        stringBuffer.append(this.f60458r);
        stringBuffer.append(",");
        stringBuffer.append(this.f60459s);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60460t);
        stringBuffer.append(",");
        stringBuffer.append(this.f60461u);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ToUsername:");
        stringBuffer.append(this.f60444d);
        stringBuffer.append("\r\nSource:");
        stringBuffer.append(this.f60445e);
        stringBuffer.append("\r\nFeedId:");
        stringBuffer.append(this.f60446f);
        stringBuffer.append("\r\nFeedType:");
        stringBuffer.append(this.f60447g);
        stringBuffer.append("\r\nIfAddText:");
        stringBuffer.append(this.f60448h);
        stringBuffer.append("\r\nFeedMediaCount:");
        stringBuffer.append(this.f60449i);
        stringBuffer.append("\r\nIsClickedFromAlbum:");
        stringBuffer.append(this.f60450j);
        stringBuffer.append("\r\nIsClickIntoDetail:");
        stringBuffer.append(this.f60451k);
        stringBuffer.append("\r\nBrowsedPicCountAtDetail:");
        stringBuffer.append(this.f60452l);
        stringBuffer.append("\r\nBrowsedPicCountAtGallery:");
        stringBuffer.append(this.f60453m);
        stringBuffer.append("\r\nBrowseTimeAtDetail:");
        stringBuffer.append(this.f60454n);
        stringBuffer.append("\r\nBrowseTimeAtGallery:");
        stringBuffer.append(this.f60455o);
        stringBuffer.append("\r\nCanViewCommentCount:");
        stringBuffer.append(this.f60456p);
        stringBuffer.append("\r\nCanViewLikeCount:");
        stringBuffer.append(this.f60457q);
        stringBuffer.append("\r\nCommentFlag:");
        stringBuffer.append(this.f60458r);
        stringBuffer.append("\r\nLikeFlag:");
        stringBuffer.append(this.f60459s);
        stringBuffer.append("\r\nWithFriendOp:0\r\nsceneType:");
        stringBuffer.append(this.f60460t);
        stringBuffer.append("\r\nalbumSessionid:");
        stringBuffer.append(this.f60461u);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct p(long j17) {
        this.f60448h = j17;
        return this;
    }
}

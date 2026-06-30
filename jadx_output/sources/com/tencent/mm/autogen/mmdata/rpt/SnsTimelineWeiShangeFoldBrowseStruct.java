package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsTimelineWeiShangeFoldBrowseStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f60731g;

    /* renamed from: h, reason: collision with root package name */
    public long f60732h;

    /* renamed from: k, reason: collision with root package name */
    public long f60735k;

    /* renamed from: l, reason: collision with root package name */
    public long f60736l;

    /* renamed from: m, reason: collision with root package name */
    public long f60737m;

    /* renamed from: n, reason: collision with root package name */
    public long f60738n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60728d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60729e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60730f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60733i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60734j = "";

    @Override // jx3.a
    public int g() {
        return 21341;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60728d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60729e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60730f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60731g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60732h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60733i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60734j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60735k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60736l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60737m);
        stringBuffer.append(",");
        stringBuffer.append(this.f60738n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f60728d);
        stringBuffer.append("\r\nFoldedBlockId:");
        stringBuffer.append(this.f60729e);
        stringBuffer.append("\r\nUserName:");
        stringBuffer.append(this.f60730f);
        stringBuffer.append("\r\nFeedCount:");
        stringBuffer.append(this.f60731g);
        stringBuffer.append("\r\nBrowseFeedCount:");
        stringBuffer.append(this.f60732h);
        stringBuffer.append("\r\nFeedList:");
        stringBuffer.append(this.f60733i);
        stringBuffer.append("\r\nBrowseFeedList:");
        stringBuffer.append(this.f60734j);
        stringBuffer.append("\r\nBrowseTime:");
        stringBuffer.append(this.f60735k);
        stringBuffer.append("\r\nUnfoldClickFlag:");
        stringBuffer.append(this.f60736l);
        stringBuffer.append("\r\nUnfoldConfirmFlag:");
        stringBuffer.append(this.f60737m);
        stringBuffer.append("\r\nFoldType:");
        stringBuffer.append(this.f60738n);
        return stringBuffer.toString();
    }
}

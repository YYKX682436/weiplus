package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsCoverReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60517d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f60518e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60519f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f60520g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f60521h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f60522i = -1;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60523j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f60524k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f60525l = "";

    /* renamed from: m, reason: collision with root package name */
    public int f60526m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f60527n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f60528o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f60529p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f60530q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f60531r = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f60532s = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f60533t = -1;

    /* renamed from: u, reason: collision with root package name */
    public long f60534u = -1;

    /* renamed from: v, reason: collision with root package name */
    public final long f60535v = -1;

    /* renamed from: w, reason: collision with root package name */
    public long f60536w = -1;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f60537x = "";

    @Override // jx3.a
    public int g() {
        return 23697;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60517d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60518e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60519f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60520g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60521h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60522i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60523j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60524k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60525l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60526m);
        stringBuffer.append(",");
        stringBuffer.append(this.f60527n);
        stringBuffer.append(",");
        stringBuffer.append(this.f60528o);
        stringBuffer.append(",");
        stringBuffer.append(this.f60529p);
        stringBuffer.append(",");
        stringBuffer.append(this.f60530q);
        stringBuffer.append(",");
        stringBuffer.append(this.f60531r);
        stringBuffer.append(",");
        stringBuffer.append(this.f60532s);
        stringBuffer.append(",");
        stringBuffer.append(this.f60533t);
        stringBuffer.append(",");
        stringBuffer.append(this.f60534u);
        stringBuffer.append(",");
        stringBuffer.append(this.f60535v);
        stringBuffer.append(",");
        stringBuffer.append(this.f60536w);
        stringBuffer.append(",");
        stringBuffer.append(this.f60537x);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OperateType:");
        stringBuffer.append(this.f60517d);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f60518e);
        stringBuffer.append("\r\nUserName:");
        stringBuffer.append(this.f60519f);
        stringBuffer.append("\r\nIsSelf:");
        stringBuffer.append(this.f60520g);
        stringBuffer.append("\r\nCoverType:");
        stringBuffer.append(this.f60521h);
        stringBuffer.append("\r\nSnsObjId:");
        stringBuffer.append(this.f60522i);
        stringBuffer.append("\r\nImageInfo:");
        stringBuffer.append(this.f60523j);
        stringBuffer.append("\r\nVideoInfo:");
        stringBuffer.append(this.f60524k);
        stringBuffer.append("\r\nFinderInfo:");
        stringBuffer.append(this.f60525l);
        stringBuffer.append("\r\nIsLocal:");
        stringBuffer.append(this.f60526m);
        stringBuffer.append("\r\nNetSceneCode:");
        stringBuffer.append(this.f60527n);
        stringBuffer.append("\r\nNetSceneCost:");
        stringBuffer.append(this.f60528o);
        stringBuffer.append("\r\nFoldClickCount:");
        stringBuffer.append(this.f60529p);
        stringBuffer.append("\r\nIsLike:");
        stringBuffer.append(this.f60530q);
        stringBuffer.append("\r\nLikeStateChange:");
        stringBuffer.append(this.f60531r);
        stringBuffer.append("\r\nEnterTimeStamp:");
        stringBuffer.append(this.f60532s);
        stringBuffer.append("\r\nExitTimeStamp:");
        stringBuffer.append(this.f60533t);
        stringBuffer.append("\r\nFirstFrameTimeStamp:");
        stringBuffer.append(this.f60534u);
        stringBuffer.append("\r\nClickLikeTimeStamp:");
        stringBuffer.append(this.f60535v);
        stringBuffer.append("\r\nFirstPlayTimeStamp:");
        stringBuffer.append(this.f60536w);
        stringBuffer.append("\r\nSnsCoverInfo:");
        stringBuffer.append(this.f60537x);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct p(java.lang.String str) {
        this.f60537x = b("SnsCoverInfo", str, true);
        return this;
    }
}

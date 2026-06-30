package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class FavAddQualityStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f56219d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f56220e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f56221f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f56222g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f56223h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56224i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f56225j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f56226k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f56227l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f56228m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f56229n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f56230o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f56231p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f56232q = "";

    /* renamed from: r, reason: collision with root package name */
    public int f56233r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f56234s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f56235t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f56236u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f56237v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f56238w = 0;

    @Override // jx3.a
    public int g() {
        return 28270;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56219d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56220e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56221f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56222g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56223h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56224i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56225j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56226k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56227l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56228m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56229n);
        stringBuffer.append(",");
        stringBuffer.append(this.f56230o);
        stringBuffer.append(",");
        stringBuffer.append(this.f56231p);
        stringBuffer.append(",");
        stringBuffer.append(this.f56232q);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f56233r);
        stringBuffer.append(",");
        stringBuffer.append(this.f56234s);
        stringBuffer.append(",");
        stringBuffer.append(this.f56235t);
        stringBuffer.append(",");
        stringBuffer.append(this.f56236u);
        stringBuffer.append(",");
        stringBuffer.append(this.f56237v);
        stringBuffer.append(",");
        stringBuffer.append(this.f56238w);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Type:");
        stringBuffer.append(this.f56219d);
        stringBuffer.append("\r\nErrType:");
        stringBuffer.append(this.f56220e);
        stringBuffer.append("\r\nuseSourceId:");
        stringBuffer.append(this.f56221f);
        stringBuffer.append("\r\nsourceIdDeduplication:");
        stringBuffer.append(this.f56222g);
        stringBuffer.append("\r\nxmllegal:");
        stringBuffer.append(this.f56223h);
        stringBuffer.append("\r\nIllegalXmlContent:");
        stringBuffer.append(this.f56224i);
        stringBuffer.append("\r\nneedCheckCDN:");
        stringBuffer.append(this.f56225j);
        stringBuffer.append("\r\ncheckCDNType:");
        stringBuffer.append(this.f56226k);
        stringBuffer.append("\r\ncheckCDNCount:0\r\ncheckCDNSuccessDataCount:");
        stringBuffer.append(this.f56227l);
        stringBuffer.append("\r\ncheckCDNSuccessThumCount:");
        stringBuffer.append(this.f56228m);
        stringBuffer.append("\r\ncheckCDNFailDataCount:");
        stringBuffer.append(this.f56229n);
        stringBuffer.append("\r\ncheckCDNFailThumCount:");
        stringBuffer.append(this.f56230o);
        stringBuffer.append("\r\ncheckCDNXmllegal:");
        stringBuffer.append(this.f56231p);
        stringBuffer.append("\r\ncheckCDNIllegalXmlContent:");
        stringBuffer.append(this.f56232q);
        stringBuffer.append("\r\ncheckCDNDownloadDataFailCount:0\r\ncheckCDNDownloadThumFailCount:0\r\ncheckCDNUploadDataFailCount:");
        stringBuffer.append(this.f56233r);
        stringBuffer.append("\r\ncheckCDNUploadThumFailCount:");
        stringBuffer.append(this.f56234s);
        stringBuffer.append("\r\nFavDealType:");
        stringBuffer.append(this.f56235t);
        stringBuffer.append("\r\nFavDealResult:");
        stringBuffer.append(this.f56236u);
        stringBuffer.append("\r\nFavDealErrorType:");
        stringBuffer.append(this.f56237v);
        stringBuffer.append("\r\nFavDealErrorCode:");
        stringBuffer.append(this.f56238w);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct p(int i17) {
        this.f56229n = i17;
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct q(int i17) {
        this.f56230o = i17;
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct r(java.lang.String str) {
        this.f56232q = b("checkCDNIllegalXmlContent", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct s(int i17) {
        this.f56227l = i17;
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct t(int i17) {
        this.f56228m = i17;
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct u(int i17) {
        this.f56233r = i17;
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct v(int i17) {
        this.f56234s = i17;
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct w(int i17) {
        this.f56231p = i17;
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct x(int i17) {
        this.f56238w = i17;
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct y(int i17) {
        this.f56236u = i17;
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct z(int i17) {
        this.f56225j = i17;
        return this;
    }
}

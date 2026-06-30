package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderFeedDataStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f56777e;

    /* renamed from: g, reason: collision with root package name */
    public int f56779g;

    /* renamed from: h, reason: collision with root package name */
    public long f56780h;

    /* renamed from: j, reason: collision with root package name */
    public int f56782j;

    /* renamed from: l, reason: collision with root package name */
    public long f56784l;

    /* renamed from: m, reason: collision with root package name */
    public long f56785m;

    /* renamed from: u, reason: collision with root package name */
    public long f56793u;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56776d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56778f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56781i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f56783k = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f56786n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f56787o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f56788p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f56789q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f56790r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f56791s = "";

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f56792t = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f56794v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f56795w = "";

    /* renamed from: x, reason: collision with root package name */
    public int f56796x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f56797y = 0;

    @Override // jx3.a
    public int g() {
        return 18054;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56776d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56777e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56778f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56779g);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56780h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56781i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56782j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56783k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56784l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56785m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56786n);
        stringBuffer.append(",");
        stringBuffer.append(this.f56787o);
        stringBuffer.append(",");
        stringBuffer.append(this.f56788p);
        stringBuffer.append(",");
        stringBuffer.append(this.f56789q);
        stringBuffer.append(",");
        stringBuffer.append(this.f56790r);
        stringBuffer.append(",");
        stringBuffer.append(this.f56791s);
        stringBuffer.append(",");
        stringBuffer.append(this.f56792t);
        stringBuffer.append(",");
        stringBuffer.append(this.f56793u);
        stringBuffer.append(",");
        stringBuffer.append(this.f56794v);
        stringBuffer.append(",");
        stringBuffer.append(this.f56795w);
        stringBuffer.append(",");
        stringBuffer.append(this.f56796x);
        stringBuffer.append(",");
        stringBuffer.append(this.f56797y);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FeedID:");
        stringBuffer.append(this.f56776d);
        stringBuffer.append("\r\nScene:0\r\nActionType:");
        stringBuffer.append(this.f56777e);
        stringBuffer.append("\r\nActionValue:");
        stringBuffer.append(this.f56778f);
        stringBuffer.append("\r\nActionCurrentVersion:");
        stringBuffer.append(this.f56779g);
        stringBuffer.append("\r\nActionTimeStamp:0\r\nActionTimeStampMs:");
        stringBuffer.append(this.f56780h);
        stringBuffer.append("\r\nsessionID:");
        stringBuffer.append(this.f56781i);
        stringBuffer.append("\r\nmediaType:");
        stringBuffer.append(this.f56782j);
        stringBuffer.append("\r\nsessionBuffer:");
        stringBuffer.append(this.f56783k);
        stringBuffer.append("\r\nvideoDurationTime:");
        stringBuffer.append(this.f56784l);
        stringBuffer.append("\r\nCommentScene:");
        stringBuffer.append(this.f56785m);
        stringBuffer.append("\r\nClickFeedId:");
        stringBuffer.append(this.f56786n);
        stringBuffer.append("\r\nClickFeedContextId:");
        stringBuffer.append(this.f56787o);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f56788p);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f56789q);
        stringBuffer.append("\r\nExtraInfo:");
        stringBuffer.append(this.f56790r);
        stringBuffer.append("\r\nenterSourceInfo:");
        stringBuffer.append(this.f56791s);
        stringBuffer.append("\r\nLongVideoId:");
        stringBuffer.append(this.f56792t);
        stringBuffer.append("\r\nFeedDisplayType:");
        stringBuffer.append(this.f56793u);
        stringBuffer.append("\r\njump_id:");
        stringBuffer.append(this.f56794v);
        stringBuffer.append("\r\nclient_udf_kv:");
        stringBuffer.append(this.f56795w);
        stringBuffer.append("\r\nis_invalid:");
        stringBuffer.append(this.f56796x);
        stringBuffer.append("\r\nmodeFlag:");
        stringBuffer.append(this.f56797y);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct p(java.lang.String str) {
        this.f56783k = b("sessionBuffer", str, true);
        return this;
    }
}

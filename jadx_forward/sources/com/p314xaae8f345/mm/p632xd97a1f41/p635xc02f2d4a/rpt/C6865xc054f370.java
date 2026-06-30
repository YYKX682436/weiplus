package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct */
/* loaded from: classes9.dex */
public final class C6865xc054f370 extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f141820g;

    /* renamed from: h, reason: collision with root package name */
    public long f141821h;

    /* renamed from: j, reason: collision with root package name */
    public long f141823j;

    /* renamed from: k, reason: collision with root package name */
    public long f141824k;

    /* renamed from: l, reason: collision with root package name */
    public long f141825l;

    /* renamed from: m, reason: collision with root package name */
    public long f141826m;

    /* renamed from: n, reason: collision with root package name */
    public long f141827n;

    /* renamed from: p, reason: collision with root package name */
    public long f141829p;

    /* renamed from: q, reason: collision with root package name */
    public long f141830q;

    /* renamed from: s, reason: collision with root package name */
    public long f141832s;

    /* renamed from: t, reason: collision with root package name */
    public long f141833t;

    /* renamed from: u, reason: collision with root package name */
    public long f141834u;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141817d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141818e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f141819f = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f141822i = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f141828o = "";

    /* renamed from: r, reason: collision with root package name */
    public long f141831r = 0;

    @Override // jx3.a
    public int g() {
        return 25884;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141817d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141818e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141819f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141820g);
        stringBuffer.append(",");
        stringBuffer.append(this.f141821h);
        stringBuffer.append(",");
        stringBuffer.append(this.f141822i);
        stringBuffer.append(",");
        stringBuffer.append(this.f141823j);
        stringBuffer.append(",");
        stringBuffer.append(this.f141824k);
        stringBuffer.append(",");
        stringBuffer.append(this.f141825l);
        stringBuffer.append(",");
        stringBuffer.append(this.f141826m);
        stringBuffer.append(",");
        stringBuffer.append(this.f141827n);
        stringBuffer.append(",");
        stringBuffer.append(this.f141828o);
        stringBuffer.append(",");
        stringBuffer.append(this.f141829p);
        stringBuffer.append(",");
        stringBuffer.append(this.f141830q);
        stringBuffer.append(",");
        stringBuffer.append(this.f141831r);
        stringBuffer.append(",");
        stringBuffer.append(this.f141832s);
        stringBuffer.append(",");
        stringBuffer.append(this.f141833t);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f141834u);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f141817d);
        stringBuffer.append("\r\nsearchsessionid:");
        stringBuffer.append(this.f141818e);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f141819f);
        stringBuffer.append("\r\ntab:");
        stringBuffer.append(this.f141820g);
        stringBuffer.append("\r\nmsgtype:");
        stringBuffer.append(this.f141821h);
        stringBuffer.append("\r\nquery:");
        stringBuffer.append(this.f141822i);
        stringBuffer.append("\r\nsearchcost:");
        stringBuffer.append(this.f141823j);
        stringBuffer.append("\r\nsub_tab:");
        stringBuffer.append(this.f141824k);
        stringBuffer.append("\r\nIfImageDone:");
        stringBuffer.append(this.f141825l);
        stringBuffer.append("\r\nIfAllImageDone:");
        stringBuffer.append(this.f141826m);
        stringBuffer.append("\r\nresultCnt:");
        stringBuffer.append(this.f141827n);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f141828o);
        stringBuffer.append("\r\nloadingcost:");
        stringBuffer.append(this.f141829p);
        stringBuffer.append("\r\nimagecnt:");
        stringBuffer.append(this.f141830q);
        stringBuffer.append("\r\nImageIdentify:");
        stringBuffer.append(this.f141831r);
        stringBuffer.append("\r\nclickPosition:");
        stringBuffer.append(this.f141832s);
        stringBuffer.append("\r\nclickPositionSameType:");
        stringBuffer.append(this.f141833t);
        stringBuffer.append("\r\nfindercnt:0\r\nverticalSearchEntrance:");
        stringBuffer.append(this.f141834u);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 p(java.lang.String str) {
        this.f141822i = b("query", str, true);
        return this;
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class SessionMsgSearchActionLogStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f60287g;

    /* renamed from: h, reason: collision with root package name */
    public long f60288h;

    /* renamed from: j, reason: collision with root package name */
    public long f60290j;

    /* renamed from: k, reason: collision with root package name */
    public long f60291k;

    /* renamed from: l, reason: collision with root package name */
    public long f60292l;

    /* renamed from: m, reason: collision with root package name */
    public long f60293m;

    /* renamed from: n, reason: collision with root package name */
    public long f60294n;

    /* renamed from: p, reason: collision with root package name */
    public long f60296p;

    /* renamed from: q, reason: collision with root package name */
    public long f60297q;

    /* renamed from: s, reason: collision with root package name */
    public long f60299s;

    /* renamed from: t, reason: collision with root package name */
    public long f60300t;

    /* renamed from: u, reason: collision with root package name */
    public long f60301u;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60284d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60285e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f60286f = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60289i = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f60295o = "";

    /* renamed from: r, reason: collision with root package name */
    public long f60298r = 0;

    @Override // jx3.a
    public int g() {
        return 25884;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60284d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60285e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60286f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60287g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60288h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60289i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60290j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60291k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60292l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60293m);
        stringBuffer.append(",");
        stringBuffer.append(this.f60294n);
        stringBuffer.append(",");
        stringBuffer.append(this.f60295o);
        stringBuffer.append(",");
        stringBuffer.append(this.f60296p);
        stringBuffer.append(",");
        stringBuffer.append(this.f60297q);
        stringBuffer.append(",");
        stringBuffer.append(this.f60298r);
        stringBuffer.append(",");
        stringBuffer.append(this.f60299s);
        stringBuffer.append(",");
        stringBuffer.append(this.f60300t);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60301u);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f60284d);
        stringBuffer.append("\r\nsearchsessionid:");
        stringBuffer.append(this.f60285e);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f60286f);
        stringBuffer.append("\r\ntab:");
        stringBuffer.append(this.f60287g);
        stringBuffer.append("\r\nmsgtype:");
        stringBuffer.append(this.f60288h);
        stringBuffer.append("\r\nquery:");
        stringBuffer.append(this.f60289i);
        stringBuffer.append("\r\nsearchcost:");
        stringBuffer.append(this.f60290j);
        stringBuffer.append("\r\nsub_tab:");
        stringBuffer.append(this.f60291k);
        stringBuffer.append("\r\nIfImageDone:");
        stringBuffer.append(this.f60292l);
        stringBuffer.append("\r\nIfAllImageDone:");
        stringBuffer.append(this.f60293m);
        stringBuffer.append("\r\nresultCnt:");
        stringBuffer.append(this.f60294n);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f60295o);
        stringBuffer.append("\r\nloadingcost:");
        stringBuffer.append(this.f60296p);
        stringBuffer.append("\r\nimagecnt:");
        stringBuffer.append(this.f60297q);
        stringBuffer.append("\r\nImageIdentify:");
        stringBuffer.append(this.f60298r);
        stringBuffer.append("\r\nclickPosition:");
        stringBuffer.append(this.f60299s);
        stringBuffer.append("\r\nclickPositionSameType:");
        stringBuffer.append(this.f60300t);
        stringBuffer.append("\r\nfindercnt:0\r\nverticalSearchEntrance:");
        stringBuffer.append(this.f60301u);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.SessionMsgSearchActionLogStruct p(java.lang.String str) {
        this.f60289i = b("query", str, true);
        return this;
    }
}

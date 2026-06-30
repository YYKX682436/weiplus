package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class IntelligentMsgActionLogStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f58512f;

    /* renamed from: g, reason: collision with root package name */
    public long f58513g;

    /* renamed from: l, reason: collision with root package name */
    public long f58518l;

    /* renamed from: m, reason: collision with root package name */
    public long f58519m;

    /* renamed from: n, reason: collision with root package name */
    public long f58520n;

    /* renamed from: o, reason: collision with root package name */
    public long f58521o;

    /* renamed from: p, reason: collision with root package name */
    public long f58522p;

    /* renamed from: q, reason: collision with root package name */
    public long f58523q;

    /* renamed from: r, reason: collision with root package name */
    public long f58524r;

    /* renamed from: t, reason: collision with root package name */
    public long f58526t;

    /* renamed from: u, reason: collision with root package name */
    public long f58527u;

    /* renamed from: v, reason: collision with root package name */
    public long f58528v;

    /* renamed from: w, reason: collision with root package name */
    public long f58529w;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58510d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58511e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58514h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58515i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f58516j = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f58517k = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f58525s = "";

    @Override // jx3.a
    public int g() {
        return 24736;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58510d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58511e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58512f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58513g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58514h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58515i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58516j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58517k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58518l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58519m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58520n);
        stringBuffer.append(",");
        stringBuffer.append(this.f58521o);
        stringBuffer.append(",");
        stringBuffer.append(this.f58522p);
        stringBuffer.append(",");
        stringBuffer.append(this.f58523q);
        stringBuffer.append(",");
        stringBuffer.append(this.f58524r);
        stringBuffer.append(",");
        stringBuffer.append(this.f58525s);
        stringBuffer.append(",");
        stringBuffer.append(this.f58526t);
        stringBuffer.append(",");
        stringBuffer.append(this.f58527u);
        stringBuffer.append(",");
        stringBuffer.append(this.f58528v);
        stringBuffer.append(",");
        stringBuffer.append(this.f58529w);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f58510d);
        stringBuffer.append("\r\nsearchsessionid:");
        stringBuffer.append(this.f58511e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f58512f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f58513g);
        stringBuffer.append("\r\nPrintQuery:");
        stringBuffer.append(this.f58514h);
        stringBuffer.append("\r\nSearchQuery:");
        stringBuffer.append(this.f58515i);
        stringBuffer.append("\r\nExpoQuery:");
        stringBuffer.append(this.f58516j);
        stringBuffer.append("\r\nKeyword:");
        stringBuffer.append(this.f58517k);
        stringBuffer.append("\r\nSearchScene:");
        stringBuffer.append(this.f58518l);
        stringBuffer.append("\r\nImageCnt:");
        stringBuffer.append(this.f58519m);
        stringBuffer.append("\r\nPeopleCnt:");
        stringBuffer.append(this.f58520n);
        stringBuffer.append("\r\nImageSendTime:");
        stringBuffer.append(this.f58521o);
        stringBuffer.append("\r\nTab:");
        stringBuffer.append(this.f58522p);
        stringBuffer.append("\r\nSearchCost:");
        stringBuffer.append(this.f58523q);
        stringBuffer.append("\r\nIfImageDone:");
        stringBuffer.append(this.f58524r);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f58525s);
        stringBuffer.append("\r\nAllImageCnt:");
        stringBuffer.append(this.f58526t);
        stringBuffer.append("\r\nMatchLogic:");
        stringBuffer.append(this.f58527u);
        stringBuffer.append("\r\nIfAlllmageDone:");
        stringBuffer.append(this.f58528v);
        stringBuffer.append("\r\nifPopups:");
        stringBuffer.append(this.f58529w);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgActionLogStruct p(java.lang.String str) {
        this.f58515i = b("SearchQuery", str, true);
        return this;
    }
}

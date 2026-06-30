package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgActionLogStruct */
/* loaded from: classes14.dex */
public final class C6659x3e773f99 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f140045f;

    /* renamed from: g, reason: collision with root package name */
    public long f140046g;

    /* renamed from: l, reason: collision with root package name */
    public long f140051l;

    /* renamed from: m, reason: collision with root package name */
    public long f140052m;

    /* renamed from: n, reason: collision with root package name */
    public long f140053n;

    /* renamed from: o, reason: collision with root package name */
    public long f140054o;

    /* renamed from: p, reason: collision with root package name */
    public long f140055p;

    /* renamed from: q, reason: collision with root package name */
    public long f140056q;

    /* renamed from: r, reason: collision with root package name */
    public long f140057r;

    /* renamed from: t, reason: collision with root package name */
    public long f140059t;

    /* renamed from: u, reason: collision with root package name */
    public long f140060u;

    /* renamed from: v, reason: collision with root package name */
    public long f140061v;

    /* renamed from: w, reason: collision with root package name */
    public long f140062w;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140043d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140044e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140047h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140048i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f140049j = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f140050k = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f140058s = "";

    @Override // jx3.a
    public int g() {
        return 24736;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140043d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140044e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140045f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140046g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140047h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140048i);
        stringBuffer.append(",");
        stringBuffer.append(this.f140049j);
        stringBuffer.append(",");
        stringBuffer.append(this.f140050k);
        stringBuffer.append(",");
        stringBuffer.append(this.f140051l);
        stringBuffer.append(",");
        stringBuffer.append(this.f140052m);
        stringBuffer.append(",");
        stringBuffer.append(this.f140053n);
        stringBuffer.append(",");
        stringBuffer.append(this.f140054o);
        stringBuffer.append(",");
        stringBuffer.append(this.f140055p);
        stringBuffer.append(",");
        stringBuffer.append(this.f140056q);
        stringBuffer.append(",");
        stringBuffer.append(this.f140057r);
        stringBuffer.append(",");
        stringBuffer.append(this.f140058s);
        stringBuffer.append(",");
        stringBuffer.append(this.f140059t);
        stringBuffer.append(",");
        stringBuffer.append(this.f140060u);
        stringBuffer.append(",");
        stringBuffer.append(this.f140061v);
        stringBuffer.append(",");
        stringBuffer.append(this.f140062w);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f140043d);
        stringBuffer.append("\r\nsearchsessionid:");
        stringBuffer.append(this.f140044e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f140045f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f140046g);
        stringBuffer.append("\r\nPrintQuery:");
        stringBuffer.append(this.f140047h);
        stringBuffer.append("\r\nSearchQuery:");
        stringBuffer.append(this.f140048i);
        stringBuffer.append("\r\nExpoQuery:");
        stringBuffer.append(this.f140049j);
        stringBuffer.append("\r\nKeyword:");
        stringBuffer.append(this.f140050k);
        stringBuffer.append("\r\nSearchScene:");
        stringBuffer.append(this.f140051l);
        stringBuffer.append("\r\nImageCnt:");
        stringBuffer.append(this.f140052m);
        stringBuffer.append("\r\nPeopleCnt:");
        stringBuffer.append(this.f140053n);
        stringBuffer.append("\r\nImageSendTime:");
        stringBuffer.append(this.f140054o);
        stringBuffer.append("\r\nTab:");
        stringBuffer.append(this.f140055p);
        stringBuffer.append("\r\nSearchCost:");
        stringBuffer.append(this.f140056q);
        stringBuffer.append("\r\nIfImageDone:");
        stringBuffer.append(this.f140057r);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f140058s);
        stringBuffer.append("\r\nAllImageCnt:");
        stringBuffer.append(this.f140059t);
        stringBuffer.append("\r\nMatchLogic:");
        stringBuffer.append(this.f140060u);
        stringBuffer.append("\r\nIfAlllmageDone:");
        stringBuffer.append(this.f140061v);
        stringBuffer.append("\r\nifPopups:");
        stringBuffer.append(this.f140062w);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6659x3e773f99 p(java.lang.String str) {
        this.f140048i = b("SearchQuery", str, true);
        return this;
    }
}

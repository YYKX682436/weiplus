package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class AndroidSnsImageLoadStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f55095f;

    /* renamed from: h, reason: collision with root package name */
    public int f55097h;

    /* renamed from: i, reason: collision with root package name */
    public int f55098i;

    /* renamed from: l, reason: collision with root package name */
    public int f55101l;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55093d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55094e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55096g = "";

    /* renamed from: j, reason: collision with root package name */
    public int f55099j = -1;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f55100k = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f55102m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f55103n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f55104o = "";

    /* renamed from: p, reason: collision with root package name */
    public int f55105p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f55106q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f55107r = -1;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f55108s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f55109t = "";

    @Override // jx3.a
    public int g() {
        return 23151;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55093d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55094e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55095f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55096g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55097h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55098i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55099j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55100k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55101l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55102m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55103n);
        stringBuffer.append(",");
        stringBuffer.append(this.f55104o);
        stringBuffer.append(",");
        stringBuffer.append(this.f55105p);
        stringBuffer.append(",");
        stringBuffer.append(this.f55106q);
        stringBuffer.append(",");
        stringBuffer.append(this.f55107r);
        stringBuffer.append(",");
        stringBuffer.append(this.f55108s);
        stringBuffer.append(",");
        stringBuffer.append(this.f55109t);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionID:");
        stringBuffer.append(this.f55093d);
        stringBuffer.append("\r\nMediaID:");
        stringBuffer.append(this.f55094e);
        stringBuffer.append("\r\nRequestType:");
        stringBuffer.append(this.f55095f);
        stringBuffer.append("\r\nFromScene:");
        stringBuffer.append(this.f55096g);
        stringBuffer.append("\r\nisBatchDownload:");
        stringBuffer.append(this.f55097h);
        stringBuffer.append("\r\nstage:");
        stringBuffer.append(this.f55098i);
        stringBuffer.append("\r\ncdnRetCode:");
        stringBuffer.append(this.f55099j);
        stringBuffer.append("\r\nstageCost:");
        stringBuffer.append(this.f55100k);
        stringBuffer.append("\r\nisAd:");
        stringBuffer.append(this.f55101l);
        stringBuffer.append("\r\nenqueueQueueSize:");
        stringBuffer.append(this.f55102m);
        stringBuffer.append("\r\nstartDownloadQueueSize:");
        stringBuffer.append(this.f55103n);
        stringBuffer.append("\r\ncallbackUIQueueSize:");
        stringBuffer.append(this.f55104o);
        stringBuffer.append("\r\nstartImageLoaderQueueSize:");
        stringBuffer.append(this.f55105p);
        stringBuffer.append("\r\nfinishedImageLoaderQueueSize:");
        stringBuffer.append(this.f55106q);
        stringBuffer.append("\r\nnetType:");
        stringBuffer.append(this.f55107r);
        stringBuffer.append("\r\nfeedInfo:");
        stringBuffer.append(this.f55108s);
        stringBuffer.append("\r\nbizName:");
        stringBuffer.append(this.f55109t);
        return stringBuffer.toString();
    }
}

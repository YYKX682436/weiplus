package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderSearchActionReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f57772f;

    /* renamed from: j, reason: collision with root package name */
    public long f57776j;

    /* renamed from: k, reason: collision with root package name */
    public long f57777k;

    /* renamed from: l, reason: collision with root package name */
    public long f57778l;

    /* renamed from: m, reason: collision with root package name */
    public long f57779m;

    /* renamed from: n, reason: collision with root package name */
    public long f57780n;

    /* renamed from: o, reason: collision with root package name */
    public long f57781o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57770d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57771e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57773g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57774h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57775i = "";

    @Override // jx3.a
    public int g() {
        return 21690;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57770d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57771e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57772f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57773g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57774h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57775i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57776j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57777k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57778l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57779m);
        stringBuffer.append(",");
        stringBuffer.append(this.f57780n);
        stringBuffer.append(",");
        stringBuffer.append(this.f57781o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionId:");
        stringBuffer.append(this.f57770d);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f57771e);
        stringBuffer.append("\r\nmyAccountType:");
        stringBuffer.append(this.f57772f);
        stringBuffer.append("\r\nsearchSessionId:");
        stringBuffer.append(this.f57773g);
        stringBuffer.append("\r\nrequestId:");
        stringBuffer.append(this.f57774h);
        stringBuffer.append("\r\nquery:");
        stringBuffer.append(this.f57775i);
        stringBuffer.append("\r\nsearchScene:");
        stringBuffer.append(this.f57776j);
        stringBuffer.append("\r\nsearchType:");
        stringBuffer.append(this.f57777k);
        stringBuffer.append("\r\ncommentScene:");
        stringBuffer.append(this.f57778l);
        stringBuffer.append("\r\nsearchResultType:");
        stringBuffer.append(this.f57779m);
        stringBuffer.append("\r\nisAccountEmpty:");
        stringBuffer.append(this.f57780n);
        stringBuffer.append("\r\nisFeedEmpty:");
        stringBuffer.append(this.f57781o);
        return stringBuffer.toString();
    }
}

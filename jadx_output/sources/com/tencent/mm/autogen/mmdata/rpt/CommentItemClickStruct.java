package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class CommentItemClickStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f55727g;

    /* renamed from: k, reason: collision with root package name */
    public long f55731k;

    /* renamed from: m, reason: collision with root package name */
    public long f55733m;

    /* renamed from: n, reason: collision with root package name */
    public long f55734n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55724d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55725e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55726f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55728h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55729i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f55730j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f55732l = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f55735o = "";

    @Override // jx3.a
    public int g() {
        return 28477;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55724d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55725e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55726f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55727g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55728h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55729i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55730j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55731k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55732l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55733m);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f55734n);
        stringBuffer.append(",");
        stringBuffer.append(this.f55735o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f55724d);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f55725e);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f55726f);
        stringBuffer.append("\r\nCommentScene:");
        stringBuffer.append(this.f55727g);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f55728h);
        stringBuffer.append("\r\nrootCommentid:");
        stringBuffer.append(this.f55729i);
        stringBuffer.append("\r\nsubCommentid:");
        stringBuffer.append(this.f55730j);
        stringBuffer.append("\r\nenterType:");
        stringBuffer.append(this.f55731k);
        stringBuffer.append("\r\nreportJson:");
        stringBuffer.append(this.f55732l);
        stringBuffer.append("\r\nindex:");
        stringBuffer.append(this.f55733m);
        stringBuffer.append("\r\nsubCommentIndex:0\r\nclickZone:");
        stringBuffer.append(this.f55734n);
        stringBuffer.append("\r\nad_report_data:");
        stringBuffer.append(this.f55735o);
        return stringBuffer.toString();
    }
}

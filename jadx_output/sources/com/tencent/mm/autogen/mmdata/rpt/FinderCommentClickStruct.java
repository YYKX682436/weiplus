package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderCommentClickStruct extends jx3.a {

    /* renamed from: h, reason: collision with root package name */
    public long f56676h;

    /* renamed from: i, reason: collision with root package name */
    public long f56677i;

    /* renamed from: j, reason: collision with root package name */
    public long f56678j;

    /* renamed from: k, reason: collision with root package name */
    public int f56679k;

    /* renamed from: l, reason: collision with root package name */
    public long f56680l;

    /* renamed from: m, reason: collision with root package name */
    public long f56681m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56672d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56673e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56674f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56675g = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f56682n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f56683o = "";

    @Override // jx3.a
    public int g() {
        return 19017;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56672d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56673e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56674f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56675g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56676h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56677i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56678j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56679k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56680l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56681m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56682n);
        stringBuffer.append(",");
        stringBuffer.append(this.f56683o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f56672d);
        stringBuffer.append("\r\nClickUI:");
        stringBuffer.append(this.f56673e);
        stringBuffer.append("\r\nFeedId:");
        stringBuffer.append(this.f56674f);
        stringBuffer.append("\r\nFeedUsr:");
        stringBuffer.append(this.f56675g);
        stringBuffer.append("\r\nFeedLikeCount:");
        stringBuffer.append(this.f56676h);
        stringBuffer.append("\r\nFeedCommentCount:");
        stringBuffer.append(this.f56677i);
        stringBuffer.append("\r\nFeedFriLikeCount:");
        stringBuffer.append(this.f56678j);
        stringBuffer.append("\r\nclickAll:");
        stringBuffer.append(this.f56679k);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f56680l);
        stringBuffer.append("\r\nFullScreenCommentsArea:");
        stringBuffer.append(this.f56681m);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f56682n);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f56683o);
        return stringBuffer.toString();
    }
}

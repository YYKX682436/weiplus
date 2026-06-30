package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderRealLikeExposeStruct extends jx3.a {

    /* renamed from: h, reason: collision with root package name */
    public long f57668h;

    /* renamed from: j, reason: collision with root package name */
    public long f57670j;

    /* renamed from: k, reason: collision with root package name */
    public long f57671k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57664d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57665e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57666f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57667g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57669i = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f57672l = "";

    @Override // jx3.a
    public int g() {
        return 19955;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57664d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57665e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57666f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57667g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57668h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57669i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57670j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57671k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57672l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f57664d);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f57665e);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f57666f);
        stringBuffer.append("\r\nExposeItems:");
        stringBuffer.append(this.f57667g);
        stringBuffer.append("\r\nIsCgiEnd:");
        stringBuffer.append(this.f57668h);
        stringBuffer.append("\r\nFeedId:");
        stringBuffer.append(this.f57669i);
        stringBuffer.append("\r\nCommentScene:");
        stringBuffer.append(this.f57670j);
        stringBuffer.append("\r\nTotalFriendLikeCnt:");
        stringBuffer.append(this.f57671k);
        stringBuffer.append("\r\nEnterContextId:");
        stringBuffer.append(this.f57672l);
        return stringBuffer.toString();
    }
}

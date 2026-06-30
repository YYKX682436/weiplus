package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsFeedOwnerDeleteCommentReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60566d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60567e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60568f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f60569g;

    /* renamed from: h, reason: collision with root package name */
    public long f60570h;

    /* renamed from: i, reason: collision with root package name */
    public long f60571i;

    /* renamed from: j, reason: collision with root package name */
    public int f60572j;

    @Override // jx3.a
    public int g() {
        return 20565;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60566d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60567e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60568f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60569g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60570h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60571i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60572j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PublishId:");
        stringBuffer.append(this.f60566d);
        stringBuffer.append("\r\nFriendUsername:");
        stringBuffer.append(this.f60567e);
        stringBuffer.append("\r\nCommentId:");
        stringBuffer.append(this.f60568f);
        stringBuffer.append("\r\nCommentType:");
        stringBuffer.append(this.f60569g);
        stringBuffer.append("\r\nCurrentLikeCount:");
        stringBuffer.append(this.f60570h);
        stringBuffer.append("\r\nCurrentCommentCount:");
        stringBuffer.append(this.f60571i);
        stringBuffer.append("\r\nOpResult:");
        stringBuffer.append(this.f60572j);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderSwitchCommentRoleStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57882d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57883e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f57884f;

    /* renamed from: g, reason: collision with root package name */
    public long f57885g;

    /* renamed from: h, reason: collision with root package name */
    public long f57886h;

    /* renamed from: i, reason: collision with root package name */
    public long f57887i;

    /* renamed from: j, reason: collision with root package name */
    public long f57888j;

    @Override // jx3.a
    public int g() {
        return 19387;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57882d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57883e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57884f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57885g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57886h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57887i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57888j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f57882d);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f57883e);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f57884f);
        stringBuffer.append("\r\nFeedLikeCount:");
        stringBuffer.append(this.f57885g);
        stringBuffer.append("\r\nFeedCommentCount:");
        stringBuffer.append(this.f57886h);
        stringBuffer.append("\r\nFeedFriLikeCount:");
        stringBuffer.append(this.f57887i);
        stringBuffer.append("\r\nRoleBeforeSwitch:");
        stringBuffer.append(this.f57888j);
        return stringBuffer.toString();
    }
}

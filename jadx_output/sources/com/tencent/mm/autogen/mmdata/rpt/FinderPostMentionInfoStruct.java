package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderPostMentionInfoStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57535d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57536e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57537f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57538g = "";

    @Override // jx3.a
    public int g() {
        return 19792;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57535d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57536e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57537f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57538g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FeedId:");
        stringBuffer.append(this.f57535d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f57536e);
        stringBuffer.append("\r\nPostUsername:");
        stringBuffer.append(this.f57537f);
        stringBuffer.append("\r\nmentionedDetailInfo:");
        stringBuffer.append(this.f57538g);
        return stringBuffer.toString();
    }
}

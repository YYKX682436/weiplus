package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPostMentionInfoStruct */
/* loaded from: classes10.dex */
public final class C6557x4df9ae47 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139068d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139069e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139070f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f139071g = "";

    @Override // jx3.a
    public int g() {
        return 19792;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139068d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139069e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139070f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139071g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FeedId:");
        stringBuffer.append(this.f139068d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f139069e);
        stringBuffer.append("\r\nPostUsername:");
        stringBuffer.append(this.f139070f);
        stringBuffer.append("\r\nmentionedDetailInfo:");
        stringBuffer.append(this.f139071g);
        return stringBuffer.toString();
    }
}

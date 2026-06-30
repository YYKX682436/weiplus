package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class VideoBGMSearchStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61551d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f61552e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61553f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f61554g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f61555h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f61556i = 0;

    @Override // jx3.a
    public int g() {
        return 17121;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f61551d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61552e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61553f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61554g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61555h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61556i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SearchID:0\r\nRecommentID:0\r\nQueryContent:");
        stringBuffer.append(this.f61551d);
        stringBuffer.append("\r\nFinishType:");
        stringBuffer.append(this.f61552e);
        stringBuffer.append("\r\nBehavior:");
        stringBuffer.append(this.f61553f);
        stringBuffer.append("\r\nMaxIndex:");
        stringBuffer.append(this.f61554g);
        stringBuffer.append("\r\nNewSearchID:");
        stringBuffer.append(this.f61555h);
        stringBuffer.append("\r\nNewRecommentID:");
        stringBuffer.append(this.f61556i);
        return stringBuffer.toString();
    }
}

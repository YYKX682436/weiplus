package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderProfileFeedClickStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f57650e;

    /* renamed from: i, reason: collision with root package name */
    public long f57654i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57649d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57651f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57652g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57653h = "";

    @Override // jx3.a
    public int g() {
        return 19188;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57649d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57650e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57651f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57652g);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f57653h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57654i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f57649d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f57650e);
        stringBuffer.append("\r\nTag:");
        stringBuffer.append(this.f57651f);
        stringBuffer.append("\r\nTagId:");
        stringBuffer.append(this.f57652g);
        stringBuffer.append("\r\nIsPoi:0\r\nTagFeedCnt:0\r\nfeedid:");
        stringBuffer.append(this.f57653h);
        stringBuffer.append("\r\nFeedLikeCount:");
        stringBuffer.append(this.f57654i);
        return stringBuffer.toString();
    }
}

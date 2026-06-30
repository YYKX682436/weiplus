package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderProfileFeedClickStruct */
/* loaded from: classes10.dex */
public final class C6566x6a6529fc extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f139183e;

    /* renamed from: i, reason: collision with root package name */
    public long f139187i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139182d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139184f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f139185g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139186h = "";

    @Override // jx3.a
    public int g() {
        return 19188;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139182d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139183e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139184f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139185g);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f139186h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139187i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f139182d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f139183e);
        stringBuffer.append("\r\nTag:");
        stringBuffer.append(this.f139184f);
        stringBuffer.append("\r\nTagId:");
        stringBuffer.append(this.f139185g);
        stringBuffer.append("\r\nIsPoi:0\r\nTagFeedCnt:0\r\nfeedid:");
        stringBuffer.append(this.f139186h);
        stringBuffer.append("\r\nFeedLikeCount:");
        stringBuffer.append(this.f139187i);
        return stringBuffer.toString();
    }
}

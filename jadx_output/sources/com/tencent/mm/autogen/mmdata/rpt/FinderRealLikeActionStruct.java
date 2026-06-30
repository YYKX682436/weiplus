package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderRealLikeActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f57659d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f57660e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f57661f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f57662g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f57663h = "";

    @Override // jx3.a
    public int g() {
        return 19956;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f57659d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57660e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57661f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57662g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57663h);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:0\r\nUsername:");
        stringBuffer.append(this.f57659d);
        stringBuffer.append("\r\nFeedid:");
        stringBuffer.append(this.f57660e);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f57661f);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f57662g);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f57663h);
        stringBuffer.append("\r\nCommentScene:0");
        return stringBuffer.toString();
    }
}

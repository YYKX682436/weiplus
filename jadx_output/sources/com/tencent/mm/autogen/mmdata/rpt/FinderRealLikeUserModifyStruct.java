package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderRealLikeUserModifyStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f57673d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f57674e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f57675f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f57676g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f57677h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f57678i = "";

    @Override // jx3.a
    public int g() {
        return 19957;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57673d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57674e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57675f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57676g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57677h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57678i);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f57673d);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f57674e);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f57675f);
        stringBuffer.append("\r\nAddUsername:");
        stringBuffer.append(this.f57676g);
        stringBuffer.append("\r\nDeleteUsername:");
        stringBuffer.append(this.f57677h);
        stringBuffer.append("\r\nFeedId:");
        stringBuffer.append(this.f57678i);
        stringBuffer.append("\r\nCommentScene:0\r\nrefuseLastCount:0");
        return stringBuffer.toString();
    }
}

package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderRealLikeUserModifyStruct */
/* loaded from: classes.dex */
public final class C6570xa3def375 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f139206d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f139207e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f139208f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f139209g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f139210h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f139211i = "";

    @Override // jx3.a
    public int g() {
        return 19957;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139206d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139207e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139208f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139209g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139210h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139211i);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f139206d);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f139207e);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f139208f);
        stringBuffer.append("\r\nAddUsername:");
        stringBuffer.append(this.f139209g);
        stringBuffer.append("\r\nDeleteUsername:");
        stringBuffer.append(this.f139210h);
        stringBuffer.append("\r\nFeedId:");
        stringBuffer.append(this.f139211i);
        stringBuffer.append("\r\nCommentScene:0\r\nrefuseLastCount:0");
        return stringBuffer.toString();
    }
}

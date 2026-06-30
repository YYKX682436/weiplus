package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderLiveUIComponentLoadingTimeStruct extends jx3.a {

    /* renamed from: h, reason: collision with root package name */
    public long f57408h;

    /* renamed from: i, reason: collision with root package name */
    public long f57409i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57404d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57405e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57406f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57407g = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f57410j = "";

    @Override // jx3.a
    public int g() {
        return 30286;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57404d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57405e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57406f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57407g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57408h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57409i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57410j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CommentScene:");
        stringBuffer.append(this.f57404d);
        stringBuffer.append("\r\nContextID:");
        stringBuffer.append(this.f57405e);
        stringBuffer.append("\r\nFeedID:");
        stringBuffer.append(this.f57406f);
        stringBuffer.append("\r\nLiveID:");
        stringBuffer.append(this.f57407g);
        stringBuffer.append("\r\nComponentType:");
        stringBuffer.append(this.f57408h);
        stringBuffer.append("\r\nDuration:");
        stringBuffer.append(this.f57409i);
        stringBuffer.append("\r\nComponentExtra:");
        stringBuffer.append(this.f57410j);
        return stringBuffer.toString();
    }
}

package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StorySnsHeaderExposeStruct */
/* loaded from: classes4.dex */
public final class C6940x89f70da9 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142500d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142501e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f142502f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142503g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f142504h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f142505i = 0;

    @Override // jx3.a
    public int g() {
        return 16843;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142500d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142501e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142502f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142503g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142504h);
        stringBuffer.append(",");
        stringBuffer.append(this.f142505i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EnterObjectId:");
        stringBuffer.append(this.f142500d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f142501e);
        stringBuffer.append("\r\nExposeUinCount:");
        stringBuffer.append(this.f142502f);
        stringBuffer.append("\r\nExposeUinList:");
        stringBuffer.append(this.f142503g);
        stringBuffer.append("\r\nExposeNewVideoCount:");
        stringBuffer.append(this.f142504h);
        stringBuffer.append("\r\nInteractiveUserCount:");
        stringBuffer.append(this.f142505i);
        return stringBuffer.toString();
    }
}

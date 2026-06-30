package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchTipActionStruct */
/* loaded from: classes9.dex */
public final class C7063x1921ad1b extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f143714e;

    /* renamed from: g, reason: collision with root package name */
    public int f143716g;

    /* renamed from: h, reason: collision with root package name */
    public int f143717h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143713d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143715f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f143718i = "";

    @Override // jx3.a
    public int g() {
        return 23012;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143713d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143714e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143715f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143716g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143717h);
        stringBuffer.append(",");
        stringBuffer.append(this.f143718i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("requestid:");
        stringBuffer.append(this.f143713d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f143714e);
        stringBuffer.append("\r\nmessage:");
        stringBuffer.append(this.f143715f);
        stringBuffer.append("\r\nactiontype:");
        stringBuffer.append(this.f143716g);
        stringBuffer.append("\r\npagetype:");
        stringBuffer.append(this.f143717h);
        stringBuffer.append("\r\nappid:");
        stringBuffer.append(this.f143718i);
        return stringBuffer.toString();
    }
}

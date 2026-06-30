package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FTSRelatedSugH5ReportStruct */
/* loaded from: classes8.dex */
public final class C6429x5666eb5 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f137671e;

    /* renamed from: f, reason: collision with root package name */
    public long f137672f;

    /* renamed from: h, reason: collision with root package name */
    public long f137674h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137670d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f137673g = "";

    @Override // jx3.a
    public int g() {
        return 22251;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137670d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137671e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137672f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137673g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137674h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Query:");
        stringBuffer.append(this.f137670d);
        stringBuffer.append("\r\nEnterTime:");
        stringBuffer.append(this.f137671e);
        stringBuffer.append("\r\nStayTime:");
        stringBuffer.append(this.f137672f);
        stringBuffer.append("\r\nInitUrl:");
        stringBuffer.append(this.f137673g);
        stringBuffer.append("\r\nPageCnt:");
        stringBuffer.append(this.f137674h);
        return stringBuffer.toString();
    }
}

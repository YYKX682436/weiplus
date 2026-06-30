package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class BizBrandTLCardRecycleReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f55388d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f55389e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f55390f = "";

    @Override // jx3.a
    public int g() {
        return 27268;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,0,");
        stringBuffer.append(this.f55388d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55389e);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f55390f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("IsRetrieved:0\r\nStyle:0\r\nRetrieveType:0\r\nFinderId:");
        stringBuffer.append(this.f55388d);
        stringBuffer.append("\r\nFeedId:");
        stringBuffer.append(this.f55389e);
        stringBuffer.append("\r\nStyleInfo:0\r\nShowFinder:0\r\nSessionId:");
        stringBuffer.append(this.f55390f);
        return stringBuffer.toString();
    }
}

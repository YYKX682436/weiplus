package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsPostMediaDataReportStruct */
/* loaded from: classes4.dex */
public final class C6902xf6463fbf extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f142222e;

    /* renamed from: g, reason: collision with root package name */
    public long f142224g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142221d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142223f = "";

    @Override // jx3.a
    public int g() {
        return 36181;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142221d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142222e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142223f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142224g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SnsFeedId:");
        stringBuffer.append(this.f142221d);
        stringBuffer.append("\r\nMediaCount:");
        stringBuffer.append(this.f142222e);
        stringBuffer.append("\r\nMetaDataJsonArray:");
        stringBuffer.append(this.f142223f);
        stringBuffer.append("\r\nSnsFeedType:");
        stringBuffer.append(this.f142224g);
        return stringBuffer.toString();
    }
}

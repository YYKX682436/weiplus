package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WASettingVoipAuthorizeManagerReportStruct */
/* loaded from: classes8.dex */
public final class C7042x2f2641d3 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f143594f;

    /* renamed from: g, reason: collision with root package name */
    public long f143595g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143592d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143593e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143596h = "";

    @Override // jx3.a
    public int g() {
        return 37090;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143592d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143593e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143594f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143595g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143596h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("pageId:");
        stringBuffer.append(this.f143592d);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f143593e);
        stringBuffer.append("\r\nenterSource:");
        stringBuffer.append(this.f143594f);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f143595g);
        stringBuffer.append("\r\ntemplateId:");
        stringBuffer.append(this.f143596h);
        return stringBuffer.toString();
    }
}

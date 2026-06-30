package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FavUploadFailReportStruct */
/* loaded from: classes12.dex */
public final class C6446xfca3563 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137872d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f137873e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f137874f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f137875g;

    /* renamed from: h, reason: collision with root package name */
    public long f137876h;

    @Override // jx3.a
    public int g() {
        return 28115;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137872d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137873e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137874f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137875g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137876h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ErrorCode:");
        stringBuffer.append(this.f137872d);
        stringBuffer.append("\r\nErrorMsg:");
        stringBuffer.append(this.f137873e);
        stringBuffer.append("\r\nCdnCode:");
        stringBuffer.append(this.f137874f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f137875g);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f137876h);
        return stringBuffer.toString();
    }
}

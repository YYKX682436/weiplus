package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DoCmdErrorReportStruct */
/* loaded from: classes8.dex */
public final class C6396xb373c382 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137395d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f137396e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f137397f;

    /* renamed from: g, reason: collision with root package name */
    public long f137398g;

    /* renamed from: h, reason: collision with root package name */
    public int f137399h;

    /* renamed from: i, reason: collision with root package name */
    public int f137400i;

    @Override // jx3.a
    public int g() {
        return 34876;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137395d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137396e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137397f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137398g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137399h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137400i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("wholeStack:");
        stringBuffer.append(this.f137395d);
        stringBuffer.append("\r\nreversion:");
        stringBuffer.append(this.f137396e);
        stringBuffer.append("\r\ncmdId:");
        stringBuffer.append(this.f137397f);
        stringBuffer.append("\r\ntime:");
        stringBuffer.append(this.f137398g);
        stringBuffer.append("\r\ncallSource:");
        stringBuffer.append(this.f137399h);
        stringBuffer.append("\r\nmsgType:");
        stringBuffer.append(this.f137400i);
        return stringBuffer.toString();
    }
}

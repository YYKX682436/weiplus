package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class DoCmdErrorReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55862d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55863e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f55864f;

    /* renamed from: g, reason: collision with root package name */
    public long f55865g;

    /* renamed from: h, reason: collision with root package name */
    public int f55866h;

    /* renamed from: i, reason: collision with root package name */
    public int f55867i;

    @Override // jx3.a
    public int g() {
        return 34876;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55862d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55863e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55864f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55865g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55866h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55867i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("wholeStack:");
        stringBuffer.append(this.f55862d);
        stringBuffer.append("\r\nreversion:");
        stringBuffer.append(this.f55863e);
        stringBuffer.append("\r\ncmdId:");
        stringBuffer.append(this.f55864f);
        stringBuffer.append("\r\ntime:");
        stringBuffer.append(this.f55865g);
        stringBuffer.append("\r\ncallSource:");
        stringBuffer.append(this.f55866h);
        stringBuffer.append("\r\nmsgType:");
        stringBuffer.append(this.f55867i);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class BizScreenshotOpReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55423d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f55424e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f55425f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f55426g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f55427h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f55428i = 0;

    @Override // jx3.a
    public int g() {
        return 34318;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55423d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55424e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55425f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55426g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55427h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55428i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("url:");
        stringBuffer.append(this.f55423d);
        stringBuffer.append("\r\nbiz:");
        stringBuffer.append(this.f55424e);
        stringBuffer.append("\r\nmid:");
        stringBuffer.append(this.f55425f);
        stringBuffer.append("\r\nidx:");
        stringBuffer.append(this.f55426g);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f55427h);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f55428i);
        return stringBuffer.toString();
    }
}

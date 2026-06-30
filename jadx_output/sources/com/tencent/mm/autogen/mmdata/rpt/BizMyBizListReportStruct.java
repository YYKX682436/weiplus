package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class BizMyBizListReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55396d;

    /* renamed from: e, reason: collision with root package name */
    public long f55397e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55398f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f55399g;

    /* renamed from: h, reason: collision with root package name */
    public long f55400h;

    @Override // jx3.a
    public int g() {
        return 27270;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55396d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55397e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55398f);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f55399g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55400h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("actionType:");
        stringBuffer.append(this.f55396d);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f55397e);
        stringBuffer.append("\r\nbizusername:");
        stringBuffer.append(this.f55398f);
        stringBuffer.append("\r\nexposeMsTime:0\r\nclickMsTime:");
        stringBuffer.append(this.f55399g);
        stringBuffer.append("\r\nisStar:");
        stringBuffer.append(this.f55400h);
        return stringBuffer.toString();
    }
}

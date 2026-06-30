package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class relationUpdateActionReportStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f63147g;

    /* renamed from: h, reason: collision with root package name */
    public long f63148h;

    /* renamed from: j, reason: collision with root package name */
    public long f63150j;

    /* renamed from: k, reason: collision with root package name */
    public long f63151k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63144d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63145e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f63146f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f63149i = "";

    @Override // jx3.a
    public int g() {
        return 36656;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63144d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63145e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63146f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63147g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63148h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63149i);
        stringBuffer.append(",");
        stringBuffer.append(this.f63150j);
        stringBuffer.append(",");
        stringBuffer.append(this.f63151k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("requestPage:");
        stringBuffer.append(this.f63144d);
        stringBuffer.append("\r\ntoUsername:");
        stringBuffer.append(this.f63145e);
        stringBuffer.append("\r\ntoUin:");
        stringBuffer.append(this.f63146f);
        stringBuffer.append("\r\neventType:");
        stringBuffer.append(this.f63147g);
        stringBuffer.append("\r\nrequestContent:");
        stringBuffer.append(this.f63148h);
        stringBuffer.append("\r\nreturnCode:");
        stringBuffer.append(this.f63149i);
        stringBuffer.append("\r\nreportSource:");
        stringBuffer.append(this.f63150j);
        stringBuffer.append("\r\ncostTime:");
        stringBuffer.append(this.f63151k);
        return stringBuffer.toString();
    }
}

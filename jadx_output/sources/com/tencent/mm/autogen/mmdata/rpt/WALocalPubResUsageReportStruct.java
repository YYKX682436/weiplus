package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WALocalPubResUsageReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f61969f;

    /* renamed from: g, reason: collision with root package name */
    public long f61970g;

    /* renamed from: i, reason: collision with root package name */
    public long f61972i;

    /* renamed from: j, reason: collision with root package name */
    public long f61973j;

    /* renamed from: k, reason: collision with root package name */
    public long f61974k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61967d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61968e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61971h = "";

    @Override // jx3.a
    public int g() {
        return 30301;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61967d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61968e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61969f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61970g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61971h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61972i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61973j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61974k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Appid:");
        stringBuffer.append(this.f61967d);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f61968e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f61969f);
        stringBuffer.append("\r\nDebugMode:");
        stringBuffer.append(this.f61970g);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f61971h);
        stringBuffer.append("\r\nPubLibType:");
        stringBuffer.append(this.f61972i);
        stringBuffer.append("\r\nPubLibVersion:");
        stringBuffer.append(this.f61973j);
        stringBuffer.append("\r\nExpt:");
        stringBuffer.append(this.f61974k);
        return stringBuffer.toString();
    }
}

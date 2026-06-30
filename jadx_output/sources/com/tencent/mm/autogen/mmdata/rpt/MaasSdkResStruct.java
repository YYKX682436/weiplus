package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class MaasSdkResStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public int f59006g;

    /* renamed from: d, reason: collision with root package name */
    public int f59003d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f59004e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f59005f = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f59007h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f59008i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f59009j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59010k = "";

    /* renamed from: l, reason: collision with root package name */
    public int f59011l = 0;

    @Override // jx3.a
    public int g() {
        return 25056;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59003d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59004e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59005f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59006g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59007h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59008i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59009j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59010k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59011l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ApkCompatVersion:");
        stringBuffer.append(this.f59003d);
        stringBuffer.append("\r\nResCompatVersion:");
        stringBuffer.append(this.f59004e);
        stringBuffer.append("\r\nIsSuccess:");
        stringBuffer.append(this.f59005f);
        stringBuffer.append("\r\nEvent:");
        stringBuffer.append(this.f59006g);
        stringBuffer.append("\r\nResSubType:");
        stringBuffer.append(this.f59007h);
        stringBuffer.append("\r\nLoadFailCount:");
        stringBuffer.append(this.f59008i);
        stringBuffer.append("\r\nResVersion:");
        stringBuffer.append(this.f59009j);
        stringBuffer.append("\r\nSha1:");
        stringBuffer.append(this.f59010k);
        stringBuffer.append("\r\nSource:");
        stringBuffer.append(this.f59011l);
        return stringBuffer.toString();
    }
}

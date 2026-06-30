package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class ClientCellInfoReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f55690d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f55691e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f55692f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55693g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55694h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55695i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f55696j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f55697k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f55698l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f55699m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f55700n = "";

    @Override // jx3.a
    public int g() {
        return 15548;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55690d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55691e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55692f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55693g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55694h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55695i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55696j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55697k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55698l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55699m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55700n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CgiCmd:");
        stringBuffer.append(this.f55690d);
        stringBuffer.append("\r\nErrType:");
        stringBuffer.append(this.f55691e);
        stringBuffer.append("\r\nErrCode:");
        stringBuffer.append(this.f55692f);
        stringBuffer.append("\r\nEncryptKey:");
        stringBuffer.append(this.f55693g);
        stringBuffer.append("\r\nEncryptUserinfo:");
        stringBuffer.append(this.f55694h);
        stringBuffer.append("\r\nEncryptCellinfoLength:");
        stringBuffer.append(this.f55695i);
        stringBuffer.append("\r\nEncryptCellinfo_01:");
        stringBuffer.append(this.f55696j);
        stringBuffer.append("\r\nEncryptCellinfo_02:");
        stringBuffer.append(this.f55697k);
        stringBuffer.append("\r\nEncryptCellinfo_03:");
        stringBuffer.append(this.f55698l);
        stringBuffer.append("\r\nEncryptCellinfo_04:");
        stringBuffer.append(this.f55699m);
        stringBuffer.append("\r\nEncryptCellinfo_05:");
        stringBuffer.append(this.f55700n);
        return stringBuffer.toString();
    }
}

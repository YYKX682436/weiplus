package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes13.dex */
public final class MMBaseStringResourceLoadStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f58773d;

    /* renamed from: g, reason: collision with root package name */
    public int f58776g;

    /* renamed from: h, reason: collision with root package name */
    public int f58777h;

    /* renamed from: j, reason: collision with root package name */
    public int f58779j;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58774e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58775f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58778i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f58780k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f58781l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f58782m = "";

    @Override // jx3.a
    public int g() {
        return 36511;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58773d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58774e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58775f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58776g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58777h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58778i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58779j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58780k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58781l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58782m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("isLogin:");
        stringBuffer.append(this.f58773d);
        stringBuffer.append("\r\nuserLanguage:");
        stringBuffer.append(this.f58774e);
        stringBuffer.append("\r\nsystemLanguage:");
        stringBuffer.append(this.f58775f);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f58776g);
        stringBuffer.append("\r\nbaseResStatus:");
        stringBuffer.append(this.f58777h);
        stringBuffer.append("\r\ncurResVersion:");
        stringBuffer.append(this.f58778i);
        stringBuffer.append("\r\nerrCode:");
        stringBuffer.append(this.f58779j);
        stringBuffer.append("\r\nerrMsg:");
        stringBuffer.append(this.f58780k);
        stringBuffer.append("\r\nloadStep:");
        stringBuffer.append(this.f58781l);
        stringBuffer.append("\r\nextra:");
        stringBuffer.append(this.f58782m);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.MMBaseStringResourceLoadStruct p(java.lang.String str) {
        this.f58782m = b("extra", str, true);
        return this;
    }
}

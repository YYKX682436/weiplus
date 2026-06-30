package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MMBaseStringResourceLoadStruct */
/* loaded from: classes13.dex */
public final class C6693xbd9eeeab extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f140306d;

    /* renamed from: g, reason: collision with root package name */
    public int f140309g;

    /* renamed from: h, reason: collision with root package name */
    public int f140310h;

    /* renamed from: j, reason: collision with root package name */
    public int f140312j;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140307e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140308f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140311i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f140313k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f140314l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f140315m = "";

    @Override // jx3.a
    public int g() {
        return 36511;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140306d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140307e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140308f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140309g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140310h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140311i);
        stringBuffer.append(",");
        stringBuffer.append(this.f140312j);
        stringBuffer.append(",");
        stringBuffer.append(this.f140313k);
        stringBuffer.append(",");
        stringBuffer.append(this.f140314l);
        stringBuffer.append(",");
        stringBuffer.append(this.f140315m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("isLogin:");
        stringBuffer.append(this.f140306d);
        stringBuffer.append("\r\nuserLanguage:");
        stringBuffer.append(this.f140307e);
        stringBuffer.append("\r\nsystemLanguage:");
        stringBuffer.append(this.f140308f);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f140309g);
        stringBuffer.append("\r\nbaseResStatus:");
        stringBuffer.append(this.f140310h);
        stringBuffer.append("\r\ncurResVersion:");
        stringBuffer.append(this.f140311i);
        stringBuffer.append("\r\nerrCode:");
        stringBuffer.append(this.f140312j);
        stringBuffer.append("\r\nerrMsg:");
        stringBuffer.append(this.f140313k);
        stringBuffer.append("\r\nloadStep:");
        stringBuffer.append(this.f140314l);
        stringBuffer.append("\r\nextra:");
        stringBuffer.append(this.f140315m);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6693xbd9eeeab p(java.lang.String str) {
        this.f140315m = b("extra", str, true);
        return this;
    }
}

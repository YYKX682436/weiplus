package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class AppMsgImageSaveStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f55291d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f55292e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f55293f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f55294g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f55295h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f55296i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f55297j = "";

    @Override // jx3.a
    public int g() {
        return 30503;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55291d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f55292e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55293f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55294g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55295h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55296i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55297j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Username:");
        stringBuffer.append(this.f55291d);
        stringBuffer.append("\r\nSaveTimeStamp:0\r\nCurrentAppId:");
        stringBuffer.append(this.f55292e);
        stringBuffer.append("\r\nCurrentPath:");
        stringBuffer.append(this.f55293f);
        stringBuffer.append("\r\nImageSrc:");
        stringBuffer.append(this.f55294g);
        stringBuffer.append("\r\nImageAppId:");
        stringBuffer.append(this.f55295h);
        stringBuffer.append("\r\nImagePath:");
        stringBuffer.append(this.f55296i);
        stringBuffer.append("\r\nImageKey:");
        stringBuffer.append(this.f55297j);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class MiniGameNativePageBehavStatStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59218d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f59219e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f59220f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f59221g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f59222h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f59223i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f59224j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f59225k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f59226l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f59227m = "";

    @Override // jx3.a
    public int g() {
        return 31766;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59218d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59219e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59220f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59221g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59222h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59223i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59224j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59225k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f59226l);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f59227m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f59218d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f59219e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f59220f);
        stringBuffer.append("\r\nClassID:");
        stringBuffer.append(this.f59221g);
        stringBuffer.append("\r\nSceneID:");
        stringBuffer.append(this.f59222h);
        stringBuffer.append("\r\nUIArea:");
        stringBuffer.append(this.f59223i);
        stringBuffer.append("\r\nPositionID:");
        stringBuffer.append(this.f59224j);
        stringBuffer.append("\r\nActionID:");
        stringBuffer.append(this.f59225k);
        stringBuffer.append("\r\nFuncType:0\r\nFuncID:");
        stringBuffer.append(this.f59226l);
        stringBuffer.append("\r\nSSID:0\r\nExternInfo:");
        stringBuffer.append(this.f59227m);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class AndroidCertErrorStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55036d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f55037e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f55038f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f55039g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55040h = "";

    @Override // jx3.a
    public int g() {
        return 15894;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55036d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55037e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55038f);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f55039g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55040h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f55036d);
        stringBuffer.append("\r\naction_result:");
        stringBuffer.append(this.f55037e);
        stringBuffer.append("\r\naction_code:");
        stringBuffer.append(this.f55038f);
        stringBuffer.append("\r\nsession:0\r\naction_ext:");
        stringBuffer.append(this.f55039g);
        stringBuffer.append("\r\nsession2:");
        stringBuffer.append(this.f55040h);
        return stringBuffer.toString();
    }
}

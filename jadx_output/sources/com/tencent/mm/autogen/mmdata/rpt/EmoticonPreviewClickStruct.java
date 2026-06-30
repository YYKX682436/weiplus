package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class EmoticonPreviewClickStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f56062d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f56063e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f56064f = "";

    @Override // jx3.a
    public int g() {
        return 25690;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56062d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56063e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56064f);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("md5:");
        stringBuffer.append(this.f56062d);
        stringBuffer.append("\r\npid:");
        stringBuffer.append(this.f56063e);
        stringBuffer.append("\r\nraw_md5:");
        stringBuffer.append(this.f56064f);
        stringBuffer.append("\r\nraw_md5_type:0\r\nmd5_type:0");
        return stringBuffer.toString();
    }
}

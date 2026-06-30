package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class RedEnvSendWithEmoticonDataStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59937d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59938e = "";

    @Override // jx3.a
    public int g() {
        return 16868;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59937d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59938e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SendScene:");
        stringBuffer.append(this.f59937d);
        stringBuffer.append("\r\nemoticonMd5:");
        stringBuffer.append(this.f59938e);
        return stringBuffer.toString();
    }
}

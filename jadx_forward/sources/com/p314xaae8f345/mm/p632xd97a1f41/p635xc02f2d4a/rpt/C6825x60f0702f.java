package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct */
/* loaded from: classes9.dex */
public final class C6825x60f0702f extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f141470d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141471e = "";

    @Override // jx3.a
    public int g() {
        return 16868;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141470d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141471e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SendScene:");
        stringBuffer.append(this.f141470d);
        stringBuffer.append("\r\nemoticonMd5:");
        stringBuffer.append(this.f141471e);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class RedEnvReplyWithEmoticonDataStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59933d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59934e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f59935f = 0;

    @Override // jx3.a
    public int g() {
        return 16872;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59933d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59934e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59935f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SendScene:");
        stringBuffer.append(this.f59933d);
        stringBuffer.append("\r\nemoticonMd5:");
        stringBuffer.append(this.f59934e);
        stringBuffer.append("\r\nhasTxt:");
        stringBuffer.append(this.f59935f);
        return stringBuffer.toString();
    }
}

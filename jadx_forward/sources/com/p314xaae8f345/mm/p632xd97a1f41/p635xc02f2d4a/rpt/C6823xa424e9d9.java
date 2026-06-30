package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct */
/* loaded from: classes9.dex */
public final class C6823xa424e9d9 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f141466d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141467e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f141468f = 0;

    @Override // jx3.a
    public int g() {
        return 16872;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141466d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141467e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141468f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SendScene:");
        stringBuffer.append(this.f141466d);
        stringBuffer.append("\r\nemoticonMd5:");
        stringBuffer.append(this.f141467e);
        stringBuffer.append("\r\nhasTxt:");
        stringBuffer.append(this.f141468f);
        return stringBuffer.toString();
    }
}

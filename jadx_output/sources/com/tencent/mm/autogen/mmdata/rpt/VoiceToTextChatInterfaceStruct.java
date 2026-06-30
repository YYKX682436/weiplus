package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class VoiceToTextChatInterfaceStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61699d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61700e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f61701f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f61702g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f61703h;

    @Override // jx3.a
    public int g() {
        return 28807;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61699d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61700e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61701f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61702g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61703h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f61699d);
        stringBuffer.append("\r\ntips:");
        stringBuffer.append(this.f61700e);
        stringBuffer.append("\r\nhasreddot:");
        stringBuffer.append(this.f61701f);
        stringBuffer.append("\r\nreddottype:");
        stringBuffer.append(this.f61702g);
        stringBuffer.append("\r\nwxkbInstalled:");
        stringBuffer.append(this.f61703h);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.VoiceToTextChatInterfaceStruct p(java.lang.String str) {
        this.f61700e = b("tips", str, true);
        return this;
    }
}

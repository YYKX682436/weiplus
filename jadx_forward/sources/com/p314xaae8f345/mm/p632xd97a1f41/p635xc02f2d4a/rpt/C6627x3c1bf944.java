package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FullScreenInputStruct */
/* loaded from: classes5.dex */
public final class C6627x3c1bf944 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f139796d;

    /* renamed from: e, reason: collision with root package name */
    public long f139797e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f139798f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f139799g = "";

    @Override // jx3.a
    public int g() {
        return 26699;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139796d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139797e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139798f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139799g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f139796d);
        stringBuffer.append("\r\nChatType:");
        stringBuffer.append(this.f139797e);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f139798f);
        stringBuffer.append("\r\nWording:");
        stringBuffer.append(this.f139799g);
        return stringBuffer.toString();
    }
}

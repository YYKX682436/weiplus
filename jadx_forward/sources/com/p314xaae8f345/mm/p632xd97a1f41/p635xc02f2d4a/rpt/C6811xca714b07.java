package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.PatMessageExpandReportStruct */
/* loaded from: classes5.dex */
public final class C6811xca714b07 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f141373d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141374e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f141375f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f141376g;

    @Override // jx3.a
    public int g() {
        return 19963;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141373d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141374e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141375f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141376g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f141373d);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f141374e);
        stringBuffer.append("\r\nChatUsername:");
        stringBuffer.append(this.f141375f);
        stringBuffer.append("\r\nMessageCount:");
        stringBuffer.append(this.f141376g);
        return stringBuffer.toString();
    }
}

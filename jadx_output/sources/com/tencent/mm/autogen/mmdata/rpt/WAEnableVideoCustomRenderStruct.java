package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WAEnableVideoCustomRenderStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61939d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61940e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f61941f;

    /* renamed from: g, reason: collision with root package name */
    public long f61942g;

    @Override // jx3.a
    public int g() {
        return 33772;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61939d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61940e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61941f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61942g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Appid:");
        stringBuffer.append(this.f61939d);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f61940e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f61941f);
        stringBuffer.append("\r\nDebugMode:");
        stringBuffer.append(this.f61942g);
        return stringBuffer.toString();
    }
}

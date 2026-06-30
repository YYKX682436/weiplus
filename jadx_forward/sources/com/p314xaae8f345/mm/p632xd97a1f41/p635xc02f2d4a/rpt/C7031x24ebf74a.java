package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WAEnableVideoCustomRenderStruct */
/* loaded from: classes7.dex */
public final class C7031x24ebf74a extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143472d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143473e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f143474f;

    /* renamed from: g, reason: collision with root package name */
    public long f143475g;

    @Override // jx3.a
    public int g() {
        return 33772;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143472d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143473e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143474f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143475g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Appid:");
        stringBuffer.append(this.f143472d);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f143473e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f143474f);
        stringBuffer.append("\r\nDebugMode:");
        stringBuffer.append(this.f143475g);
        return stringBuffer.toString();
    }
}

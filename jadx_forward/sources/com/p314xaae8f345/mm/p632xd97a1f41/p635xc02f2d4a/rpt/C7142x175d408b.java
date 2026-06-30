package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WevisionSwitchResStruct */
/* loaded from: classes5.dex */
public final class C7142x175d408b extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f144513e;

    /* renamed from: f, reason: collision with root package name */
    public int f144514f;

    /* renamed from: d, reason: collision with root package name */
    public int f144512d = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f144515g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f144516h = "";

    @Override // jx3.a
    public int g() {
        return 26428;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144512d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144513e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144514f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144515g);
        stringBuffer.append(",");
        stringBuffer.append(this.f144516h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppSDKVersion:");
        stringBuffer.append(this.f144512d);
        stringBuffer.append("\r\nBusinessType:");
        stringBuffer.append(this.f144513e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f144514f);
        stringBuffer.append("\r\nCgiSwitchRes:");
        stringBuffer.append(this.f144515g);
        stringBuffer.append("\r\nSwitchRes:");
        stringBuffer.append(this.f144516h);
        return stringBuffer.toString();
    }
}

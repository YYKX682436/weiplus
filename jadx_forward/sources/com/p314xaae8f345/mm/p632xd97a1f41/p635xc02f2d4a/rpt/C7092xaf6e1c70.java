package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFlagsStruct */
/* loaded from: classes7.dex */
public final class C7092xaf6e1c70 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144026d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144027e = "";

    @Override // jx3.a
    public int g() {
        return 21750;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144026d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144027e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("instanceId:");
        stringBuffer.append(this.f144026d);
        stringBuffer.append("\r\nflags:");
        stringBuffer.append(this.f144027e);
        return stringBuffer.toString();
    }
}

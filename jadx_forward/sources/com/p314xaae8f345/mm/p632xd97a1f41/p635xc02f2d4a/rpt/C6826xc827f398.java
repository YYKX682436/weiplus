package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RedScreenSoftwareUseStruct */
/* loaded from: classes3.dex */
public final class C6826xc827f398 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f141472d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141473e = "";

    @Override // jx3.a
    public int g() {
        return 24112;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141472d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141473e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppType:");
        stringBuffer.append(this.f141472d);
        stringBuffer.append("\r\nPackageName:");
        stringBuffer.append(this.f141473e);
        return stringBuffer.toString();
    }
}

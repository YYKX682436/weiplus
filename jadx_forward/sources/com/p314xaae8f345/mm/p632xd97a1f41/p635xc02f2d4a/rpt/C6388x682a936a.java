package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DeviceIdChangeStatStruct */
/* loaded from: classes12.dex */
public final class C6388x682a936a extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137324d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f137325e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f137326f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f137327g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f137328h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f137329i = "";

    @Override // jx3.a
    public int g() {
        return 28619;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137324d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137325e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137326f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137327g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137328h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137329i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PreFirstInstallTime:");
        stringBuffer.append(this.f137324d);
        stringBuffer.append("\r\nCurFirstInstallTime:");
        stringBuffer.append(this.f137325e);
        stringBuffer.append("\r\nPreAndroidId:");
        stringBuffer.append(this.f137326f);
        stringBuffer.append("\r\nCurAndroidId:");
        stringBuffer.append(this.f137327g);
        stringBuffer.append("\r\nPreDeviceModel:");
        stringBuffer.append(this.f137328h);
        stringBuffer.append("\r\nCurDeviceModel:");
        stringBuffer.append(this.f137329i);
        return stringBuffer.toString();
    }
}

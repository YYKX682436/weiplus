package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AndroidShortCutPermissionCompactStruct */
/* loaded from: classes12.dex */
public final class C6305xcbcd67f4 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f136622d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f136623e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f136624f;

    /* renamed from: g, reason: collision with root package name */
    public int f136625g;

    @Override // jx3.a
    public int g() {
        return 29057;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136622d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136623e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136624f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136625g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f136622d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f136623e);
        stringBuffer.append("\r\nPermissionStatus:");
        stringBuffer.append(this.f136624f);
        stringBuffer.append("\r\nCanJumpSettings:");
        stringBuffer.append(this.f136625g);
        return stringBuffer.toString();
    }
}

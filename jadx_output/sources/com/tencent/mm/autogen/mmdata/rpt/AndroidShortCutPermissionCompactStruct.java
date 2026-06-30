package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class AndroidShortCutPermissionCompactStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55089d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55090e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f55091f;

    /* renamed from: g, reason: collision with root package name */
    public int f55092g;

    @Override // jx3.a
    public int g() {
        return 29057;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55089d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55090e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55091f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55092g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f55089d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f55090e);
        stringBuffer.append("\r\nPermissionStatus:");
        stringBuffer.append(this.f55091f);
        stringBuffer.append("\r\nCanJumpSettings:");
        stringBuffer.append(this.f55092g);
        return stringBuffer.toString();
    }
}

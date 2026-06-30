package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class MagicBootsPkgRecordStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59022d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59023e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59024f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59025g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f59026h;

    /* renamed from: i, reason: collision with root package name */
    public long f59027i;

    /* renamed from: j, reason: collision with root package name */
    public long f59028j;

    /* renamed from: k, reason: collision with root package name */
    public long f59029k;

    @Override // jx3.a
    public int g() {
        return 27831;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59022d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59023e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59024f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59025g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59026h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59027i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59028j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59029k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PkgId:");
        stringBuffer.append(this.f59022d);
        stringBuffer.append("\r\nBaseId:");
        stringBuffer.append(this.f59023e);
        stringBuffer.append("\r\nVersion:");
        stringBuffer.append(this.f59024f);
        stringBuffer.append("\r\nMd5:");
        stringBuffer.append(this.f59025g);
        stringBuffer.append("\r\nFileExist:");
        stringBuffer.append(this.f59026h);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f59027i);
        stringBuffer.append("\r\nState:");
        stringBuffer.append(this.f59028j);
        stringBuffer.append("\r\nErrCode:");
        stringBuffer.append(this.f59029k);
        return stringBuffer.toString();
    }
}

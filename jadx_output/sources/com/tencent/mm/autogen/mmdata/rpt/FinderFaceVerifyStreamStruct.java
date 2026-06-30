package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderFaceVerifyStreamStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f56758f;

    /* renamed from: h, reason: collision with root package name */
    public long f56760h;

    /* renamed from: i, reason: collision with root package name */
    public long f56761i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56756d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56757e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56759g = "";

    @Override // jx3.a
    public int g() {
        return 21113;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56756d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56757e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56758f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56759g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56760h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56761i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FinderUsrname:");
        stringBuffer.append(this.f56756d);
        stringBuffer.append("\r\nFinderWxAppInfo:");
        stringBuffer.append(this.f56757e);
        stringBuffer.append("\r\nIsPrivate:");
        stringBuffer.append(this.f56758f);
        stringBuffer.append("\r\nFinderSessionId:");
        stringBuffer.append(this.f56759g);
        stringBuffer.append("\r\nActionTimeMs:");
        stringBuffer.append(this.f56760h);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f56761i);
        return stringBuffer.toString();
    }
}

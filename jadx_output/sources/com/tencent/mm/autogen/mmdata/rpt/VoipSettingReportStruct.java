package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class VoipSettingReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61851d;

    /* renamed from: e, reason: collision with root package name */
    public long f61852e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61853f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f61854g;

    @Override // jx3.a
    public int g() {
        return 25083;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61851d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61852e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61853f);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f61854g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("UseFaceBeauty:");
        stringBuffer.append(this.f61851d);
        stringBuffer.append("\r\nDynamicPreview:");
        stringBuffer.append(this.f61852e);
        stringBuffer.append("\r\nCameraSdk:");
        stringBuffer.append(this.f61853f);
        stringBuffer.append("\r\nReuseSurfaceTexture:0\r\nUseImageReader:");
        stringBuffer.append(this.f61854g);
        return stringBuffer.toString();
    }
}

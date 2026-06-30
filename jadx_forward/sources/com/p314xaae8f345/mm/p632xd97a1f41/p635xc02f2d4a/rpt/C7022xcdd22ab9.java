package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipSettingReportStruct */
/* loaded from: classes14.dex */
public final class C7022xcdd22ab9 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143384d;

    /* renamed from: e, reason: collision with root package name */
    public long f143385e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143386f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f143387g;

    @Override // jx3.a
    public int g() {
        return 25083;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143384d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143385e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143386f);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f143387g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("UseFaceBeauty:");
        stringBuffer.append(this.f143384d);
        stringBuffer.append("\r\nDynamicPreview:");
        stringBuffer.append(this.f143385e);
        stringBuffer.append("\r\nCameraSdk:");
        stringBuffer.append(this.f143386f);
        stringBuffer.append("\r\nReuseSurfaceTexture:0\r\nUseImageReader:");
        stringBuffer.append(this.f143387g);
        return stringBuffer.toString();
    }
}

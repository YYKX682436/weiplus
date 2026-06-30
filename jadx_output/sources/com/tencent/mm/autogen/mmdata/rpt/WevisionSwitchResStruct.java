package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class WevisionSwitchResStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f62980e;

    /* renamed from: f, reason: collision with root package name */
    public int f62981f;

    /* renamed from: d, reason: collision with root package name */
    public int f62979d = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62982g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62983h = "";

    @Override // jx3.a
    public int g() {
        return 26428;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62979d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62980e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62981f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62982g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62983h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppSDKVersion:");
        stringBuffer.append(this.f62979d);
        stringBuffer.append("\r\nBusinessType:");
        stringBuffer.append(this.f62980e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f62981f);
        stringBuffer.append("\r\nCgiSwitchRes:");
        stringBuffer.append(this.f62982g);
        stringBuffer.append("\r\nSwitchRes:");
        stringBuffer.append(this.f62983h);
        return stringBuffer.toString();
    }
}

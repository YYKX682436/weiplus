package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class WeVisionModelResStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f62926d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62927e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62928f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f62929g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62930h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f62931i = 0;

    @Override // jx3.a
    public int g() {
        return 24501;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62926d);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f62927e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62928f);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62929g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62930h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62931i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppSDKVersion:");
        stringBuffer.append(this.f62926d);
        stringBuffer.append("\r\nConfigSDKVersion:0\r\nConfigVersion:0\r\nModelList:");
        stringBuffer.append(this.f62927e);
        stringBuffer.append("\r\nInvalidModelList:");
        stringBuffer.append(this.f62928f);
        stringBuffer.append("\r\nConfigFileVersion:0\r\nAction:");
        stringBuffer.append(this.f62929g);
        stringBuffer.append("\r\nCgiModelList:");
        stringBuffer.append(this.f62930h);
        stringBuffer.append("\r\nffeversion:");
        stringBuffer.append(this.f62931i);
        return stringBuffer.toString();
    }
}

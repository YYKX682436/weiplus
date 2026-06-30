package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonDesignerIPPageExposureStruct */
/* loaded from: classes.dex */
public final class C6411x8ee75ae3 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f137558d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f137559e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f137560f = "";

    @Override // jx3.a
    public int g() {
        return 27617;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137558d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137559e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137560f);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f137558d);
        stringBuffer.append("\r\nIPSetKey:");
        stringBuffer.append(this.f137559e);
        stringBuffer.append("\r\nDesUin:");
        stringBuffer.append(this.f137560f);
        stringBuffer.append("\r\nSendClick:0");
        return stringBuffer.toString();
    }
}

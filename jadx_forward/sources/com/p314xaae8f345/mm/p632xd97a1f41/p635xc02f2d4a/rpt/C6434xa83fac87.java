package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FaceFlashCommonReportStruct */
/* loaded from: classes14.dex */
public final class C6434xa83fac87 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f137708d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f137709e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f137710f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f137711g = "";

    @Override // jx3.a
    public int g() {
        return 21597;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137708d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137709e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137710f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137711g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EventType:");
        stringBuffer.append(this.f137708d);
        stringBuffer.append("\r\nFaceType:");
        stringBuffer.append(this.f137709e);
        stringBuffer.append("\r\nErrorCode:");
        stringBuffer.append(this.f137710f);
        stringBuffer.append("\r\nErrorMsg:");
        stringBuffer.append(this.f137711g);
        return stringBuffer.toString();
    }
}

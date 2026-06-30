package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class FaceFlashCommonReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f56175d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f56176e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f56177f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56178g = "";

    @Override // jx3.a
    public int g() {
        return 21597;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56175d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56176e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56177f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56178g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EventType:");
        stringBuffer.append(this.f56175d);
        stringBuffer.append("\r\nFaceType:");
        stringBuffer.append(this.f56176e);
        stringBuffer.append("\r\nErrorCode:");
        stringBuffer.append(this.f56177f);
        stringBuffer.append("\r\nErrorMsg:");
        stringBuffer.append(this.f56178g);
        return stringBuffer.toString();
    }
}

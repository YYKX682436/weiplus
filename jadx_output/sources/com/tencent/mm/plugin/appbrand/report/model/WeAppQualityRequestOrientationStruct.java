package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes3.dex */
public final class WeAppQualityRequestOrientationStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f87924d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f87925e = -2;

    @Override // jx3.a
    public int g() {
        return 23792;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f87924d);
        stringBuffer.append(",");
        stringBuffer.append(this.f87925e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("requestedOrientation:");
        stringBuffer.append(this.f87924d);
        stringBuffer.append("\r\ncurrentOrientation:");
        stringBuffer.append(this.f87925e);
        return stringBuffer.toString();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.WeAppQualityRequestOrientationStruct */
/* loaded from: classes3.dex */
public final class C12564xc4180c42 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f169457d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f169458e = -2;

    @Override // jx3.a
    public int g() {
        return 23792;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f169457d);
        stringBuffer.append(",");
        stringBuffer.append(this.f169458e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("requestedOrientation:");
        stringBuffer.append(this.f169457d);
        stringBuffer.append("\r\ncurrentOrientation:");
        stringBuffer.append(this.f169458e);
        return stringBuffer.toString();
    }
}

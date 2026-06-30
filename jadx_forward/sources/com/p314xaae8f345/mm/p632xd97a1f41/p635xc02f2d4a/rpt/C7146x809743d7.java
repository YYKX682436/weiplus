package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WxImeCommandTokenReportStruct */
/* loaded from: classes9.dex */
public final class C7146x809743d7 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f144528f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144526d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144527e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f144529g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f144530h = "";

    @Override // jx3.a
    public int g() {
        return 29960;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144526d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144527e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144528f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144529g);
        stringBuffer.append(",");
        stringBuffer.append(this.f144530h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CurrentImePackageName:");
        stringBuffer.append(this.f144526d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f144527e);
        stringBuffer.append("\r\nResult:");
        stringBuffer.append(this.f144528f);
        stringBuffer.append("\r\nToken:");
        stringBuffer.append(this.f144529g);
        stringBuffer.append("\r\nCommandId:");
        stringBuffer.append(this.f144530h);
        return stringBuffer.toString();
    }
}

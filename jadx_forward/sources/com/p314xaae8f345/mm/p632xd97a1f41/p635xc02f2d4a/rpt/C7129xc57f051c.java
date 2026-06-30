package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct */
/* loaded from: classes9.dex */
public final class C7129xc57f051c extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f144444d;

    /* renamed from: e, reason: collision with root package name */
    public long f144445e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f144446f = "";

    @Override // jx3.a
    public int g() {
        return 29695;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144444d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144445e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144446f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BizObject:");
        stringBuffer.append(this.f144444d);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f144445e);
        stringBuffer.append("\r\nBizContent:");
        stringBuffer.append(this.f144446f);
        return stringBuffer.toString();
    }
}

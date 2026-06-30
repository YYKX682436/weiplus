package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandVideoPreLoadReportStruct */
/* loaded from: classes13.dex */
public final class C6321x968cee9d extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f136794d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f136795e = 0;

    /* renamed from: f, reason: collision with root package name */
    public cm.a f136796f;

    @Override // jx3.a
    public int g() {
        return 15586;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136794d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136795e);
        stringBuffer.append(",");
        cm.a aVar = this.f136796f;
        stringBuffer.append(aVar != null ? aVar.f124545d : -1);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Url:");
        stringBuffer.append(this.f136794d);
        stringBuffer.append("\r\nDownLoadCostStampMs:");
        stringBuffer.append(this.f136795e);
        stringBuffer.append("\r\nPreLoadStatus:");
        stringBuffer.append(this.f136796f);
        return stringBuffer.toString();
    }
}

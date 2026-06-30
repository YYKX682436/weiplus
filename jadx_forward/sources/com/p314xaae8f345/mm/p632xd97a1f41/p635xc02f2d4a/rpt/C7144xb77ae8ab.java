package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WowCompliancePopupWindowReportStruct */
/* loaded from: classes.dex */
public final class C7144xb77ae8ab extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f144520d;

    /* renamed from: e, reason: collision with root package name */
    public long f144521e;

    /* renamed from: f, reason: collision with root package name */
    public long f144522f;

    @Override // jx3.a
    public int g() {
        return 25208;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144520d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144521e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144522f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f144520d);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f144521e);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f144522f);
        return stringBuffer.toString();
    }
}

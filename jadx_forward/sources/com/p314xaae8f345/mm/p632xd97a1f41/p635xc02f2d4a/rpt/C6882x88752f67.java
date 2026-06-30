package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsChoosePostBussinessReportStruct */
/* loaded from: classes10.dex */
public final class C6882x88752f67 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142003d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f142004e;

    /* renamed from: f, reason: collision with root package name */
    public long f142005f;

    @Override // jx3.a
    public int g() {
        return 21182;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142003d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142004e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142005f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f142003d);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f142004e);
        stringBuffer.append("\r\nclickType:");
        stringBuffer.append(this.f142005f);
        return stringBuffer.toString();
    }
}

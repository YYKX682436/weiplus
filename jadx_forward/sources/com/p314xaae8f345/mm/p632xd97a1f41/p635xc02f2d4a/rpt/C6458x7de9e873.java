package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderAdvertisementKvReportStruct */
/* loaded from: classes5.dex */
public final class C6458x7de9e873 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138010d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f138011e;

    /* renamed from: f, reason: collision with root package name */
    public long f138012f;

    /* renamed from: g, reason: collision with root package name */
    public int f138013g;

    /* renamed from: h, reason: collision with root package name */
    public int f138014h;

    @Override // jx3.a
    public int g() {
        return 36015;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138010d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138011e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138012f);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f138013g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138014h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("object_id:");
        stringBuffer.append(this.f138010d);
        stringBuffer.append("\r\nreport_type:");
        stringBuffer.append(this.f138011e);
        stringBuffer.append("\r\nexposure_type:");
        stringBuffer.append(this.f138012f);
        stringBuffer.append("\r\nerr_type:0\r\nerr_code:0\r\nerr_type_int:");
        stringBuffer.append(this.f138013g);
        stringBuffer.append("\r\nerr_code_int:");
        stringBuffer.append(this.f138014h);
        return stringBuffer.toString();
    }
}

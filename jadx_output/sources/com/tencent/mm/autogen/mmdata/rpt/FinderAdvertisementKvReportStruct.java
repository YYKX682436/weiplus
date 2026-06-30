package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class FinderAdvertisementKvReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56477d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f56478e;

    /* renamed from: f, reason: collision with root package name */
    public long f56479f;

    /* renamed from: g, reason: collision with root package name */
    public int f56480g;

    /* renamed from: h, reason: collision with root package name */
    public int f56481h;

    @Override // jx3.a
    public int g() {
        return 36015;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56477d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56478e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56479f);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f56480g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56481h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("object_id:");
        stringBuffer.append(this.f56477d);
        stringBuffer.append("\r\nreport_type:");
        stringBuffer.append(this.f56478e);
        stringBuffer.append("\r\nexposure_type:");
        stringBuffer.append(this.f56479f);
        stringBuffer.append("\r\nerr_type:0\r\nerr_code:0\r\nerr_type_int:");
        stringBuffer.append(this.f56480g);
        stringBuffer.append("\r\nerr_code_int:");
        stringBuffer.append(this.f56481h);
        return stringBuffer.toString();
    }
}

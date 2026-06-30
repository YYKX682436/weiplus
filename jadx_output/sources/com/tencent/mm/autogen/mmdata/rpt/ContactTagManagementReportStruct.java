package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class ContactTagManagementReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55748d;

    /* renamed from: e, reason: collision with root package name */
    public long f55749e;

    /* renamed from: f, reason: collision with root package name */
    public long f55750f;

    /* renamed from: g, reason: collision with root package name */
    public long f55751g;

    /* renamed from: h, reason: collision with root package name */
    public long f55752h;

    @Override // jx3.a
    public int g() {
        return 24176;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55748d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55749e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55750f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55751g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55752h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("source:");
        stringBuffer.append(this.f55748d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f55749e);
        stringBuffer.append("\r\noperate_label_cnt:");
        stringBuffer.append(this.f55750f);
        stringBuffer.append("\r\nadd_member_cnt:");
        stringBuffer.append(this.f55751g);
        stringBuffer.append("\r\nremove_member_cnt:");
        stringBuffer.append(this.f55752h);
        return stringBuffer.toString();
    }
}

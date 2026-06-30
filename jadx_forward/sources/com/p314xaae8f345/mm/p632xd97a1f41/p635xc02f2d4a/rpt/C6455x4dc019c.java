package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FindMoreManageReportStruct */
/* loaded from: classes8.dex */
public final class C6455x4dc019c extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f137972e;

    /* renamed from: f, reason: collision with root package name */
    public long f137973f;

    /* renamed from: g, reason: collision with root package name */
    public long f137974g;

    /* renamed from: i, reason: collision with root package name */
    public long f137976i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137971d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f137975h = "";

    @Override // jx3.a
    public int g() {
        return 24037;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137971d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137972e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137973f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137974g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137975h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137976i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f137971d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f137972e);
        stringBuffer.append("\r\nitem:");
        stringBuffer.append(this.f137973f);
        stringBuffer.append("\r\nbutton:");
        stringBuffer.append(this.f137974g);
        stringBuffer.append("\r\nexpose_items:");
        stringBuffer.append(this.f137975h);
        stringBuffer.append("\r\nenter_scene:");
        stringBuffer.append(this.f137976i);
        return stringBuffer.toString();
    }
}

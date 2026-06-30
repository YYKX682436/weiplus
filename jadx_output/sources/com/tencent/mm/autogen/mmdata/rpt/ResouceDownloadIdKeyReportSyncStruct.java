package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class ResouceDownloadIdKeyReportSyncStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60005d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f60006e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f60007f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60008g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f60009h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f60010i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f60011j = 0;

    @Override // jx3.a
    public int g() {
        return 15166;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60005d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60006e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60007f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60008g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60009h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60010i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60011j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ResType:");
        stringBuffer.append(this.f60005d);
        stringBuffer.append("\r\nResSubType:");
        stringBuffer.append(this.f60006e);
        stringBuffer.append("\r\nResVersion:");
        stringBuffer.append(this.f60007f);
        stringBuffer.append("\r\nNetwork:");
        stringBuffer.append(this.f60008g);
        stringBuffer.append("\r\nReportId:");
        stringBuffer.append(this.f60009h);
        stringBuffer.append("\r\nReportKey:");
        stringBuffer.append(this.f60010i);
        stringBuffer.append("\r\nAndroidPathMigrate:");
        stringBuffer.append(this.f60011j);
        return stringBuffer.toString();
    }
}

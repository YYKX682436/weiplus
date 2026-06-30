package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class FindMoreManageReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f56439e;

    /* renamed from: f, reason: collision with root package name */
    public long f56440f;

    /* renamed from: g, reason: collision with root package name */
    public long f56441g;

    /* renamed from: i, reason: collision with root package name */
    public long f56443i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56438d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56442h = "";

    @Override // jx3.a
    public int g() {
        return 24037;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56438d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56439e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56440f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56441g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56442h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56443i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f56438d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f56439e);
        stringBuffer.append("\r\nitem:");
        stringBuffer.append(this.f56440f);
        stringBuffer.append("\r\nbutton:");
        stringBuffer.append(this.f56441g);
        stringBuffer.append("\r\nexpose_items:");
        stringBuffer.append(this.f56442h);
        stringBuffer.append("\r\nenter_scene:");
        stringBuffer.append(this.f56443i);
        return stringBuffer.toString();
    }
}

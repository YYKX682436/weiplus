package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class MediaFileReportStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f59135g;

    /* renamed from: h, reason: collision with root package name */
    public long f59136h;

    /* renamed from: k, reason: collision with root package name */
    public long f59139k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59132d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59133e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59134f = "";

    /* renamed from: i, reason: collision with root package name */
    public int f59137i = -1;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f59138j = "";

    @Override // jx3.a
    public int g() {
        return 27643;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59132d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59133e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59134f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59135g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59136h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59137i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59138j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59139k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MediaDirPath:");
        stringBuffer.append(this.f59132d);
        stringBuffer.append("\r\nMediaFilePath:");
        stringBuffer.append(this.f59133e);
        stringBuffer.append("\r\nModifiedTimeStr:");
        stringBuffer.append(this.f59134f);
        stringBuffer.append("\r\nModifiedTimeMs:");
        stringBuffer.append(this.f59135g);
        stringBuffer.append("\r\nMediaFileSize:");
        stringBuffer.append(this.f59136h);
        stringBuffer.append("\r\nOptType:");
        stringBuffer.append(this.f59137i);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f59138j);
        stringBuffer.append("\r\nDeleteCostTime:");
        stringBuffer.append(this.f59139k);
        return stringBuffer.toString();
    }
}

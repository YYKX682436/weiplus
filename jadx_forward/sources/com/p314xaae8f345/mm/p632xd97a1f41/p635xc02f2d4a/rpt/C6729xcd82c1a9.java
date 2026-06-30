package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MediaFileReportStruct */
/* loaded from: classes4.dex */
public final class C6729xcd82c1a9 extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f140668g;

    /* renamed from: h, reason: collision with root package name */
    public long f140669h;

    /* renamed from: k, reason: collision with root package name */
    public long f140672k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140665d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140666e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140667f = "";

    /* renamed from: i, reason: collision with root package name */
    public int f140670i = -1;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f140671j = "";

    @Override // jx3.a
    public int g() {
        return 27643;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140665d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140666e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140667f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140668g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140669h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140670i);
        stringBuffer.append(",");
        stringBuffer.append(this.f140671j);
        stringBuffer.append(",");
        stringBuffer.append(this.f140672k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MediaDirPath:");
        stringBuffer.append(this.f140665d);
        stringBuffer.append("\r\nMediaFilePath:");
        stringBuffer.append(this.f140666e);
        stringBuffer.append("\r\nModifiedTimeStr:");
        stringBuffer.append(this.f140667f);
        stringBuffer.append("\r\nModifiedTimeMs:");
        stringBuffer.append(this.f140668g);
        stringBuffer.append("\r\nMediaFileSize:");
        stringBuffer.append(this.f140669h);
        stringBuffer.append("\r\nOptType:");
        stringBuffer.append(this.f140670i);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f140671j);
        stringBuffer.append("\r\nDeleteCostTime:");
        stringBuffer.append(this.f140672k);
        return stringBuffer.toString();
    }
}

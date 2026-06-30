package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class FavUploadFailReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56339d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56340e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f56341f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f56342g;

    /* renamed from: h, reason: collision with root package name */
    public long f56343h;

    @Override // jx3.a
    public int g() {
        return 28115;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56339d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56340e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56341f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56342g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56343h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ErrorCode:");
        stringBuffer.append(this.f56339d);
        stringBuffer.append("\r\nErrorMsg:");
        stringBuffer.append(this.f56340e);
        stringBuffer.append("\r\nCdnCode:");
        stringBuffer.append(this.f56341f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f56342g);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f56343h);
        return stringBuffer.toString();
    }
}

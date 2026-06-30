package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class VideoAlbumErrorReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61548d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f61549e;

    /* renamed from: f, reason: collision with root package name */
    public long f61550f;

    @Override // jx3.a
    public int g() {
        return 24979;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61548d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61549e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61550f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ToUsername:");
        stringBuffer.append(this.f61548d);
        stringBuffer.append("\r\nReason:");
        stringBuffer.append(this.f61549e);
        stringBuffer.append("\r\nReasonDetail:");
        stringBuffer.append(this.f61550f);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct p(java.lang.String str) {
        this.f61548d = b("ToUsername", str, true);
        return this;
    }
}

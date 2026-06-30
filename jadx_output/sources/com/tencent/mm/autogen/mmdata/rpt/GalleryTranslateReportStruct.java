package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class GalleryTranslateReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58316d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f58317e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f58318f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f58319g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58320h = "";

    @Override // jx3.a
    public int g() {
        return 17055;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58316d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58317e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58318f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58319g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58320h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f58316d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f58317e);
        stringBuffer.append("\r\nSource:");
        stringBuffer.append(this.f58318f);
        stringBuffer.append("\r\nFileID:");
        stringBuffer.append(this.f58319g);
        stringBuffer.append("\r\nAesKey:");
        stringBuffer.append(this.f58320h);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct p(java.lang.String str) {
        this.f58320h = b("AesKey", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct q(java.lang.String str) {
        this.f58319g = b("FileID", str, true);
        return this;
    }
}

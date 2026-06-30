package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct */
/* loaded from: classes3.dex */
public final class C6631xd817ea85 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f139849d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f139850e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f139851f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f139852g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139853h = "";

    @Override // jx3.a
    public int g() {
        return 17055;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139849d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139850e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139851f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139852g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139853h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f139849d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f139850e);
        stringBuffer.append("\r\nSource:");
        stringBuffer.append(this.f139851f);
        stringBuffer.append("\r\nFileID:");
        stringBuffer.append(this.f139852g);
        stringBuffer.append("\r\nAesKey:");
        stringBuffer.append(this.f139853h);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85 p(java.lang.String str) {
        this.f139853h = b("AesKey", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85 q(java.lang.String str) {
        this.f139852g = b("FileID", str, true);
        return this;
    }
}

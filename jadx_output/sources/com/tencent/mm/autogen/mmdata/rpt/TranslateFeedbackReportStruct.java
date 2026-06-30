package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class TranslateFeedbackReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61339d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61340e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61341f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f61342g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f61343h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61344i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f61345j = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f61346k = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f61347l = "";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f61348m = "";

    @Override // jx3.a
    public int g() {
        return 28185;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61339d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f61340e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61341f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61342g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61343h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61344i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61345j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61346k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61347l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61348m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f61339d);
        stringBuffer.append("\r\nReason:0\r\nOrigImgFileId:");
        stringBuffer.append(this.f61340e);
        stringBuffer.append("\r\nOrigImgAesKey:");
        stringBuffer.append(this.f61341f);
        stringBuffer.append("\r\nDocImgFileId:");
        stringBuffer.append(this.f61342g);
        stringBuffer.append("\r\nDocImgAesKey:");
        stringBuffer.append(this.f61343h);
        stringBuffer.append("\r\nTransImgFileId:");
        stringBuffer.append(this.f61344i);
        stringBuffer.append("\r\nTransImgAesKey:");
        stringBuffer.append(this.f61345j);
        stringBuffer.append("\r\nOrigText:");
        stringBuffer.append(this.f61346k);
        stringBuffer.append("\r\nTransText:");
        stringBuffer.append(this.f61347l);
        stringBuffer.append("\r\nMoreInfo:");
        stringBuffer.append(this.f61348m);
        return stringBuffer.toString();
    }
}

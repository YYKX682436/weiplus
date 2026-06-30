package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class ImageFastEntryDetectStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58455d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f58456e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58457f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f58458g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f58459h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58460i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f58461j = "";

    @Override // jx3.a
    public int g() {
        return 19776;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58455d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58456e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58457f);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58458g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58459h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58460i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58461j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OpenPictureTime:");
        stringBuffer.append(this.f58455d);
        stringBuffer.append("\r\nOpenPictureType:");
        stringBuffer.append(this.f58456e);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f58457f);
        stringBuffer.append("\r\nExposeIconTime:0\r\nPictureConcluding:");
        stringBuffer.append(this.f58458g);
        stringBuffer.append("\r\nIconType:");
        stringBuffer.append(this.f58459h);
        stringBuffer.append("\r\nFileID:");
        stringBuffer.append(this.f58460i);
        stringBuffer.append("\r\nAesKey:");
        stringBuffer.append(this.f58461j);
        return stringBuffer.toString();
    }
}

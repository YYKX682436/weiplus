package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class android_scanner_performanceStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f63096d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f63097e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f63098f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f63099g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f63100h = 0;

    @Override // jx3.a
    public int g() {
        return 14176;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63096d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63097e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63098f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63099g);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f63100h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("isSuccessful:");
        stringBuffer.append(this.f63096d);
        stringBuffer.append("\r\nscanTime:");
        stringBuffer.append(this.f63097e);
        stringBuffer.append("\r\nfocusMode:");
        stringBuffer.append(this.f63098f);
        stringBuffer.append("\r\ntotalFrames:");
        stringBuffer.append(this.f63099g);
        stringBuffer.append("\r\nfocusTime:0\r\npreviewStartTime:0\r\nhasCodeTime:0\r\nscanMode:");
        stringBuffer.append(this.f63100h);
        return stringBuffer.toString();
    }
}

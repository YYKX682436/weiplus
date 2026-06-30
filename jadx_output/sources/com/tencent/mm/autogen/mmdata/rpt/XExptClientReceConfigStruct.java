package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class XExptClientReceConfigStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f63063d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f63064e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f63065f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f63066g;

    @Override // jx3.a
    public int g() {
        return 16909;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63063d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63064e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63065f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63066g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExptId:");
        stringBuffer.append(this.f63063d);
        stringBuffer.append("\r\nGroupId:");
        stringBuffer.append(this.f63064e);
        stringBuffer.append("\r\nExptSeq:");
        stringBuffer.append(this.f63065f);
        stringBuffer.append("\r\nBucketSrc:");
        stringBuffer.append(this.f63066g);
        return stringBuffer.toString();
    }
}

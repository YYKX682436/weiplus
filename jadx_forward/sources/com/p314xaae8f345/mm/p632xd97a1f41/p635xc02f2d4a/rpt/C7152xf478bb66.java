package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.XExptClientReceConfigStruct */
/* loaded from: classes14.dex */
public final class C7152xf478bb66 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f144596d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f144597e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f144598f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f144599g;

    @Override // jx3.a
    public int g() {
        return 16909;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144596d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144597e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144598f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144599g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExptId:");
        stringBuffer.append(this.f144596d);
        stringBuffer.append("\r\nGroupId:");
        stringBuffer.append(this.f144597e);
        stringBuffer.append("\r\nExptSeq:");
        stringBuffer.append(this.f144598f);
        stringBuffer.append("\r\nBucketSrc:");
        stringBuffer.append(this.f144599g);
        return stringBuffer.toString();
    }
}

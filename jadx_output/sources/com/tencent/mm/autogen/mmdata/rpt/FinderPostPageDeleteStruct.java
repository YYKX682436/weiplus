package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderPostPageDeleteStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57539d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57540e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f57541f;

    /* renamed from: g, reason: collision with root package name */
    public long f57542g;

    /* renamed from: h, reason: collision with root package name */
    public long f57543h;

    /* renamed from: i, reason: collision with root package name */
    public long f57544i;

    /* renamed from: j, reason: collision with root package name */
    public long f57545j;

    @Override // jx3.a
    public int g() {
        return 21638;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57539d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57540e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57541f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57542g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57543h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57544i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57545j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PostId:");
        stringBuffer.append(this.f57539d);
        stringBuffer.append("\r\nEditId:");
        stringBuffer.append(this.f57540e);
        stringBuffer.append("\r\nVideoSource:");
        stringBuffer.append(this.f57541f);
        stringBuffer.append("\r\nMediaType:");
        stringBuffer.append(this.f57542g);
        stringBuffer.append("\r\nPicCnt:");
        stringBuffer.append(this.f57543h);
        stringBuffer.append("\r\nVideoLen:");
        stringBuffer.append(this.f57544i);
        stringBuffer.append("\r\nDeleteFlag:");
        stringBuffer.append(this.f57545j);
        return stringBuffer.toString();
    }
}

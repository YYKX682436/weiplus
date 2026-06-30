package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderPostSelectPageActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57553d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57554e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f57555f;

    /* renamed from: g, reason: collision with root package name */
    public long f57556g;

    /* renamed from: h, reason: collision with root package name */
    public long f57557h;

    @Override // jx3.a
    public int g() {
        return 21149;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57553d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57554e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57555f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57556g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57557h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ClickId:");
        stringBuffer.append(this.f57553d);
        stringBuffer.append("\r\nPostId:");
        stringBuffer.append(this.f57554e);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f57555f);
        stringBuffer.append("\r\nActionTimeStamp:");
        stringBuffer.append(this.f57556g);
        stringBuffer.append("\r\nClickTab:");
        stringBuffer.append(this.f57557h);
        return stringBuffer.toString();
    }
}

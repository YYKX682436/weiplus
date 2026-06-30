package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsCoverPostStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60513d;

    /* renamed from: e, reason: collision with root package name */
    public int f60514e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60515f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60516g = "";

    @Override // jx3.a
    public int g() {
        return 23664;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60513d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60514e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60515f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60516g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ContentSource:");
        stringBuffer.append(this.f60513d);
        stringBuffer.append("\r\nContentType:");
        stringBuffer.append(this.f60514e);
        stringBuffer.append("\r\nPublishID:");
        stringBuffer.append(this.f60515f);
        stringBuffer.append("\r\nFinderFeedID:");
        stringBuffer.append(this.f60516g);
        return stringBuffer.toString();
    }
}

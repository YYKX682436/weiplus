package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class XFileOtherAppActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f63075d;

    /* renamed from: e, reason: collision with root package name */
    public long f63076e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63077f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f63078g = "";

    @Override // jx3.a
    public int g() {
        return 27653;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63075d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63076e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63077f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63078g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f63075d);
        stringBuffer.append("\r\nEnterScene:");
        stringBuffer.append(this.f63076e);
        stringBuffer.append("\r\nOtherInfo:");
        stringBuffer.append(this.f63077f);
        stringBuffer.append("\r\nFileFormat:");
        stringBuffer.append(this.f63078g);
        return stringBuffer.toString();
    }
}

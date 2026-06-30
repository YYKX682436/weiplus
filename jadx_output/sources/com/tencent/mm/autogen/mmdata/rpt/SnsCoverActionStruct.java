package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsCoverActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60508d;

    /* renamed from: e, reason: collision with root package name */
    public int f60509e;

    /* renamed from: g, reason: collision with root package name */
    public int f60511g;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60510f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60512h = "";

    @Override // jx3.a
    public int g() {
        return 23665;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60508d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60509e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60510f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60511g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60512h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f60508d);
        stringBuffer.append("\r\nContentType:");
        stringBuffer.append(this.f60509e);
        stringBuffer.append("\r\nOwnerUsername:");
        stringBuffer.append(this.f60510f);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f60511g);
        stringBuffer.append("\r\nFinderFeedID:");
        stringBuffer.append(this.f60512h);
        return stringBuffer.toString();
    }
}

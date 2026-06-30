package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class MPScreenShotOperationStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58901d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f58902e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f58903f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f58904g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f58905h = 0;

    @Override // jx3.a
    public int g() {
        return 34320;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58901d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58902e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58903f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58904g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58905h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("url:");
        stringBuffer.append(this.f58901d);
        stringBuffer.append("\r\nbiz:");
        stringBuffer.append(this.f58902e);
        stringBuffer.append("\r\nmid:");
        stringBuffer.append(this.f58903f);
        stringBuffer.append("\r\nidx:");
        stringBuffer.append(this.f58904g);
        stringBuffer.append("\r\nscreenshotType:");
        stringBuffer.append(this.f58905h);
        return stringBuffer.toString();
    }
}

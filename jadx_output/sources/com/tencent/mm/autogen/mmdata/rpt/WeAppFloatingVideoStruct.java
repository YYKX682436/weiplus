package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppFloatingVideoStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62274d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62275e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62276f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f62277g;

    /* renamed from: h, reason: collision with root package name */
    public long f62278h;

    @Override // jx3.a
    public int g() {
        return 18837;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62274d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62275e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62276f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62277g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62278h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f62274d);
        stringBuffer.append("\r\nPagePath:");
        stringBuffer.append(this.f62275e);
        stringBuffer.append("\r\nVideoUrl:");
        stringBuffer.append(this.f62276f);
        stringBuffer.append("\r\nEventId:");
        stringBuffer.append(this.f62277g);
        stringBuffer.append("\r\nEventNote:");
        stringBuffer.append(this.f62278h);
        return stringBuffer.toString();
    }
}

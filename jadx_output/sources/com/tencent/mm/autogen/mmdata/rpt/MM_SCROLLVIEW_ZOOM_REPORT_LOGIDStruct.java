package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class MM_SCROLLVIEW_ZOOM_REPORT_LOGIDStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58896d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f58897e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58898f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f58899g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f58900h;

    @Override // jx3.a
    public int g() {
        return 28134;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58896d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58897e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58898f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58899g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58900h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f58896d);
        stringBuffer.append("\r\nMediaType:");
        stringBuffer.append(this.f58897e);
        stringBuffer.append("\r\nActionAndScales:");
        stringBuffer.append(this.f58898f);
        stringBuffer.append("\r\nSnsFeedId:");
        stringBuffer.append(this.f58899g);
        stringBuffer.append("\r\nPicIndex:");
        stringBuffer.append(this.f58900h);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class AppBrandTaskBar_CloseStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55206d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f55207e;

    /* renamed from: f, reason: collision with root package name */
    public long f55208f;

    /* renamed from: g, reason: collision with root package name */
    public long f55209g;

    /* renamed from: h, reason: collision with root package name */
    public long f55210h;

    /* renamed from: i, reason: collision with root package name */
    public long f55211i;

    @Override // jx3.a
    public int g() {
        return 21929;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55206d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55207e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55208f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55209g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55210h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55211i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("session_id:");
        stringBuffer.append(this.f55206d);
        stringBuffer.append("\r\naction_type:");
        stringBuffer.append(this.f55207e);
        stringBuffer.append("\r\nlive_duration:");
        stringBuffer.append(this.f55208f);
        stringBuffer.append("\r\npage_type:");
        stringBuffer.append(this.f55209g);
        stringBuffer.append("\r\npage:");
        stringBuffer.append(this.f55210h);
        stringBuffer.append("\r\nlive_duration_ms:");
        stringBuffer.append(this.f55211i);
        return stringBuffer.toString();
    }
}

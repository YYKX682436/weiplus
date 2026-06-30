package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class RoomTodoHandleStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f60097e;

    /* renamed from: f, reason: collision with root package name */
    public long f60098f;

    /* renamed from: g, reason: collision with root package name */
    public long f60099g;

    /* renamed from: h, reason: collision with root package name */
    public long f60100h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60096d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60101i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60102j = "";

    @Override // jx3.a
    public int g() {
        return 19444;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60096d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60097e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60098f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60099g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60100h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60101i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60102j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomId:");
        stringBuffer.append(this.f60096d);
        stringBuffer.append("\r\nrole:");
        stringBuffer.append(this.f60097e);
        stringBuffer.append("\r\nmsgType:");
        stringBuffer.append(this.f60098f);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f60099g);
        stringBuffer.append("\r\nexit:");
        stringBuffer.append(this.f60100h);
        stringBuffer.append("\r\ntodoid:");
        stringBuffer.append(this.f60101i);
        stringBuffer.append("\r\nappusername:");
        stringBuffer.append(this.f60102j);
        return stringBuffer.toString();
    }
}

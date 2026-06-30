package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class OpenImMigrateStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59803d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59804e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f59805f;

    @Override // jx3.a
    public int g() {
        return 20246;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59803d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59804e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59805f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomID:");
        stringBuffer.append(this.f59803d);
        stringBuffer.append("\r\noldRoomID:");
        stringBuffer.append(this.f59804e);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f59805f);
        return stringBuffer.toString();
    }
}

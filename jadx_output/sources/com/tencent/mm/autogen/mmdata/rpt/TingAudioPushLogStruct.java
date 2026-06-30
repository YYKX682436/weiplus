package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class TingAudioPushLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61302d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61303e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61304f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61305g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61306h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f61307i = "";

    @Override // jx3.a
    public int g() {
        return 31046;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61302d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61303e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61304f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61305g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61306h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f61307i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f61302d);
        stringBuffer.append("\r\nPushType:");
        stringBuffer.append(this.f61303e);
        stringBuffer.append("\r\nUniqueId:");
        stringBuffer.append(this.f61304f);
        stringBuffer.append("\r\nPushTitle:");
        stringBuffer.append(this.f61305g);
        stringBuffer.append("\r\nPushDesc:");
        stringBuffer.append(this.f61306h);
        stringBuffer.append("\r\nVersion:0\r\nPushConfigTime:");
        stringBuffer.append(this.f61307i);
        return stringBuffer.toString();
    }
}

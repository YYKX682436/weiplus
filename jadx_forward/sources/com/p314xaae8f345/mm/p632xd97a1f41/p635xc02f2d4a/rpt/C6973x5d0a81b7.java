package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct */
/* loaded from: classes5.dex */
public final class C6973x5d0a81b7 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142835d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142836e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142837f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142838g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f142839h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f142840i = "";

    @Override // jx3.a
    public int g() {
        return 31046;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142835d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142836e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142837f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142838g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142839h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f142840i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f142835d);
        stringBuffer.append("\r\nPushType:");
        stringBuffer.append(this.f142836e);
        stringBuffer.append("\r\nUniqueId:");
        stringBuffer.append(this.f142837f);
        stringBuffer.append("\r\nPushTitle:");
        stringBuffer.append(this.f142838g);
        stringBuffer.append("\r\nPushDesc:");
        stringBuffer.append(this.f142839h);
        stringBuffer.append("\r\nVersion:0\r\nPushConfigTime:");
        stringBuffer.append(this.f142840i);
        return stringBuffer.toString();
    }
}

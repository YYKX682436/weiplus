package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryRevokeStruct */
/* loaded from: classes16.dex */
public final class C6871xb018e115 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f141883e;

    /* renamed from: h, reason: collision with root package name */
    public long f141886h;

    /* renamed from: i, reason: collision with root package name */
    public long f141887i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141882d = "";

    /* renamed from: f, reason: collision with root package name */
    public long f141884f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f141885g = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f141888j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f141889k = "";

    @Override // jx3.a
    public int g() {
        return 20542;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141882d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141883e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141884f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141885g);
        stringBuffer.append(",");
        stringBuffer.append(this.f141886h);
        stringBuffer.append(",");
        stringBuffer.append(this.f141887i);
        stringBuffer.append(",");
        stringBuffer.append(this.f141888j);
        stringBuffer.append(",");
        stringBuffer.append(this.f141889k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RoomId:");
        stringBuffer.append(this.f141882d);
        stringBuffer.append("\r\nOrigInvitedUV:");
        stringBuffer.append(this.f141883e);
        stringBuffer.append("\r\nAvailUV:");
        stringBuffer.append(this.f141884f);
        stringBuffer.append("\r\nOpt:");
        stringBuffer.append(this.f141885g);
        stringBuffer.append("\r\nToUV:");
        stringBuffer.append(this.f141886h);
        stringBuffer.append("\r\nFinalResult:");
        stringBuffer.append(this.f141887i);
        stringBuffer.append("\r\nHistoryID:");
        stringBuffer.append(this.f141888j);
        stringBuffer.append("\r\nToUsers:");
        stringBuffer.append(this.f141889k);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class ShareRoomHistoryRevokeStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f60350e;

    /* renamed from: h, reason: collision with root package name */
    public long f60353h;

    /* renamed from: i, reason: collision with root package name */
    public long f60354i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60349d = "";

    /* renamed from: f, reason: collision with root package name */
    public long f60351f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f60352g = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f60355j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f60356k = "";

    @Override // jx3.a
    public int g() {
        return 20542;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60349d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60350e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60351f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60352g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60353h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60354i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60355j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60356k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RoomId:");
        stringBuffer.append(this.f60349d);
        stringBuffer.append("\r\nOrigInvitedUV:");
        stringBuffer.append(this.f60350e);
        stringBuffer.append("\r\nAvailUV:");
        stringBuffer.append(this.f60351f);
        stringBuffer.append("\r\nOpt:");
        stringBuffer.append(this.f60352g);
        stringBuffer.append("\r\nToUV:");
        stringBuffer.append(this.f60353h);
        stringBuffer.append("\r\nFinalResult:");
        stringBuffer.append(this.f60354i);
        stringBuffer.append("\r\nHistoryID:");
        stringBuffer.append(this.f60355j);
        stringBuffer.append("\r\nToUsers:");
        stringBuffer.append(this.f60356k);
        return stringBuffer.toString();
    }
}

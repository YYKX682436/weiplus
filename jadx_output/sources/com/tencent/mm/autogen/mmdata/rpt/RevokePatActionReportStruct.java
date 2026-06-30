package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class RevokePatActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60012d;

    /* renamed from: e, reason: collision with root package name */
    public long f60013e;

    /* renamed from: f, reason: collision with root package name */
    public long f60014f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60015g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60016h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60017i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60018j = "";

    /* renamed from: k, reason: collision with root package name */
    public int f60019k;

    /* renamed from: l, reason: collision with root package name */
    public int f60020l;

    /* renamed from: m, reason: collision with root package name */
    public int f60021m;

    @Override // jx3.a
    public int g() {
        return 20590;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60012d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60013e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60014f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60015g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60016h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60017i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60018j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60019k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60020l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60021m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f60012d);
        stringBuffer.append("\r\nPatTime:");
        stringBuffer.append(this.f60013e);
        stringBuffer.append("\r\nRevokeTime:");
        stringBuffer.append(this.f60014f);
        stringBuffer.append("\r\nUserName:");
        stringBuffer.append(this.f60015g);
        stringBuffer.append("\r\nPattedUserName:");
        stringBuffer.append(this.f60016h);
        stringBuffer.append("\r\nPatSuffix:");
        stringBuffer.append(this.f60017i);
        stringBuffer.append("\r\nChatRoomName:");
        stringBuffer.append(this.f60018j);
        stringBuffer.append("\r\nRevokeMethod:");
        stringBuffer.append(this.f60019k);
        stringBuffer.append("\r\nIsSuccess:");
        stringBuffer.append(this.f60020l);
        stringBuffer.append("\r\nRevokeAction:");
        stringBuffer.append(this.f60021m);
        return stringBuffer.toString();
    }
}

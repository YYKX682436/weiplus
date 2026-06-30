package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class MessageSecurityStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59206d;

    /* renamed from: g, reason: collision with root package name */
    public long f59209g;

    /* renamed from: i, reason: collision with root package name */
    public long f59211i;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59207e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59208f = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f59210h = "";

    @Override // jx3.a
    public int g() {
        return 23344;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59206d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59207e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59208f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59209g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59210h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59211i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("msgid:");
        stringBuffer.append(this.f59206d);
        stringBuffer.append("\r\nChatName:");
        stringBuffer.append(this.f59207e);
        stringBuffer.append("\r\nSendUser:");
        stringBuffer.append(this.f59208f);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f59209g);
        stringBuffer.append("\r\nBanDetail:");
        stringBuffer.append(this.f59210h);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f59211i);
        return stringBuffer.toString();
    }
}

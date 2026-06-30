package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MessageSecurityStruct */
/* loaded from: classes9.dex */
public final class C6741x3e3982fc extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140739d;

    /* renamed from: g, reason: collision with root package name */
    public long f140742g;

    /* renamed from: i, reason: collision with root package name */
    public long f140744i;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140740e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140741f = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f140743h = "";

    @Override // jx3.a
    public int g() {
        return 23344;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140739d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140740e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140741f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140742g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140743h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140744i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("msgid:");
        stringBuffer.append(this.f140739d);
        stringBuffer.append("\r\nChatName:");
        stringBuffer.append(this.f140740e);
        stringBuffer.append("\r\nSendUser:");
        stringBuffer.append(this.f140741f);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f140742g);
        stringBuffer.append("\r\nBanDetail:");
        stringBuffer.append(this.f140743h);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f140744i);
        return stringBuffer.toString();
    }
}

package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct */
/* loaded from: classes9.dex */
public final class C7150xae2fbc94 extends jx3.a {

    /* renamed from: i, reason: collision with root package name */
    public cm.b1 f144588i;

    /* renamed from: j, reason: collision with root package name */
    public cm.a1 f144589j;

    /* renamed from: m, reason: collision with root package name */
    public cm.c1 f144592m;

    /* renamed from: n, reason: collision with root package name */
    public cm.d1 f144593n;

    /* renamed from: o, reason: collision with root package name */
    public cm.z0 f144594o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144583d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144584e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f144585f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f144586g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f144587h = "";

    /* renamed from: k, reason: collision with root package name */
    public long f144590k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f144591l = "";

    @Override // jx3.a
    public int g() {
        return 16024;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144583d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144584e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144585f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144586g);
        stringBuffer.append(",");
        stringBuffer.append(this.f144587h);
        stringBuffer.append(",");
        cm.b1 b1Var = this.f144588i;
        stringBuffer.append(b1Var != null ? b1Var.f124570d : -1);
        stringBuffer.append(",");
        cm.a1 a1Var = this.f144589j;
        stringBuffer.append(a1Var != null ? a1Var.f124556d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f144590k);
        stringBuffer.append(",");
        stringBuffer.append(this.f144591l);
        stringBuffer.append(",");
        cm.c1 c1Var = this.f144592m;
        stringBuffer.append(c1Var != null ? c1Var.f124582d : -1);
        stringBuffer.append(",");
        cm.d1 d1Var = this.f144593n;
        stringBuffer.append(d1Var != null ? d1Var.f124595d : -1);
        stringBuffer.append(",");
        cm.z0 z0Var = this.f144594o;
        stringBuffer.append(z0Var != null ? z0Var.f124811d : -1);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f144583d);
        stringBuffer.append("\r\nPageId:");
        stringBuffer.append(this.f144584e);
        stringBuffer.append("\r\nActionTimeStampMs:");
        stringBuffer.append(this.f144585f);
        stringBuffer.append("\r\nShareTicket:");
        stringBuffer.append(this.f144586g);
        stringBuffer.append("\r\nChattingId:");
        stringBuffer.append(this.f144587h);
        stringBuffer.append("\r\nIsGroupChatting:");
        stringBuffer.append(this.f144588i);
        stringBuffer.append("\r\nEventId:");
        stringBuffer.append(this.f144589j);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f144590k);
        stringBuffer.append("\r\nSceneNote:");
        stringBuffer.append(this.f144591l);
        stringBuffer.append("\r\nMsgState:");
        stringBuffer.append(this.f144592m);
        stringBuffer.append("\r\nSubScribeState:");
        stringBuffer.append(this.f144593n);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f144594o);
        return stringBuffer.toString();
    }
}

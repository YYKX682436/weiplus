package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WxaUpdatableMsgReportStruct extends jx3.a {

    /* renamed from: i, reason: collision with root package name */
    public cm.b1 f63055i;

    /* renamed from: j, reason: collision with root package name */
    public cm.a1 f63056j;

    /* renamed from: m, reason: collision with root package name */
    public cm.c1 f63059m;

    /* renamed from: n, reason: collision with root package name */
    public cm.d1 f63060n;

    /* renamed from: o, reason: collision with root package name */
    public cm.z0 f63061o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63050d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63051e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f63052f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f63053g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f63054h = "";

    /* renamed from: k, reason: collision with root package name */
    public long f63057k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f63058l = "";

    @Override // jx3.a
    public int g() {
        return 16024;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63050d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63051e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63052f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63053g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63054h);
        stringBuffer.append(",");
        cm.b1 b1Var = this.f63055i;
        stringBuffer.append(b1Var != null ? b1Var.f43037d : -1);
        stringBuffer.append(",");
        cm.a1 a1Var = this.f63056j;
        stringBuffer.append(a1Var != null ? a1Var.f43023d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f63057k);
        stringBuffer.append(",");
        stringBuffer.append(this.f63058l);
        stringBuffer.append(",");
        cm.c1 c1Var = this.f63059m;
        stringBuffer.append(c1Var != null ? c1Var.f43049d : -1);
        stringBuffer.append(",");
        cm.d1 d1Var = this.f63060n;
        stringBuffer.append(d1Var != null ? d1Var.f43062d : -1);
        stringBuffer.append(",");
        cm.z0 z0Var = this.f63061o;
        stringBuffer.append(z0Var != null ? z0Var.f43278d : -1);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f63050d);
        stringBuffer.append("\r\nPageId:");
        stringBuffer.append(this.f63051e);
        stringBuffer.append("\r\nActionTimeStampMs:");
        stringBuffer.append(this.f63052f);
        stringBuffer.append("\r\nShareTicket:");
        stringBuffer.append(this.f63053g);
        stringBuffer.append("\r\nChattingId:");
        stringBuffer.append(this.f63054h);
        stringBuffer.append("\r\nIsGroupChatting:");
        stringBuffer.append(this.f63055i);
        stringBuffer.append("\r\nEventId:");
        stringBuffer.append(this.f63056j);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f63057k);
        stringBuffer.append("\r\nSceneNote:");
        stringBuffer.append(this.f63058l);
        stringBuffer.append("\r\nMsgState:");
        stringBuffer.append(this.f63059m);
        stringBuffer.append("\r\nSubScribeState:");
        stringBuffer.append(this.f63060n);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f63061o);
        return stringBuffer.toString();
    }
}

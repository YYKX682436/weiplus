package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class MuteRoomStayTimeStruct extends jx3.a {

    /* renamed from: p, reason: collision with root package name */
    public long f59447p;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59435d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f59436e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f59437f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f59438g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f59439h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f59440i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f59441j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f59442k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f59443l = "";

    /* renamed from: m, reason: collision with root package name */
    public long f59444m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f59445n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f59446o = 0;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f59448q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f59449r = "";

    @Override // jx3.a
    public int g() {
        return 12077;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59435d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59436e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59437f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59438g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59439h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59440i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59441j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59442k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59443l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59444m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59445n);
        stringBuffer.append(",");
        stringBuffer.append(this.f59446o);
        stringBuffer.append(",");
        stringBuffer.append(this.f59447p);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f59448q);
        stringBuffer.append(",");
        stringBuffer.append(this.f59449r);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatRoomID:");
        stringBuffer.append(this.f59435d);
        stringBuffer.append("\r\nStayTime:");
        stringBuffer.append(this.f59436e);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f59437f);
        stringBuffer.append("\r\nReceiveMsgCount:");
        stringBuffer.append(this.f59438g);
        stringBuffer.append("\r\nSendMsgCount:");
        stringBuffer.append(this.f59439h);
        stringBuffer.append("\r\nUnReadMsgCount:");
        stringBuffer.append(this.f59440i);
        stringBuffer.append("\r\nUnreadTipStatus:");
        stringBuffer.append(this.f59441j);
        stringBuffer.append("\r\nisMuteRoom:");
        stringBuffer.append(this.f59442k);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f59443l);
        stringBuffer.append("\r\nisRingBlue:");
        stringBuffer.append(this.f59444m);
        stringBuffer.append("\r\nEnterScene:");
        stringBuffer.append(this.f59445n);
        stringBuffer.append("\r\nredType:");
        stringBuffer.append(this.f59446o);
        stringBuffer.append("\r\nInGroupBox:");
        stringBuffer.append(this.f59447p);
        stringBuffer.append("\r\nEnterTimeMs:0\r\nExitTimeMs:0\r\nHasSlideInChatUI:0\r\nHasReachedPrevMsgs:");
        stringBuffer.append(this.f59448q);
        stringBuffer.append("\r\nRedWord:");
        stringBuffer.append(this.f59449r);
        return stringBuffer.toString();
    }
}

package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class GameChatRoomReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58321d;

    /* renamed from: e, reason: collision with root package name */
    public long f58322e;

    /* renamed from: f, reason: collision with root package name */
    public long f58323f;

    /* renamed from: g, reason: collision with root package name */
    public long f58324g;

    /* renamed from: h, reason: collision with root package name */
    public long f58325h;

    /* renamed from: i, reason: collision with root package name */
    public long f58326i;

    /* renamed from: j, reason: collision with root package name */
    public long f58327j;

    /* renamed from: m, reason: collision with root package name */
    public long f58330m;

    /* renamed from: q, reason: collision with root package name */
    public long f58334q;

    /* renamed from: s, reason: collision with root package name */
    public long f58336s;

    /* renamed from: t, reason: collision with root package name */
    public int f58337t;

    /* renamed from: v, reason: collision with root package name */
    public long f58339v;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f58328k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f58329l = "";

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f58331n = "";

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f58332o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f58333p = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f58335r = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f58338u = "";

    @Override // jx3.a
    public int g() {
        return 23070;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58321d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58322e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58323f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58324g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58325h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58326i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58327j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58328k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58329l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58330m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58331n);
        stringBuffer.append(",");
        stringBuffer.append(this.f58332o);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58333p);
        stringBuffer.append(",");
        stringBuffer.append(this.f58334q);
        stringBuffer.append(",");
        stringBuffer.append(this.f58335r);
        stringBuffer.append(",");
        stringBuffer.append(this.f58336s);
        stringBuffer.append(",");
        stringBuffer.append(this.f58337t);
        stringBuffer.append(",");
        stringBuffer.append(this.f58338u);
        stringBuffer.append(",");
        stringBuffer.append(this.f58339v);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SceneID:");
        stringBuffer.append(this.f58321d);
        stringBuffer.append("\r\nUIArea:");
        stringBuffer.append(this.f58322e);
        stringBuffer.append("\r\nPositionID:");
        stringBuffer.append(this.f58323f);
        stringBuffer.append("\r\nActionID:");
        stringBuffer.append(this.f58324g);
        stringBuffer.append("\r\nActionStatus:");
        stringBuffer.append(this.f58325h);
        stringBuffer.append("\r\nSsid:");
        stringBuffer.append(this.f58326i);
        stringBuffer.append("\r\nSourceID:");
        stringBuffer.append(this.f58327j);
        stringBuffer.append("\r\nGameID:");
        stringBuffer.append(this.f58328k);
        stringBuffer.append("\r\nChatroomID:");
        stringBuffer.append(this.f58329l);
        stringBuffer.append("\r\nMessageID:");
        stringBuffer.append(this.f58330m);
        stringBuffer.append("\r\nGameLeval:");
        stringBuffer.append(this.f58331n);
        stringBuffer.append("\r\nGameTitle:");
        stringBuffer.append(this.f58332o);
        stringBuffer.append("\r\nUserState:0\r\nUsername:");
        stringBuffer.append(this.f58333p);
        stringBuffer.append("\r\nStayTime:");
        stringBuffer.append(this.f58334q);
        stringBuffer.append("\r\nExternInfo:");
        stringBuffer.append(this.f58335r);
        stringBuffer.append("\r\nNoticeID:");
        stringBuffer.append(this.f58336s);
        stringBuffer.append("\r\nTalkTab:");
        stringBuffer.append(this.f58337t);
        stringBuffer.append("\r\nsession_id:");
        stringBuffer.append(this.f58338u);
        stringBuffer.append("\r\nclient_timestamp:");
        stringBuffer.append(this.f58339v);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct p(java.lang.String str) {
        this.f58329l = b("ChatroomID", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct q(java.lang.String str) {
        this.f58328k = b("GameID", str, true);
        return this;
    }
}

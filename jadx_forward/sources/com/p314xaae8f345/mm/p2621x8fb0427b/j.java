package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class j extends com.p314xaae8f345.mm.p2621x8fb0427b.f {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f276570c = {"CREATE TABLE IF NOT EXISTS appbrandmessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT, transBrandWording TEXT ) ", "CREATE INDEX IF NOT EXISTS  appbrandmessageSvrIdIndex ON appbrandmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  appbrandmessageTalkerIndex ON appbrandmessage ( talker )", "CREATE INDEX IF NOT EXISTS  appbrandmessageTalerStatusIndex ON appbrandmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  appbrandmessageCreateTimeIndex ON appbrandmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  appbrandmessageCreateTaklerTimeIndex ON appbrandmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  appbrandmessageSendCreateTimeIndex ON appbrandmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  appbrandmessageTalkerTypeIndex ON appbrandmessage ( talker,type )"};

    public j(xg3.m0 m0Var) {
        super(m0Var);
        g(d(), "appbrandmessage");
        a(new xg3.k0(256, "appbrandmessage", xg3.k0.a(3000001L, 3500000L, 102000001L, 105000000L, -1L, -1L)));
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.f
    public java.lang.String f(java.lang.String str) {
        iz5.a.g(null, str != null && str.length() > 0);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str)) {
            return "appbrandmessage";
        }
        return null;
    }
}

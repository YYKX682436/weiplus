package c63;

/* loaded from: classes11.dex */
public final class m extends com.p314xaae8f345.mm.p2621x8fb0427b.f {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f121008c;

    static {
        ((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).getClass();
        l75.e0 e0Var = bt1.b.f105678y1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e0Var, "<get-info>(...)");
        f121008c = new java.lang.String[]{l75.n0.m145250x3fdc6f77(e0Var, "gamelifemessage"), "CREATE INDEX IF NOT EXISTS  gamelifemessageSvrIdIndex ON gamelifemessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  gamelifemessageTalkerIndex ON gamelifemessage ( talker )", "CREATE INDEX IF NOT EXISTS  gamelifemessageTalkerStatusIndex ON gamelifemessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  gamelifemessageCreateTimeIndex ON gamelifemessage ( createTime )", "CREATE INDEX IF NOT EXISTS  gamelifemessageCreateTalkerTimeIndex ON gamelifemessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  gamelifemessageSendCreateTimeIndex ON gamelifemessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  gamelifemessageTalkerTypeIndex ON gamelifemessage ( talker,type )"};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(xg3.m0 storage) {
        super(storage);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        g(d(), "gamelifemessage");
        a(new xg3.k0(1024, "gamelifemessage", xg3.k0.a(4500001L, 5000000L, 208000001L, 308000000L, -1L, -1L)));
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.f
    public java.lang.String f(java.lang.String str) {
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        iz5.a.g(null, z17);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(str)) {
            return "gamelifemessage";
        }
        return null;
    }
}

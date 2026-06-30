package we0;

/* loaded from: classes.dex */
public final class r1 implements d95.c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final we0.r1 f526689a = new we0.r1();

    @Override // d95.c0
    public final java.lang.String[] a() {
        java.lang.String m145250x3fdc6f77 = l75.n0.m145250x3fdc6f77(bt1.b.f105678y1, "textstatusmessage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m145250x3fdc6f77, "getCreateSQLs(...)");
        return new java.lang.String[]{m145250x3fdc6f77, "CREATE INDEX IF NOT EXISTS  textstatusmessageSvrIdIndex ON textstatusmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  textstatusmessageTalkerIndex ON textstatusmessage ( talker )", "CREATE INDEX IF NOT EXISTS  textstatusmessageTalkerStatusIndex ON textstatusmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  textstatusmessageCreateTimeIndex ON textstatusmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  textstatusmessageCreateTalkerTimeIndex ON textstatusmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  textstatusmessageSendCreateTimeIndex ON textstatusmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  textstatusmessageTalkerTypeIndex ON textstatusmessage ( talker,type )"};
    }
}

package b92;

/* loaded from: classes.dex */
public final class a implements d95.c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b92.a f99893a = new b92.a();

    @Override // d95.c0
    public final java.lang.String[] a() {
        ((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).getClass();
        l75.e0 e0Var = bt1.b.f105678y1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e0Var, "<get-info>(...)");
        java.lang.String m145250x3fdc6f77 = l75.n0.m145250x3fdc6f77(e0Var, "findermessage006");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m145250x3fdc6f77, "getCreateSQLs(...)");
        return new java.lang.String[]{m145250x3fdc6f77, "CREATE INDEX IF NOT EXISTS  findermessage006SvrIdIndex ON findermessage006 ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  findermessage006TalkerIndex ON findermessage006 ( talker )", "CREATE INDEX IF NOT EXISTS  findermessage006TalkerStatusIndex ON findermessage006 ( talker,status )", "CREATE INDEX IF NOT EXISTS  findermessage006CreateTimeIndex ON findermessage006 ( createTime )", "CREATE INDEX IF NOT EXISTS  findermessage006CreateTalkerTimeIndex ON findermessage006 ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  findermessage006SendCreateTimeIndex ON findermessage006 ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  findermessage006TalkerTypeIndex ON findermessage006 ( talker,type )"};
    }
}

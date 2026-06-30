package xw;

/* loaded from: classes.dex */
public class x implements d95.c0 {
    public x(xw.a0 a0Var) {
    }

    @Override // d95.c0
    public java.lang.String[] a() {
        ((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).getClass();
        l75.e0 e0Var = bt1.b.f105678y1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e0Var, "<get-info>(...)");
        java.lang.String m145250x3fdc6f77 = l75.n0.m145250x3fdc6f77(e0Var, "picfansmsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m145250x3fdc6f77, "getCreateSQLs(...)");
        return new java.lang.String[]{m145250x3fdc6f77, "CREATE INDEX IF NOT EXISTS  picfansmsgSvrIdIndex ON picfansmsg ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  picfansmsgTalkerIndex ON picfansmsg ( talker )", "CREATE INDEX IF NOT EXISTS  picfansmsgTalkerStatusIndex ON picfansmsg ( talker,status )", "CREATE INDEX IF NOT EXISTS  picfansmsgCreateTimeIndex ON picfansmsg ( createTime )", "CREATE INDEX IF NOT EXISTS  picfansmsgCreateTalkerTimeIndex ON picfansmsg ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  picfansmsgSendCreateTimeIndex ON picfansmsg ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  picfansmsgTalkerTypeIndex ON picfansmsg ( talker,type )"};
    }
}

package xw;

/* loaded from: classes.dex */
public class w implements d95.c0 {
    public w(xw.a0 a0Var) {
    }

    @Override // d95.c0
    public java.lang.String[] a() {
        ((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).getClass();
        l75.e0 e0Var = bt1.b.f105678y1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e0Var, "<get-info>(...)");
        java.lang.String m145250x3fdc6f77 = l75.n0.m145250x3fdc6f77(e0Var, "bizfansmessage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m145250x3fdc6f77, "getCreateSQLs(...)");
        return new java.lang.String[]{m145250x3fdc6f77, "CREATE INDEX IF NOT EXISTS  bizfansmessageSvrIdIndex ON bizfansmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  bizfansmessageTalkerIndex ON bizfansmessage ( talker )", "CREATE INDEX IF NOT EXISTS  bizfansmessageTalkerStatusIndex ON bizfansmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  bizfansmessageCreateTimeIndex ON bizfansmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  bizfansmessageCreateTalkerTimeIndex ON bizfansmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  bizfansmessageSendCreateTimeIndex ON bizfansmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  bizfansmessageTalkerTypeIndex ON bizfansmessage ( talker,type )"};
    }
}

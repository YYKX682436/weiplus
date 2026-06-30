package tg3;

/* loaded from: classes5.dex */
public abstract class q1 {
    public static final void a(com.p314xaae8f345.mm.p2621x8fb0427b.i9 i9Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        tg3.o1 o1Var = tg3.p1.f500739a;
        java.lang.String Q0 = msgInfo.Q0();
        long m124847x74d37ac6 = msgInfo.m124847x74d37ac6();
        if (Q0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgProcessingManager", "msgTalker is null, msgId: " + m124847x74d37ac6);
        } else {
            i9Var.f276565m = java.lang.System.currentTimeMillis();
            java.lang.String c17 = o1Var.c(Q0, m124847x74d37ac6);
            tg3.p1.f500742d.d(c17, i9Var);
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) tg3.p1.f500741c).mo141623x754a37bb()).H(c17, i9Var.mo14344x5f01b1f6());
        }
    }
}

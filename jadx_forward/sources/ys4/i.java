package ys4;

/* loaded from: classes2.dex */
public final class i extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public i(java.lang.String guardian, java.lang.String sessionId, java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(guardian, "guardian");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152198b = new r45.qx6();
        lVar.f152199c = "/cgi-bin/mmpay-bin/pa/verifyparent";
        lVar.f152200d = 4815;
        r45.px6 px6Var = new r45.px6();
        px6Var.f465000d = guardian;
        px6Var.f465001e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q0(sessionId, 0L);
        px6Var.f465002f = message;
        lVar.f152197a = px6Var;
        p(lVar.a());
    }
}

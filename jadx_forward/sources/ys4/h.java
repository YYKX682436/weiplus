package ys4;

/* loaded from: classes4.dex */
public final class h extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public h(java.lang.String guardian, java.lang.String sessionId, java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(guardian, "guardian");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152198b = new r45.rj5();
        lVar.f152199c = "/cgi-bin/mmpay-bin/tenpay/realnameverifyguardian";
        lVar.f152200d = 4877;
        r45.qj5 qj5Var = new r45.qj5();
        qj5Var.f465587d = guardian;
        qj5Var.f465588e = sessionId;
        qj5Var.f465589f = message;
        lVar.f152197a = qj5Var;
        p(lVar.a());
    }
}

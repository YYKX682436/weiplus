package db2;

/* loaded from: classes.dex */
public final class a2 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(int i17, java.lang.String finderUsername, java.util.LinkedList sensitiveWords) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sensitiveWords, "sensitiveWords");
        r45.a92 a92Var = new r45.a92();
        a92Var.set(1, db2.t4.f309704a.a(11726));
        a92Var.set(2, java.lang.Integer.valueOf(i17));
        a92Var.set(4, finderUsername);
        a92Var.set(3, sensitiveWords);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = a92Var;
        r45.b92 b92Var = new r45.b92();
        b92Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) b92Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = b92Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivesensitivewordmanage";
        lVar.f152200d = 11726;
        p(lVar.a());
    }
}

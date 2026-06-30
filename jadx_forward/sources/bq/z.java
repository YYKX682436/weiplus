package bq;

/* loaded from: classes10.dex */
public final class z extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(dm.pd mention, int i17, r45.qt2 contextObj) {
        super(contextObj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6618;
        r45.u31 u31Var = new r45.u31();
        u31Var.set(1, java.lang.Long.valueOf(mention.f66090x2fc02651));
        u31Var.set(2, java.lang.Integer.valueOf(i17));
        u31Var.set(3, db2.t4.f309704a.b(6618, contextObj));
        u31Var.set(4, xy2.c.f(contextObj));
        lVar.f152197a = u31Var;
        r45.t31 t31Var = new r45.t31();
        t31Var.set(0, new r45.ie());
        lVar.f152198b = t31Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderfollowverify";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFollowVerifyCgi", "init id:" + mention.f66095xc8a07680 + ", " + u31Var.m75942xfb822ef2(1) + " opType " + i17);
    }

    @Override // bq.e, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }
}

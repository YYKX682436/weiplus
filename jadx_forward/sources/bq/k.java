package bq;

/* loaded from: classes.dex */
public final class k extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r45.qt2 qt2Var, java.lang.String finderUsername, r45.xw4 item) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ax0 ax0Var = new r45.ax0();
        ax0Var.set(1, db2.t4.f309704a.b(9468, qt2Var));
        ax0Var.set(2, finderUsername);
        java.util.LinkedList m75941xfb821914 = ax0Var.m75941xfb821914(3);
        if (m75941xfb821914 != null) {
            m75941xfb821914.add(item);
        }
        lVar.f152197a = ax0Var;
        r45.bx0 bx0Var = new r45.bx0();
        bx0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) bx0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = bx0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderclientnotify";
        lVar.f152200d = 9468;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderClientNotifyCGI", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.bx0 resp = (r45.bx0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderClientNotifyCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}

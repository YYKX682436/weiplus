package db2;

/* loaded from: classes2.dex */
public final class a0 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String userName, r45.h32 noticeInfo, int i17, r45.qt2 qt2Var) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeInfo, "noticeInfo");
        r45.g01 g01Var = new r45.g01();
        g01Var.set(2, userName);
        g01Var.set(3, noticeInfo);
        g01Var.set(4, java.lang.Integer.valueOf(i17));
        g01Var.set(1, db2.t4.f309704a.b(6653, qt2Var));
        r45.kv0 kv0Var = (r45.kv0) g01Var.m75936x14adae67(1);
        if (kv0Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0));
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = g01Var;
        r45.h01 h01Var = new r45.h01();
        h01Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) h01Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = h01Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercreatelivenotice";
        lVar.f152200d = 6653;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.h01 resp = (r45.h01) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.CgiFinderCreateLiveNotice", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}

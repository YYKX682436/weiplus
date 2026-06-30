package db2;

/* loaded from: classes.dex */
public final class t extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.util.LinkedList mentionIdList, int i17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mentionIdList, "mentionIdList");
        r45.lv0 lv0Var = new r45.lv0();
        lv0Var.set(1, db2.t4.f309704a.b(8546, qt2Var));
        lv0Var.set(2, qt2Var != null ? xy2.c.f(qt2Var) : null);
        lv0Var.set(3, mentionIdList);
        lv0Var.set(4, java.lang.Integer.valueOf(i17));
        r45.mv0 mv0Var = new r45.mv0();
        mv0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) mv0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = lv0Var;
        lVar.f152198b = mv0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderbatchgetmentioninfo";
        lVar.f152200d = 8546;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderBatchGetMentionInfo", "init userName = " + lv0Var.m75945x2fec8307(2) + ", mentionIdList:" + mentionIdList.size());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.mv0 resp = (r45.mv0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderBatchGetMentionInfo", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}

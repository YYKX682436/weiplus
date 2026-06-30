package db2;

/* loaded from: classes.dex */
public final class o extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309636t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String userName, java.lang.String noticeId, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        this.f309636t = "Finder.CgiFinderAdLiveNotice";
        r45.rt0 rt0Var = new r45.rt0();
        rt0Var.set(2, userName);
        rt0Var.set(1, noticeId);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = rt0Var;
        r45.st0 st0Var = new r45.st0();
        st0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) st0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = st0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderadlivenotice";
        lVar.f152200d = 4164;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderAdLiveNotice", "init userName:" + userName + ", noticeId:" + noticeId);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.st0 resp = (r45.st0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ';
        java.lang.String str3 = this.f309636t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0 && resp.m75939xb282bd08(2) > 0) {
            ((vd2.j1) ((zy2.x7) i95.n0.c(zy2.x7.class))).f517303d = resp.m75939xb282bd08(2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "requestInterval " + resp.m75939xb282bd08(2));
        }
    }
}

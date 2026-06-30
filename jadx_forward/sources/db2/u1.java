package db2;

/* loaded from: classes.dex */
public final class u1 extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f309720m;

    public u1(java.util.List nicknameList, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nicknameList, "nicknameList");
        this.f309720m = "Finder.CgiFinderGetUser";
        r45.ta1 ta1Var = new r45.ta1();
        ta1Var.m75941xfb821914(3).addAll(nicknameList);
        if (str != null) {
            ta1Var.set(4, str);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ta1Var;
        r45.ua1 ua1Var = new r45.ua1();
        ua1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ua1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ua1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetuser";
        lVar.f152200d = 3512;
        p(lVar.a());
        java.lang.String str2 = (java.lang.String) kz5.n0.Z(nicknameList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetUser", "init nickname:".concat(str2 == null ? "" : str2));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ua1 resp = (r45.ua1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309720m, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}

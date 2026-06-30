package ek2;

/* loaded from: classes.dex */
public final class o2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335044u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.n2 f335045v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.yb2 f335046w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(long j17, long j18, java.lang.String nonceId, java.lang.String anchorUsername, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.LinkedList syncReqList, java.lang.String str2, ek2.n2 n2Var, r45.qt2 qt2Var) {
        super(qt2Var);
        java.lang.String str3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUsername, "anchorUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(syncReqList, "syncReqList");
        this.f335044u = "Finder.CgiFinderLiveSyncExtraInfo";
        this.f335045v = n2Var;
        r45.yb2 yb2Var = new r45.yb2();
        this.f335046w = yb2Var;
        boolean z17 = true;
        yb2Var.set(1, db2.t4.f309704a.b(5971, qt2Var));
        yb2Var.set(6, java.lang.Long.valueOf(j17));
        yb2Var.set(5, java.lang.Long.valueOf(j18));
        yb2Var.set(2, anchorUsername);
        yb2Var.set(3, str);
        yb2Var.set(4, gVar);
        yb2Var.set(7, syncReqList);
        yb2Var.set(8, nonceId);
        gk2.e eVar = gk2.e.f354004n;
        yb2Var.set(10, (eVar == null || (str3 = ((mm2.c1) eVar.a(mm2.c1.class)).f410324d3) == null) ? "" : str3);
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            yb2Var.set(9, com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str2));
        }
        yb2Var.set(11, zl2.q4.d(zl2.q4.f555466a, null, null, 3, null));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = yb2Var;
        r45.zb2 zb2Var = new r45.zb2();
        zb2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) zb2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = zb2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivesyncextrainfo";
        lVar.f152200d = 5971;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveSyncExtraInfo", "init " + yb2Var.m75942xfb822ef2(6) + ", " + yb2Var.m75942xfb822ef2(5) + ", " + yb2Var.m75945x2fec8307(8) + ", ux_info:" + yb2Var.m75934xbce7f2f(9));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.zb2 resp = (r45.zb2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335044u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.n2 n2Var = this.f335045v;
        if (n2Var != null) {
            n2Var.a(this, i17, i18, str, resp);
        }
    }
}

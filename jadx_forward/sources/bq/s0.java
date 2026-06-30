package bq;

/* loaded from: classes.dex */
public final class s0 extends bq.e {
    public s0(r45.qt2 qt2Var, long j17, long j18, long j19, java.lang.String str, java.lang.String str2) {
        super(qt2Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.u81 u81Var = new r45.u81();
        db2.t4 t4Var = db2.t4.f309704a;
        u81Var.set(1, t4Var.b(14158, qt2Var));
        if (str != null) {
            t4Var.j((r45.kv0) u81Var.m75936x14adae67(1), j19, str);
        }
        u81Var.set(2, java.lang.Long.valueOf(j17));
        u81Var.set(3, java.lang.Long.valueOf(j18));
        u81Var.set(4, 1);
        r45.kv0 kv0Var = (r45.kv0) u81Var.m75936x14adae67(1);
        if (kv0Var != null) {
            r45.tj2 tj2Var = new r45.tj2();
            tj2Var.set(1, str2);
            tj2Var.set(0, java.lang.Long.valueOf(j17));
            kv0Var.set(15, tj2Var);
        }
        lVar.f152197a = u81Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCgi", "dramaSessionBuffer FinderGetNativeDramaInfoCgi " + pm0.v.u(j17) + ' ' + str2);
        r45.v81 v81Var = new r45.v81();
        v81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) v81Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = v81Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetnativedramainfo";
        lVar.f152200d = 14158;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nativeDramaCgi_findergetnativedramainfo commentScene ");
        r45.kv0 kv0Var2 = (r45.kv0) u81Var.m75936x14adae67(1);
        sb6.append(kv0Var2 != null ? java.lang.Integer.valueOf(kv0Var2.m75939xb282bd08(1)) : null);
        sb6.append(" enterObjectId ");
        sb6.append(pm0.v.u(j19));
        sb6.append(" buffer ");
        sb6.append(str != null ? pm0.v.e0(str, str.length() - 8, str.length()) : null);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209175cd).mo141623x754a37bb()).r()).booleanValue() && j19 != 0) {
            pm0.v.X(new bq.r0(sb7));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCgi", sb7);
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCgi", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }
}

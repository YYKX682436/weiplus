package db2;

/* loaded from: classes10.dex */
public final class t3 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final db2.k6 f309702t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f309703u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(db2.k6 params, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f309702t = params;
        this.f309703u = "Finder.CgiFinderThank";
        r45.sz2 sz2Var = new r45.sz2();
        java.lang.String str = params.f309577b;
        sz2Var.set(2, str);
        sz2Var.set(3, java.lang.Integer.valueOf(params.f309579d));
        sz2Var.set(6, java.lang.Integer.valueOf(params.f309576a ? 1 : 2));
        java.lang.String str2 = params.f309578c;
        sz2Var.set(4, str2);
        sz2Var.set(7, java.lang.Integer.valueOf(params.f309580e));
        java.lang.Long l17 = params.f309581f;
        if (l17 != null) {
            sz2Var.set(5, java.lang.Long.valueOf(l17.longValue()));
        }
        java.lang.Long l18 = params.f309582g;
        if (l18 != null) {
            sz2Var.set(8, java.lang.Long.valueOf(l18.longValue()));
        }
        r45.nv2 nv2Var = params.f309583h;
        if (nv2Var != null) {
            sz2Var.set(9, nv2Var);
        }
        sz2Var.set(1, db2.t4.f309704a.b(3867, qt2Var));
        r45.kv0 kv0Var = (r45.kv0) sz2Var.m75936x14adae67(1);
        if (kv0Var != null) {
            r45.qt2 qt2Var2 = this.f97668n;
            kv0Var.set(1, java.lang.Integer.valueOf(qt2Var2 != null ? qt2Var2.m75939xb282bd08(5) : 0));
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = sz2Var;
        r45.tz2 tz2Var = new r45.tz2();
        tz2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tz2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = tz2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderthank";
        lVar.f152200d = 7283;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderThank init, username=");
        sb6.append(str);
        sb6.append(" opType=");
        sb6.append(sz2Var.m75939xb282bd08(6));
        sb6.append(" scene=");
        r45.kv0 kv0Var2 = (r45.kv0) sz2Var.m75936x14adae67(1);
        sb6.append(kv0Var2 != null ? java.lang.Integer.valueOf(kv0Var2.m75939xb282bd08(1)) : null);
        sb6.append(" wxUsername=");
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderThank", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.tz2 resp = (r45.tz2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.String str2 = this.f309703u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onCgiEnd errType " + i17 + ", errCode " + i18 + ", errMsg " + str + ' ');
        if (i17 == 0 && i18 == 0) {
            db2.k6 k6Var = this.f309702t;
            java.lang.Long l17 = k6Var.f309581f;
            dm.pd pdVar = null;
            if (l17 != null) {
                long longValue = l17.longValue();
                l75.n0 fk6 = ((c61.l7) i95.n0.c(c61.l7.class)).fk(2);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int i19 = dm.x4.f322559a3;
                sb6.append("SELECT rowid, * FROM ".concat("FinderIdentityMsg"));
                sb6.append(" WHERE svrMentionId = ");
                sb6.append(longValue);
                android.database.Cursor m145256x1d3f4980 = fk6.m145256x1d3f4980(sb6.toString(), new java.lang.String[0]);
                if (m145256x1d3f4980 != null) {
                    try {
                        if (m145256x1d3f4980.moveToNext()) {
                            dm.pd pdVar2 = new dm.pd();
                            pdVar2.mo9015xbf5d97fd(m145256x1d3f4980);
                            vz5.b.a(m145256x1d3f4980, null);
                            pdVar = pdVar2;
                        } else {
                            vz5.b.a(m145256x1d3f4980, null);
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            vz5.b.a(m145256x1d3f4980, th6);
                            throw th7;
                        }
                    }
                }
            }
            if (pdVar != null) {
                int i27 = pdVar.f66082x26b1b2e8;
                pdVar.f66082x26b1b2e8 = k6Var.f309576a ? i27 | 32 : i27 & (-33);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "CgiFinderThank updateExtFlag mentionId=" + pdVar.f66124x65f321b + " originalFlag=" + i27 + " newFlag=" + pdVar.f66082x26b1b2e8);
                cu2.b0.f303904a.l(pdVar, 1);
            }
        }
    }
}

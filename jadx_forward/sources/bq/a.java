package bq;

/* loaded from: classes10.dex */
public final class a extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final r45.m81 f105006t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, int i18, java.lang.String username, boolean z17) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        r45.m81 m81Var = new r45.m81();
        this.f105006t = m81Var;
        m81Var.set(6, java.lang.Integer.valueOf(i18));
        if (z17) {
            m81Var.set(9, 1);
        } else {
            bq.p0 p0Var = bq.q0.f105046t;
            if (p0Var.b()) {
                m81Var.set(10, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bq.p0.e(p0Var, i17, i18, username, false, 8, null)));
                m81Var.set(9, 1);
            } else {
                m81Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bq.p0.e(p0Var, i17, i18, username, false, 8, null)));
                m81Var.set(9, 0);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doScene, isNewType: ");
        sb6.append(bq.q0.f105046t.b());
        sb6.append(", pageBuffer: ");
        sb6.append(m81Var.m75934xbce7f2f(10) != null);
        sb6.append(", lastBuffer: ");
        sb6.append(m81Var.m75934xbce7f2f(2) != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderGetMentionList", sb6.toString());
        m81Var.set(4, java.lang.Integer.valueOf(i17 != 1 ? i17 != 2 ? 0 : 1 : 2));
        m81Var.set(3, username);
        m81Var.set(5, db2.t4.f309704a.a(978));
        B();
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.n81 resp = (r45.n81) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderGetMentionList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    public final void B() {
        r45.n81 n81Var = new r45.n81();
        n81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) n81Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 978;
        lVar.f152197a = this.f105006t;
        lVar.f152198b = new r45.n81();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmentionlist";
        p(lVar.a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, int i18, java.lang.String username, java.lang.String wxUserName, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUserName, "wxUserName");
        r45.m81 m81Var = new r45.m81();
        this.f105006t = m81Var;
        m81Var.set(6, java.lang.Integer.valueOf(i18));
        m81Var.set(10, gVar);
        m81Var.set(9, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doScene, isNewType: ");
        sb6.append(bq.q0.f105046t.b());
        sb6.append(", pageBuffer: ");
        sb6.append(m81Var.m75934xbce7f2f(10) != null);
        sb6.append(", lastBuffer: ");
        sb6.append(m81Var.m75934xbce7f2f(2) != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderGetMentionList", sb6.toString());
        m81Var.set(4, java.lang.Integer.valueOf(i17 != 1 ? i17 != 2 ? 0 : 1 : 2));
        m81Var.set(3, username);
        m81Var.set(5, db2.t4.f309704a.a(978));
        m81Var.set(8, wxUserName);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doScene, wx_username: ");
        sb7.append(wxUserName);
        sb7.append(", pageBuffer: ");
        sb7.append(m81Var.m75934xbce7f2f(10) != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderGetMentionList", sb7.toString());
        B();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, int i18, java.lang.String username, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        r45.m81 m81Var = new r45.m81();
        this.f105006t = m81Var;
        int i19 = 2;
        if (i17 == 1) {
            bq.p0 p0Var = bq.q0.f105046t;
        } else if (i17 != 2) {
            i19 = 0;
        } else {
            bq.p0 p0Var2 = bq.q0.f105046t;
            i19 = 1;
        }
        m81Var.set(4, java.lang.Integer.valueOf(i19));
        m81Var.set(6, java.lang.Integer.valueOf(i18));
        m81Var.set(3, username);
        m81Var.set(7, java.lang.Long.valueOf(j17));
        m81Var.set(10, gVar);
        m81Var.set(5, db2.t4.f309704a.a(978));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doScene, aggregatedRootMentionId: ");
        sb6.append(j17);
        sb6.append(", pageBuffer: ");
        sb6.append(m81Var.m75934xbce7f2f(10) != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderGetMentionList", sb6.toString());
        B();
    }
}

package db2;

/* loaded from: classes.dex */
public final class x extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final int f309759m;

    public x(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f309759m = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.az0 az0Var = new r45.az0();
        az0Var.set(3, db2.t4.f309704a.a(3839));
        az0Var.set(1, java.lang.Integer.valueOf(i17));
        az0Var.set(2, gVar);
        lVar.f152197a = az0Var;
        r45.bz0 bz0Var = new r45.bz0();
        bz0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) bz0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = bz0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderconsumeprefetchreport";
        lVar.f152200d = 3839;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[init] tabType=");
        sb6.append(i17);
        sb6.append(" lastBuff=");
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.f273689a.length) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderConsumePrefetchReport", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderConsumePrefetchReport", "onCgiBack errType[" + i17 + "] errCode[" + i18 + "] errMsg[" + str + "] tabType[" + this.f309759m + ']');
    }
}

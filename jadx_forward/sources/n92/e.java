package n92;

/* loaded from: classes8.dex */
public final class e extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f417446t;

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f417447u;

    public e(int i17) {
        super(null, null, 3, null);
        java.lang.String str = "Cgi.FinderNewUserPrepare#" + i17 + '@' + hashCode();
        this.f417446t = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.g23 g23Var = new r45.g23();
        g23Var.set(1, java.lang.Integer.valueOf(i17));
        g23Var.set(2, db2.t4.f309704a.a(7289));
        lVar.f152197a = g23Var;
        r45.lk2 lk2Var = new r45.lk2();
        lk2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) lk2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = lk2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findernewuserprepare";
        lVar.f152200d = 7289;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[CgiFinderNewUserPrepare] created...");
        this.f417447u = new org.json.JSONObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0216  */
    @Override // az2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(int r18, int r19, java.lang.String r20, com.p314xaae8f345.mm.p2495xc50a8b8b.f r21, com.p314xaae8f345.mm.p944x882e457a.m1 r22) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n92.e.A(int, int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.modelbase.m1):void");
    }

    @Override // az2.j, com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f417446t, "[run]...");
        return super.l();
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f417447u;
    }
}

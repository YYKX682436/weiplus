package ek2;

/* loaded from: classes.dex */
public final class d0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.c0 f334964u;

    /* renamed from: v, reason: collision with root package name */
    public final org.json.JSONObject f334965v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, long j17, ek2.c0 callback) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f334964u = callback;
        this.f334965v = new org.json.JSONObject();
        r45.e81 e81Var = new r45.e81();
        e81Var.set(1, db2.t4.f309704a.b(11609, this.f97668n));
        e81Var.set(2, str == null ? "" : str);
        e81Var.set(3, java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = e81Var;
        r45.f81 f81Var = new r45.f81();
        f81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) f81Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = f81Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetlivesonglist";
        lVar.f152200d = 11609;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.f81 resp = (r45.f81) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveReward", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.c0 c0Var = this.f334964u;
        if (c0Var != null) {
            c0Var.a(i17, i18, str, resp);
        }
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f334965v;
    }
}

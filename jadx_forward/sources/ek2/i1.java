package ek2;

/* loaded from: classes.dex */
public final class i1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f334998u;

    public i1(java.lang.String str, long j17, long j18) {
        super(null, 1, null);
        this.f334998u = new org.json.JSONObject();
        r45.wu1 wu1Var = new r45.wu1();
        wu1Var.set(1, db2.t4.f309704a.b(7875, this.f97668n));
        wu1Var.set(2, str);
        wu1Var.set(3, java.lang.Long.valueOf(j17));
        wu1Var.set(4, java.lang.Long.valueOf(j18));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = wu1Var;
        r45.xu1 xu1Var = new r45.xu1();
        xu1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) xu1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = xu1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetroommanager";
        lVar.f152200d = 7875;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.xu1 resp = (r45.xu1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveGetRoomManager", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f334998u;
    }
}

package db2;

/* loaded from: classes.dex */
public final class w2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309746t;

    /* renamed from: u, reason: collision with root package name */
    public int f309747u;

    public /* synthetic */ w2(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str4, r45.ip2 ip2Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, (i17 & 4) != 0 ? "" : str3, (i17 & 8) != 0 ? null : gVar, (i17 & 16) != 0 ? "" : str4, (i17 & 32) != 0 ? null : ip2Var);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.du2 resp = (r45.du2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309746t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(java.lang.String nickName, java.lang.String eventName, java.lang.String query, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String requestId, r45.ip2 ip2Var) {
        super(null, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        this.f309746t = "CgiFinderSearchEvent";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.cu2 cu2Var = new r45.cu2();
        cu2Var.set(1, db2.t4.f309704a.b(6241, this.f97668n));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(requestId, "")) {
            cu2Var.set(4, java.lang.String.valueOf(c01.id.c()));
        } else {
            cu2Var.set(4, requestId);
        }
        if (query.length() > 0) {
            cu2Var.set(3, query);
        } else {
            cu2Var.set(5, nickName);
            cu2Var.set(6, eventName);
        }
        cu2Var.set(2, gVar);
        cu2Var.set(8, ip2Var);
        lVar.f152197a = cu2Var;
        r45.du2 du2Var = new r45.du2();
        du2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) du2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = du2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findersearchevent";
        lVar.f152200d = 6241;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderSearchEvent", "nickName: " + nickName + ", eventName: " + eventName + ", query: " + query);
    }
}

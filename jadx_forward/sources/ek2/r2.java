package ek2;

/* loaded from: classes5.dex */
public final class r2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.q2 f335059u;

    /* renamed from: v, reason: collision with root package name */
    public final org.json.JSONObject f335060v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r2(java.lang.String str, java.lang.Long l17, java.lang.Long l18, byte[] bArr, int i17, r45.b32 b32Var, r45.dy1 dy1Var, ek2.q2 callback) {
        super(null, 1, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f335059u = callback;
        this.f335060v = new org.json.JSONObject();
        r45.qd2 qd2Var = new r45.qd2();
        qd2Var.set(1, db2.t4.f309704a.b(21535, this.f97668n));
        qd2Var.set(2, str == null ? "" : str);
        if (l17 != null) {
            qd2Var.set(3, java.lang.Long.valueOf(l17.longValue()));
        }
        if (l18 != null) {
            qd2Var.set(4, java.lang.Long.valueOf(l18.longValue()));
        }
        if (bArr != null) {
            qd2Var.set(5, pm0.b0.h(bArr));
        }
        qd2Var.set(6, java.lang.Integer.valueOf(i17));
        qd2Var.set(7, b32Var);
        qd2Var.set(8, dy1Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = qd2Var;
        r45.rd2 rd2Var = new r45.rd2();
        rd2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) rd2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = rd2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveupdatenewsonglist";
        lVar.f152200d = 21535;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.rd2 resp = (r45.rd2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveUpdateNewSongList", "onCgiEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        this.f335059u.a(i17, i18, str, resp);
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f335060v;
    }
}

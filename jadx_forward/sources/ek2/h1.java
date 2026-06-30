package ek2;

/* loaded from: classes.dex */
public final class h1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.g1 f334991u;

    /* renamed from: v, reason: collision with root package name */
    public final org.json.JSONObject f334992v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h1(java.lang.String str, java.lang.Long l17, java.lang.Long l18, byte[] bArr, long j17, ek2.g1 callback) {
        super(null, 1, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f334991u = callback;
        this.f334992v = new org.json.JSONObject();
        r45.st1 st1Var = new r45.st1();
        st1Var.set(1, db2.t4.f309704a.b(21534, this.f97668n));
        st1Var.set(2, str == null ? "" : str);
        if (l17 != null) {
            st1Var.set(3, java.lang.Long.valueOf(l17.longValue()));
        }
        if (l18 != null) {
            st1Var.set(4, java.lang.Long.valueOf(l18.longValue()));
        }
        if (bArr != null) {
            st1Var.set(5, pm0.b0.h(bArr));
        }
        st1Var.set(6, java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = st1Var;
        r45.tt1 tt1Var = new r45.tt1();
        tt1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tt1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = tt1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetnewsonglist";
        lVar.f152200d = 21534;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.tt1 resp = (r45.tt1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveGetNewSongList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.g1 g1Var = this.f334991u;
        if (g1Var != null) {
            g1Var.a(i17, i18, str, resp);
        }
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f334992v;
    }
}

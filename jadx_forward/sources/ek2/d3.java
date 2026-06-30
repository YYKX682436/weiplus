package ek2;

/* loaded from: classes.dex */
public final class d3 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f334966u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(java.lang.String str, int i17, long j17, long j18, long j19, java.lang.String userName, ek2.c3 c3Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f334966u = new org.json.JSONObject();
        r45.h13 h13Var = new r45.h13();
        h13Var.set(1, db2.t4.f309704a.b(11174, this.f97668n));
        h13Var.set(2, str);
        h13Var.set(3, java.lang.Integer.valueOf(i17));
        h13Var.set(4, java.lang.Long.valueOf(j17));
        h13Var.set(5, java.lang.Long.valueOf(j18));
        h13Var.set(6, java.lang.Long.valueOf(j19));
        h13Var.set(7, userName);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = h13Var;
        r45.i13 i13Var = new r45.i13();
        i13Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) i13Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = i13Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderupdatelivesongstate";
        lVar.f152200d = 11174;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.i13 resp = (r45.i13) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderUpdateLiveSongState", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f334966u;
    }
}

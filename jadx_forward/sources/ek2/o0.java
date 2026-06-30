package ek2;

/* loaded from: classes.dex */
public final class o0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.n0 f335042u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f335043v;

    public o0(r45.kv0 kv0Var, java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, r45.rn1 rn1Var, ek2.n0 n0Var) {
        super(null, 1, null);
        this.f335042u = n0Var;
        this.f335043v = "Finder.CgiFinderLiveCandidate";
        r45.n71 n71Var = new r45.n71();
        n71Var.set(1, kv0Var);
        n71Var.set(2, str);
        n71Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        n71Var.set(3, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr3));
        n71Var.set(5, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr2));
        n71Var.set(6, rn1Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = n71Var;
        r45.o71 o71Var = new r45.o71();
        o71Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) o71Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = o71Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetlivemiccandidatelist";
        lVar.f152200d = 6845;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.o71 resp = (r45.o71) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335043v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.n0 n0Var = this.f335042u;
        if (n0Var != null) {
            n0Var.a(i17, i18, str, resp);
        }
    }
}

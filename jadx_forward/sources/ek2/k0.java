package ek2;

/* loaded from: classes.dex */
public final class k0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.j0 f335020u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f335021v;

    public k0(long j17, long j18, java.lang.String str, byte[] bArr, int i17, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3, ek2.j0 j0Var) {
        super(null, 1, null);
        this.f335020u = j0Var;
        this.f335021v = "Finder.CgiFinderLiveBatchGetMicContact";
        r45.cm1 cm1Var = new r45.cm1();
        cm1Var.set(3, java.lang.Long.valueOf(j17));
        cm1Var.set(1, db2.t4.f309704a.a(4224));
        cm1Var.set(4, java.lang.Long.valueOf(j18));
        cm1Var.set(5, str);
        cm1Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        cm1Var.set(7, xy2.c.f(this.f97668n));
        cm1Var.set(11, java.lang.Integer.valueOf(i17));
        cm1Var.set(8, linkedList);
        cm1Var.set(9, linkedList2);
        cm1Var.set(10, linkedList3);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = cm1Var;
        r45.dm1 dm1Var = new r45.dm1();
        dm1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) dm1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = dm1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivebatchgetmiccontact";
        lVar.f152200d = 4224;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.dm1 resp = (r45.dm1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335021v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.j0 j0Var = this.f335020u;
        if (j0Var != null) {
            pm0.v.X(new yi2.f0(((yi2.g0) j0Var).f544046a, resp));
        }
    }
}

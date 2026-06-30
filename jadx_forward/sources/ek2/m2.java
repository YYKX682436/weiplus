package ek2;

/* loaded from: classes3.dex */
public final class m2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.l2 f335037u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(long j17, long j18, int i17, java.lang.String verificationId, ek2.l2 l2Var) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verificationId, "verificationId");
        this.f335037u = l2Var;
        r45.cb2 cb2Var = new r45.cb2();
        cb2Var.set(4, java.lang.Long.valueOf(j17));
        cb2Var.set(3, java.lang.Long.valueOf(j18));
        cb2Var.set(5, java.lang.Integer.valueOf(i17));
        cb2Var.set(6, verificationId);
        cb2Var.set(1, db2.t4.f309704a.a(5281));
        cb2Var.set(2, xy2.c.f(this.f97668n));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = cb2Var;
        r45.db2 db2Var = new r45.db2();
        db2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) db2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = db2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivesuspiciousverify";
        lVar.f152200d = 5281;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveSuspiciousVerify", "init: liveId:" + j17 + ", objectId:" + j18 + ", scene:" + i17 + ", verification_id:" + verificationId);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.db2 resp = (r45.db2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveSuspiciousVerify", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.l2 l2Var = this.f335037u;
        if (l2Var != null) {
            dk2.a0 a0Var = (dk2.a0) l2Var;
            boolean z17 = a0Var.f314697a;
            dk2.g0 g0Var = a0Var.f314698b;
            if (!z17) {
                g0Var.d(false);
                return;
            }
            if (i17 == 0 && i18 == 0) {
                if (g0Var.f315003c != 4) {
                    pm0.v.X(new dk2.b0(g0Var));
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = g0Var.f315002b;
                android.content.Context context = k0Var != null ? k0Var.getContext() : null;
                if (context == null) {
                    return;
                }
                pm0.v.X(new dk2.c0(context, g0Var));
            }
        }
    }
}

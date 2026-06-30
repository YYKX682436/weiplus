package ek2;

/* loaded from: classes.dex */
public final class g extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.f f334983u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f334984v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, long j18, java.lang.String str, byte[] bArr, int i17, r45.ch1 msg, ek2.f fVar) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f334983u = fVar;
        this.f334984v = "CgiFinderAnchorInviteMicWithAudience";
        r45.mg1 mg1Var = new r45.mg1();
        mg1Var.set(4, java.lang.Long.valueOf(j17));
        mg1Var.set(1, db2.t4.f309704a.a(13907));
        mg1Var.set(5, java.lang.Long.valueOf(j18));
        mg1Var.set(6, str);
        mg1Var.set(8, xy2.c.f(this.f97668n));
        mg1Var.set(7, java.lang.Integer.valueOf(i17));
        mg1Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        mg1Var.set(3, msg);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = mg1Var;
        r45.ng1 ng1Var = new r45.ng1();
        ng1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ng1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ng1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveanchorinvitemicwithaudience";
        lVar.f152200d = 13907;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ng1 resp = (r45.ng1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f334984v, "onCgiEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        ek2.f fVar2 = this.f334983u;
        if (i17 == 0 && i18 == 0) {
            if (fVar2 != null) {
                fVar2.a(resp);
            }
        } else if (fVar2 != null) {
            fVar2.b(i17, i18, str);
        }
    }
}

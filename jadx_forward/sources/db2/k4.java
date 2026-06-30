package db2;

/* loaded from: classes.dex */
public final class k4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f309575t;

    public k4(long j17) {
        super(null, null, 3, null);
        r45.yu1 yu1Var = new r45.yu1();
        yu1Var.set(1, db2.t4.f309704a.a(8350));
        yu1Var.set(2, java.lang.Long.valueOf(j17));
        yu1Var.set(3, java.lang.Integer.valueOf(te2.sc.f499946b));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = yu1Var;
        r45.zu1 zu1Var = new r45.zu1();
        zu1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) zu1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = zu1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetshareqrcode";
        lVar.f152200d = 8350;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f309575t = a17;
        p(a17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.t52 t52Var;
        r45.zu1 resp = (r45.zu1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309575t;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
            throw null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetShareQRCodeResponse");
        r45.f92 f92Var = (r45.f92) ((r45.zu1) fVar2).m75936x14adae67(1);
        if (f92Var == null || (t52Var = (r45.t52) f92Var.m75936x14adae67(6)) == null) {
            return;
        }
        te2.sc.f499945a.c(t52Var.m75939xb282bd08(2), t52Var.m75933x41a8a7f2(1), t52Var.m75941xfb821914(0));
    }
}

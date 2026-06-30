package ek2;

/* loaded from: classes.dex */
public final class r1 extends az2.j {

    /* renamed from: u, reason: collision with root package name */
    public static final ek2.q1 f335057u = new ek2.q1(null);

    /* renamed from: t, reason: collision with root package name */
    public final r45.hx0 f335058t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r1(long j17, long j18, int i17, r45.hx0 cmdItem) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdItem, "cmdItem");
        this.f335058t = cmdItem;
        r45.l02 l02Var = new r45.l02();
        l02Var.set(2, java.lang.Long.valueOf(j17));
        l02Var.set(3, java.lang.Long.valueOf(j18));
        l02Var.set(4, java.lang.Integer.valueOf(i17));
        l02Var.set(1, db2.t4.f309704a.b(4175, null));
        l02Var.m75941xfb821914(5).add(cmdItem);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = l02Var;
        r45.m02 m02Var = new r45.m02();
        m02Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) m02Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = m02Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivemodbasicinfo";
        lVar.f152200d = 4175;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveModBasicInfo", "liveId " + j17 + ", objectId " + pm0.v.u(j18) + ",scene:" + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.m02 resp = (r45.m02) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveModBasicInfo", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        if (this.f335058t.m75939xb282bd08(0) == 7) {
            ya2.g gVar = ya2.h.f542017a;
            gk2.e eVar = dk2.ef.I;
            ya2.b2 b17 = gVar.b(eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f410385o : null);
            if (b17 != null) {
                gk2.e eVar2 = dk2.ef.I;
                b17.f69324x7733ca97 = eVar2 != null ? ((mm2.c1) eVar2.a(mm2.c1.class)).w7() : null;
                gVar.k(b17);
            }
        }
    }
}

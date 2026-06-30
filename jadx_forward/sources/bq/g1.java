package bq;

/* loaded from: classes.dex */
public final class g1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105020o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(java.lang.String friendUsername, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(friendUsername, "friendUsername");
        this.f105020o = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6850;
        r45.vf3 vf3Var = new r45.vf3();
        vf3Var.set(1, db2.t4.f309704a.b(6850, qt2Var));
        vf3Var.set(3, gVar);
        vf3Var.set(4, friendUsername);
        vf3Var.set(2, java.lang.Integer.valueOf(i17));
        jz5.l P6 = ((ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class))).P6();
        vf3Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        vf3Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        lVar.f152197a = vf3Var;
        lVar.f152198b = new r45.wf3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getfinderpoilist";
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.wf3 resp = (r45.wf3) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiListStreamCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}

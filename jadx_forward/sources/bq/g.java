package bq;

/* loaded from: classes.dex */
public final class g extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(java.lang.String friendUsername, java.util.LinkedList bindList) {
        super(null, 1, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(friendUsername, "friendUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindList, "bindList");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4078;
        r45.cw0 cw0Var = new r45.cw0();
        cw0Var.set(1, db2.t4.f309704a.a(4078));
        cw0Var.set(3, friendUsername);
        cw0Var.m75941xfb821914(2).addAll(bindList);
        jz5.l P6 = ((ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class))).P6();
        cw0Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        cw0Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        lVar.f152197a = cw0Var;
        lVar.f152198b = new r45.dw0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderbindpoi";
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.dw0 resp = (r45.dw0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBindPoiStreamCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}

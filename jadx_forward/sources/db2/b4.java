package db2;

/* loaded from: classes.dex */
public final class b4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309444t;

    public b4(java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(null, null, 3, null);
        this.f309444t = "Finder.CgiFinderPoiSearch";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.d23 d23Var = new r45.d23();
        d23Var.set(3, str);
        d23Var.set(4, gVar);
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        d23Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        d23Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        lVar.f152197a = d23Var;
        r45.e23 e23Var = new r45.e23();
        e23Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) e23Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = e23Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderuserpoi";
        lVar.f152200d = 4035;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderPoiSearch", "[init] finder_username:" + str);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.e23 resp = (r45.e23) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309444t, "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}

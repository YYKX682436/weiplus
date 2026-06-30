package db2;

/* loaded from: classes.dex */
public final class p0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309642t;

    public p0(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(null, null, 3, null);
        this.f309642t = "Finder.CgiFinderGetCollectionWatchingList";
        r45.e51 e51Var = new r45.e51();
        e51Var.set(1, db2.t4.f309704a.b(12120, this.f97668n));
        e51Var.set(2, java.lang.Integer.valueOf(i17));
        e51Var.set(3, gVar);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = e51Var;
        r45.f51 f51Var = new r45.f51();
        f51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) f51Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = f51Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetcollectionwatchinglist";
        lVar.f152200d = 12120;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.f51 resp = (r45.f51) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(" size ");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
        sb6.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309642t, sb6.toString());
    }
}

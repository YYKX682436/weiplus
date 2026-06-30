package db2;

/* loaded from: classes.dex */
public final class h1 {
    public h1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String keyword, r45.gd1 gd1Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.gd1 gd1Var2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, boolean z17, int i17, yz5.p onBuildEnd) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onBuildEnd, "onBuildEnd");
        onBuildEnd.mo149xb9724478(gd1Var != null ? b(1, keyword, gd1Var, gVar, 0) : null, gd1Var2 != null ? b(z17 ? 3 : 2, keyword, gd1Var2, gVar2, i17) : null);
    }

    public final r45.cd1 b(int i17, java.lang.String str, r45.gd1 gd1Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18) {
        r45.cd1 cd1Var = new r45.cd1();
        cd1Var.set(0, java.lang.Integer.valueOf(i17));
        cd1Var.set(1, str);
        cd1Var.set(2, gd1Var);
        cd1Var.set(3, gVar);
        cd1Var.set(4, java.lang.Integer.valueOf(i18));
        return cd1Var;
    }

    public final void c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, r45.cd1 cd1Var, r45.cd1 cd1Var2, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pq5.g l17 = new db2.i1(xy2.c.e(activity), cd1Var, cd1Var2, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(activity).c(zy2.ra.class))).V6()).l();
        l17.I(activity);
        pm0.v.T(l17, new db2.g1(pVar));
    }
}

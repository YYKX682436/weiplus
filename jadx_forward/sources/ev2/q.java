package ev2;

/* loaded from: classes10.dex */
public final class q extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final ev2.e f338461f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f338462g;

    public q(ev2.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f338461f = action;
    }

    @Override // fp0.d
    public void a() {
        ev2.p pVar = new ev2.p(this);
        ev2.t tVar = (ev2.t) this.f338461f;
        tVar.getClass();
        tVar.f338439a++;
        fv2.f fVar = new fv2.f(tVar.f338466c);
        long t07 = tVar.f338467d.t0();
        int i17 = tVar.f338468e ? 3 : 4;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.a13 a13Var = new r45.a13();
        iv2.b bVar = fVar.f348507m;
        a13Var.f451165f = bVar.f376658a;
        a13Var.f451166g = bVar.f376659b;
        a13Var.f451172p = null;
        a13Var.f451163d = db2.t4.f309704a.a(6989);
        a13Var.f451168i = t07;
        a13Var.f451169m = i17;
        a13Var.f451170n = tVar.f338469f;
        a13Var.f451164e = java.lang.System.currentTimeMillis();
        lVar.f152197a = a13Var;
        lVar.f152198b = new r45.b13();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderunilike";
        lVar.f152200d = 6989;
        fVar.p(lVar.a());
        fVar.l().K(new ev2.s(tVar, pVar));
    }

    @Override // fp0.d
    public java.lang.String d() {
        ev2.t tVar = (ev2.t) this.f338461f;
        return "id_" + tVar.f338466c.f376663f + '_' + tVar.f338467d.t0() + '_' + tVar.f338468e + '_' + tVar.f338469f + '_' + tVar.f338440b;
    }
}

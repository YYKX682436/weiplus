package jn3;

/* loaded from: classes8.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final jn3.f f382314d = new jn3.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ra0.b0 state = (ra0.b0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof sa0.c)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NewLife.Entrance");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NewLife.MentionEntrance");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NewLife.OfficialMsgEntrance");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NewLife.SquareTab");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NewLife.OfficialMsgSquareTab");
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof sa0.d)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("NewLife.Entrance");
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof sa0.g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = ((sa0.g) dVar3).f486783b;
            int i17 = jbVar.f65875xb5fc3ab6;
            if (i17 >= 100001 && i17 < 199999) {
                nn3.f fVar = (nn3.f) ((ra0.x) i95.n0.c(ra0.x.class));
                fVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLifeReporter", "reportNewLifeRedDotExpired", true);
                fVar.Ri("red_dot_expired", jbVar, null, 1);
            } else if (i17 >= 300000 && i17 < 399999) {
                nn3.f fVar2 = (nn3.f) ((ra0.x) i95.n0.c(ra0.x.class));
                fVar2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLifeReporter", "reportNewLifeRedDotExpired", true);
                fVar2.Ri("red_dot_expired", jbVar, null, 2);
            }
        }
        return jz5.f0.f384359a;
    }
}

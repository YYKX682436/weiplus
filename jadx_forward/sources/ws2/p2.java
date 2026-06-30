package ws2;

/* loaded from: classes3.dex */
public final class p2 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f530654m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f530655n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f530654m = "TransitionReplayController";
        this.f530655n = jz5.h.b(new ws2.o2(this));
    }

    public final void Z6() {
        ct2.j jVar = (ct2.j) m56788xbba4bfc0(ct2.j.class);
        ws2.n2 replayListener = (ws2.n2) ((jz5.n) this.f530655n).mo141623x754a37bb();
        jVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replayListener, "replayListener");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = jVar.E;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        jVar.E = p3325xe03a0797.p3326xc267989b.l.d(jVar.f410496d.f354008i, null, null, new ct2.h(jVar, 30000, 5000L, replayListener, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530654m, "onReplayActivate");
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530654m, "onReplayDeactivate");
    }
}

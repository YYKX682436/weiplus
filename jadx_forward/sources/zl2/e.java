package zl2;

/* loaded from: classes13.dex */
public final class e implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f555260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f555261b;

    public e(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f555260a = c0Var;
        this.f555261b = qVar;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCoroutineUtil", "onResultAllow");
        zl2.f.a(this.f555260a, this.f555261b, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t0(abstractActivityC19626xce283566));
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCoroutineUtil", "onResultCancel");
        zl2.f.a(this.f555260a, this.f555261b, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r0(abstractActivityC19626xce283566));
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCoroutineUtil", "onResultRefuse");
        zl2.f.a(this.f555260a, this.f555261b, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s0(abstractActivityC19626xce283566));
    }
}

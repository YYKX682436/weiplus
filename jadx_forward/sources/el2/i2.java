package el2;

/* loaded from: classes3.dex */
public final class i2 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f335362m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f335363n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f335362m = "FinderLivePromotePollingController";
        this.f335363n = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(java.lang.Boolean.FALSE);
    }

    public final java.lang.String Z6() {
        return pm0.v.u(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
    }

    public final void a7(r45.f52 f52Var, java.lang.Boolean bool) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335362m, "[startPollingPromoteInfo] enter, live = ".concat(Z6()));
        zl2.r4 r4Var = zl2.r4.f555483a;
        dk2.ef.f314925k.f(10);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, null, null, new el2.f2(this, f52Var, bool, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLiveStart] resp is null = ");
        sb6.append(hc1Var == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335362m, sb6.toString());
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f335363n).k(java.lang.Boolean.valueOf(hc1Var != null));
    }
}

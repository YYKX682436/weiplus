package dk2;

/* loaded from: classes3.dex */
public final class df extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba f314865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba) {
        super(0);
        this.f314865d = c6231x4f3054ba;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (gm0.j1.a()) {
            dk2.ef efVar = dk2.ef.f314905a;
            if (dk2.ef.I != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = this.f314865d;
                int i17 = c6231x4f3054ba.f136478g.f89948b;
                if (i17 == 3 || i17 == 12 || i17 == 5) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "event.data.opcode = " + c6231x4f3054ba.f136478g.f89948b + ", isAnchor = " + dk2.ef.f314917g);
                    if (!dk2.ef.f314917g) {
                        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                        ml2.e4 e4Var = ml2.e4.f408916o;
                        r0Var.Qk(e4Var);
                        dk2.ef.T(efVar, false, null, 3, null);
                        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_data_report_live_voip_replenish_break, false)) {
                            i95.m c17 = i95.n0.c(ml2.r0.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                            ml2.r0 r0Var2 = (ml2.r0) c17;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                            ml2.r0.Ck(r0Var2, k0Var != null ? k0Var.getContext() : null, e4Var, null, false, null, 28, null);
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

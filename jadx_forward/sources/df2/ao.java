package df2;

/* loaded from: classes3.dex */
public final class ao extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public bl2.c f311265m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        dk2.ef efVar = dk2.ef.f314905a;
        em2.u uVar = dk2.ef.f314919h;
        if (uVar.f336703c) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FLOAT_WINDOW_GUIDE_SHOWN_BOOLEAN_SYNC;
            if (!c17.o(u3Var, false) && (ubVar = this.f372632e) != null) {
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                bl2.c cVar = new bl2.c(O6(), ubVar);
                this.f311265m = cVar;
                cVar.w();
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.Oj((ml2.r0) c18, 1, null, null, null, null, 30, null);
            }
        }
        uVar.f336703c = false;
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        bl2.c cVar = this.f311265m;
        if (cVar != null) {
            cVar.a();
        }
        this.f311265m = null;
    }
}

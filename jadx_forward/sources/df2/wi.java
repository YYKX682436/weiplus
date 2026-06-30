package df2;

/* loaded from: classes3.dex */
public final class wi extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313223m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f313224n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 f313225o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 f313226p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e f313227q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313223m = "LiveGamePostController";
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 r24, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e r25) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wi.Z6(com.tencent.mm.protocal.protobuf.FinderObjectDesc, com.tencent.mm.protocal.protobuf.FinderMedia):void");
    }

    public final mm2.g1 a7() {
        return (mm2.g1) m56788xbba4bfc0(mm2.g1.class);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 b7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        if (ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar;
        }
        return null;
    }

    public final r45.n73 c7() {
        return (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410604i).mo144003x754a37bb();
    }

    public final mm2.s1 d7() {
        return (mm2.s1) m56788xbba4bfc0(mm2.s1.class);
    }

    public final r45.xl6 e7() {
        return ((mm2.s1) m56788xbba4bfc0(mm2.s1.class)).f410935y;
    }

    public final void f7(r45.m01 m01Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313223m, "warn_page = " + pm0.b0.g(m01Var));
        android.content.Context O6 = O6();
        pf5.z zVar = pf5.z.f435481a;
        if (!(O6 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) O6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a6.class)).O6(m01Var, new df2.ri(m01Var, this));
    }

    public final boolean g7() {
        r45.z53 z53Var;
        r45.n73 c76 = c7();
        return (c76 == null || (z53Var = (r45.z53) c76.m75936x14adae67(1)) == null || z53Var.m75939xb282bd08(13) != 1) ? false : true;
    }

    public final void h7(boolean z17, int i17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SUCC", z17);
        intent.putExtra("TITLE", O6().getResources().getString(i17));
        intent.putExtra("DESC", str);
        intent.putExtra("IS_MINI_GAME", g7());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Aj(O6(), intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184206b == 19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.b(1);
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f313225o = null;
        this.f313226p = null;
        this.f313227q = null;
    }
}

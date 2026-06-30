package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class h implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q f232687d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q qVar) {
        this.f232687d = qVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.tencent.mm.plugin.mvvmlist.MvvmList, com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList] */
    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.g0 g0Var;
        pm3.a state = (pm3.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar == null || !(dVar instanceof pm3.b)) {
            return;
        }
        r45.oc5 oc5Var = ((pm3.b) dVar).f438403b;
        im3.g gVar = new im3.g(oc5Var);
        final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q qVar = this.f232687d;
        qVar.f232898h = gVar;
        gVar.f374224e = oc5Var.f463684f;
        ?? r17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<im3.j>(qVar, gVar, new xm3.n0()) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$MvPreviewLiveList
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(gVar, config, qVar.m158354x19263085(), null, null, 24, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "dataSource");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe
            public java.lang.String c() {
                return "MicroMsg.Mv.MusicMvAlbumPreviewRecyclerUIC";
            }
        };
        qVar.f232899i = r17;
        qVar.f232900m = new xm3.t0(r17, new in5.s() { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewRecyclerUIC$buildItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return type != 1 ? type != 3 ? new im3.f(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q.this.Q6()) : new im3.i(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q.this.Q6()) : new im3.a();
            }
        }, false);
        qVar.m67288x4905e9fa().mo7960x6cab2c8d(qVar.f232900m);
        qVar.m67288x4905e9fa().mo7967x900dcbe1((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) qVar.f232895e).mo141623x754a37bb());
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i) ((jz5.n) qVar.f232896f).mo141623x754a37bb()).b(qVar.m67288x4905e9fa());
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16664x54fdbbae c16664x54fdbbae = qVar.f232899i;
        if (c16664x54fdbbae == null || (g0Var = c16664x54fdbbae.f233604u) == null) {
            return;
        }
        g0Var.mo7806x9d92d11c(qVar.m158354x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g(qVar, dVar));
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class w implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0 f233040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b f233041e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b bVar) {
        this.f233040d = c0Var;
        this.f233041e = bVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.tencent.mm.plugin.mvvmlist.MvvmList, com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList] */
    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        r45.oc5 oc5Var;
        pm3.a state = (pm3.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (!(state.f379599d instanceof pm3.b) || (oc5Var = state.f438401e) == null) {
            return;
        }
        im3.k kVar = new im3.k(oc5Var);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0 c0Var = this.f233040d;
        c0Var.getClass();
        ?? r47 = new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<im3.j>(c0Var, kVar, new xm3.n0()) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$MvPreviewLiveList
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(kVar, config, c0Var.m158354x19263085(), null, null, 24, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "dataSource");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe
            public java.lang.String c() {
                return "MicroMsg.Mv.MusicMvAlbumPreviewSelectedUIC";
            }
        };
        c0Var.f232602g = r47;
        p012xc85e97e9.p093xedfae76a.g0 g0Var = r47.f233604u;
        if (g0Var != null) {
            g0Var.mo7806x9d92d11c(c0Var.m158354x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.u(c0Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16666xe1e8fad2 c16666xe1e8fad2 = c0Var.f232602g;
        if (c16666xe1e8fad2 != null) {
            c0Var.f232603h = new xm3.t0(c16666xe1e8fad2, new in5.s() { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvAlbumPreviewSelectedUIC$buildItemConvertFactory$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new im3.l();
                }
            }, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0.O6(c0Var).mo7960x6cab2c8d(c0Var.f232603h);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0.O6(c0Var).mo7967x900dcbe1((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) c0Var.f232601f).mo141623x754a37bb());
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0.O6(c0Var).N(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.r(c0Var));
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 10);
        android.view.View view = new android.view.View(c0Var.m158354x19263085());
        view.setPadding(b17, 0, 0, 0);
        xm3.t0 t0Var = c0Var.f232603h;
        if (t0Var != null) {
            in5.n0.U(t0Var, view, view.hashCode(), false, 4, null);
        }
        android.view.View view2 = new android.view.View(c0Var.m158354x19263085());
        view2.setPadding(b17, 0, 0, 0);
        xm3.t0 t0Var2 = c0Var.f232603h;
        if (t0Var2 != null) {
            in5.n0.P(t0Var2, view2, view2.hashCode(), false, 4, null);
        }
        xm3.t0 t0Var3 = c0Var.f232603h;
        if (t0Var3 != null) {
            t0Var3.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v(this.f233041e);
        }
        if (oc5Var.f463683e.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0.O6(c0Var).setVisibility(0);
            c0Var.P6().setEnabled(true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0.O6(c0Var).setVisibility(8);
            c0Var.P6().setEnabled(false);
        }
    }
}

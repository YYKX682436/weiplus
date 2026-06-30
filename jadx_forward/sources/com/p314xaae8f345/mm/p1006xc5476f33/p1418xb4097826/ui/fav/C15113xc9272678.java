package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalMixFavFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalMixFavFragment */
/* loaded from: classes2.dex */
public final class C15113xc9272678 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f210676x = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f210677t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f210678u;

    /* renamed from: v, reason: collision with root package name */
    public long f210679v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f210680w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.b0(this));

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ecm;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.m0.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        super.o0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalMixFavFragment", m7479x8cdac1b() + " onUserVisibleFocused inFragment=" + this.f210678u);
        this.f210677t = true;
        this.f210679v = android.os.SystemClock.elapsedRealtime();
        this.f210678u = true;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar != null) {
                r45.qt2 V6 = nyVar.V6();
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                iy1.c cVar = iy1.c.MainUI;
                ((cy1.a) rVar).Aj(50196, "page_in", kz5.c1.k(new jz5.l("ref_commentscene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5))), new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("finder_username", xy2.c.e(mo7430x19263085)), new jz5.l("sub_tab_type", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.m0) pf5.z.f435481a.b(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.m0.class)).f210722w != 0 ? 2 : 1)), new jz5.l("comment_scene", 349)), 1, false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalMixFavFragment", m7479x8cdac1b() + " onCreate inFragment=" + this.f210678u);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalMixFavFragment", m7479x8cdac1b() + " onDestroy");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalMixFavFragment", m7479x8cdac1b() + " onPause inFragment=" + this.f210678u);
        y0("onPause");
        this.f210678u = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalMixFavFragment", m7479x8cdac1b() + " onResume inFragment=" + this.f210678u);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.m0) pf5.z.f435481a.b(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.m0.class)).f210723x = (yz5.l) ((jz5.n) this.f210680w).mo141623x754a37bb();
        if (!this.f210678u && this.f210677t) {
            this.f210679v = android.os.SystemClock.elapsedRealtime();
        }
        this.f210678u = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        super.p0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalMixFavFragment", m7479x8cdac1b() + " onUserVisibleUnFocused inFragment=" + this.f210678u);
        y0("onUserVisibleUnFocused");
        this.f210678u = false;
    }

    public final void y0(java.lang.String str) {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085;
        if (!this.f210678u || (mo7430x19263085 = mo7430x19263085()) == null) {
            return;
        }
        long elapsedRealtime = this.f210679v > 0 ? android.os.SystemClock.elapsedRealtime() - this.f210679v : 0L;
        this.f210679v = 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalMixFavFragment", str + " reportPageOut timeCost=" + elapsedRealtime);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            iy1.c cVar = iy1.c.MainUI;
            ((cy1.a) rVar).Aj(50196, "page_out", kz5.c1.k(new jz5.l("stay_time", java.lang.Long.valueOf(elapsedRealtime)), new jz5.l("ref_commentscene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5))), new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("finder_username", xy2.c.e(mo7430x19263085)), new jz5.l("sub_tab_type", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.m0) pf5.z.f435481a.b(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.m0.class)).f210722w == 0 ? 1 : 2)), new jz5.l("comment_scene", 349)), 1, false);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "pt2/d", "pt2/e", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment */
/* loaded from: classes2.dex */
public final class C14959x1a54a2ac extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: t, reason: collision with root package name */
    public final int f207436t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca f207437u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f207438v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f207439w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f207440x;

    /* renamed from: y, reason: collision with root package name */
    public sc2.s8 f207441y;

    /* renamed from: z, reason: collision with root package name */
    public final pt2.g f207442z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14959x1a54a2ac(nt2.a tabData, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca c14951x18cbc2ca) {
        super(0, tabData.f421235a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabData, "tabData");
        this.f207436t = i17;
        this.f207437u = c14951x18cbc2ca;
        this.f207438v = tabData.f421237c;
        this.f207439w = jz5.h.b(new pt2.i(this));
        this.f207440x = jz5.h.b(new pt2.h(this));
        jz5.h.b(new pt2.j(this));
        this.f207442z = new pt2.g();
    }

    public final boolean A0() {
        return this.f207436t == 13;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return A0() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.b37 : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570567b36;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return kz5.r0.f395535d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        sc2.s8 s8Var;
        super.mo7504xac79a11b();
        y0().V0(this.f207442z);
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.S1().r()).intValue() != 1 || (s8Var = this.f207441y) == null) {
            return;
        }
        y0().V0(s8Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        y0().mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7(2, 1));
        y0().mo7960x6cab2c8d(new pt2.d(this));
        y0().N(new pt2.e(this, (int) (A0() ? m7460x893a2f6f().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) : m7460x893a2f6f().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv))));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1674xc086f2ae.C15430xb1d1f629 c15430xb1d1f629 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1674xc086f2ae.C15430xb1d1f629(mo7430x19263085(), null);
        c15430xb1d1f629.j(A0() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.bsc : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5);
        z0().D(c15430xb1d1f629);
        z0().m82945xba09cf09(new pt2.f(this));
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.S1().r()).intValue() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f z07 = z0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z07, "<get-rlLayout>(...)");
            sc2.s8 s8Var = new sc2.s8("Finder.MixSearchFeedFragment", z07, 2);
            this.f207441y = s8Var;
            y0().i(s8Var);
        }
        y0().i(this.f207442z);
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 y0() {
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) this.f207440x).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f z0() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) ((jz5.n) this.f207439w).mo141623x754a37bb();
    }
}

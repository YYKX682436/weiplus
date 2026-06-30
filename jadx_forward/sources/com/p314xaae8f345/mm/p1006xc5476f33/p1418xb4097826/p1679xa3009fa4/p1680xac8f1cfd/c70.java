package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class c70 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f215507g;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f215508d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f215509e;

    /* renamed from: f, reason: collision with root package name */
    public int f215510f;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.y60(null);
        f215507g = new java.util.HashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f215508d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a70(this));
        this.f215509e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.b70(this));
        this.f215510f = -1;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 O6() {
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) this.f215508d).mo141623x754a37bb();
    }

    public final int P6() {
        return ((java.lang.Number) ((jz5.n) this.f215509e).mo141623x754a37bb()).intValue();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        gm0.j1.d().a(3901, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        if (O6() == null) {
            return;
        }
        android.content.Context context = O6().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        fc2.c b76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).b7(P6());
        if (b76 != null) {
            b76.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.z60(this));
        }
        f215507g.put(java.lang.Integer.valueOf(P6()), 0L);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        gm0.j1.d().q(3901, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558;
        if (i17 == 0 && i18 == 0) {
            java.lang.Object mo47979x2d63726f = (m1Var == null || (mo47948x7f0c4558 = m1Var.mo47948x7f0c4558()) == null) ? null : mo47948x7f0c4558.mo47979x2d63726f();
            if ((mo47979x2d63726f instanceof r45.ix2) && ((r45.ix2) mo47979x2d63726f).m75939xb282bd08(11) == P6()) {
                this.f215510f = -1;
                f215507g.put(java.lang.Integer.valueOf(P6()), 0L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamPartialExposeUIC", "[onSceneEnd] tabType=" + P6() + " reset");
            }
        }
    }
}

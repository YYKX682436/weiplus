package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public final class l0 extends zx2.l {
    @Override // zx2.l, zx2.a0
    public void c(android.view.Window window) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe;
        com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 c22785xca931918;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        android.view.View findViewById = window.findViewById(com.p314xaae8f345.mm.R.id.ugu);
        com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 c22785xca9319182 = null;
        if (findViewById == null || (c2718xca2902ff = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById.findViewById(com.p314xaae8f345.mm.R.id.ugw)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderTabUIC", "alignTabLayout is null!");
            c2718xca2902ff = null;
        }
        this.f558586a = c2718xca2902ff;
        if (findViewById == null || (c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById.findViewById(com.p314xaae8f345.mm.R.id.ugx)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderTabUIC", "fragmentViewPager is null!");
            c1190x18d3c3fe = null;
        }
        this.f558588c = c1190x18d3c3fe;
        if (findViewById == null || (c22785xca931918 = (com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918) findViewById.findViewById(com.p314xaae8f345.mm.R.id.ugv)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderTabUIC", "layoutContainer is null!");
        } else {
            c22785xca9319182 = c22785xca931918;
        }
        this.f558587b = c22785xca9319182;
    }

    @Override // zx2.a0
    public int d() {
        return com.p314xaae8f345.mm.R.id.ugu;
    }

    @Override // zx2.l, zx2.a0
    /* renamed from: getLayoutId */
    public int mo58748x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ecm;
    }
}

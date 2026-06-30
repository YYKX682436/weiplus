package g44;

/* loaded from: classes4.dex */
public final class g extends j44.j {
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 A;

    @Override // j44.j
    public int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDeleteHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDeleteHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570201zx;
    }

    @Override // j44.j
    public int d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloadHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570699bj3;
    }

    @Override // j44.j
    public java.lang.String k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        return "AdDownloadAppHalfScreenHelper";
    }

    @Override // j44.j
    public void l() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.A;
        boolean z17 = false;
        if (k0Var2 != null && k0Var2.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = this.A) != null) {
            k0Var.u();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
    }

    @Override // j44.j
    public void s(int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        if (f() == null) {
            k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDownloadAppHalfScreenHelper", "showBottomSheet, adDownloadParams is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        boolean z17 = false;
        if (this.A == null) {
            m();
            android.view.View g17 = g();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = g17 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) g17.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260) : null;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setOnClickListener(new g44.d(this));
            }
            android.view.View i19 = i();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = i19 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) i19.findViewById(com.p314xaae8f345.mm.R.id.aac) : null;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setOnClickListener(new g44.e(this));
            }
            this.A = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(h(), 1, false);
            android.view.View g18 = g();
            android.view.ViewGroup.LayoutParams layoutParams = g18 != null ? g18.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
            android.view.View g19 = g();
            android.view.ViewGroup.LayoutParams layoutParams2 = g19 != null ? g19.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
            }
            if (g() instanceof android.widget.LinearLayout) {
                android.view.View g27 = g();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g27, "null cannot be cast to non-null type android.widget.LinearLayout");
                ((android.widget.LinearLayout) g27).setOrientation(1);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.A;
            if (k0Var2 != null) {
                k0Var2.s(g(), true);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.A;
            if (k0Var3 != null) {
                k0Var3.V1 = true;
            }
            if (k0Var3 != null) {
                k0Var3.e(true);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var4 = this.A;
            if (k0Var4 != null) {
                k0Var4.f293387d = new g44.f(this);
            }
        }
        q();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var5 = this.A;
        if (k0Var5 != null && !k0Var5.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = this.A) != null) {
            k0Var.v();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        this.f379238w = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        b(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
    }

    @Override // j44.j
    public void t(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateDownloadHalfScreenView", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDownloadHalfScreenView", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.A;
        if (k0Var != null) {
            k0Var.s(view, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDownloadHalfScreenView", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
    }
}

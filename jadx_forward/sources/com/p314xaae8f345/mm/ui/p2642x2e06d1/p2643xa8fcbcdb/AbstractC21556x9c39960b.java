package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.MMPreferenceFragment */
/* loaded from: classes11.dex */
public abstract class AbstractC21556x9c39960b extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 {

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.ref.WeakReference f279296i;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 f279297d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f279298e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.SharedPreferences f279299f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f279300g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f279301h;

    public static void l0() {
        java.lang.ref.WeakReference weakReference = f279296i;
        android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view != null) {
            view.setSelected(false);
            f279296i = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutView */
    public android.view.View mo78651x29ebce5() {
        return com.p314xaae8f345.mm.ui.td.f291426c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(mo7438x76847179()), com.p314xaae8f345.mm.R.C30864xbddafb2a.c07, null, false);
    }

    public abstract int m0();

    public abstract boolean n0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.n0 n0Var);

    public boolean o0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, android.view.View view) {
        return false;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        int m07;
        super.mo7495x78cb4fa(bundle);
        this.f279301h = false;
        this.f279299f = m78391xc8c7209d(m78389x1000d6bb() + "_preferences", 0);
        this.f279298e = (android.widget.ListView) mo26077x4ff8c0f0(android.R.id.list);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0(mo7438x76847179(), this.f279298e, this.f279299f);
        this.f279297d = h0Var;
        h0Var.f279355x = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.i0(this);
        h0Var.notifyDataSetChanged();
        if (!(!(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15051x458683ad)) && !this.f279301h && (m07 = m0()) != -1) {
            this.f279297d.g(m07);
            this.f279301h = true;
        }
        this.f279298e.setAdapter((android.widget.ListAdapter) this.f279297d);
        this.f279298e.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.l0(this));
        this.f279298e.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.m0(this));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onContextItemSelected */
    public boolean mo7499xc8f7e1be(android.view.MenuItem menuItem) {
        return super.mo7499xc8f7e1be(menuItem);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = this.f279297d;
        if (h0Var != null) {
            h0Var.notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        l0();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes3.dex */
public final class jo extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f216406d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f216407e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f216408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f216406d = "FinderLivePurchaseMicListUIC";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dsf;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f216407e = (android.widget.FrameLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.che);
        android.view.View oj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).oj(m80379x76847179(), false, false, null);
        this.f216408f = oj6;
        ((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) oj6).f127591y = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f216406d, "createLiteAppView: add lite app view:" + this.f216408f);
        android.widget.FrameLayout frameLayout = this.f216407e;
        if (frameLayout != null) {
            frameLayout.addView(this.f216408f, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f216406d = "FinderLivePurchaseMicListUIC";
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalMixFavFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavFeedFragment;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalMixFavFeedFragment */
/* loaded from: classes2.dex */
public final class C15112x462a9e36 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00 {

    /* renamed from: x, reason: collision with root package name */
    public final int f210674x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f210675y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15112x462a9e36(java.lang.String source, int i17) {
        super(source);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f210674x = i17;
        this.f210675y = "Finder.GlobalMixFavFeedFragment";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a B0() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.g0(this.f210674x);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x C0(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        if (this.f210674x != 2) {
            return super.C0(view, presenter);
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f m7548xe6e42394 = m7548xe6e42394();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7548xe6e42394, "requireActivity(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.h0(m7548xe6e42394, this, presenter, view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f210675y, "onCreate");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f210675y, "onDestroy");
    }
}

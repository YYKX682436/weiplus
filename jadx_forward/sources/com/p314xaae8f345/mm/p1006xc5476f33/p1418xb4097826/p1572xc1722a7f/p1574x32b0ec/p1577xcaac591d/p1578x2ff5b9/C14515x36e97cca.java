package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1578x2ff5b9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment;", "Lcom/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment */
/* loaded from: classes2.dex */
public final class C14515x36e97cca extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98 {

    /* renamed from: s, reason: collision with root package name */
    public long f203040s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f203041t = true;

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_ENTER_FINDER_LIVE_SQUARE_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View mo7503x18bad100 = super.mo7503x18bad100(inflater, viewGroup, bundle);
        if (mo7430x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7430x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            android.view.View findViewById = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) mo7430x19263085).findViewById(com.p314xaae8f345.mm.R.id.f_h);
            if (findViewById != null) {
                findViewById.setOnClickListener(new lp2.a(this));
            }
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = mo7430x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7430x192630852, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            android.widget.TextView textView = (android.widget.TextView) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) mo7430x192630852).findViewById(com.p314xaae8f345.mm.R.id.k6f);
            if (textView != null) {
                textView.setTextSize(1, 15.0f);
            }
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630853 = mo7430x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7430x192630853, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            android.view.View findViewById2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) mo7430x192630853).findViewById(com.p314xaae8f345.mm.R.id.fnn);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new lp2.b(this));
            }
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630854 = mo7430x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7430x192630854, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            android.view.View findViewById3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) mo7430x192630854).findViewById(com.p314xaae8f345.mm.R.id.f_h);
            if (findViewById3 != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById3, "live_tab_page_start_live");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById3, 40, 25388);
            }
        }
        return mo7503x18bad100;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_EXIT_FINDER_LIVE_SQUARE_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        if (mo7430x19263085() != null) {
            ip2.a.f375145a.c(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class)).P6());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareFragment", "onResume() isFirstOnResume:" + this.f203041t);
        rq2.x xVar = rq2.x.f480447a;
        rq2.x.f480450d = c01.id.c();
        if (!this.f203041t && mo7430x19263085() != null) {
            ip2.a.f375145a.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class)).P6());
        }
        this.f203041t = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        o0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    /* renamed from: u0 */
    public java.lang.String getF203049t() {
        return "8001";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14512xbce0ab98, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public int x0() {
        return 3;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1619x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/replay/fragment/FinderLiveReplayFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.replay.fragment.FinderLiveReplayFragment */
/* loaded from: classes3.dex */
public final class C14936xcd160249 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656 {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f206448n = "FinderLiveReplayFragment";

    /* renamed from: o, reason: collision with root package name */
    public int f206449o;

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f206448n, "importUIComponents sourceType:" + this.f206449o);
        return kz5.o1.c(this.f206449o == 3 ? bt2.h.class : ws2.m1.class);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14031x8c64dd2d activityC14031x8c64dd2d = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14031x8c64dd2d ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14031x8c64dd2d) context : null;
        this.f206449o = activityC14031x8c64dd2d != null ? activityC14031x8c64dd2d.f190944v : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f206448n, "onAttach sourceType:" + this.f206449o);
        super.mo7397x3b13c504(context);
    }
}

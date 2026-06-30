package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class nf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedUpdateEvent f104094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f104095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, com.tencent.mm.plugin.finder.convert.zf zfVar) {
        super(0);
        this.f104094d = feedUpdateEvent;
        this.f104095e = zfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        java.util.List<in5.c> data;
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = this.f104094d;
        feedUpdateEvent.f54252g.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedChangeListener update type:");
        am.ia iaVar = feedUpdateEvent.f54252g;
        sb6.append(iaVar.f6919b);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        int i18 = iaVar.f6919b;
        com.tencent.mm.plugin.finder.convert.zf zfVar = this.f104095e;
        if (i18 == 8 || i18 == 19) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(iaVar.f6921d);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(iaVar.f6918a);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(iaVar.f6925h);
            java.lang.String str = com.tencent.mm.plugin.finder.convert.zf.D1;
            zfVar.getClass();
            pm0.v.X(new com.tencent.mm.plugin.finder.convert.lf(valueOf, zfVar, valueOf2, valueOf3, null));
        } else if (i18 == 29) {
            androidx.recyclerview.widget.RecyclerView recyclerView = zfVar.f104357J;
            androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
            if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
                i17 = 0;
                for (in5.c cVar : data) {
                    if ((cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar).getFeedObject().getId() == iaVar.f6918a) {
                        break;
                    }
                    i17++;
                }
            }
            i17 = -1;
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "feedChangeListener update Theme, position: " + i17 + " id: " + iaVar.f6918a);
            if (i17 >= 0) {
                androidx.recyclerview.widget.RecyclerView recyclerView2 = zfVar.f104357J;
                androidx.recyclerview.widget.k3 q07 = recyclerView2 != null ? recyclerView2.q0(i17, false) : null;
                in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                so2.h1 h1Var = s0Var != null ? (so2.h1) s0Var.f293125i : null;
                so2.h1 h1Var2 = h1Var instanceof so2.h1 ? h1Var : null;
                if (s0Var != null && h1Var2 != null) {
                    zfVar.N0(s0Var, h1Var2);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

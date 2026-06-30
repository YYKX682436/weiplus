package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class tj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f109066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f109067e;

    public tj(com.tencent.mm.plugin.finder.feed.xj xjVar, in5.s0 s0Var) {
        this.f109066d = xjVar;
        this.f109067e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        cw2.da videoView;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f109066d.f111080i = false;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) this.f109067e.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout != null && (videoView = finderVideoLayout.getVideoView()) != null) {
            in5.s0 s0Var = this.f109067e;
            com.tencent.mm.plugin.finder.feed.xj xjVar = this.f109066d;
            ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.FinderLongVideoRelViewCallback");
            java.lang.Object obj = s0Var.f293125i;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
            if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (mediaList = feedObject.getMediaList()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) != null) {
                r45.gn2 gn2Var = (r45.gn2) mb4Var.getCustom(45);
                if (gn2Var != null && gn2Var.getBoolean(1)) {
                    com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
                    if (finderThumbPlayerProxy != null) {
                        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.h0(finderThumbPlayerProxy, new cw2.t4((r45.gn2) mb4Var.getCustom(45), com.tencent.mm.pluginsdk.ui.e1.CROP), false, 2, null);
                    }
                }
            }
            videoView.setVideoViewFocused(true);
            zy2.g5.u(videoView, null, 1, null);
            bb2.p0 p0Var = bb2.p0.f18940a;
            android.view.View itemView = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            bb2.a1 a17 = p0Var.a(itemView);
            if (a17 != null) {
                a17.c();
            }
            com.tencent.mm.ui.MMActivity activity = xjVar.f111072a;
            kotlin.jvm.internal.o.g(activity, "activity");
            bb2.a1 a18 = p0Var.a(((com.tencent.mm.plugin.finder.viewmodel.component.pt) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.pt.class)).X6());
            if (a18 != null) {
                a18.c();
            }
            if (videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) {
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView;
                finderThumbPlayerProxy2.setPlaySpeed(finderThumbPlayerProxy2.getPlaySpeedRatio());
            }
        }
        android.view.View e17 = this.f109066d.e();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(e17, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.ui.MMActivity context = this.f109066d.f111072a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.finder.feed.xj xjVar2 = this.f109066d;
        in5.s0 s0Var2 = this.f109067e;
        jSONObject.put("first_feedid", pm0.v.u(xjVar2.f111073b.f109084v));
        jSONObject.put("feedid", pm0.v.u(((so2.j5) s0Var2.f293125i).getItemId()));
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "feed_replay", 1, jSONObject, false, null, 48, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

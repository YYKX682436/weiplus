package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class db implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f103139e;

    public db(in5.s0 s0Var, com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f103138d = s0Var;
        this.f103139e = finderFullSeekBarLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        in5.s0 s0Var = this.f103138d;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f484486ee3);
        if (p17 != null) {
            arrayList2.add(p17);
        }
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f103139e;
        arrayList2.add(finderFullSeekBarLayout.getSeekLayout());
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        cw2.da videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
        if (finderThumbPlayerProxy != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.a7((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) a17, s0Var, arrayList2, finderThumbPlayerProxy, null, new com.tencent.mm.plugin.finder.convert.cb(finderFullSeekBarLayout), null, 40, null);
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
            if (baseFinderFeed != null) {
                jSONObject.put("feedid", pm0.v.u(baseFinderFeed.getItemId()));
            }
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "accelerate_play", 1, jSONObject, false, null, 48, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

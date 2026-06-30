package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fb implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103362e;

    public fb(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f103361d = s0Var;
        this.f103362e = baseFinderFeed;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        cw2.h8 playInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        in5.s0 s0Var = this.f103361d;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        mn2.g4 g4Var = (finderVideoLayout == null || (playInfo = finderVideoLayout.getPlayInfo()) == null) ? null : playInfo.f223747c;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.plugin.finder.viewmodel.component.q8 q8Var = (com.tencent.mm.plugin.finder.viewmodel.component.q8) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.q8.class);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        q8Var.P6(context2, this.f103362e, g4Var, s0Var);
        s0Var.o().requestLayout();
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

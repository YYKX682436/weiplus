package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103821e;

    public kc(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f103820d = s0Var;
        this.f103821e = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshFinderLivingStatusView$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f103820d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f103821e;
        ya2.b2 contact = baseFinderFeed.getContact();
        com.tencent.mm.plugin.finder.view.er erVar = new com.tencent.mm.plugin.finder.view.er(context, contact != null ? contact.D0() : null, s0Var.getAdapterPosition(), baseFinderFeed.getFeedObject().isLiveFeed(), baseFinderFeed.getFeedObject().getId());
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = baseFinderFeed.getFeedObject().getFeedObject();
        so2.h2 h2Var = so2.h2.f410385e;
        erVar.c(true, false, feedObject, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshFinderLivingStatusView$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.b1 f105073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f105074f;

    public z0(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.b1 b1Var, int i17) {
        this.f105072d = s0Var;
        this.f105073e = b1Var;
        this.f105074f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        androidx.lifecycle.j0 j0Var;
        jz5.l lVar;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer;
        r45.ey0 ey0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert$refreshJumpToFeedListUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f105072d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class)).f133650u) {
            int i17 = this.f105074f;
            android.view.View itemView = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            com.tencent.mm.plugin.finder.convert.b1 b1Var = this.f105073e;
            ey2.u s17 = b1Var.s();
            if (s17 == null || (j0Var = s17.f257542x) == null || (lVar = (jz5.l) j0Var.getValue()) == null || (dataBuffer = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar.f302833d) == null) {
                com.tencent.mars.xlog.Log.w("Finder.FinderColumnCardVideoConvert", "feedList is null or not DataBuffer<RVFeed> type");
            } else if (i17 < 0 || i17 >= dataBuffer.size()) {
                com.tencent.mars.xlog.Log.w("Finder.FinderColumnCardVideoConvert", "Invalid position: " + i17 + ", feedList size: " + dataBuffer.size());
            } else {
                java.lang.Object obj = dataBuffer.get(i17);
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
                if (baseFinderFeed == null) {
                    com.tencent.mars.xlog.Log.w("Finder.FinderColumnCardVideoConvert", "feed at position " + i17 + " is null or not BaseFinderFeed type");
                } else {
                    android.content.Context context2 = itemView.getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                    r45.qt2 W6 = nyVar != null ? nyVar.W6(b1Var.f104057o) : new r45.qt2();
                    com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) itemView.findViewById(com.tencent.mm.R.id.e_k);
                    if (finderVideoLayout != null) {
                        finderVideoLayout.W(baseFinderFeed.getItemId(), false, true, 3);
                    }
                    r45.en2 en2Var = b1Var.f102918v;
                    int integer = (en2Var == null || (ey0Var = (r45.ey0) en2Var.getCustom(11)) == null) ? 0 : ey0Var.getInteger(0);
                    if (!baseFinderFeed.getFeedObject().isLive()) {
                        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) c17;
                        android.content.Context context3 = itemView.getContext();
                        kotlin.jvm.internal.o.f(context3, "getContext(...)");
                        i0Var.vj(context3, null, dataBuffer, s17.O6(), i17, en2Var != null ? en2Var.getString(0) : null, integer);
                    }
                    baseFinderFeed.l1(W6.getInteger(5));
                    baseFinderFeed.a2(355);
                    baseFinderFeed.h1(true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert$refreshJumpToFeedListUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

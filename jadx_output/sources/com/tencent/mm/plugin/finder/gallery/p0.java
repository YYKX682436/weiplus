package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class p0 extends com.tencent.mm.plugin.finder.convert.df {
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.r0 A1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.finder.gallery.r0 r0Var, boolean z17, int i17) {
        super(r0Var, z17, i17, false, 8, null);
        this.A1 = r0Var;
    }

    @Override // com.tencent.mm.plugin.finder.convert.df, in5.r
    /* renamed from: P1 */
    public void h(in5.s0 holder, so2.d1 item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.plugin.finder.gallery.u0.f111413a.a(holder);
        java.lang.String Gj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Gj(item.getFeedObject().getDescription());
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) holder.p(com.tencent.mm.R.id.f487278o45);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.tencent.mm.ui.MMActivity mMActivity = this.A1.f106421d;
        float dimension = holder.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479850gz);
        ((ke0.e) xVar).getClass();
        neatTextView.b(com.tencent.mm.pluginsdk.ui.span.c0.j(mMActivity, Gj, dimension));
        android.view.View p17 = holder.p(com.tencent.mm.R.id.eeb);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedImage;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedImage;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.eec);
        if (p18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedImage;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/gallery/FinderGalleryTimelineContract$Presenter$buildItemCoverts$1$getItemConvert$2", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedImage;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        t(holder);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void S0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        so2.d1 item = (so2.d1) baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void T0(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f485561i44)).setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void W0(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.ggt)).setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public boolean i0() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void o0(in5.s0 holder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void y0(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}

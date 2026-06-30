package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fo extends com.tencent.mm.plugin.finder.convert.eh {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f103403r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(int i17, tu2.b itemViewConfig, boolean z17) {
        super(i17, itemViewConfig, null, null, 12, null);
        kotlin.jvm.internal.o.g(itemViewConfig, "itemViewConfig");
        this.f103403r = z17;
    }

    @Override // com.tencent.mm.plugin.finder.convert.eh, in5.r
    /* renamed from: q */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        if (this.f103403r) {
            x(holder, item);
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f484870fs4);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMemberFeedImageRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMemberFeedImageRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.convert.ck.w(this, holder, item, 0.0f, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.convert.ck
    public void t(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (this.f103403r) {
            return;
        }
        super.t(holder, item);
    }

    @Override // com.tencent.mm.plugin.finder.convert.ck
    public void u(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.u(holder, item);
        com.tencent.mm.plugin.finder.convert.ck.w(this, holder, item, 0.0f, 4, null);
    }
}

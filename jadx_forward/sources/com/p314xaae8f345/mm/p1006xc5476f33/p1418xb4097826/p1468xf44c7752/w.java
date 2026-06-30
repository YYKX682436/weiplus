package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class w extends pd2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.y f192950e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.y yVar) {
        this.f192950e = yVar;
    }

    @Override // pd2.a, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        if (item.h() != 4) {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.hhk);
            if (p17 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryMusicPostConfig$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/gallery/FinderGalleryMusicPostConfig$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.y yVar = this.f192950e;
        if (yVar.f192893a.f192879e <= 0) {
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.hhk);
            if (p18 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryMusicPostConfig$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/gallery/FinderGalleryMusicPostConfig$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().m59264x7efe73ec());
        long m75942xfb822ef2 = mb4Var != null ? mb4Var.m75942xfb822ef2(24) : 0L;
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.hhk);
        if (p19 == null) {
            return;
        }
        int i19 = m75942xfb822ef2 < yVar.f192893a.f192879e ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryMusicPostConfig$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/gallery/FinderGalleryMusicPostConfig$buildItemCoverts$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

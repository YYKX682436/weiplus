package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class jw extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f107144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(1);
        this.f107144d = pzVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.ct ctVar;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f107144d;
        if (pzVar.C.getDataList().size() > 1 && (ctVar = pzVar.f108759m) != null && (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(intValue + 1));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$buildItemCoverts$1$getItemConvert$4", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$buildItemCoverts$1$getItemConvert$4", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

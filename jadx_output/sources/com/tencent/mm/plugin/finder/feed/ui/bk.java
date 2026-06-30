package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class bk extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSelectActivityUI2 f109712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader f109713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(com.tencent.mm.plugin.finder.feed.ui.FinderSelectActivityUI2 finderSelectActivityUI2, com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader) {
        super(1);
        this.f109712d = finderSelectActivityUI2;
        this.f109713e = finderActivitySearchLoader;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.recyclerview.widget.f2 adapter;
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader = this.f109713e;
        int size = finderActivitySearchLoader.getDataList().size();
        com.tencent.mm.plugin.finder.feed.ui.FinderSelectActivityUI2 finderSelectActivityUI2 = this.f109712d;
        if (size == 0) {
            android.view.View view = finderSelectActivityUI2.loadingView;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "refreshWhenDataReady", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "refreshWhenDataReady", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderSelectActivityUI2.d7().setVisibility(0);
            finderSelectActivityUI2.e7().setVisibility(8);
        } else {
            android.view.View view2 = finderSelectActivityUI2.loadingView;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "refreshWhenDataReady", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "refreshWhenDataReady", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderSelectActivityUI2.d7().setVisibility(8);
            finderSelectActivityUI2.e7().setVisibility(0);
        }
        if (intValue == 0) {
            androidx.recyclerview.widget.f2 adapter2 = finderSelectActivityUI2.getRecyclerView().getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
        } else if (intValue < size && (adapter = finderSelectActivityUI2.getRecyclerView().getAdapter()) != null) {
            adapter.notifyItemRangeInserted(intValue, size - intValue);
        }
        finderSelectActivityUI2.e7().post(new pt2.n(intValue, finderSelectActivityUI2, size));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader2 = finderSelectActivityUI2.E;
        if (finderActivitySearchLoader2 == null) {
            kotlin.jvm.internal.o.o("feedloader");
            throw null;
        }
        org.json.JSONObject put = jSONObject.put("search_word", finderActivitySearchLoader2.f125676d).put("search_res_num", finderActivitySearchLoader.getDataList().size()).put("vst_id", finderSelectActivityUI2.F);
        com.tencent.mm.plugin.finder.report.e3 e3Var = com.tencent.mm.plugin.finder.report.e3.f125009a;
        androidx.appcompat.app.AppCompatActivity context = finderSelectActivityUI2.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e3Var.a("3", xy2.c.e(context), put);
        return jz5.f0.f302826a;
    }
}

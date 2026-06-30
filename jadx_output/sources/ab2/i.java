package ab2;

/* loaded from: classes2.dex */
public final class i implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment f2777a;

    public i(com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment finderBizProfileFragment) {
        this.f2777a = finderBizProfileFragment;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment finderBizProfileFragment = this.f2777a;
        ab2.g gVar = finderBizProfileFragment.A;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View t17 = gVar.t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ab2.g gVar2 = finderBizProfileFragment.A;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = gVar2.getRecyclerView();
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(0);
        }
    }
}

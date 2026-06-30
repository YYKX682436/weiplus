package ab2;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment f2799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment finderBizProfileFragment) {
        super(1);
        this.f2799d = finderBizProfileFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment finderBizProfileFragment = this.f2799d;
        if (intValue == -2) {
            int i17 = com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment.M;
            android.view.View K0 = finderBizProfileFragment.K0();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(K0, arrayList.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1", "invoke", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            K0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(K0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1", "invoke", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View L0 = finderBizProfileFragment.L0();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(L0, arrayList2.toArray(), "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1", "invoke", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            L0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(L0, "com/tencent/mm/plugin/finder/biz/FinderBizProfileFragment$scrollToPositionAfterJustWatched$1", "invoke", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (finderBizProfileFragment.L) {
            finderBizProfileFragment.G0(false);
            finderBizProfileFragment.f102761J = true;
            ab2.g gVar = finderBizProfileFragment.A;
            if (gVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = gVar.getRecyclerView();
            recyclerView.postDelayed(new ab2.x(recyclerView, intValue, (int) recyclerView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479649bo)), 200L);
        }
        return jz5.f0.f302826a;
    }
}

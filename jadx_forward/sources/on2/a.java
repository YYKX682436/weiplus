package on2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.d f428357d;

    public a(on2.d dVar) {
        this.f428357d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/FinderLiveAnchorLotteryEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        on2.d dVar = this.f428357d;
        dVar.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = dVar.f428395f;
        if (((mm2.c1) lVar.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) lVar.X0(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
            vVar.a();
            vVar.c(2019);
        }
        ll2.e eVar = ll2.e.f400666a;
        ll2.e.b(eVar, dVar.f428399m, false, false, 6, null);
        ll2.e.b(eVar, dVar.f428400n, false, false, 6, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveAnchorLotteryEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

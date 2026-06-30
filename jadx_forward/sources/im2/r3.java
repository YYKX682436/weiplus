package im2;

/* loaded from: classes.dex */
public final class r3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374050d;

    public r3(im2.z3 z3Var) {
        this.f374050d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$showPurchaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f374050d;
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zp(z3Var.m158354x19263085(), new im2.n3(z3Var)).a(kz5.c0.i(10, 500, 1000, 2000));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$showPurchaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

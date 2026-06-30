package tx2;

/* loaded from: classes3.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx2.z0 f504196d;

    public u0(tx2.z0 z0Var) {
        this.f504196d = z0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/notice/PayConcertLiveSecondCheckWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        tx2.z0 z0Var = this.f504196d;
        j45.l.k(z0Var.getContext(), "wallet", ".wecoin.ui.WeCoinRechargeView", intent, true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = z0Var.f504210e;
        if (y1Var != null) {
            y1Var.q();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/PayConcertLiveSecondCheckWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

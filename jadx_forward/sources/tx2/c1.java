package tx2;

/* loaded from: classes3.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx2.g1 f504073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f504074e;

    public c1(tx2.g1 g1Var, yz5.a aVar) {
        this.f504073d = g1Var;
        this.f504074e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f504073d.f504101e;
        if (y1Var != null) {
            y1Var.q();
        }
        this.f504074e.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

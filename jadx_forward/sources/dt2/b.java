package dt2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.d f324694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f324695e;

    public b(dt2.d dVar, yz5.a aVar) {
        this.f324694d = dVar;
        this.f324695e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        dt2.d dVar = this.f324694d;
        dt2.d.a(dVar, true, dVar.f324698e, dVar.m126194x74e7fabc());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 m126190xb4dbbcbe = dVar.m126190xb4dbbcbe();
        if (m126190xb4dbbcbe != null) {
            m126190xb4dbbcbe.q();
        }
        this.f324695e.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

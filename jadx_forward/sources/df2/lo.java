package df2;

/* loaded from: classes3.dex */
public final class lo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.to f312222d;

    public lo(df2.to toVar) {
        this.f312222d = toVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.LinkedList m75941xfb821914;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveNoticeBannerController$getNoticeItemViewInstance$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        df2.to toVar = this.f312222d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(toVar.f312993m, "noticeItemView fast click");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveNoticeBannerController$getNoticeItemViewInstance$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        df2.to.Z6(toVar, 2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBannerClick] notice size = ");
        r45.j32 j32Var = toVar.f312995o;
        sb6.append((j32Var == null || (m75941xfb821914 = j32Var.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb821914.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(toVar.f312993m, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(toVar, null, null, new df2.qo(toVar, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveNoticeBannerController$getNoticeItemViewInstance$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package au2;

/* loaded from: classes2.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18 f95606d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18 c14988xa0c9eb18) {
        this.f95606d = c14988xa0c9eb18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shortcuts/FinderShortcutsDrawer$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/shortcuts/FinderShortcutsDrawer$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18.f207899z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18 c14988xa0c9eb18 = this.f95606d;
        c14988xa0c9eb18.getClass();
        long c17 = c01.id.c();
        i95.m c18 = i95.n0.c(au2.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((au2.q) c18).f95622g = java.lang.Long.valueOf(c17);
        hc2.v0.d(c14988xa0c9eb18, "finder_quick_add", "view_clk", false, kz5.b1.e(new jz5.l("click_timestamp", java.lang.Long.valueOf(c17))), null, 20, null);
        i95.m c19 = i95.n0.c(au2.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        android.content.Context context = c14988xa0c9eb18.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((au2.q) c19).wi(context);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shortcuts/FinderShortcutsDrawer$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

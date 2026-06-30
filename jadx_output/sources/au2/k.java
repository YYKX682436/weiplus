package au2;

/* loaded from: classes2.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer f14073d;

    public k(com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer finderShortcutsDrawer) {
        this.f14073d = finderShortcutsDrawer;
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
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/shortcuts/FinderShortcutsDrawer$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i17 = com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer.f126366z;
        com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer finderShortcutsDrawer = this.f14073d;
        finderShortcutsDrawer.getClass();
        long c17 = c01.id.c();
        i95.m c18 = i95.n0.c(au2.q.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((au2.q) c18).f14089g = java.lang.Long.valueOf(c17);
        hc2.v0.d(finderShortcutsDrawer, "finder_quick_add", "view_clk", false, kz5.b1.e(new jz5.l("click_timestamp", java.lang.Long.valueOf(c17))), null, 20, null);
        i95.m c19 = i95.n0.c(au2.q.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        android.content.Context context = finderShortcutsDrawer.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((au2.q) c19).wi(context);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shortcuts/FinderShortcutsDrawer$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

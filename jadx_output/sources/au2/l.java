package au2;

/* loaded from: classes2.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer f14074d;

    public l(com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer finderShortcutsDrawer) {
        this.f14074d = finderShortcutsDrawer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shortcuts/FinderShortcutsDrawer$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/shortcuts/FinderShortcutsDrawer$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer finderShortcutsDrawer = this.f14074d;
        finderShortcutsDrawer.getClass();
        com.tencent.mm.view.drawer.RecyclerViewDrawer.o(finderShortcutsDrawer, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shortcuts/FinderShortcutsDrawer$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

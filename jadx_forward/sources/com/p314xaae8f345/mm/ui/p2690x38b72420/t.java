package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment f288719d;

    public t(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment) {
        this.f288719d = addressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment.Y;
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment = this.f288719d;
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54 = (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) addressUIFragment.mo7438x76847179();
        if (activityC21387x976b8e54 == null || activityC21387x976b8e54.f7().f278458e == 1) {
            android.widget.ListView listView = addressUIFragment.f287840o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(listView);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment", "doubleTap", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.m.a((android.widget.ListView) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment", "doubleTap", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2690x38b72420.j(addressUIFragment), 300L);
        }
    }
}

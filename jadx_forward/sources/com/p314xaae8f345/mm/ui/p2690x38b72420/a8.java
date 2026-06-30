package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes4.dex */
public class a8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment f288125d;

    public a8(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f288125d = openIMAddressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22322x8ea5381a.OpenIMAddressUIFragment openIMAddressUIFragment = this.f288125d;
        android.widget.ListView listView = openIMAddressUIFragment.f288052e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(listView);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment", "doubleTap", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m.a((android.widget.ListView) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/ui/contact/OpenIMAddressUI$OpenIMAddressUIFragment", "doubleTap", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2690x38b72420.k7(openIMAddressUIFragment), 300L);
    }
}

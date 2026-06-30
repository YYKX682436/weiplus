package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class c8 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI f109745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI finderLiveBizListUI) {
        super(3);
        this.f109745d = finderLiveBizListUI;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.vl3 resp = (r45.vl3) obj3;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI finderLiveBizListUI = this.f109745d;
        android.view.View view = finderLiveBizListUI.f109344y;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$requestList$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/GetProfileScreenCastResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$requestList$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/GetProfileScreenCastResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (intValue == 0 && intValue2 == 0) {
            java.util.LinkedList list = resp.getList(0);
            kotlin.jvm.internal.o.f(list, "getList(...)");
            bm2.f1 f1Var = finderLiveBizListUI.f109345z;
            f1Var.getClass();
            f1Var.f21881d = list;
            f1Var.notifyDataSetChanged();
        } else {
            android.view.View view2 = finderLiveBizListUI.f109343x;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("retryView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$requestList$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/GetProfileScreenCastResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$requestList$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/GetProfileScreenCastResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class l8 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI f110260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI finderLiveBizSearchUI) {
        super(3);
        this.f110260d = finderLiveBizSearchUI;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.kx5 resp = (r45.kx5) obj3;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI finderLiveBizSearchUI = this.f110260d;
        android.view.View view = finderLiveBizSearchUI.A;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.LinkedList list = resp.getList(0);
        kotlin.jvm.internal.o.f(list, "getList(...)");
        bm2.f1 f1Var = finderLiveBizSearchUI.B;
        f1Var.getClass();
        f1Var.f21881d = list;
        f1Var.notifyDataSetChanged();
        if (intValue != 0 || intValue2 != 0) {
            android.view.View view2 = finderLiveBizSearchUI.f109352z;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = finderLiveBizSearchUI.f109351y;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("retryView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (resp.getList(0).isEmpty()) {
            android.view.View view4 = finderLiveBizSearchUI.f109351y;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("retryView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = finderLiveBizSearchUI.f109352z;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view6 = finderLiveBizSearchUI.f109351y;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("retryView");
                throw null;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = finderLiveBizSearchUI.f109352z;
            if (view7 == null) {
                kotlin.jvm.internal.o.o("noResultView");
                throw null;
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

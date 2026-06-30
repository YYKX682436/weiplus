package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class l8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13993xa27aaebd f191793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13993xa27aaebd activityC13993xa27aaebd) {
        super(3);
        this.f191793d = activityC13993xa27aaebd;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.kx5 resp = (r45.kx5) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13993xa27aaebd activityC13993xa27aaebd = this.f191793d;
        android.view.View view = activityC13993xa27aaebd.A;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getList(...)");
        bm2.f1 f1Var = activityC13993xa27aaebd.B;
        f1Var.getClass();
        f1Var.f103414d = m75941xfb821914;
        f1Var.m8146xced61ae5();
        if (intValue != 0 || intValue2 != 0) {
            android.view.View view2 = activityC13993xa27aaebd.f190885z;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = activityC13993xa27aaebd.f190884y;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (resp.m75941xfb821914(0).isEmpty()) {
            android.view.View view4 = activityC13993xa27aaebd.f190884y;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = activityC13993xa27aaebd.f190885z;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view6 = activityC13993xa27aaebd.f190884y;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
                throw null;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = activityC13993xa27aaebd.f190885z;
            if (view7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
                throw null;
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}

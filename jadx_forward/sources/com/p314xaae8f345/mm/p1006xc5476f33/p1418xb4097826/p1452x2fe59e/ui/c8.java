package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class c8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13991x36464073 f191278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13991x36464073 activityC13991x36464073) {
        super(3);
        this.f191278d = activityC13991x36464073;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.vl3 resp = (r45.vl3) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13991x36464073 activityC13991x36464073 = this.f191278d;
        android.view.View view = activityC13991x36464073.f190877y;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$requestList$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/GetProfileScreenCastResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$requestList$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/GetProfileScreenCastResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (intValue == 0 && intValue2 == 0) {
            java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getList(...)");
            bm2.f1 f1Var = activityC13991x36464073.f190878z;
            f1Var.getClass();
            f1Var.f103414d = m75941xfb821914;
            f1Var.m8146xced61ae5();
        } else {
            android.view.View view2 = activityC13991x36464073.f190876x;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$requestList$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/GetProfileScreenCastResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizListUI$requestList$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/GetProfileScreenCastResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes10.dex */
public final class r implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 f191422d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084) {
        this.f191422d = activityC14126xa5cf9084;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.List list = (java.util.List) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084 = this.f191422d;
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = activityC14126xa5cf9084.f191311v;
        on5.c m82923x19404fcc = c22851x22587864 != null ? c22851x22587864.m82923x19404fcc() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.C14129xeeef4ef6 c14129xeeef4ef6 = m82923x19404fcc instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.C14129xeeef4ef6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.C14129xeeef4ef6) m82923x19404fcc : null;
        if (c14129xeeef4ef6 != null) {
            c14129xeeef4ef6.m56608x9c8b62cf(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.q(activityC14126xa5cf9084, c14129xeeef4ef6));
        }
        if (activityC14126xa5cf9084.d7().f191363q) {
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878642 = activityC14126xa5cf9084.f191311v;
            if (c22851x225878642 != null) {
                c22851x225878642.e(true);
            }
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878643 = activityC14126xa5cf9084.f191311v;
            if (c22851x225878643 != null) {
                c22851x225878643.f();
            }
        }
        int size = activityC14126xa5cf9084.d7().f191360n.size();
        if (true ^ list.isEmpty()) {
            activityC14126xa5cf9084.d7().f191360n.addAll(list);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = activityC14126xa5cf9084.f191313x;
            if (c22848x6ddd90cf != null) {
                int a07 = c22848x6ddd90cf.a0() + size;
                c22848x6ddd90cf.m8153xd399a4d9(a07, list.size());
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC14126xa5cf9084.f191310u;
                if (c1163xf1deaba4 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(a07));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$collectFlows$1$1", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "smoothScrollToPosition", "(I)V");
                    c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$collectFlows$1$1", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "smoothScrollToPosition", "(I)V");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

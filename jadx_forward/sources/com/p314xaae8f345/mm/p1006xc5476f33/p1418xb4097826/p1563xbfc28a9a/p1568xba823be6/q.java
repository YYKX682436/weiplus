package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6;

/* loaded from: classes2.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s f202875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s sVar) {
        super(1);
        this.f202875d = sVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.w wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        int pullType = response.getPullType();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s sVar = this.f202875d;
        if (pullType == 0) {
            java.util.List m56409x97891cf7 = response.m56409x97891cf7();
            boolean z17 = (m56409x97891cf7 != null ? m56409x97891cf7.size() : 0) <= sVar.f202879f.f189049h;
            if (response.getErrCode() == 0 || !z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.w wVar2 = sVar.f202880g;
                if (wVar2 != null) {
                    wVar2.j(z17, sVar.f202883m);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.w wVar3 = sVar.f202880g;
                if (wVar3 != null) {
                    android.view.View view = wVar3.f202909m;
                    if (view == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = wVar3.f202911o;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryTip");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = wVar3.f202912p;
                    if (view3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                        throw null;
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view4 = wVar3.f202910n;
                    if (view4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progress");
                        throw null;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/question/FinderMemberQAViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view5 = wVar3.f202909m;
                    if (view5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyLayout");
                        throw null;
                    }
                    view5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.v(wVar3));
                }
            }
        }
        if (!response.getHasMore() && (wVar = sVar.f202880g) != null) {
            wVar.a().E(true);
        }
        sVar.f202883m = response.getHasMore();
        return jz5.f0.f384359a;
    }
}

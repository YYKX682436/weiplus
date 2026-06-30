package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all;

/* loaded from: classes2.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.m f202620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.m mVar) {
        super(1);
        this.f202620d = mVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.q qVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        int pullType = response.getPullType();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.m mVar = this.f202620d;
        if (pullType == 0) {
            java.util.List m56409x97891cf7 = response.m56409x97891cf7();
            boolean z17 = (m56409x97891cf7 != null ? m56409x97891cf7.size() : 0) <= mVar.f202623f.f189036g;
            if (response.getErrCode() == 0 || !z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.q qVar2 = mVar.f202624g;
                if (qVar2 != null) {
                    qVar2.g(z17, mVar.f202626i);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.q qVar3 = mVar.f202624g;
                if (qVar3 != null) {
                    android.view.View view = qVar3.f202642i;
                    if (view == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = qVar3.f202644n;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryTip");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = qVar3.f202645o;
                    if (view3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                        throw null;
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view4 = qVar3.f202643m;
                    if (view4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progress");
                        throw null;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/all/FinderMemberAllViewCallback", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view5 = qVar3.f202642i;
                    if (view5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyLayout");
                        throw null;
                    }
                    view5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all.p(qVar3));
                }
            }
        }
        if (!response.getHasMore() && (qVar = mVar.f202624g) != null) {
            qVar.a().E(true);
        }
        mVar.f202626i = response.getHasMore();
        return jz5.f0.f384359a;
    }
}

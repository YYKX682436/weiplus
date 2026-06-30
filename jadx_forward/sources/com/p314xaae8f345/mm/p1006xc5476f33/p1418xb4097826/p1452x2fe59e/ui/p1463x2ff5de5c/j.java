package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.o f191380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191381e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.o oVar, android.view.View view) {
        this.f191380d = oVar;
        this.f191381e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View inflate;
        android.view.View parent = this.f191381e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(parent, "$parent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.o oVar = this.f191380d;
        if (oVar.f191413h) {
            return;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) parent.findViewById(com.p314xaae8f345.mm.R.id.vnc);
        if (viewStub == null) {
            inflate = parent.findViewById(com.p314xaae8f345.mm.R.id.vbb);
            if (inflate != null) {
                if (inflate.getVisibility() == 0) {
                    return;
                }
            }
            inflate = null;
        } else {
            inflate = viewStub.inflate();
            if (inflate != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$OnPageChangeCallback", "showBottomEdu", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(inflate, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$OnPageChangeCallback", "showBottomEdu", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(inflate, "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            inflate = null;
        }
        if (inflate == null) {
            return;
        }
        oVar.f191413h = true;
        android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.ssh);
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ((cq.k) c17).f302759g.f323818b;
        if (o4Var != null) {
            o4Var.G("kFinderCommentImageFlowBottomEduDisplayed", true);
        }
        inflate.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.n(inflate, findViewById));
    }
}

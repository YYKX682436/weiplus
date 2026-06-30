package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.o f109847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109848e;

    public j(com.tencent.mm.plugin.finder.feed.ui.commentimage.o oVar, android.view.View view) {
        this.f109847d = oVar;
        this.f109848e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View inflate;
        android.view.View parent = this.f109848e;
        kotlin.jvm.internal.o.f(parent, "$parent");
        com.tencent.mm.plugin.finder.feed.ui.commentimage.o oVar = this.f109847d;
        if (oVar.f109880h) {
            return;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) parent.findViewById(com.tencent.mm.R.id.vnc);
        if (viewStub == null) {
            inflate = parent.findViewById(com.tencent.mm.R.id.vbb);
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
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        oVar.f109880h = true;
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.ssh);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.sdk.platformtools.o4 o4Var = ((cq.k) c17).f221226g.f242285b;
        if (o4Var != null) {
            o4Var.G("kFinderCommentImageFlowBottomEduDisplayed", true);
        }
        inflate.post(new com.tencent.mm.plugin.finder.feed.ui.commentimage.n(inflate, findViewById));
    }
}

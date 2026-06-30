package hd2;

/* loaded from: classes8.dex */
public final class o implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f362036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e f362037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f362038c;

    public o(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f362036a = view;
        this.f362037b = c14133xabc4217e;
        this.f362038c = k0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d1
    /* renamed from: onShow */
    public final void mo14645xc39f557c() {
        android.view.View view = this.f362036a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$onViewCreated$9", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$onViewCreated$9", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View container = this.f362036a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(container, "$container");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f362038c;
        android.view.View view2 = k0Var.S;
        int measuredHeight = view2 != null ? view2.getMeasuredHeight() : 0;
        int measuredHeight2 = container.getMeasuredHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e = this.f362037b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e.l0(c14133xabc4217e, container, measuredHeight, measuredHeight2);
        android.view.ViewTreeObserver viewTreeObserver = container.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new hd2.n(container, c14133xabc4217e, k0Var));
        }
    }
}

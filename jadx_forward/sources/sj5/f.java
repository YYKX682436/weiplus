package sj5;

/* loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 f490452d;

    public f(com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 c22478xb6499b94) {
        this.f490452d = c22478xb6499b94;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 c22478xb6499b94 = this.f490452d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c22478xb6499b94.isDragging);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c22478xb6499b94, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c22478xb6499b94, arrayList2.toArray(), "com/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView$hideRunnable$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22478xb6499b94.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c22478xb6499b94, "com/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView$hideRunnable$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(c22478xb6499b94, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf, c22478xb6499b94)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c22478xb6499b94, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(c22478xb6499b94, arrayList4.toArray(), "com/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView$hideRunnable$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22478xb6499b94.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(c22478xb6499b94, "com/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView$hideRunnable$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(c22478xb6499b94, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f490452d.setAlpha(1.0f);
    }
}

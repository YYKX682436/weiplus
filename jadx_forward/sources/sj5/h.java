package sj5;

/* loaded from: classes.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 f490454d;

    public h(com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 c22478xb6499b94) {
        this.f490454d = c22478xb6499b94;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 c22478xb6499b94 = this.f490454d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c22478xb6499b94, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c22478xb6499b94, arrayList2.toArray(), "com/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView$showImmediately$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22478xb6499b94.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c22478xb6499b94, "com/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView$showImmediately$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(c22478xb6499b94, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f490454d.setAlpha(0.0f);
    }
}

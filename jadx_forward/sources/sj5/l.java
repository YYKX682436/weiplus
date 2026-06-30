package sj5;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 f490458d;

    public l(com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 c22478xb6499b94) {
        this.f490458d = c22478xb6499b94;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94 c22478xb6499b94 = this.f490458d;
        com.p314xaae8f345.mm.ui.p2734x9d861347.p2735x4fe3eeaf.C22478xb6499b94.d(c22478xb6499b94);
        em.v3 v3Var = c22478xb6499b94.f291329g;
        if (v3Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (v3Var.f336408d == null) {
            v3Var.f336408d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) v3Var.f336405a.findViewById(com.p314xaae8f345.mm.R.id.a4t);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = v3Var.f336408d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c22699x3dcdb352, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c22699x3dcdb352, arrayList2.toArray(), "com/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView$tryExpand$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c22699x3dcdb352, "com/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView$tryExpand$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(c22699x3dcdb352, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22478xb6499b94.performHapticFeedback(25);
    }
}

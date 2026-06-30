package vc5;

/* loaded from: classes.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21819x24b6e7b5 f516879d;

    public u(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21819x24b6e7b5 c21819x24b6e7b5) {
        this.f516879d = c21819x24b6e7b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21819x24b6e7b5 c21819x24b6e7b5 = this.f516879d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c21819x24b6e7b5, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c21819x24b6e7b5, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryTimelineOverlayView$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c21819x24b6e7b5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c21819x24b6e7b5, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryTimelineOverlayView$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(c21819x24b6e7b5, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f516879d.setAlpha(1.0f);
    }
}

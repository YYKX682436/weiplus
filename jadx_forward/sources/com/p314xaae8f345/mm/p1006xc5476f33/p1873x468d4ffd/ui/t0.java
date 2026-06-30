package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes3.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16553x9b9a9a23 f230953d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16553x9b9a9a23 c16553x9b9a9a23) {
        this.f230953d = c16553x9b9a9a23;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16553x9b9a9a23 c16553x9b9a9a23 = this.f230953d;
        android.view.View view = c16553x9b9a9a23.f230751e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView", "switchToAlmostEndState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView", "switchToAlmostEndState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c16553x9b9a9a23.f230754h.setVisibility(0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c16553x9b9a9a23.f230753g.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.addRule(14);
        layoutParams.addRule(2, c16553x9b9a9a23.f230751e.getId());
        c16553x9b9a9a23.requestLayout();
        c16553x9b9a9a23.invalidate();
    }
}

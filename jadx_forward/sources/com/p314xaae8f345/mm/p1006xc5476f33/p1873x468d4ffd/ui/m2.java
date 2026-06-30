package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes4.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230901d;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d) {
        this.f230901d = activityC16554x70dcab5d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230901d;
        android.view.View view = activityC16554x70dcab5d.f230776s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC16554x70dcab5d.f230774q.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.apb);
        activityC16554x70dcab5d.f230774q.setImageResource(com.p314xaae8f345.mm.R.raw.f80628xbf6d9f39);
        activityC16554x70dcab5d.f230774q.setEnabled(true);
    }
}

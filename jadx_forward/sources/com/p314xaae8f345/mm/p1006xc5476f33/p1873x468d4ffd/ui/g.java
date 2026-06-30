package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public final class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 f230865d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 c16548x9f1d7908) {
        this.f230865d = c16548x9f1d7908;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playReverseAni record ani >> ani end ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 c16548x9f1d7908 = this.f230865d;
        sb6.append(c16548x9f1d7908.f230695u);
        sb6.append(", ");
        sb6.append(c16548x9f1d7908.f230680J);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightRecordButton", sb6.toString());
        if (!c16548x9f1d7908.f230680J) {
            c16548x9f1d7908.f230695u = false;
            return;
        }
        if (c16548x9f1d7908.f230695u) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.r rVar = c16548x9f1d7908.f230688n;
            if (rVar != null) {
                ((yt3.w2) rVar).a();
            }
            c16548x9f1d7908.f230695u = false;
            return;
        }
        int i17 = c16548x9f1d7908.K;
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightRecordButton", "tap to auto record");
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908.a(c16548x9f1d7908, true);
            return;
        }
        if (i17 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightRecordButton", "tap to take picture");
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u3 u3Var = c16548x9f1d7908.f230690p;
            if (u3Var != null) {
                ((yt3.v2) u3Var).a();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightRecordButton", "tap to delay record RECORD_MODE_DELAY_WAITING");
        c16548x9f1d7908.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightRecordButton", "changeToRecordDelayRunning");
        c16548x9f1d7908.K = 4;
        android.view.View view = c16548x9f1d7908.f230686i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "changeToRecordDelayRunning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "changeToRecordDelayRunning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = c16548x9f1d7908.f230685h;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View view2 = c16548x9f1d7908.f230681d;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "changeToRecordDelayRunning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/mmsight/ui/ImproveMMSightRecordButton", "changeToRecordDelayRunning", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.c cVar = c16548x9f1d7908.f230691q;
        if (cVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordButtonPlugin", "countDownStart");
            ju3.d0.k(((yt3.y2) cVar).f547259a.f547271e, ju3.c0.O2, null, 2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightRecordButton", "playReverseAni record ani >> ani start");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908.L;
        this.f230865d.e();
    }
}

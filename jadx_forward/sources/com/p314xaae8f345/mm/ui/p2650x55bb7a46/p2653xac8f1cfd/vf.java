package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class vf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf f281661e;

    public vf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar, java.lang.String str) {
        this.f281661e = rfVar;
        this.f281660d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryMsgTongueComponent", "show animation! GoBackToHistoryMsgLayout2!!!");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar = this.f281661e;
        if (!rfVar.r0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryMsgTongueComponent", "try showRedHintTongue2, but is empty");
            return;
        }
        android.view.View view = rfVar.f281362e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$11", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$11", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rfVar.f281365h = 1;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf.m0(rfVar);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(rfVar.f281362e.getWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(rfVar.f280113d.g(), android.R.anim.accelerate_interpolator));
        translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.uf(this));
        rfVar.f281362e.startAnimation(translateAnimation);
    }
}

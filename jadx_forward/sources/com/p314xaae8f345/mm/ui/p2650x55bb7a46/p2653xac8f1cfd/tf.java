package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class tf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f281528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 f281529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf f281530f;

    public tf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5) {
        this.f281530f = rfVar;
        this.f281528d = z17;
        this.f281529e = c16564xb55e1d5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryMsgTongueComponent", "show animation! GoBackToHistoryMsgLayout!!!");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar = this.f281530f;
        android.view.View view = rfVar.f281362e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$10", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$10", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rfVar.f281365h = 1;
        rfVar.I0(5, true);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(rfVar.f281362e.getWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(rfVar.f280113d.g(), android.R.anim.accelerate_interpolator));
        translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sf(this));
        rfVar.f281362e.startAnimation(translateAnimation);
    }
}

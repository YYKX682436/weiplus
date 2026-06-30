package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class zf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf f281907d;

    public zf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar) {
        this.f281907d = rfVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryMsgTongueComponent", "show animation! GoBackToHistoryMsgLayout!!!");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar = this.f281907d;
        android.view.View view = rfVar.f281362e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rfVar.f281365h = 1;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf.m0(rfVar);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(rfVar.f281362e.getWidth(), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(rfVar.f280113d.g(), android.R.anim.accelerate_interpolator));
        rfVar.f281362e.startAnimation(translateAnimation);
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h0) ((sb5.g) rfVar.f280113d.f542241c.a(sb5.g.class))).n0()) {
            try {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a aVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b;
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y yVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y();
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x xVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                xVar.f300747f = java.lang.System.currentTimeMillis();
                xVar.f300748g = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.w.Expose;
                xVar.f300745d = aVar.b();
                xVar.f300749h = "102_1";
                xVar.f300750i = "elevator";
                cl0.g gVar = new cl0.g();
                gVar.o("new_noti_count", rfVar.f281364g);
                xVar.f300755q = gVar.toString();
                yVar.f300787d = xVar;
                aVar.f(yVar);
            } catch (cl0.f e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HistoryMsgTongueComponent", "json error: %s", e17);
            }
        }
    }
}

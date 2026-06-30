package sj3;

/* loaded from: classes5.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.u1 f490258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f490259e;

    public r1(sj3.u1 u1Var, java.lang.String str) {
        this.f490258d = u1Var;
        this.f490259e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj3.u1 u1Var = this.f490258d;
        android.view.View view = u1Var.f490292g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView$changeRenderUser$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView$changeRenderUser$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = u1Var.f490287b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null) {
            textView.setTextSize(1, 10.0f);
        }
        java.lang.String str = this.f490259e;
        if (textView != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            textView.setText(n17 != null ? n17.P0() : null);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u1Var.f490301p, str)) {
            return;
        }
        u1Var.g(str);
        u1Var.f490301p = str;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        u1Var.f490302q = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
    }
}

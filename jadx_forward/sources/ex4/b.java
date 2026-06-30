package ex4;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex4.o f338744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f338745e;

    public b(ex4.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f338744d = oVar;
        this.f338745e = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper$enterSnapshotMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ex4.o oVar = this.f338744d;
        oVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d context = this.f338745e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (oVar.f338760c && java.lang.Math.abs(java.lang.System.currentTimeMillis() - oVar.f338777t) >= 2000) {
            oVar.f338777t = java.lang.System.currentTimeMillis();
            android.view.View view2 = oVar.f338770m;
            if ((view2 != null ? view2.getVisibility() : 8) == 0) {
                android.view.View view3 = oVar.f338771n;
                if (view3 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper", "snapshotTipsToHighlightState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper", "snapshotTipsToHighlightState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 0.2f);
                    alphaAnimation.setRepeatCount(1);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setRepeatMode(2);
                    alphaAnimation.setAnimationListener(new ex4.g(oVar));
                    view3.startAnimation(alphaAnimation);
                }
            } else {
                android.view.View view4 = oVar.f338770m;
                if (view4 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper", "snapshotTipsToHighlightState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper", "snapshotTipsToHighlightState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view5 = oVar.f338770m;
                if (view5 != null) {
                    android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, ((java.lang.Number) ((jz5.n) oVar.f338759b).mo141623x754a37bb()).intValue() - ((java.lang.Number) ((jz5.n) oVar.f338758a).mo141623x754a37bb()).intValue(), 0.0f);
                    translateAnimation.setDuration(120L);
                    translateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
                    translateAnimation.setAnimationListener(new ex4.h());
                    view5.startAnimation(translateAnimation);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/snapshot/WebViewSnapshotHelper$enterSnapshotMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

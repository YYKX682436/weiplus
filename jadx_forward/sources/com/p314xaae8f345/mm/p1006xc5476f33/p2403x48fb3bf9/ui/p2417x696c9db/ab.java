package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class ab implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f265443d;

    public ab(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f265443d = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUI$29", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f265443d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = viewOnCreateContextMenuListenerC19337x37f3384d.L1;
        if (e3Var != null) {
            e3Var.f263353v1.f263513a = true;
        }
        android.view.View view2 = viewOnCreateContextMenuListenerC19337x37f3384d.f265396v;
        if (view2 != null && view2.getVisibility() == 0) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(viewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.R.C30854x2dc211.f559335bv);
            loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.za(this));
            viewOnCreateContextMenuListenerC19337x37f3384d.f265396v.startAnimation(loadAnimation);
            android.view.View view3 = viewOnCreateContextMenuListenerC19337x37f3384d.f265396v;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$29", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$29", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            if (!view.hasFocus()) {
                view.requestFocus();
            }
            if (motionEvent.getAction() == 0) {
                viewOnCreateContextMenuListenerC19337x37f3384d.f265360j2 = (int) motionEvent.getX();
                viewOnCreateContextMenuListenerC19337x37f3384d.f265362k2 = (int) motionEvent.getY();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var2 = viewOnCreateContextMenuListenerC19337x37f3384d.L1;
                if (e3Var2 != null) {
                    int i17 = viewOnCreateContextMenuListenerC19337x37f3384d.f265360j2;
                    int i18 = viewOnCreateContextMenuListenerC19337x37f3384d.f265362k2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.t2 t2Var = e3Var2.f263353v1;
                    android.graphics.Point point = t2Var.f263515c;
                    if (point == null) {
                        t2Var.f263515c = new android.graphics.Point(i17, i18);
                    } else {
                        point.x = i17;
                        point.y = i18;
                    }
                    t2Var.f263516d = java.lang.System.currentTimeMillis();
                }
            }
        }
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265348f == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$29", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 5 || motionEvent.getAction() == 5 || motionEvent.getAction() == 261 || motionEvent.getAction() == 517) {
            if (motionEvent.getPointerCount() > 1) {
                viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.mo120153xd15cf999().r(true);
                viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.mo120153xd15cf999().N(true);
            } else {
                viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.mo120153xd15cf999().r(false);
                viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.mo120153xd15cf999().N(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI$29", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

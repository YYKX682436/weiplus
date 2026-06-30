package sj3;

/* loaded from: classes4.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f490346d;

    public z(sj3.a1 a1Var) {
        this.f490346d = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj3.a1 a1Var = this.f490346d;
        a1Var.f489945z = false;
        android.view.ViewGroup viewGroup = a1Var.e().f506034c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewGroup, "getSceneRoot(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "handleBadNetworkLogic: hideView");
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.k6o);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "handleBadNetworkLogic$hideNetView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "handleBadNetworkLogic$hideNetView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564577v3);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        layoutParams.height -= findViewById2.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562107a70);
        findViewById2.setLayoutParams(layoutParams);
    }
}

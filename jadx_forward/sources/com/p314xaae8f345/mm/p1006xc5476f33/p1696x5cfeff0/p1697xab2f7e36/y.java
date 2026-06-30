package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.a0 f218724d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.a0 a0Var) {
        this.f218724d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.a0 a0Var = this.f218724d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) a0Var.f218648e.f218605n.getLayoutParams();
        layoutParams.topMargin = (int) (a0Var.f218648e.f218599e.m63496x6c781953() - (a0Var.f218648e.f218605n.getWidth() / 2));
        a0Var.f218648e.f218605n.setLayoutParams(layoutParams);
        a0Var.f218648e.f218605n.setVisibility(0);
        android.view.View view = a0Var.f218648e.f218607p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout$8$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout$8$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

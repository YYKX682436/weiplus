package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes8.dex */
public class l2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI f72719d;

    public l2(com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI) {
        this.f72719d = launchAAByPersonAmountSelectUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI = this.f72719d;
        boolean z17 = launchAAByPersonAmountSelectUI.f72487p;
        if (!z17) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (z17) {
            launchAAByPersonAmountSelectUI.f72483i.setTextColor(launchAAByPersonAmountSelectUI.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        } else {
            launchAAByPersonAmountSelectUI.j7();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

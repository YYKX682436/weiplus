package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes8.dex */
public class p4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72768d;

    public p4(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72768d = launchAAUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72768d;
        launchAAUI.hideTenpayKB();
        launchAAUI.hideVKB();
        if (launchAAUI.f72510p.findFocus() != null) {
            launchAAUI.f72510p.setCursorVisible(false);
            launchAAUI.f72510p.clearFocus();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

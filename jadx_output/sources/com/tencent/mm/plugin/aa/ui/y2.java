package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes3.dex */
public class y2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72895d;

    public y2(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72895d = launchAAUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72895d;
        launchAAUI.f72510p.setCursorVisible(true);
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) view;
        launchAAUI.getClass();
        if (mMEditText.getLineCount() > mMEditText.getMaxLines()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if (motionEvent.getAction() == 1) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes8.dex */
public class p4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154301d;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        this.f154301d = activityC11351x975a7907;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154301d;
        activityC11351x975a7907.mo48632xd46dd964();
        activityC11351x975a7907.mo48674x36654fab();
        if (activityC11351x975a7907.f154043p.findFocus() != null) {
            activityC11351x975a7907.f154043p.setCursorVisible(false);
            activityC11351x975a7907.f154043p.clearFocus();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

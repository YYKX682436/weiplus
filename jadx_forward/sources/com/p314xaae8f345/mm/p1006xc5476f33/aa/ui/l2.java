package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes8.dex */
public class l2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 f154252d;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 activityC11348xdd034dc7) {
        this.f154252d = activityC11348xdd034dc7;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7 activityC11348xdd034dc7 = this.f154252d;
        boolean z17 = activityC11348xdd034dc7.f154020p;
        if (!z17) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (z17) {
            activityC11348xdd034dc7.f154016i.setTextColor(activityC11348xdd034dc7.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        } else {
            activityC11348xdd034dc7.j7();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

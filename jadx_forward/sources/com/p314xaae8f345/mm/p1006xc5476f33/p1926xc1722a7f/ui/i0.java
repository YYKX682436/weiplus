package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes15.dex */
public class i0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a f233679d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a) {
        this.f233679d = activityC16724xf2604f0a;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        bb5.g gVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q0 q0Var = this.f233679d.f233621e;
        if (q0Var != null && (gVar = q0Var.f233733e) != null) {
            gVar.c(motionEvent);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

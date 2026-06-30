package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes4.dex */
public class k2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 f182746d;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 activityC13566x76c62427) {
        this.f182746d = activityC13566x76c62427;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavFilterUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 activityC13566x76c62427 = this.f182746d;
            activityC13566x76c62427.mo48674x36654fab();
            activityC13566x76c62427.B[0] = (int) motionEvent.getRawX();
            activityC13566x76c62427.B[1] = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/FavFilterUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

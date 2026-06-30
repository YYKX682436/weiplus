package com.p314xaae8f345.mm.ui.p2649x8f4dc54e;

/* loaded from: classes8.dex */
public class b implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b f279574d;

    public b(com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b) {
        this.f279574d = activityC21598xfb43db0b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b = this.f279574d;
            activityC21598xfb43db0b.f279563q = rawX;
            activityC21598xfb43db0b.f279564r = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

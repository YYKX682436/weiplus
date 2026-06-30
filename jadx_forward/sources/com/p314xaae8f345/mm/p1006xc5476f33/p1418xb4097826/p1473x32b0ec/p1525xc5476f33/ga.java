package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes2.dex */
public final class ga implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f194198d;

    public ga(android.view.ViewGroup viewGroup) {
        this.f194198d = viewGroup;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveBannerAreaPlugin$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.view.ViewGroup viewGroup = this.f194198d;
        if (action == 1) {
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                android.graphics.Rect rect = new android.graphics.Rect();
                childAt.getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    childAt.performClick();
                    yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBannerAreaPlugin$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
            }
        } else {
            android.graphics.Rect rect2 = new android.graphics.Rect();
            viewGroup.getGlobalVisibleRect(rect2);
            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                viewGroup.dispatchTouchEvent(motionEvent);
                yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBannerAreaPlugin$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        }
        boolean onTouchEvent = view.onTouchEvent(motionEvent);
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveBannerAreaPlugin$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}

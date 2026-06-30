package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes4.dex */
public class o8 implements android.view.View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/sdk/platformtools/Util$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
        } else if (action == 1 || action == 3 || action == 4) {
            view.post(new com.p314xaae8f345.mm.sdk.p2603x2137b148.n8(this, view));
        }
        yj0.a.i(false, this, "com/tencent/mm/sdk/platformtools/Util$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

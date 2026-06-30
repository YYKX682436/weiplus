package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes2.dex */
public final class t1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f219719d;

    public t1(android.view.View view) {
        this.f219719d = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.view.View view2 = this.f219719d;
        if (action == 0) {
            view2.animate().alpha(0.7f).setDuration(100L).start();
        } else if (action == 1 || action == 3) {
            view2.animate().alpha(1.0f).setDuration(100L).start();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

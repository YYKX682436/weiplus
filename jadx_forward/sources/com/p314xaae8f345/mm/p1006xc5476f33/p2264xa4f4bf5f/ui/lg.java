package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes8.dex */
public final class lg implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg f255594d;

    public lg(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg mgVar) {
        this.f255594d = mgVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg mgVar = this.f255594d;
        if (mgVar.f255642f != null) {
            mgVar.f255642f = null;
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC$initView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

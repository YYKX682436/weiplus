package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes3.dex */
public final class j0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m0 f219818d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m0 m0Var) {
        this.f219818d = m0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSHalfScreenDialog$initContentView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f219818d.cancel();
        yj0.a.i(true, this, "com/tencent/mm/plugin/fts/ui/widget/FTSHalfScreenDialog$initContentView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}

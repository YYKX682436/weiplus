package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class vh0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 f196259d;

    public vh0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 ai0Var) {
        this.f196259d = ai0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGamePlugin$mount$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 ai0Var = this.f196259d;
        if (action == 2 && ai0Var.f193428w == 0 && java.lang.Math.abs(ai0Var.f193429x - motionEvent.getY()) > ai0Var.f193430y && ((mm2.c1) ai0Var.P0(mm2.c1.class)).Z2) {
            db5.t7.m(ai0Var.f446856d.getContext(), ai0Var.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.leb));
        }
        ai0Var.f193429x = (int) motionEvent.getY();
        ai0Var.f193428w = motionEvent.getAction();
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorGamePlugin$mount$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

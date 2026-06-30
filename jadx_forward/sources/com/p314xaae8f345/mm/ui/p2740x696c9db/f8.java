package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes14.dex */
public class f8 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22518xb79395bd f291951d;

    public f8(com.p314xaae8f345.mm.ui.p2740x696c9db.C22518xb79395bd c22518xb79395bd) {
        this.f291951d = c22518xb79395bd;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/PressImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22518xb79395bd c22518xb79395bd = this.f291951d;
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            c22518xb79395bd.f291672d.mo50300x3fa464aa(c22518xb79395bd.f291673e);
        } else if (action == 1 || action == 3) {
            c22518xb79395bd.f291672d.mo50293x3498a0(c22518xb79395bd.f291673e);
        }
        boolean z17 = (c22518xb79395bd.isClickable() || c22518xb79395bd.isLongClickable()) ? false : true;
        yj0.a.i(z17, this, "com/tencent/mm/ui/tools/PressImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}

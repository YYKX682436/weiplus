package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes4.dex */
public class c7 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22509xc04419c1 f291847d;

    public c7(com.p314xaae8f345.mm.ui.p2740x696c9db.C22509xc04419c1 c22509xc04419c1) {
        this.f291847d = c22509xc04419c1;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/MaskImageButton$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22509xc04419c1 c22509xc04419c1 = this.f291847d;
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            c22509xc04419c1.f291618f.mo50300x3fa464aa(c22509xc04419c1.f291619g);
        } else if (action == 1 || action == 3) {
            c22509xc04419c1.f291618f.mo50293x3498a0(c22509xc04419c1.f291619g);
        }
        boolean z17 = (c22509xc04419c1.isClickable() || c22509xc04419c1.isLongClickable()) ? false : true;
        yj0.a.i(z17, this, "com/tencent/mm/ui/tools/MaskImageButton$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}

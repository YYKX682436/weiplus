package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes2.dex */
public class b8 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22517xf97851e5 f291835d;

    public b8(com.p314xaae8f345.mm.ui.p2740x696c9db.C22517xf97851e5 c22517xf97851e5) {
        this.f291835d = c22517xf97851e5;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/PressAlphaImageView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22517xf97851e5 c22517xf97851e5 = this.f291835d;
        if (action == 0) {
            float f17 = c22517xf97851e5.f291671r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/tools/PressAlphaImageView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/tools/PressAlphaImageView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else if (action == 1 || action == 3) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/tools/PressAlphaImageView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/tools/PressAlphaImageView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        boolean z17 = (c22517xf97851e5.isClickable() || c22517xf97851e5.isLongClickable()) ? false : true;
        yj0.a.i(z17, this, "com/tencent/mm/ui/tools/PressAlphaImageView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}

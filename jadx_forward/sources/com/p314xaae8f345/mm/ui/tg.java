package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public final class tg extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f291434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21432x204668e8 f291435e;

    public tg(com.p314xaae8f345.mm.ui.C21432x204668e8 c21432x204668e8) {
        this.f291435e = c21432x204668e8;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.String str = this.f291435e.f278580d;
        yj0.a.i(true, this, "com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.String str = this.f291435e.f278580d;
        return super.onDoubleTapEvent(e17);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.mm.ui.C21432x204668e8 c21432x204668e8 = this.f291435e;
        java.lang.String str = c21432x204668e8.f278580d;
        this.f291434d = false;
        c21432x204668e8.f278583g = 0.0f;
        c21432x204668e8.f278584h = 0.0f;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        android.view.View m78819xba93aa4e = this.f291435e.m78819xba93aa4e();
        if (m78819xba93aa4e != null) {
            m78819xba93aa4e.dispatchTouchEvent(e17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        com.p314xaae8f345.mm.ui.C21432x204668e8 c21432x204668e8 = this.f291435e;
        float f19 = c21432x204668e8.f278584h + f17;
        c21432x204668e8.f278584h = f19;
        c21432x204668e8.f278583g += f18;
        this.f291434d = java.lang.Math.abs(f19) <= java.lang.Math.abs(c21432x204668e8.f278583g) && java.lang.Math.abs(c21432x204668e8.f278583g) > c21432x204668e8.f278581e;
        return this.f291434d || ((java.lang.Math.abs(c21432x204668e8.f278583g) > java.lang.Math.abs(c21432x204668e8.f278584h) ? 1 : (java.lang.Math.abs(c21432x204668e8.f278583g) == java.lang.Math.abs(c21432x204668e8.f278584h) ? 0 : -1)) <= 0 && (java.lang.Math.abs(c21432x204668e8.f278584h) > c21432x204668e8.f278582f ? 1 : (java.lang.Math.abs(c21432x204668e8.f278584h) == c21432x204668e8.f278582f ? 0 : -1)) > 0);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.String str = this.f291435e.f278580d;
        yj0.a.i(true, this, "com/tencent/mm/ui/ProfileDispatchTouchEventLayout$ProfileGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }
}

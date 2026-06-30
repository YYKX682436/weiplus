package cl5;

/* loaded from: classes5.dex */
public final class e extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl5.n f124514d;

    public e(cl5.n nVar) {
        this.f124514d = nVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/banner/PushBanner$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/ui/widget/banner/PushBanner$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/banner/PushBanner$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/ui/widget/banner/PushBanner$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFling: ");
        cl5.n nVar = this.f124514d;
        sb6.append(nVar.f124533e);
        sb6.append(' ');
        sb6.append(f18);
        com.p314xaae8f345.mm.ui.yk.c("PushBanner", sb6.toString(), new java.lang.Object[0]);
        if (f18 >= 0.0f) {
            return false;
        }
        nVar.f124533e = true;
        android.view.View view = nVar.f124530b;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(nVar.b(e27.getRawY()), -((int) (nVar.f124536h + view.getHeight())));
                ofInt.addListener(new cl5.c(nVar));
                ofInt.addUpdateListener(new cl5.d(layoutParams2, nVar, view));
                ofInt.setDuration(300L);
                ofInt.start();
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/banner/PushBanner$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/ui/widget/banner/PushBanner$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        com.p314xaae8f345.mm.ui.yk.c("PushBanner", "onScroll, distanceY: " + f18, new java.lang.Object[0]);
        if (java.lang.Math.abs(f18) <= 2.0f) {
            return false;
        }
        cl5.n nVar = this.f124514d;
        android.view.View view = nVar.f124530b;
        if (view == null) {
            return true;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return true;
        }
        layoutParams2.y = java.lang.Math.min(nVar.b(e27.getRawY()), nVar.f124535g);
        android.view.ViewManager viewManager = nVar.f124529a;
        if (viewManager == null) {
            return true;
        }
        viewManager.updateViewLayout(view, layoutParams2);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.mm.ui.yk.c("PushBanner", "onSingleTapConfirmed: ", new java.lang.Object[0]);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/banner/PushBanner$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/ui/widget/banner/PushBanner$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}

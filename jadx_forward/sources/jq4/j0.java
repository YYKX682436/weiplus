package jq4;

/* loaded from: classes5.dex */
public final class j0 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f382692d;

    public j0(jq4.z0 z0Var) {
        this.f382692d = z0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFling: ");
        jq4.z0 z0Var = this.f382692d;
        sb6.append(z0Var.f382776l);
        sb6.append(' ');
        sb6.append(f18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", sb6.toString());
        float x17 = motionEvent != null ? motionEvent.getX() - e27.getX() : 0.0f;
        float y17 = motionEvent != null ? motionEvent.getY() - e27.getY() : 0.0f;
        if (f18 > 0.0f || ((java.lang.Math.abs(f17) > java.lang.Math.abs(f18) && java.lang.Math.abs(x17) > java.lang.Math.abs(y17)) || z0Var.t())) {
            return true;
        }
        if (f18 >= 0.0f || z0Var.f382782r == 3) {
            return false;
        }
        z0Var.f382776l = true;
        android.view.View view = z0Var.f382769e;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(z0Var.g(e27.getRawY()), -((int) (z0Var.f382779o + view.getHeight())));
                ofInt.addListener(new jq4.h0(z0Var));
                ofInt.addUpdateListener(new jq4.i0(layoutParams2, z0Var, view));
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
        yj0.a.b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "onScroll, distanceY: " + f18);
        if (java.lang.Math.abs(f18) <= 2.0f) {
            return false;
        }
        jq4.z0 z0Var = this.f382692d;
        android.view.View view = z0Var.f382769e;
        if (view == null) {
            return true;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return true;
        }
        layoutParams2.y = java.lang.Math.min(z0Var.g(e27.getRawY()), z0Var.f382778n);
        android.view.ViewManager viewManager = z0Var.f382768d;
        if (viewManager == null) {
            return true;
        }
        viewManager.updateViewLayout(view, layoutParams2);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipBaseFloatCardManager", "onSingleTapConfirmed: ");
        jq4.z0 z0Var = this.f382692d;
        if (!z0Var.m() && (intent = z0Var.f382770f) != null) {
            z0Var.p(intent);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$gestureDetectorListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}

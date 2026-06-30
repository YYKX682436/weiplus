package com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5;

/* loaded from: classes15.dex */
public class i implements android.view.View.OnTouchListener, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.GestureDetector f296741d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.a f296742e;

    /* renamed from: f, reason: collision with root package name */
    public ks5.a f296743f;

    /* renamed from: g, reason: collision with root package name */
    public js5.c f296744g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f296745h;

    public i(android.content.Context context, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.a aVar, android.os.Handler handler) {
        this.f296742e = aVar;
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(context, this, handler);
        this.f296741d = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
    }

    public void a(int i17) {
        js5.c cVar = this.f296744g;
        if (cVar != null) {
            cVar.f383105h = false;
            this.f296745h.invalidate();
            this.f296744g = null;
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.a aVar = this.f296742e;
        if (aVar.mo84161xa4b83ff6() == null) {
            return false;
        }
        aVar.mo84161xa4b83ff6().f(this.f296745h, motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(android.view.MotionEvent motionEvent) {
        boolean z17;
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.a aVar = this.f296742e;
        if (((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) aVar).f296711e || this.f296743f.m() == null) {
            return false;
        }
        for (js5.c cVar : this.f296743f.m()) {
            float x17 = motionEvent.getX() - aVar.mo84152x4431994d();
            float y17 = motionEvent.getY() - aVar.mo81369xcbe6949f();
            java.util.LinkedList linkedList = cVar.f383101d;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (((android.graphics.RectF) it.next()).contains(x17, y17)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                this.f296744g = cVar;
                cVar.f383105h = true;
                this.f296745h.postInvalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        a(3);
        return false;
    }

    public void onLongPress(android.view.MotionEvent motionEvent) {
        a(1);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        js5.c cVar;
        if (((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) this.f296742e).f296711e || (cVar = this.f296744g) == null) {
            return false;
        }
        cVar.m141360xaf6b9ae9(this.f296745h);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.a aVar = this.f296742e;
        if (aVar.mo84153x22f21e20() == null) {
            return false;
        }
        this.f296743f = aVar.mo84153x22f21e20();
        this.f296745h = view;
        android.view.GestureDetector gestureDetector = this.f296741d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/neattextview/textview/view/NeatViewTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/neattextview/textview/view/NeatViewTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            a(2);
        }
        return onTouchEvent;
    }
}

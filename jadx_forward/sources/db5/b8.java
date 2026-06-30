package db5;

/* loaded from: classes15.dex */
public class b8 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e f309831d;

    public b8(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e, db5.u7 u7Var) {
        this.f309831d = c21520x5bb48e5e;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.f309831d;
        if (c21520x5bb48e5e.f279141d == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
        db5.x7 x7Var = c21520x5bb48e5e.I;
        if (x7Var != null && x7Var.a(motionEvent)) {
            yj0.a.i(true, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (c21520x5bb48e5e.f279141d.mo45732x7520af94() <= c21520x5bb48e5e.f279141d.mo79188x8f7d8694()) {
            float b17 = c21520x5bb48e5e.f279141d.b(db5.s.b(motionEvent, 0), db5.s.c(motionEvent, 0));
            db5.c8 c8Var = c21520x5bb48e5e.f279140J;
            if (c8Var != null) {
                c8Var.m123866xd4e26b1e(b17);
            }
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleChangeReportListener scaleChangeReportListener = c21520x5bb48e5e.K;
            if (scaleChangeReportListener != null) {
                scaleChangeReportListener.mo15819x92a4c352(b17);
            }
        } else {
            c21520x5bb48e5e.f279141d.d(db5.s.b(motionEvent, 0), db5.s.c(motionEvent, 0));
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleChangeReportListener scaleChangeReportListener2 = c21520x5bb48e5e.K;
            if (scaleChangeReportListener2 != null) {
                scaleChangeReportListener2.mo15819x92a4c352(1.0f);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        android.widget.OverScroller overScroller = this.f309831d.f279167z;
        if (overScroller != null) {
            overScroller.forceFinished(true);
        }
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.f309831d;
        db5.f0 m79159xba51a58f = c21520x5bb48e5e.m79159xba51a58f();
        if (m79159xba51a58f != null) {
            if (m79159xba51a58f instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) {
                m79159xba51a58f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) m79159xba51a58f;
            } else if (m79159xba51a58f instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
                m79159xba51a58f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) m79159xba51a58f;
            }
            float mo45732x7520af94 = m79159xba51a58f.mo45732x7520af94() * m79159xba51a58f.mo79182x97cbed21();
            float mo45732x7520af942 = m79159xba51a58f.mo45732x7520af94() * m79159xba51a58f.mo79180x47e2bd2c();
            if (m79159xba51a58f.g() || m79159xba51a58f.j() || ((int) mo45732x7520af94) > c21520x5bb48e5e.f279145h || ((int) mo45732x7520af942) > c21520x5bb48e5e.f279146i) {
                float[] fArr = new float[9];
                m79159xba51a58f.mo79307x5037c3c6().getValues(fArr);
                float f19 = fArr[2];
                float f27 = f19 + mo45732x7520af94;
                float f28 = fArr[5];
                float f29 = f28 + mo45732x7520af942;
                c21520x5bb48e5e.q(motionEvent, motionEvent2);
                float f37 = (((float) java.lang.Math.round(f19)) >= c21520x5bb48e5e.C.left || ((float) java.lang.Math.round(f27)) <= c21520x5bb48e5e.C.right) ? 0.0f : f17;
                float f38 = (((float) java.lang.Math.round(f28)) >= c21520x5bb48e5e.C.top || ((float) java.lang.Math.round(f29)) <= c21520x5bb48e5e.C.bottom) ? 0.0f : f18;
                android.graphics.RectF rectF = c21520x5bb48e5e.C;
                float f39 = rectF.right;
                float f47 = rectF.bottom;
                android.widget.OverScroller overScroller = c21520x5bb48e5e.f279167z;
                overScroller.fling(overScroller.getCurrX(), c21520x5bb48e5e.f279167z.getCurrY(), (int) f37, (int) f38, (int) (f39 - mo45732x7520af94), (int) (f39 + mo45732x7520af94), (int) (f47 - mo45732x7520af942), (int) (f47 + mo45732x7520af942), 0, 0);
                if ((!c21520x5bb48e5e.q(motionEvent, motionEvent2) || f19 < 0.0f) && (c21520x5bb48e5e.q(motionEvent, motionEvent2) || f27 > c21520x5bb48e5e.f279145h)) {
                    return false;
                }
            }
        }
        if (c21520x5bb48e5e.f279149n) {
            return false;
        }
        c21520x5bb48e5e.getClass();
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float x17 = motionEvent.getX() - motionEvent2.getX();
        float y17 = motionEvent.getY() - motionEvent2.getY();
        boolean q17 = c21520x5bb48e5e.q(motionEvent, motionEvent2);
        float abs = java.lang.Math.abs(x17);
        float abs2 = java.lang.Math.abs(y17);
        if (java.lang.Math.abs(f17) <= 500.0f || abs < 60.0f || abs < abs2) {
            return false;
        }
        if (q17) {
            c21520x5bb48e5e.onKeyDown(21, null);
        } else {
            c21520x5bb48e5e.onKeyDown(22, null);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.f309831d;
        c21520x5bb48e5e.f279162x0 = true;
        db5.a8 a8Var = c21520x5bb48e5e.H;
        if (a8Var != null) {
            a8Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        db5.d8 d8Var = this.f309831d.G;
        if (d8Var == null) {
            return true;
        }
        d8Var.a();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/ui/base/MMViewPager$MySimpleGesture", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}

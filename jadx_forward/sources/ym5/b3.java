package ym5;

/* loaded from: classes15.dex */
public class b3 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 f544754d;

    public b3(com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7) {
        this.f544754d = c22796x44e7a3d7;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        float f17;
        float f18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7 = this.f544754d;
        c22796x44e7a3d7.S.b();
        android.graphics.RectF rectF = c22796x44e7a3d7.L;
        float width = rectF.left + (rectF.width() / 2.0f);
        android.graphics.RectF rectF2 = c22796x44e7a3d7.L;
        float height = rectF2.top + (rectF2.height() / 2.0f);
        c22796x44e7a3d7.Q.set(width, height);
        c22796x44e7a3d7.R.set(width, height);
        c22796x44e7a3d7.F = 0;
        c22796x44e7a3d7.G = 0;
        if (c22796x44e7a3d7.f294935z) {
            f17 = c22796x44e7a3d7.E;
            f18 = 1.0f;
        } else {
            float f19 = c22796x44e7a3d7.E;
            float f27 = c22796x44e7a3d7.f294914g;
            c22796x44e7a3d7.Q.set(motionEvent.getX(), motionEvent.getY());
            f17 = f19;
            f18 = f27;
        }
        c22796x44e7a3d7.f294924q.reset();
        android.graphics.Matrix matrix = c22796x44e7a3d7.f294924q;
        android.graphics.RectF rectF3 = c22796x44e7a3d7.K;
        matrix.postTranslate(-rectF3.left, -rectF3.top);
        android.graphics.Matrix matrix2 = c22796x44e7a3d7.f294924q;
        android.graphics.PointF pointF = c22796x44e7a3d7.R;
        matrix2.postTranslate(pointF.x, pointF.y);
        c22796x44e7a3d7.f294924q.postTranslate(-c22796x44e7a3d7.H, -c22796x44e7a3d7.I);
        android.graphics.Matrix matrix3 = c22796x44e7a3d7.f294924q;
        float f28 = c22796x44e7a3d7.D;
        android.graphics.PointF pointF2 = c22796x44e7a3d7.R;
        matrix3.postRotate(f28, pointF2.x, pointF2.y);
        android.graphics.Matrix matrix4 = c22796x44e7a3d7.f294924q;
        android.graphics.PointF pointF3 = c22796x44e7a3d7.Q;
        matrix4.postScale(f18, f18, pointF3.x, pointF3.y);
        c22796x44e7a3d7.f294924q.postTranslate(c22796x44e7a3d7.F, c22796x44e7a3d7.G);
        c22796x44e7a3d7.f294924q.mapRect(c22796x44e7a3d7.M, c22796x44e7a3d7.K);
        c22796x44e7a3d7.t(c22796x44e7a3d7.M);
        c22796x44e7a3d7.f294935z = !c22796x44e7a3d7.f294935z;
        ym5.j3 j3Var = c22796x44e7a3d7.S;
        j3Var.f544929g.startScroll((int) (f17 * 10000.0f), 0, (int) ((f18 - f17) * 10000.0f), 0, j3Var.f544939t.f294913f);
        j3Var.f544926d = true;
        j3Var.f544939t.post(j3Var);
        yj0.a.i(false, this, "com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7 = this.f544754d;
        c22796x44e7a3d7.f294930w = false;
        c22796x44e7a3d7.f294927t = false;
        c22796x44e7a3d7.A = false;
        c22796x44e7a3d7.removeCallbacks(c22796x44e7a3d7.f294934y0);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        int i17;
        int i18;
        int i19;
        int i27;
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7 = this.f544754d;
        if (c22796x44e7a3d7.f294927t) {
            return false;
        }
        if (!c22796x44e7a3d7.B && !c22796x44e7a3d7.C) {
            return false;
        }
        ym5.j3 j3Var = c22796x44e7a3d7.S;
        if (j3Var.f544926d) {
            return false;
        }
        float f19 = (((float) java.lang.Math.round(c22796x44e7a3d7.L.left)) >= c22796x44e7a3d7.f294912J.left || ((float) java.lang.Math.round(c22796x44e7a3d7.L.right)) <= c22796x44e7a3d7.f294912J.right) ? 0.0f : f17;
        float f27 = (((float) java.lang.Math.round(c22796x44e7a3d7.L.top)) >= c22796x44e7a3d7.f294912J.top || ((float) java.lang.Math.round(c22796x44e7a3d7.L.bottom)) <= c22796x44e7a3d7.f294912J.bottom) ? 0.0f : f18;
        if (c22796x44e7a3d7.A || c22796x44e7a3d7.D % 90.0f != 0.0f) {
            float f28 = c22796x44e7a3d7.D;
            float f29 = ((int) (f28 / 90.0f)) * 90;
            float f37 = f28 % 90.0f;
            if (f37 > 45.0f) {
                f29 += 90.0f;
            } else if (f37 < -45.0f) {
                f29 -= 90.0f;
            }
            int i28 = (int) f28;
            j3Var.f544931i.startScroll(i28, 0, ((int) f29) - i28, 0, j3Var.f544939t.f294913f);
            c22796x44e7a3d7.D = f29;
        }
        c22796x44e7a3d7.t(c22796x44e7a3d7.L);
        j3Var.getClass();
        j3Var.f544933n = f19 < 0.0f ? Integer.MAX_VALUE : 0;
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d72 = j3Var.f544939t;
        int abs = (int) (f19 > 0.0f ? java.lang.Math.abs(c22796x44e7a3d72.L.left) : c22796x44e7a3d72.L.right - c22796x44e7a3d72.f294912J.right);
        if (f19 < 0.0f) {
            abs = Integer.MAX_VALUE - abs;
        }
        int i29 = f19 < 0.0f ? abs : 0;
        int i37 = f19 < 0.0f ? Integer.MAX_VALUE : abs;
        if (f19 < 0.0f) {
            abs = Integer.MAX_VALUE - i29;
        }
        j3Var.f544934o = f27 < 0.0f ? Integer.MAX_VALUE : 0;
        int abs2 = (int) (f27 > 0.0f ? java.lang.Math.abs(c22796x44e7a3d72.L.top) : c22796x44e7a3d72.L.bottom - c22796x44e7a3d72.f294912J.bottom);
        if (f27 < 0.0f) {
            abs2 = Integer.MAX_VALUE - abs2;
        }
        int i38 = f27 < 0.0f ? abs2 : 0;
        int i39 = f27 < 0.0f ? Integer.MAX_VALUE : abs2;
        if (f27 < 0.0f) {
            abs2 = Integer.MAX_VALUE - i38;
        }
        if (f19 == 0.0f) {
            i17 = 0;
            i18 = 0;
        } else {
            i17 = i29;
            i18 = i37;
        }
        if (f27 == 0.0f) {
            i19 = 0;
            i27 = 0;
        } else {
            i19 = i38;
            i27 = i39;
        }
        android.widget.OverScroller overScroller = j3Var.f544928f;
        int i47 = j3Var.f544933n;
        int i48 = j3Var.f544934o;
        int i49 = (int) f19;
        int i57 = (int) f27;
        int abs3 = java.lang.Math.abs(abs);
        int i58 = c22796x44e7a3d72.f294915h;
        int i59 = abs3 < i58 * 2 ? 0 : i58;
        int abs4 = java.lang.Math.abs(abs2);
        int i66 = c22796x44e7a3d72.f294915h;
        overScroller.fling(i47, i48, i49, i57, i17, i18, i19, i27, i59, abs4 < i66 * 2 ? 0 : i66);
        j3Var.f544926d = true;
        j3Var.f544939t.post(j3Var);
        return super.onFling(motionEvent, motionEvent2, f17, f18);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7 = this.f544754d;
        android.view.View.OnLongClickListener onLongClickListener = c22796x44e7a3d7.f294922p0;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(c22796x44e7a3d7);
        }
        yj0.a.h(this, "com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7 = this.f544754d;
        ym5.j3 j3Var = c22796x44e7a3d7.S;
        if (j3Var.f544926d) {
            j3Var.b();
        }
        if (c22796x44e7a3d7.r(f17)) {
            if (f17 < 0.0f) {
                float f19 = c22796x44e7a3d7.L.left;
                if (f19 - f17 > c22796x44e7a3d7.f294912J.left) {
                    f17 = f19;
                }
            }
            if (f17 > 0.0f) {
                float f27 = c22796x44e7a3d7.L.right;
                float f28 = f27 - f17;
                float f29 = c22796x44e7a3d7.f294912J.right;
                if (f28 < f29) {
                    f17 = f27 - f29;
                }
            }
            c22796x44e7a3d7.f294920o.postTranslate(-f17, 0.0f);
            c22796x44e7a3d7.F = (int) (c22796x44e7a3d7.F - f17);
        } else if (c22796x44e7a3d7.B || c22796x44e7a3d7.f294927t || c22796x44e7a3d7.f294930w) {
            com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7.n(c22796x44e7a3d7);
            if (!c22796x44e7a3d7.f294927t) {
                if (f17 < 0.0f) {
                    float f37 = c22796x44e7a3d7.L.left;
                    float f38 = f37 - f17;
                    float f39 = c22796x44e7a3d7.N.left;
                    if (f38 > f39) {
                        f17 *= java.lang.Math.abs(java.lang.Math.abs(f37 - f39) - c22796x44e7a3d7.f294916i) / c22796x44e7a3d7.f294916i;
                    }
                }
                if (f17 > 0.0f) {
                    float f47 = c22796x44e7a3d7.L.right;
                    float f48 = f47 - f17;
                    float f49 = c22796x44e7a3d7.N.right;
                    if (f48 < f49) {
                        f17 *= java.lang.Math.abs(java.lang.Math.abs(f47 - f49) - c22796x44e7a3d7.f294916i) / c22796x44e7a3d7.f294916i;
                    }
                }
            }
            c22796x44e7a3d7.F = (int) (c22796x44e7a3d7.F - f17);
            c22796x44e7a3d7.f294920o.postTranslate(-f17, 0.0f);
            c22796x44e7a3d7.f294930w = true;
        }
        if (c22796x44e7a3d7.s(f18)) {
            if (f18 < 0.0f) {
                float f57 = c22796x44e7a3d7.L.top;
                if (f57 - f18 > c22796x44e7a3d7.f294912J.top) {
                    f18 = f57;
                }
            }
            if (f18 > 0.0f) {
                float f58 = c22796x44e7a3d7.L.bottom;
                float f59 = f58 - f18;
                float f66 = c22796x44e7a3d7.f294912J.bottom;
                if (f59 < f66) {
                    f18 = f58 - f66;
                }
            }
            c22796x44e7a3d7.f294920o.postTranslate(0.0f, -f18);
            c22796x44e7a3d7.G = (int) (c22796x44e7a3d7.G - f18);
        } else if (c22796x44e7a3d7.C || c22796x44e7a3d7.f294930w || c22796x44e7a3d7.f294927t) {
            com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7.n(c22796x44e7a3d7);
            if (!c22796x44e7a3d7.f294927t) {
                if (f18 < 0.0f) {
                    float f67 = c22796x44e7a3d7.L.top;
                    float f68 = f67 - f18;
                    float f69 = c22796x44e7a3d7.N.top;
                    if (f68 > f69) {
                        f18 *= java.lang.Math.abs(java.lang.Math.abs(f67 - f69) - c22796x44e7a3d7.f294916i) / c22796x44e7a3d7.f294916i;
                    }
                }
                if (f18 > 0.0f) {
                    float f76 = c22796x44e7a3d7.L.bottom;
                    float f77 = f76 - f18;
                    float f78 = c22796x44e7a3d7.N.bottom;
                    if (f77 < f78) {
                        f18 *= java.lang.Math.abs(java.lang.Math.abs(f76 - f78) - c22796x44e7a3d7.f294916i) / c22796x44e7a3d7.f294916i;
                    }
                }
            }
            c22796x44e7a3d7.f294920o.postTranslate(0.0f, -f18);
            c22796x44e7a3d7.G = (int) (c22796x44e7a3d7.G - f18);
            c22796x44e7a3d7.f294930w = true;
        }
        c22796x44e7a3d7.u();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p2776x373aa5.C22796x44e7a3d7 c22796x44e7a3d7 = this.f544754d;
        c22796x44e7a3d7.postDelayed(c22796x44e7a3d7.f294934y0, 250L);
        yj0.a.i(false, this, "com/tencent/mm/view/PhotoView$4", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}

package ub3;

/* loaded from: classes15.dex */
public class r0 implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e f507667d;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e) {
        this.f507667d = c16332x7cb9791e;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507667d;
        if (c16332x7cb9791e.f226646e.f507675b == 4) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            for (int i17 = 0; i17 < c16332x7cb9791e.f226660v; i17++) {
                android.graphics.Rect f17 = c16332x7cb9791e.f(i17);
                if (f17 != null && f17.contains(x17, y17)) {
                    android.view.View view = (android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17);
                    android.view.View view2 = c16332x7cb9791e.f226656r;
                    if (view2 != view && view2 != null) {
                        c16332x7cb9791e.d();
                    } else if (view2 == view) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShuffleView", "down on the select card");
                        return true;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e.a(c16332x7cb9791e, i17);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShuffleView", "fling up " + f18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507667d;
        if (f18 >= (-c16332x7cb9791e.C)) {
            return false;
        }
        if (c16332x7cb9791e.f226646e.f507675b != 4) {
            return true;
        }
        if (c16332x7cb9791e.f226656r != null) {
            c16332x7cb9791e.d();
        }
        if (c16332x7cb9791e.f226658t == null) {
            return true;
        }
        ub3.u0 u0Var = c16332x7cb9791e.f226653o;
        if (u0Var != null) {
            ((ub3.f) u0Var).b(c16332x7cb9791e.f226659u, c16332x7cb9791e.f226660v);
        }
        c16332x7cb9791e.j(c16332x7cb9791e.f226659u);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        if (motionEvent2.getActionMasked() == 2) {
            int x17 = (int) motionEvent2.getX();
            int y17 = (int) motionEvent2.getY();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507667d;
            if (c16332x7cb9791e.f226646e.f507675b == 4) {
                if (java.lang.Math.abs(f18) < c16332x7cb9791e.B) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= c16332x7cb9791e.f226660v) {
                            break;
                        }
                        android.graphics.Rect f19 = c16332x7cb9791e.f(i17);
                        if (f19 != null && f19.contains(x17, y17)) {
                            android.view.View view = (android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(i17);
                            android.view.View view2 = c16332x7cb9791e.f226656r;
                            if (view2 != view && view2 != null) {
                                c16332x7cb9791e.d();
                            } else if (view2 == view) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShuffleView", "scroll on the select card");
                                break;
                            }
                            if (c16332x7cb9791e.f226658t != view) {
                                c16332x7cb9791e.e();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e.a(c16332x7cb9791e, i17);
                            }
                        }
                        i17++;
                    }
                }
                if (java.lang.Math.abs(f17) < c16332x7cb9791e.B) {
                    android.view.View view3 = c16332x7cb9791e.f226658t;
                    if (view3 == null && (view3 = c16332x7cb9791e.f226656r) == null) {
                        view3 = null;
                    }
                    if (view3 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShuffleView", "scroll translationY:" + view3.getTranslationY() + "," + (view3.getHeight() / 7));
                        if (((int) view3.getTranslationY()) <= (-view3.getHeight()) / 7) {
                            if (f18 < 0.0f && java.lang.Math.abs(f18) > c16332x7cb9791e.B) {
                                if (((int) f18) <= (-view3.getHeight()) / 7) {
                                    view3.setTranslationY(0.0f);
                                } else {
                                    view3.setTranslationY(view3.getTranslationY() - f18);
                                }
                                android.view.View view4 = c16332x7cb9791e.f226656r;
                                if (view3 == view4) {
                                    c16332x7cb9791e.f226658t = view4;
                                    c16332x7cb9791e.f226659u = c16332x7cb9791e.f226657s;
                                    if (c16332x7cb9791e.f226650i.isStarted()) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShuffleView", "scroll when select view is animation");
                                        c16332x7cb9791e.f226650i.cancel();
                                    }
                                    c16332x7cb9791e.f226656r = null;
                                    c16332x7cb9791e.f226657s = 0;
                                }
                            }
                        } else if (view3.getTranslationY() == 0.0f) {
                            if (f18 > 0.0f && java.lang.Math.abs(f18) > c16332x7cb9791e.B) {
                                if (((int) f18) >= view3.getHeight() / 7) {
                                    view3.setTranslationY((-view3.getHeight()) / 7);
                                } else {
                                    view3.setTranslationY(view3.getTranslationY() - f18);
                                }
                            }
                        } else if (f18 < 0.0f) {
                            if (view3.getTranslationY() - f18 >= 0.0f) {
                                view3.setTranslationY(0.0f);
                            } else {
                                view3.setTranslationY(view3.getTranslationY() - f18);
                            }
                        } else if (((int) (view3.getTranslationY() - f18)) <= (-view3.getHeight()) / 7) {
                            view3.setTranslationY((-view3.getHeight()) / 7);
                        } else {
                            view3.setTranslationY(view3.getTranslationY() - f18);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507667d;
        if (c16332x7cb9791e.f226646e.f507675b != 4) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (c16332x7cb9791e.f226656r != null) {
            ub3.u0 u0Var = c16332x7cb9791e.f226653o;
            if (u0Var != null) {
                ((ub3.f) u0Var).a(c16332x7cb9791e.f226657s, c16332x7cb9791e.f226660v);
            }
            c16332x7cb9791e.d();
        }
        if (c16332x7cb9791e.f226658t != null) {
            ub3.u0 u0Var2 = c16332x7cb9791e.f226653o;
            if (u0Var2 != null) {
                ((ub3.f) u0Var2).b(c16332x7cb9791e.f226659u, c16332x7cb9791e.f226660v);
            }
            c16332x7cb9791e.j(c16332x7cb9791e.f226659u);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView$8", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }
}

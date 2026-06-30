package we4;

/* loaded from: classes13.dex */
public class c extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public long f526821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.C18459xbf144eaf f526822e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.C18459xbf144eaf c18459xbf144eaf) {
        this.f526822e = c18459xbf144eaf;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportChartView", "onScroll %.2f", java.lang.Float.valueOf(f17));
        if (java.lang.System.currentTimeMillis() - this.f526821d >= 500) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.C18459xbf144eaf c18459xbf144eaf = this.f526822e;
            if (c18459xbf144eaf.f253390y0) {
                this.f526821d = java.lang.System.currentTimeMillis();
                if (f17 > 0.0f) {
                    int i17 = c18459xbf144eaf.M + 1;
                    c18459xbf144eaf.M = i17;
                    int i18 = c18459xbf144eaf.N;
                    if (i17 > i18) {
                        c18459xbf144eaf.M = i18;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.C18459xbf144eaf.a(c18459xbf144eaf, false);
                    c18459xbf144eaf.invalidate();
                    return true;
                }
                if (f17 < 0.0f) {
                    int i19 = c18459xbf144eaf.M - 1;
                    c18459xbf144eaf.M = i19;
                    if (i19 < 1) {
                        c18459xbf144eaf.M = 1;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.C18459xbf144eaf.a(c18459xbf144eaf, false);
                    c18459xbf144eaf.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.ui.C18459xbf144eaf c18459xbf144eaf = this.f526822e;
        c18459xbf144eaf.f253372i = Integer.MAX_VALUE;
        if (c18459xbf144eaf.R.length > 0) {
            int i17 = 0;
            while (true) {
                we4.e[] eVarArr = c18459xbf144eaf.R;
                if (i17 >= eVarArr.length) {
                    break;
                }
                if (i17 == 0) {
                    if (x17 < eVarArr[i17].f526828c + (c18459xbf144eaf.K / 2) && x17 > 0.0f) {
                        c18459xbf144eaf.f253372i = i17;
                        c18459xbf144eaf.invalidate();
                        break;
                    }
                    i17++;
                } else if (i17 > 0 && i17 < eVarArr.length - 1) {
                    float f17 = eVarArr[i17].f526828c;
                    float f18 = c18459xbf144eaf.K / 2;
                    if (x17 < f18 + f17 && x17 > f17 - f18) {
                        c18459xbf144eaf.f253372i = i17;
                        c18459xbf144eaf.invalidate();
                        break;
                    }
                    i17++;
                } else {
                    if (i17 != eVarArr.length - 1) {
                        c18459xbf144eaf.f253372i = Integer.MAX_VALUE;
                        break;
                    }
                    if (x17 < c18459xbf144eaf.f253374m && x17 > eVarArr[i17].f526828c - (c18459xbf144eaf.K / 2)) {
                        c18459xbf144eaf.f253372i = i17;
                        c18459xbf144eaf.invalidate();
                        break;
                    }
                    i17++;
                }
            }
        }
        c18459xbf144eaf.f253372i = c18459xbf144eaf.f253372i;
        int i18 = 0;
        while (true) {
            int i19 = c18459xbf144eaf.Q;
            if (i18 >= i19) {
                c18459xbf144eaf.f253388x0 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportChartView", "onSingleTapUp %s %s %d", java.lang.Float.valueOf(x17), java.lang.Float.valueOf(y17), java.lang.Integer.valueOf(c18459xbf144eaf.f253372i));
                c18459xbf144eaf.invalidate();
                yj0.a.i(true, this, "com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return true;
            }
            if (i18 == i19 - 1) {
                c18459xbf144eaf.R[i18].f526830e = true;
            } else {
                c18459xbf144eaf.R[i18].f526830e = false;
            }
            i18++;
        }
    }
}

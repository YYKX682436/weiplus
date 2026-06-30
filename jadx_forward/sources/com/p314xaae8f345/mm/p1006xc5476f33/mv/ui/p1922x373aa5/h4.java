package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes15.dex */
public class h4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public int f233383d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f233384e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f233385f;

    /* renamed from: g, reason: collision with root package name */
    public int f233386g;

    /* renamed from: h, reason: collision with root package name */
    public float f233387h;

    /* renamed from: i, reason: collision with root package name */
    public float f233388i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a f233389m;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a c16705xabefc23a) {
        this.f233389m = c16705xabefc23a;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a c16705xabefc23a = this.f233389m;
        if (!c16705xabefc23a.f233268d) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!c16705xabefc23a.e(true) && !c16705xabefc23a.e(false)) {
                        yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return false;
                    }
                    if (c16705xabefc23a.f233269e) {
                        yj0.a.i(true, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return true;
                    }
                    this.f233386g = 0;
                    boolean z17 = false;
                    while (this.f233386g < motionEvent.getPointerCount()) {
                        int pointerId = motionEvent.getPointerId(this.f233386g);
                        this.f233385f = pointerId;
                        int i17 = this.f233383d;
                        if (pointerId == i17 || pointerId == this.f233384e) {
                            boolean f17 = c16705xabefc23a.f(pointerId == i17, motionEvent.getX(this.f233386g));
                            if (c16705xabefc23a.f233273i && f17 && !c16705xabefc23a.f233272h) {
                                c16705xabefc23a.performHapticFeedback(0, 2);
                            }
                            c16705xabefc23a.f233272h = f17;
                            c16705xabefc23a.getClass();
                            z17 = true;
                        }
                        this.f233386g++;
                    }
                    yj0.a.i(z17, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return z17;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            return false;
                        }
                    }
                }
            }
            int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f233385f = pointerId2;
            if (pointerId2 != this.f233383d && pointerId2 != this.f233384e) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            c16705xabefc23a.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a.a(c16705xabefc23a, this.f233385f == this.f233383d, false);
            if (this.f233385f == this.f233383d) {
                this.f233383d = -1;
            } else {
                this.f233384e = -1;
            }
            c16705xabefc23a.f233272h = false;
            yj0.a.i(true, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        int actionIndex = motionEvent.getActionIndex();
        this.f233386g = actionIndex;
        this.f233385f = motionEvent.getPointerId(actionIndex);
        this.f233387h = motionEvent.getX(this.f233386g);
        float y17 = motionEvent.getY(this.f233386g);
        this.f233388i = y17;
        if (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a.b(c16705xabefc23a, c16705xabefc23a.f233274m, this.f233387h, y17)) {
            if (c16705xabefc23a.e(true)) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            c16705xabefc23a.getClass();
            this.f233383d = this.f233385f;
            int i18 = c16705xabefc23a.f233274m.getBounds().left;
            c16705xabefc23a.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a.a(c16705xabefc23a, true, true);
            yj0.a.i(true, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a.b(c16705xabefc23a, c16705xabefc23a.f233275n, this.f233387h, this.f233388i)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (c16705xabefc23a.e(false)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        c16705xabefc23a.getClass();
        this.f233384e = this.f233385f;
        int i19 = c16705xabefc23a.f233275n.getBounds().right;
        c16705xabefc23a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16705xabefc23a.a(c16705xabefc23a, false, true);
        yj0.a.i(true, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}

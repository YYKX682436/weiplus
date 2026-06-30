package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class j1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public int f230574d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f230575e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f230576f;

    /* renamed from: g, reason: collision with root package name */
    public int f230577g;

    /* renamed from: h, reason: collision with root package name */
    public float f230578h;

    /* renamed from: i, reason: collision with root package name */
    public float f230579i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a f230580m;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a) {
        this.f230580m = c16543xabefc23a;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a = this.f230580m;
        if (!c16543xabefc23a.f230473e) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!c16543xabefc23a.c(true) && !c16543xabefc23a.c(false)) {
                        yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return false;
                    }
                    if (c16543xabefc23a.f230474f) {
                        yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return true;
                    }
                    this.f230577g = 0;
                    boolean z17 = false;
                    while (this.f230577g < motionEvent.getPointerCount()) {
                        int pointerId = motionEvent.getPointerId(this.f230577g);
                        this.f230576f = pointerId;
                        int i17 = this.f230574d;
                        if (pointerId == i17 || pointerId == this.f230575e) {
                            boolean f17 = c16543xabefc23a.f(pointerId == i17, motionEvent.getX(this.f230577g));
                            if (c16543xabefc23a.f230478m && f17 && !c16543xabefc23a.f230477i) {
                                c16543xabefc23a.performHapticFeedback(0, 2);
                            }
                            c16543xabefc23a.f230477i = f17;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.k1 k1Var = c16543xabefc23a.f230472d;
                            if (k1Var != null) {
                                k1Var.a(this.f230576f == this.f230574d);
                            }
                            z17 = true;
                        }
                        this.f230577g++;
                    }
                    yj0.a.i(z17, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return z17;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            return false;
                        }
                    }
                }
            }
            int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f230576f = pointerId2;
            int i18 = this.f230574d;
            if (pointerId2 != i18 && pointerId2 != this.f230575e) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.k1 k1Var2 = c16543xabefc23a.f230472d;
            if (k1Var2 != null) {
                k1Var2.c(pointerId2 == i18);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a.a(c16543xabefc23a, this.f230576f == this.f230574d, false);
            if (this.f230576f == this.f230574d) {
                this.f230574d = -1;
            } else {
                this.f230575e = -1;
            }
            c16543xabefc23a.f230477i = false;
            yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        int actionIndex = motionEvent.getActionIndex();
        this.f230577g = actionIndex;
        this.f230576f = motionEvent.getPointerId(actionIndex);
        this.f230578h = motionEvent.getX(this.f230577g);
        float y17 = motionEvent.getY(this.f230577g);
        this.f230579i = y17;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a.b(c16543xabefc23a, c16543xabefc23a.f230479n, this.f230578h, y17)) {
            if (c16543xabefc23a.c(true)) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.k1 k1Var3 = c16543xabefc23a.f230472d;
            if (k1Var3 != null) {
                k1Var3.b(true);
            }
            this.f230574d = this.f230576f;
            int i19 = c16543xabefc23a.f230479n.getBounds().left;
            c16543xabefc23a.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a.a(c16543xabefc23a, true, true);
            yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a.b(c16543xabefc23a, c16543xabefc23a.f230480o, this.f230578h, this.f230579i)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (c16543xabefc23a.c(false)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.k1 k1Var4 = c16543xabefc23a.f230472d;
        if (k1Var4 != null) {
            k1Var4.b(false);
        }
        this.f230575e = this.f230576f;
        int i27 = c16543xabefc23a.f230480o.getBounds().right;
        c16543xabefc23a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a.a(c16543xabefc23a, false, true);
        yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}

package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class z2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 f292470d;

    public z2(com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d0) {
        this.f292470d = c22500x8bcca9d0;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d0 = this.f292470d;
        if (!c22500x8bcca9d0.B) {
            yj0.a.i(false, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (c22500x8bcca9d0.f291545e == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int action = motionEvent.getAction() & 255;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d02 = this.f292470d;
        if (!c22500x8bcca9d02.f291555r && action != 0) {
            yj0.a.i(false, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (action == 0) {
            c22500x8bcca9d02.f291547g = motionEvent.getRawX();
            this.f292470d.f291548h = motionEvent.getRawY();
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d03 = this.f292470d;
            float f17 = c22500x8bcca9d03.f291547g;
            float f18 = c22500x8bcca9d03.f291548h;
            c22500x8bcca9d03.f291549i = f17;
            c22500x8bcca9d03.f291550m = f18;
            android.graphics.Matrix imageMatrix = c22500x8bcca9d03.getImageMatrix();
            android.graphics.RectF rectF = new android.graphics.RectF();
            rectF.set(0.0f, 0.0f, this.f292470d.f291545e.getWidth(), this.f292470d.f291545e.getHeight());
            imageMatrix.mapRect(rectF);
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d04 = this.f292470d;
            c22500x8bcca9d04.f291555r = rectF.contains(c22500x8bcca9d04.f291547g, c22500x8bcca9d04.f291548h);
            this.f292470d.f291562y = java.lang.System.currentTimeMillis();
        } else if (action != 1) {
            if (action == 2) {
                if (c22500x8bcca9d02.f291554q) {
                    c22500x8bcca9d02.f291553p = db5.s.a(motionEvent);
                    com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d05 = this.f292470d;
                    float f19 = c22500x8bcca9d05.f291553p;
                    float f27 = f19 - c22500x8bcca9d05.f291552o;
                    if (f19 > 5.0f && java.lang.Math.abs(f27) > 5.0f) {
                        db5.s.d(this.f292470d.f291551n, motionEvent);
                        com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d06 = this.f292470d;
                        android.graphics.PointF pointF = c22500x8bcca9d06.f291551n;
                        float f28 = pointF.x;
                        float f29 = pointF.y;
                        if (f27 > 0.0f) {
                            c22500x8bcca9d06.a();
                        } else {
                            c22500x8bcca9d06.b();
                        }
                    }
                    com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d07 = this.f292470d;
                    c22500x8bcca9d07.f291552o = c22500x8bcca9d07.f291553p;
                }
                if (!this.f292470d.f291546f) {
                    float rawX = motionEvent.getRawX() - this.f292470d.f291547g;
                    float rawY = motionEvent.getRawY() - this.f292470d.f291548h;
                    if (java.lang.Math.abs(rawX) > 5.0f || java.lang.Math.abs(rawY) > 5.0f) {
                        this.f292470d.getImageMatrix().postTranslate(rawX, rawY);
                    }
                    this.f292470d.invalidate();
                }
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d08 = this.f292470d;
                c22500x8bcca9d08.f291546f = false;
                c22500x8bcca9d08.f291547g = motionEvent.getRawX();
                this.f292470d.f291548h = motionEvent.getRawY();
            } else if (action == 5) {
                c22500x8bcca9d02.f291546f = true;
                c22500x8bcca9d02.f291552o = db5.s.a(motionEvent);
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d09 = this.f292470d;
                if (c22500x8bcca9d09.f291552o > 5.0f) {
                    c22500x8bcca9d09.f291554q = true;
                    db5.s.d(c22500x8bcca9d09.f291551n, motionEvent);
                    yj0.a.i(true, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
            } else if (action == 6) {
                c22500x8bcca9d02.f291554q = false;
                c22500x8bcca9d02.f291546f = true;
                yj0.a.i(true, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        } else if (c22500x8bcca9d02.f291558u) {
            c22500x8bcca9d02.f291558u = false;
            if (c22500x8bcca9d02.f291557t) {
                c22500x8bcca9d02.f291557t = false;
                c22500x8bcca9d02.b();
                this.f292470d.b();
                this.f292470d.b();
                this.f292470d.b();
                this.f292470d.b();
            } else {
                c22500x8bcca9d02.f291557t = true;
                c22500x8bcca9d02.a();
                this.f292470d.a();
                this.f292470d.a();
                this.f292470d.a();
                this.f292470d.a();
            }
        } else {
            c22500x8bcca9d02.f291558u = true;
            wu5.c cVar = c22500x8bcca9d02.f291559v;
            if (cVar != null) {
                cVar.cancel(true);
            }
            this.f292470d.f291559v = ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.ui.p2740x696c9db.y2(this, motionEvent), 200L);
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/tools/CropImageView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

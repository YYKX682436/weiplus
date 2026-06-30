package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5;

/* renamed from: com.tencent.mm.plugin.gallery.view.MultiGestureImageView */
/* loaded from: classes13.dex */
public class C15675x95c3ae90 extends android.widget.LinearLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f220184z = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a f220185d;

    /* renamed from: e, reason: collision with root package name */
    public int f220186e;

    /* renamed from: f, reason: collision with root package name */
    public long f220187f;

    /* renamed from: g, reason: collision with root package name */
    public long f220188g;

    /* renamed from: h, reason: collision with root package name */
    public float f220189h;

    /* renamed from: i, reason: collision with root package name */
    public float f220190i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f220191m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.OverScroller f220192n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.GestureDetector f220193o;

    /* renamed from: p, reason: collision with root package name */
    public int f220194p;

    /* renamed from: q, reason: collision with root package name */
    public int f220195q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.RectF f220196r;

    /* renamed from: s, reason: collision with root package name */
    public float f220197s;

    /* renamed from: t, reason: collision with root package name */
    public float f220198t;

    /* renamed from: u, reason: collision with root package name */
    public k33.o f220199u;

    /* renamed from: v, reason: collision with root package name */
    public k33.o f220200v;

    /* renamed from: w, reason: collision with root package name */
    public k33.o f220201w;

    /* renamed from: x, reason: collision with root package name */
    public int f220202x;

    /* renamed from: y, reason: collision with root package name */
    public int f220203y;

    public C15675x95c3ae90(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220186e = 0;
        this.f220187f = 0L;
        this.f220188g = 0L;
        this.f220189h = 0.0f;
        this.f220190i = 0.0f;
        this.f220191m = false;
        this.f220196r = new android.graphics.RectF();
        a(context, attributeSet);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.f220185d = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(context, attributeSet);
        this.f220193o = new android.view.GestureDetector(context, new k33.m(this, null));
        this.f220192n = new android.widget.OverScroller(context, new android.view.animation.DecelerateInterpolator(2.0f));
        this.f220185d.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        addView(this.f220185d);
        this.f220199u = new k33.o(this, new java.lang.ref.WeakReference(this));
        this.f220200v = new k33.o(this, new java.lang.ref.WeakReference(this));
        this.f220201w = new k33.o(this, new java.lang.ref.WeakReference(this));
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f220185d != null && this.f220192n.computeScrollOffset()) {
            int currX = this.f220192n.getCurrX() - this.f220194p;
            int currY = this.f220192n.getCurrY() - this.f220195q;
            this.f220194p = this.f220192n.getCurrX();
            this.f220195q = this.f220192n.getCurrY();
            float mo45732x7520af94 = this.f220185d.mo45732x7520af94();
            float mo79182x97cbed21 = this.f220185d.mo79182x97cbed21() * mo45732x7520af94;
            float mo79180x47e2bd2c = mo45732x7520af94 * this.f220185d.mo79180x47e2bd2c();
            float[] fArr = new float[9];
            this.f220185d.getImageMatrix().getValues(fArr);
            float f17 = mo79182x97cbed21 + fArr[2];
            float f18 = fArr[5] + mo79180x47e2bd2c;
            android.graphics.RectF rectF = this.f220196r;
            if (currX < 0 && currX < rectF.right - java.lang.Math.round(f17)) {
                currX = (int) (rectF.right - java.lang.Math.round(f17));
            }
            if (currX > 0 && currX > rectF.left - java.lang.Math.round(r5)) {
                currX = (int) (rectF.left - java.lang.Math.round(r5));
            }
            if (currY < 0 && currY < rectF.bottom - java.lang.Math.round(f18)) {
                currY = (int) (rectF.bottom - java.lang.Math.round(f18));
            }
            if (currY > 0 && currY > rectF.top - java.lang.Math.round(r4)) {
                currY = (int) (rectF.top - java.lang.Math.round(r4));
            }
            if (java.lang.Math.round(r5) >= rectF.left || java.lang.Math.round(f17) <= rectF.right) {
                currX = 0;
            } else if (java.lang.Math.round(r4) >= rectF.top || java.lang.Math.round(f18) <= rectF.bottom) {
                currY = 0;
            }
            this.f220185d.c(currX, mo79180x47e2bd2c >= ((float) this.f220203y) ? currY : 0);
            postInvalidate();
        }
    }

    /* renamed from: getImageHeight */
    public int m63731x47e2bd2c() {
        return this.f220185d.mo79180x47e2bd2c();
    }

    /* renamed from: getImageWidth */
    public int m63732x97cbed21() {
        return this.f220185d.mo79182x97cbed21();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f220202x = android.view.View.MeasureSpec.getSize(i17);
        int size = android.view.View.MeasureSpec.getSize(i18);
        this.f220203y = size;
        this.f220196r.set(0.0f, 0.0f, this.f220202x, size);
    }

    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v39 */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        ?? r07;
        android.view.GestureDetector gestureDetector = this.f220193o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/gallery/view/MultiGestureImageView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/gallery/view/MultiGestureImageView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 0) {
            this.f220192n.forceFinished(true);
            this.f220201w.mo50303x856b99f0(2);
            k33.o oVar = this.f220201w;
            oVar.f385406b = 0L;
            oVar.mo50307xb9e94560(2, 500L);
            this.f220185d.o();
            int i17 = this.f220186e + 1;
            this.f220186e = i17;
            if (i17 == 1) {
                this.f220187f = java.lang.System.currentTimeMillis();
                this.f220189h = db5.s.b(motionEvent, 0);
                this.f220190i = db5.s.c(motionEvent, 0);
            } else if (i17 == 2) {
                if (java.lang.System.currentTimeMillis() - this.f220188g >= 350) {
                    this.f220186e = 1;
                } else if (java.lang.Math.abs(this.f220189h - db5.s.b(motionEvent, 0)) >= 35.0f || java.lang.Math.abs(this.f220190i - db5.s.c(motionEvent, 0)) >= 35.0f) {
                    this.f220186e = 1;
                } else {
                    this.f220186e = 0;
                    if (this.f220185d.mo45732x7520af94() <= this.f220185d.mo79188x8f7d8694()) {
                        this.f220185d.b(db5.s.b(motionEvent, 0), db5.s.c(motionEvent, 0));
                    } else {
                        this.f220185d.d(db5.s.b(motionEvent, 0), db5.s.c(motionEvent, 0));
                        this.f220185d.h();
                    }
                }
            }
        }
        if (motionEvent.getAction() == 6 || motionEvent.getAction() == 262) {
            this.f220201w.mo50303x856b99f0(2);
            this.f220198t = 0.0f;
            float mo45732x7520af94 = this.f220185d.mo45732x7520af94();
            this.f220197s = mo45732x7520af94;
            this.f220191m = true;
            if (mo45732x7520af94 < this.f220185d.mo79188x8f7d8694()) {
                this.f220185d.d((db5.s.b(motionEvent, 0) - db5.s.b(motionEvent, 1)) + db5.s.b(motionEvent, 1), (db5.s.c(motionEvent, 0) - db5.s.c(motionEvent, 1)) + db5.s.c(motionEvent, 1));
            }
            if (this.f220197s > this.f220185d.mo79179x72dd1a9c()) {
                this.f220185d.b((db5.s.b(motionEvent, 0) - db5.s.b(motionEvent, 1)) + db5.s.b(motionEvent, 1), (db5.s.c(motionEvent, 0) - db5.s.c(motionEvent, 1)) + db5.s.c(motionEvent, 1));
            }
        }
        if (motionEvent.getAction() == 1) {
            this.f220201w.mo50303x856b99f0(2);
            this.f220198t = 0.0f;
            this.f220197s = this.f220185d.mo45732x7520af94();
            if (this.f220186e == 1) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                this.f220188g = currentTimeMillis;
                if (currentTimeMillis - this.f220187f >= 350) {
                    this.f220186e = 0;
                } else if (java.lang.Math.abs(this.f220189h - db5.s.b(motionEvent, 0)) < 10.0f && java.lang.Math.abs(this.f220190i - db5.s.c(motionEvent, 0)) < 10.0f) {
                    k33.o oVar2 = this.f220200v;
                    oVar2.getClass();
                    oVar2.f385406b = 0L;
                    oVar2.mo50307xb9e94560(0, 350L);
                }
            }
        }
        if (motionEvent.getAction() == 5 || motionEvent.getAction() == 261) {
            this.f220198t = 0.0f;
            this.f220197s = this.f220185d.mo45732x7520af94();
            r07 = 1;
            this.f220191m = true;
        } else {
            r07 = 1;
        }
        if (motionEvent.getAction() != 2) {
            return r07;
        }
        if (motionEvent.getPointerCount() == 2) {
            this.f220201w.mo50303x856b99f0(2);
            this.f220191m = r07;
            this.f220186e = 0;
            float b17 = db5.s.b(motionEvent, 0) - db5.s.b(motionEvent, r07);
            float c17 = db5.s.c(motionEvent, 0) - db5.s.c(motionEvent, r07);
            float sqrt = (float) java.lang.Math.sqrt((b17 * b17) + (c17 * c17));
            float f17 = this.f220198t;
            if (f17 == 0.0f) {
                this.f220198t = sqrt;
            } else {
                float f18 = sqrt / f17;
                if (this.f220191m) {
                    this.f220185d.a(this.f220197s * f18, b17 + db5.s.b(motionEvent, 1), c17 + db5.s.c(motionEvent, 1));
                    this.f220185d.h();
                }
            }
        } else if (java.lang.Math.abs(this.f220189h - db5.s.b(motionEvent, 0)) > 10.0f || java.lang.Math.abs(this.f220190i - db5.s.c(motionEvent, 0)) > 10.0f) {
            this.f220201w.mo50303x856b99f0(2);
            this.f220186e = 0;
            computeScroll();
        }
        return true;
    }

    /* renamed from: setEnableHorLongBmpMode */
    public void m63733x464b3146(boolean z17) {
        this.f220185d.m79195x464b3146(z17);
    }

    /* renamed from: setImageBitmap */
    public void m63734xd44890a8(android.graphics.Bitmap bitmap) {
        this.f220185d.setImageBitmap(bitmap);
        this.f220185d.i();
    }

    /* renamed from: setImageHeight */
    public void m63735xde4830a0(int i17) {
        this.f220185d.m79199xde4830a0(i17);
    }

    /* renamed from: setImageWidth */
    public void m63736xc5f03b2d(int i17) {
        this.f220185d.m79200xc5f03b2d(i17);
    }

    /* renamed from: setLongClickOverListener */
    public void m63737xf8a6a4f2(k33.l lVar) {
    }

    /* renamed from: setSingleClickOverListener */
    public void m63738x3be48126(k33.n nVar) {
    }

    public C15675x95c3ae90(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f220186e = 0;
        this.f220187f = 0L;
        this.f220188g = 0L;
        this.f220189h = 0.0f;
        this.f220190i = 0.0f;
        this.f220191m = false;
        this.f220196r = new android.graphics.RectF();
        a(context, attributeSet);
    }
}

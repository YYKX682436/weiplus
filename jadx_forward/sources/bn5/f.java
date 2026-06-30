package bn5;

/* loaded from: classes10.dex */
public abstract class f extends android.view.View {
    public static float F = 1.0f;
    public int A;
    public boolean B;
    public android.graphics.Rect C;
    public boolean D;
    public final float[] E;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView.ScaleType f104473d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Matrix f104474e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f104475f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Matrix f104476g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f104477h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f104478i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f104479m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f104480n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f104481o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Rect f104482p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Rect f104483q;

    /* renamed from: r, reason: collision with root package name */
    public final l45.q f104484r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Runnable f104485s;

    /* renamed from: t, reason: collision with root package name */
    public float f104486t;

    /* renamed from: u, reason: collision with root package name */
    public float f104487u;

    /* renamed from: v, reason: collision with root package name */
    public float f104488v;

    /* renamed from: w, reason: collision with root package name */
    public float f104489w;

    /* renamed from: x, reason: collision with root package name */
    public float f104490x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f104491y;

    /* renamed from: z, reason: collision with root package name */
    public int f104492z;

    public f(android.content.Context context, l45.q qVar) {
        super(context);
        android.graphics.Rect rect;
        this.f104473d = android.widget.ImageView.ScaleType.CENTER_INSIDE;
        this.f104488v = 1.0f;
        this.f104491y = true;
        this.f104492z = -1;
        this.A = -1;
        this.B = false;
        this.D = false;
        this.E = new float[9];
        this.f104484r = qVar;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.f104474e = matrix;
        this.f104475f = new android.graphics.Matrix();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        this.f104477h = rect2;
        this.f104478i = new android.graphics.Rect();
        this.f104480n = new android.graphics.Rect();
        android.graphics.Rect rect3 = new android.graphics.Rect();
        this.f104479m = rect3;
        android.graphics.Rect rect4 = new android.graphics.Rect();
        this.f104481o = rect4;
        android.graphics.Bitmap bitmap = ((l45.n) qVar).f397998f;
        if (bitmap != null) {
            rect3.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            rect2.set(rect3);
            rect4.set(rect3);
        }
        if (f() || (rect = ((l45.n) qVar).f397994b.f445769f) == null) {
            return;
        }
        rect2.set(0, 0, rect.width(), rect.height());
        matrix.postTranslate(0.0f, rect.top);
    }

    public void a() {
        float height;
        int width;
        float c17;
        float f17;
        int width2;
        float f18;
        int width3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseBoardView", "adaptImage execute guess only by first time");
        android.graphics.Rect m10947x9f2f90d = m10947x9f2f90d();
        android.graphics.Matrix matrix = this.f104474e;
        if (d(matrix) % 180.0f == 0.0f) {
            height = m10947x9f2f90d.width() * 1.0f;
            width = m10947x9f2f90d.height();
        } else {
            height = m10947x9f2f90d.height() * 1.0f;
            width = m10947x9f2f90d.width();
        }
        float f19 = height / width;
        float width4 = (m10934x9faf4b34().width() * 1.0f) / m10934x9faf4b34().height();
        float width5 = f19 < width4 ? m10934x9faf4b34().width() / f19 : m10934x9faf4b34().height();
        android.widget.ImageView.ScaleType scaleType = this.f104473d;
        if (scaleType == android.widget.ImageView.ScaleType.CENTER_INSIDE) {
            float width6 = (f19 < width4 ? m10934x9faf4b34().width() : m10934x9faf4b34().width()) / f19;
            if (d(matrix) % 180.0f == 0.0f) {
                f18 = width6 * 1.0f;
                width3 = m10947x9f2f90d.height();
            } else {
                f18 = width6 * 1.0f;
                width3 = m10947x9f2f90d.width();
            }
            c17 = f18 / width3;
        } else {
            c17 = scaleType == android.widget.ImageView.ScaleType.CENTER_CROP ? c(m10947x9f2f90d) : 1.0f;
        }
        if (d(matrix) % 180.0f == 0.0f) {
            f17 = width5 * 1.0f;
            width2 = m10947x9f2f90d.height();
        } else {
            f17 = width5 * 1.0f;
            width2 = m10947x9f2f90d.width();
        }
        float f27 = f17 / width2;
        matrix.postScale(c17, c17, m10947x9f2f90d.centerX(), m10947x9f2f90d.centerY());
        android.graphics.RectF m10936x72f909f5 = m10936x72f909f5();
        int centerX = (int) m10936x72f909f5.centerX();
        int centerY = (int) m10936x72f909f5.centerY();
        int centerX2 = m10934x9faf4b34().centerX() - centerX;
        int m10935xca32c8d0 = m10935xca32c8d0() - centerY;
        if (f19 < width4) {
            m10935xca32c8d0 = (int) ((c17 - 1.0f) * centerY);
        }
        matrix.postTranslate(centerX2, m10935xca32c8d0);
        android.graphics.Matrix matrix2 = this.f104475f;
        matrix2.set(matrix);
        this.f104489w = e(matrix2) * 3.0f;
        this.f104490x = e(matrix2) * F;
        if (this.f104489w < f27) {
            this.f104489w = f27 * 1.2f;
        }
    }

    public void b(bn5.e eVar, float f17, boolean z17) {
        float height;
        float width;
        float width2;
        float f18;
        float width3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseBoardView", "adaptImageWithAnim");
        android.graphics.RectF m10936x72f909f5 = m10936x72f909f5();
        int centerX = (int) m10936x72f909f5.centerX();
        int centerY = (int) m10936x72f909f5.centerY();
        int centerX2 = m10934x9faf4b34().centerX() - centerX;
        this.B = !z17;
        int m10935xca32c8d0 = m10935xca32c8d0() - centerY;
        float f19 = f17 % 180.0f;
        if (f19 == 0.0f) {
            height = m10936x72f909f5.width() * 1.0f;
            width = m10936x72f909f5.height();
        } else {
            height = m10936x72f909f5.height() * 1.0f;
            width = m10936x72f909f5.width();
        }
        float f27 = height / width;
        if (f27 < (m10934x9faf4b34().width() * 1.0f) / m10934x9faf4b34().height()) {
            m10934x9faf4b34().width();
            width2 = m10934x9faf4b34().height();
        } else {
            m10934x9faf4b34().height();
            width2 = m10934x9faf4b34().width() / f27;
        }
        if (f19 == 0.0f) {
            f18 = width2 * 1.0f;
            width3 = m10936x72f909f5.height();
        } else {
            f18 = width2 * 1.0f;
            width3 = m10936x72f909f5.width();
        }
        float f28 = centerX2;
        float f29 = m10935xca32c8d0;
        bn5.d dVar = new bn5.d(this, f18 / width3, f28, f29, centerX, centerY, f17, z17);
        dVar.f104471i = eVar;
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("scale", 0.0f, 166.0f), android.animation.PropertyValuesHolder.ofFloat("deltaX", 0.0f, f28), android.animation.PropertyValuesHolder.ofFloat("deltaY", 0.0f, f29), android.animation.PropertyValuesHolder.ofFloat("rotation", 0.0f, f17));
        dVar.f104465c = ofPropertyValuesHolder;
        ofPropertyValuesHolder.addUpdateListener(new bn5.b(dVar));
        dVar.f104465c.addListener(new bn5.c(dVar));
        dVar.f104465c.setInterpolator(new android.view.animation.LinearInterpolator());
        dVar.f104465c.setDuration(166L);
        dVar.f104465c.start();
    }

    public float c(android.graphics.Rect rect) {
        return java.lang.Math.max((m10934x9faf4b34().width() * 1.0f) / rect.width(), (m10934x9faf4b34().height() * 1.0f) / rect.height());
    }

    public float d(android.graphics.Matrix matrix) {
        float[] fArr = this.E;
        matrix.getValues(fArr);
        double d17 = fArr[1];
        matrix.getValues(fArr);
        return (float) java.lang.Math.round(java.lang.Math.atan2(d17, fArr[0]) * 57.29577951308232d);
    }

    public float e(android.graphics.Matrix matrix) {
        float[] fArr = this.E;
        matrix.getValues(fArr);
        float f17 = fArr[3];
        matrix.getValues(fArr);
        float f18 = fArr[0];
        return (float) java.lang.Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public abstract boolean f();

    public boolean g() {
        return false;
    }

    /* renamed from: getAliveRect */
    public android.graphics.Rect mo10933x81daa99b() {
        return this.f104477h;
    }

    /* renamed from: getBoardRect */
    public android.graphics.Rect m10934x9faf4b34() {
        if (this.f104478i == null) {
            this.f104478i = new android.graphics.Rect();
        }
        return this.f104478i;
    }

    /* renamed from: getBoardRectCenterY */
    public int m10935xca32c8d0() {
        if (this.f104492z == -1 || this.B) {
            return this.f104478i.centerY();
        }
        if (this.A == -1) {
            android.graphics.RectF m10938xe0f502ed = m10938xe0f502ed();
            this.A = (int) (((m10938xe0f502ed.bottom - m10938xe0f502ed.top) / 2.0f) + this.f104492z);
        }
        return this.A;
    }

    /* renamed from: getCurImageRect */
    public android.graphics.RectF m10936x72f909f5() {
        android.graphics.RectF rectF = new android.graphics.RectF(m10947x9f2f90d());
        this.f104474e.mapRect(rectF);
        return rectF;
    }

    /* renamed from: getCurScale */
    public float m10937x9c703c60() {
        return e(this.f104474e);
    }

    /* renamed from: getCurValidImageRect */
    public android.graphics.RectF m10938xe0f502ed() {
        android.graphics.RectF rectF = new android.graphics.RectF(m10949x6b00ea39());
        this.f104474e.mapRect(rectF);
        return rectF;
    }

    /* renamed from: getFinalGenerateBitmapOutputRect */
    public android.graphics.Rect m10939x8e53f889() {
        return this.C;
    }

    /* renamed from: getImageBitmapRect */
    public android.graphics.Rect m10940x30103138() {
        return this.f104481o;
    }

    /* renamed from: getInitScale */
    public float m10941xef60cf64() {
        if (f()) {
            return this.f104488v;
        }
        return 1.0f;
    }

    /* renamed from: getMainMatrix */
    public android.graphics.Matrix m10942xfeaf52d0() {
        return this.f104474e;
    }

    /* renamed from: getMaxScale */
    public float m10943x937c6fbc() {
        return this.f104489w;
    }

    /* renamed from: getMinScale */
    public float mo10944x299dd38e() {
        return this.f104490x;
    }

    /* renamed from: getPresenter */
    public l45.q m10945xc879b3f2() {
        return this.f104484r;
    }

    /* renamed from: getRawBoardRect */
    public android.graphics.Rect m10946xde8d8118() {
        return this.f104480n;
    }

    /* renamed from: getRawImageRect */
    public android.graphics.Rect m10947x9f2f90d() {
        return this.f104479m;
    }

    /* renamed from: getRawLayoutRect */
    public android.graphics.Rect m10948x9f8562c0() {
        if (this.f104483q == null) {
            this.f104483q = ((l45.n) m10945xc879b3f2()).f397994b.f445772i;
        }
        return this.f104483q;
    }

    /* renamed from: getValidImageRect */
    public android.graphics.Rect m10949x6b00ea39() {
        android.graphics.Rect rect = this.f104482p;
        return rect != null ? rect : this.f104479m;
    }

    public void h(android.view.MotionEvent motionEvent) {
        motionEvent.toString();
        if (motionEvent.getAction() == 0) {
            this.f104486t = motionEvent.getX();
            this.f104487u = motionEvent.getY();
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 2) {
                if (java.lang.Math.abs(motionEvent.getX() - this.f104486t) >= 3.0f || java.lang.Math.abs(motionEvent.getY() - this.f104487u) >= 3.0f) {
                    this.D = true;
                    removeCallbacks(this.f104485s);
                    if (((l45.n) m10945xc879b3f2()).f397993a.f544893w) {
                        ((l45.n) m10945xc879b3f2()).f397993a.mo160423x2f328115(false);
                        ((l45.n) m10945xc879b3f2()).f397993a.mo160421xeaaa6c37(false);
                    }
                }
                this.f104486t = motionEvent.getX();
                this.f104487u = motionEvent.getY();
                return;
            }
            return;
        }
        removeCallbacks(this.f104485s);
        long j17 = this.D ? 700L : 0L;
        dl.a m17 = ((l45.n) m10945xc879b3f2()).f().m();
        if (m17 == dl.a.EMOJI_AND_TEXT || m17 == dl.a.STICKER) {
            ((l45.n) m10945xc879b3f2()).f397993a.c(true);
            if (((l45.n) m10945xc879b3f2()).f397993a.f544893w) {
                ((l45.n) m10945xc879b3f2()).f397993a.mo160423x2f328115(false);
                ((l45.n) m10945xc879b3f2()).f397993a.mo160421xeaaa6c37(false);
            } else {
                ym5.h hVar = ((l45.n) m10945xc879b3f2()).f397993a;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = hVar.f544886p;
                if (!(abstractC19636xc6b37291 != null && (abstractC19636xc6b37291.getVisibility() == 0 || hVar.mo177319xb073c692().getVisibility() == 0))) {
                    ((l45.n) m10945xc879b3f2()).f397993a.mo160423x2f328115(true);
                    ((l45.n) m10945xc879b3f2()).f397993a.mo160421xeaaa6c37(true);
                }
            }
            dn5.c m177311xc3ab3d87 = ((l45.n) m10945xc879b3f2()).f397993a.m177311xc3ab3d87();
            m177311xc3ab3d87.f323581r = m177311xc3ab3d87.f323582s;
            m177311xc3ab3d87.requestLayout();
            m177311xc3ab3d87.invalidate();
        } else {
            bn5.a aVar = new bn5.a(this);
            this.f104485s = aVar;
            postDelayed(aVar, j17);
        }
        this.D = false;
    }

    public void i(android.view.MotionEvent motionEvent) {
    }

    public void j() {
        l45.q qVar = this.f104484r;
        if (qVar != null) {
            this.A = -1;
            l45.n nVar = (l45.n) qVar;
            qk.l9 l9Var = nVar.f397994b;
            this.f104492z = l9Var.f445775l;
            F = l9Var.f445776m;
            android.graphics.Bitmap bitmap = nVar.f397998f;
            if (bitmap != null) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                android.graphics.Rect rect = this.f104479m;
                rect.set(0, 0, width, height);
                this.f104477h.set(rect);
                this.f104481o.set(rect);
            }
            if (nVar.f398015w) {
                this.f104474e.reset();
                a();
            }
        }
    }

    public void k(android.graphics.Rect rect) {
        this.f104479m.set(rect);
        this.f104477h.set(rect);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseBoardView", "[resetImageRect] rect %s", rect.flattenToString());
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("changelcai", "[onLayout] %s=%s=%s=%s=%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (z17) {
            this.f104478i.set(i17, i18, i19, i27);
            this.f104480n.set(this.f104478i);
        }
        l45.n nVar = (l45.n) m10945xc879b3f2();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DrawingPresenter", "[onLayout],%s", java.lang.Boolean.valueOf(nVar.f398015w));
        nVar.c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (((l45.n) m10945xc879b3f2()).n()) {
            h(motionEvent);
        }
        if (((l45.n) m10945xc879b3f2()).v(motionEvent) || !f()) {
            return true;
        }
        if (!((l45.n) m10945xc879b3f2()).f398000h) {
            return false;
        }
        i(motionEvent);
        return true;
    }

    /* renamed from: setFinalGenerateBitmapOutputRect */
    public void m10950xf096f6fd(android.graphics.Rect rect) {
        this.C = rect;
    }

    /* renamed from: setForceMatrix */
    public void m10951x4988acca(android.graphics.Matrix matrix) {
        this.f104476g = matrix;
    }

    /* renamed from: setInitScale */
    public void m10952x4bb48fd8(float f17) {
        this.f104488v = f17;
    }

    /* renamed from: setOneFingerMoveEnable */
    public void m10953x1395fc1(boolean z17) {
        this.f104491y = z17;
    }

    /* renamed from: setScaleType */
    public void m10954xebd28962(android.widget.ImageView.ScaleType scaleType) {
        this.f104473d = scaleType;
    }

    /* renamed from: setTouchEnable */
    public void m10955xbc91ffe0(boolean z17) {
    }

    /* renamed from: setValidImageRect */
    public void m10956x32f75245(android.graphics.Rect rect) {
        this.f104482p = rect;
    }
}

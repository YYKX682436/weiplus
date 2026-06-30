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
    public android.widget.ImageView.ScaleType f22940d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Matrix f22941e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f22942f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Matrix f22943g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f22944h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f22945i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f22946m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f22947n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f22948o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Rect f22949p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Rect f22950q;

    /* renamed from: r, reason: collision with root package name */
    public final l45.q f22951r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Runnable f22952s;

    /* renamed from: t, reason: collision with root package name */
    public float f22953t;

    /* renamed from: u, reason: collision with root package name */
    public float f22954u;

    /* renamed from: v, reason: collision with root package name */
    public float f22955v;

    /* renamed from: w, reason: collision with root package name */
    public float f22956w;

    /* renamed from: x, reason: collision with root package name */
    public float f22957x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22958y;

    /* renamed from: z, reason: collision with root package name */
    public int f22959z;

    public f(android.content.Context context, l45.q qVar) {
        super(context);
        android.graphics.Rect rect;
        this.f22940d = android.widget.ImageView.ScaleType.CENTER_INSIDE;
        this.f22955v = 1.0f;
        this.f22958y = true;
        this.f22959z = -1;
        this.A = -1;
        this.B = false;
        this.D = false;
        this.E = new float[9];
        this.f22951r = qVar;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.f22941e = matrix;
        this.f22942f = new android.graphics.Matrix();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        this.f22944h = rect2;
        this.f22945i = new android.graphics.Rect();
        this.f22947n = new android.graphics.Rect();
        android.graphics.Rect rect3 = new android.graphics.Rect();
        this.f22946m = rect3;
        android.graphics.Rect rect4 = new android.graphics.Rect();
        this.f22948o = rect4;
        android.graphics.Bitmap bitmap = ((l45.n) qVar).f316465f;
        if (bitmap != null) {
            rect3.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            rect2.set(rect3);
            rect4.set(rect3);
        }
        if (f() || (rect = ((l45.n) qVar).f316461b.f364236f) == null) {
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
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseBoardView", "adaptImage execute guess only by first time");
        android.graphics.Rect rawImageRect = getRawImageRect();
        android.graphics.Matrix matrix = this.f22941e;
        if (d(matrix) % 180.0f == 0.0f) {
            height = rawImageRect.width() * 1.0f;
            width = rawImageRect.height();
        } else {
            height = rawImageRect.height() * 1.0f;
            width = rawImageRect.width();
        }
        float f19 = height / width;
        float width4 = (getBoardRect().width() * 1.0f) / getBoardRect().height();
        float width5 = f19 < width4 ? getBoardRect().width() / f19 : getBoardRect().height();
        android.widget.ImageView.ScaleType scaleType = this.f22940d;
        if (scaleType == android.widget.ImageView.ScaleType.CENTER_INSIDE) {
            float width6 = (f19 < width4 ? getBoardRect().width() : getBoardRect().width()) / f19;
            if (d(matrix) % 180.0f == 0.0f) {
                f18 = width6 * 1.0f;
                width3 = rawImageRect.height();
            } else {
                f18 = width6 * 1.0f;
                width3 = rawImageRect.width();
            }
            c17 = f18 / width3;
        } else {
            c17 = scaleType == android.widget.ImageView.ScaleType.CENTER_CROP ? c(rawImageRect) : 1.0f;
        }
        if (d(matrix) % 180.0f == 0.0f) {
            f17 = width5 * 1.0f;
            width2 = rawImageRect.height();
        } else {
            f17 = width5 * 1.0f;
            width2 = rawImageRect.width();
        }
        float f27 = f17 / width2;
        matrix.postScale(c17, c17, rawImageRect.centerX(), rawImageRect.centerY());
        android.graphics.RectF curImageRect = getCurImageRect();
        int centerX = (int) curImageRect.centerX();
        int centerY = (int) curImageRect.centerY();
        int centerX2 = getBoardRect().centerX() - centerX;
        int boardRectCenterY = getBoardRectCenterY() - centerY;
        if (f19 < width4) {
            boardRectCenterY = (int) ((c17 - 1.0f) * centerY);
        }
        matrix.postTranslate(centerX2, boardRectCenterY);
        android.graphics.Matrix matrix2 = this.f22942f;
        matrix2.set(matrix);
        this.f22956w = e(matrix2) * 3.0f;
        this.f22957x = e(matrix2) * F;
        if (this.f22956w < f27) {
            this.f22956w = f27 * 1.2f;
        }
    }

    public void b(bn5.e eVar, float f17, boolean z17) {
        float height;
        float width;
        float width2;
        float f18;
        float width3;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseBoardView", "adaptImageWithAnim");
        android.graphics.RectF curImageRect = getCurImageRect();
        int centerX = (int) curImageRect.centerX();
        int centerY = (int) curImageRect.centerY();
        int centerX2 = getBoardRect().centerX() - centerX;
        this.B = !z17;
        int boardRectCenterY = getBoardRectCenterY() - centerY;
        float f19 = f17 % 180.0f;
        if (f19 == 0.0f) {
            height = curImageRect.width() * 1.0f;
            width = curImageRect.height();
        } else {
            height = curImageRect.height() * 1.0f;
            width = curImageRect.width();
        }
        float f27 = height / width;
        if (f27 < (getBoardRect().width() * 1.0f) / getBoardRect().height()) {
            getBoardRect().width();
            width2 = getBoardRect().height();
        } else {
            getBoardRect().height();
            width2 = getBoardRect().width() / f27;
        }
        if (f19 == 0.0f) {
            f18 = width2 * 1.0f;
            width3 = curImageRect.height();
        } else {
            f18 = width2 * 1.0f;
            width3 = curImageRect.width();
        }
        float f28 = centerX2;
        float f29 = boardRectCenterY;
        bn5.d dVar = new bn5.d(this, f18 / width3, f28, f29, centerX, centerY, f17, z17);
        dVar.f22938i = eVar;
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("scale", 0.0f, 166.0f), android.animation.PropertyValuesHolder.ofFloat("deltaX", 0.0f, f28), android.animation.PropertyValuesHolder.ofFloat("deltaY", 0.0f, f29), android.animation.PropertyValuesHolder.ofFloat("rotation", 0.0f, f17));
        dVar.f22932c = ofPropertyValuesHolder;
        ofPropertyValuesHolder.addUpdateListener(new bn5.b(dVar));
        dVar.f22932c.addListener(new bn5.c(dVar));
        dVar.f22932c.setInterpolator(new android.view.animation.LinearInterpolator());
        dVar.f22932c.setDuration(166L);
        dVar.f22932c.start();
    }

    public float c(android.graphics.Rect rect) {
        return java.lang.Math.max((getBoardRect().width() * 1.0f) / rect.width(), (getBoardRect().height() * 1.0f) / rect.height());
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

    public android.graphics.Rect getAliveRect() {
        return this.f22944h;
    }

    public android.graphics.Rect getBoardRect() {
        if (this.f22945i == null) {
            this.f22945i = new android.graphics.Rect();
        }
        return this.f22945i;
    }

    public int getBoardRectCenterY() {
        if (this.f22959z == -1 || this.B) {
            return this.f22945i.centerY();
        }
        if (this.A == -1) {
            android.graphics.RectF curValidImageRect = getCurValidImageRect();
            this.A = (int) (((curValidImageRect.bottom - curValidImageRect.top) / 2.0f) + this.f22959z);
        }
        return this.A;
    }

    public android.graphics.RectF getCurImageRect() {
        android.graphics.RectF rectF = new android.graphics.RectF(getRawImageRect());
        this.f22941e.mapRect(rectF);
        return rectF;
    }

    public float getCurScale() {
        return e(this.f22941e);
    }

    public android.graphics.RectF getCurValidImageRect() {
        android.graphics.RectF rectF = new android.graphics.RectF(getValidImageRect());
        this.f22941e.mapRect(rectF);
        return rectF;
    }

    public android.graphics.Rect getFinalGenerateBitmapOutputRect() {
        return this.C;
    }

    public android.graphics.Rect getImageBitmapRect() {
        return this.f22948o;
    }

    public float getInitScale() {
        if (f()) {
            return this.f22955v;
        }
        return 1.0f;
    }

    public android.graphics.Matrix getMainMatrix() {
        return this.f22941e;
    }

    public float getMaxScale() {
        return this.f22956w;
    }

    public float getMinScale() {
        return this.f22957x;
    }

    public l45.q getPresenter() {
        return this.f22951r;
    }

    public android.graphics.Rect getRawBoardRect() {
        return this.f22947n;
    }

    public android.graphics.Rect getRawImageRect() {
        return this.f22946m;
    }

    public android.graphics.Rect getRawLayoutRect() {
        if (this.f22950q == null) {
            this.f22950q = ((l45.n) getPresenter()).f316461b.f364239i;
        }
        return this.f22950q;
    }

    public android.graphics.Rect getValidImageRect() {
        android.graphics.Rect rect = this.f22949p;
        return rect != null ? rect : this.f22946m;
    }

    public void h(android.view.MotionEvent motionEvent) {
        motionEvent.toString();
        if (motionEvent.getAction() == 0) {
            this.f22953t = motionEvent.getX();
            this.f22954u = motionEvent.getY();
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 2) {
                if (java.lang.Math.abs(motionEvent.getX() - this.f22953t) >= 3.0f || java.lang.Math.abs(motionEvent.getY() - this.f22954u) >= 3.0f) {
                    this.D = true;
                    removeCallbacks(this.f22952s);
                    if (((l45.n) getPresenter()).f316460a.f463360w) {
                        ((l45.n) getPresenter()).f316460a.setFooterVisible(false);
                        ((l45.n) getPresenter()).f316460a.setActionBarVisible(false);
                    }
                }
                this.f22953t = motionEvent.getX();
                this.f22954u = motionEvent.getY();
                return;
            }
            return;
        }
        removeCallbacks(this.f22952s);
        long j17 = this.D ? 700L : 0L;
        dl.a m17 = ((l45.n) getPresenter()).f().m();
        if (m17 == dl.a.EMOJI_AND_TEXT || m17 == dl.a.STICKER) {
            ((l45.n) getPresenter()).f316460a.c(true);
            if (((l45.n) getPresenter()).f316460a.f463360w) {
                ((l45.n) getPresenter()).f316460a.setFooterVisible(false);
                ((l45.n) getPresenter()).f316460a.setActionBarVisible(false);
            } else {
                ym5.h hVar = ((l45.n) getPresenter()).f316460a;
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = hVar.f463353p;
                if (!(chatFooterPanel != null && (chatFooterPanel.getVisibility() == 0 || hVar.getTextEditView().getVisibility() == 0))) {
                    ((l45.n) getPresenter()).f316460a.setFooterVisible(true);
                    ((l45.n) getPresenter()).f316460a.setActionBarVisible(true);
                }
            }
            dn5.c baseFooterView = ((l45.n) getPresenter()).f316460a.getBaseFooterView();
            baseFooterView.f242048r = baseFooterView.f242049s;
            baseFooterView.requestLayout();
            baseFooterView.invalidate();
        } else {
            bn5.a aVar = new bn5.a(this);
            this.f22952s = aVar;
            postDelayed(aVar, j17);
        }
        this.D = false;
    }

    public void i(android.view.MotionEvent motionEvent) {
    }

    public void j() {
        l45.q qVar = this.f22951r;
        if (qVar != null) {
            this.A = -1;
            l45.n nVar = (l45.n) qVar;
            qk.l9 l9Var = nVar.f316461b;
            this.f22959z = l9Var.f364242l;
            F = l9Var.f364243m;
            android.graphics.Bitmap bitmap = nVar.f316465f;
            if (bitmap != null) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                android.graphics.Rect rect = this.f22946m;
                rect.set(0, 0, width, height);
                this.f22944h.set(rect);
                this.f22948o.set(rect);
            }
            if (nVar.f316482w) {
                this.f22941e.reset();
                a();
            }
        }
    }

    public void k(android.graphics.Rect rect) {
        this.f22946m.set(rect);
        this.f22944h.set(rect);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseBoardView", "[resetImageRect] rect %s", rect.flattenToString());
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mars.xlog.Log.i("changelcai", "[onLayout] %s=%s=%s=%s=%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (z17) {
            this.f22945i.set(i17, i18, i19, i27);
            this.f22947n.set(this.f22945i);
        }
        l45.n nVar = (l45.n) getPresenter();
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "[onLayout],%s", java.lang.Boolean.valueOf(nVar.f316482w));
        nVar.c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (((l45.n) getPresenter()).n()) {
            h(motionEvent);
        }
        if (((l45.n) getPresenter()).v(motionEvent) || !f()) {
            return true;
        }
        if (!((l45.n) getPresenter()).f316467h) {
            return false;
        }
        i(motionEvent);
        return true;
    }

    public void setFinalGenerateBitmapOutputRect(android.graphics.Rect rect) {
        this.C = rect;
    }

    public void setForceMatrix(android.graphics.Matrix matrix) {
        this.f22943g = matrix;
    }

    public void setInitScale(float f17) {
        this.f22955v = f17;
    }

    public void setOneFingerMoveEnable(boolean z17) {
        this.f22958y = z17;
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.f22940d = scaleType;
    }

    public void setTouchEnable(boolean z17) {
    }

    public void setValidImageRect(android.graphics.Rect rect) {
        this.f22949p = rect;
    }
}

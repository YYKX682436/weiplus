package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MultiTouchImageView */
/* loaded from: classes13.dex */
public class C21524xecd57b9a extends android.widget.ImageView implements db5.f0 {
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f279175J;
    public android.graphics.Paint K;
    public final android.graphics.Paint L;
    public float M;
    public float N;
    public boolean P;
    public boolean Q;
    public android.widget.ImageView.ScaleType R;
    public final android.graphics.Rect S;
    public final android.graphics.Rect T;
    public final float[] U;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 V;
    public float W;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f279176d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Matrix f279177e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f279178f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f279179g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f279180h;

    /* renamed from: i, reason: collision with root package name */
    public float f279181i;

    /* renamed from: m, reason: collision with root package name */
    public float f279182m;

    /* renamed from: n, reason: collision with root package name */
    public float f279183n;

    /* renamed from: o, reason: collision with root package name */
    public int f279184o;

    /* renamed from: p, reason: collision with root package name */
    public int f279185p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f279186p0;

    /* renamed from: q, reason: collision with root package name */
    public float f279187q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Float f279188r;

    /* renamed from: s, reason: collision with root package name */
    public db5.e0 f279189s;

    /* renamed from: t, reason: collision with root package name */
    public int f279190t;

    /* renamed from: u, reason: collision with root package name */
    public int f279191u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f279192v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f279193w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f279194x;

    /* renamed from: x0, reason: collision with root package name */
    public android.graphics.drawable.Drawable f279195x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f279196y;

    /* renamed from: z, reason: collision with root package name */
    public float f279197z;

    public C21524xecd57b9a(android.content.Context context, int i17, int i18) {
        super(context);
        this.f279176d = new android.graphics.Matrix();
        this.f279177e = new android.graphics.Matrix();
        this.f279178f = new android.graphics.Matrix();
        this.f279179g = new float[9];
        this.f279180h = null;
        this.f279181i = 0.0f;
        this.f279182m = 0.0f;
        this.f279183n = 0.0f;
        this.f279192v = false;
        this.f279193w = false;
        this.f279194x = true;
        this.f279196y = false;
        this.f279197z = 2.0f;
        this.A = 0.75f;
        this.B = 20.0f;
        this.C = 0.0f;
        this.D = 1.0f;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = true;
        this.K = null;
        this.L = new android.graphics.Paint();
        this.M = 1.0f;
        this.N = 1.0f;
        this.P = true;
        this.Q = true;
        this.R = android.widget.ImageView.ScaleType.MATRIX;
        this.S = new android.graphics.Rect();
        this.T = new android.graphics.Rect();
        this.U = new float[9];
        this.V = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.W = 1.0f;
        this.f279186p0 = false;
        this.f279185p = i18;
        this.f279184o = i17;
        t();
    }

    @Override // db5.f0
    public void a(float f17, float f18, float f19) {
        float mo45732x7520af94 = mo45732x7520af94();
        if (this.E) {
            float f27 = this.f279181i;
            if (0.0f == f27) {
                f27 = this.B * this.W;
            }
            this.f279182m = f27;
        }
        float f28 = this.f279182m;
        if (f17 > f28 * 2.0f) {
            f17 = ((f17 - f28) * 0.1f) + (2.0f * f28);
        } else {
            float f29 = this.f279183n;
            if (f17 < f29) {
                f17 = f29;
            }
        }
        float f37 = f17 / mo45732x7520af94;
        if (!this.f279186p0) {
            setImageMatrix(m79181x1db5104b());
            this.f279177e.postScale(f37, f37, f18, f19);
        }
        db5.e0 e0Var = this.f279189s;
        if (e0Var != null) {
            ((kz3.j) e0Var).a(mo45732x7520af94, f17);
        }
    }

    @Override // db5.f0
    public float b(float f17, float f18) {
        float mo79179x72dd1a9c = mo79179x72dd1a9c();
        this.f279181i = mo79179x72dd1a9c;
        v(mo79179x72dd1a9c, f17, f18, 128.0f);
        return this.f279181i;
    }

    @Override // db5.f0
    public void c(float f17, float f18) {
        this.f279177e.postTranslate(f17, f18);
        setImageMatrix(m79181x1db5104b());
        this.f279177e.getValues(new float[9]);
    }

    @Override // db5.f0
    public void d(float f17, float f18) {
        s();
        v(this.f279187q, f17, f18, 128.0f);
    }

    @Override // db5.f0
    public void e(boolean z17) {
    }

    @Override // db5.f0
    public void f() {
        this.f279188r = null;
        s();
    }

    @Override // db5.f0
    public boolean g() {
        return this.F;
    }

    @Override // db5.f0
    /* renamed from: getDoubleTabScale */
    public float mo79179x72dd1a9c() {
        float mo79188x8f7d8694 = mo79188x8f7d8694();
        float m79189x607d2a92 = m79189x607d2a92() * 0.7f > mo79188x8f7d8694 ? m79189x607d2a92() : m79187x95592ddb() * 0.7f > mo79188x8f7d8694 ? m79187x95592ddb() : mo79188x8f7d8694() * this.f279197z;
        if (m79189x607d2a92 < 1.0d) {
            m79189x607d2a92 = 1.0f;
        }
        return m79189x607d2a92 > m79183x70202721() ? m79183x70202721() : m79189x607d2a92;
    }

    @Override // db5.f0
    /* renamed from: getImageHeight */
    public int mo79180x47e2bd2c() {
        return this.f279185p;
    }

    /* renamed from: getImageViewMatrix */
    public android.graphics.Matrix m79181x1db5104b() {
        android.graphics.Matrix matrix = this.f279176d;
        android.graphics.Matrix matrix2 = this.f279178f;
        matrix2.set(matrix);
        matrix2.postConcat(this.f279177e);
        return matrix2;
    }

    @Override // db5.f0
    /* renamed from: getImageViewMatrixScale */
    public android.graphics.PointF mo45728xfdb07fbf() {
        android.graphics.Matrix matrix = this.f279177e;
        float[] fArr = this.f279179g;
        matrix.getValues(fArr);
        return new android.graphics.PointF(fArr[0], fArr[4]);
    }

    @Override // db5.f0
    /* renamed from: getImageViewMatrixTranslation */
    public android.graphics.PointF mo45729x3ffd66() {
        android.graphics.Matrix matrix = this.f279177e;
        float[] fArr = this.f279179g;
        matrix.getValues(fArr);
        return new android.graphics.PointF(fArr[2], fArr[5]);
    }

    @Override // db5.f0
    /* renamed from: getImageWidth */
    public int mo79182x97cbed21() {
        return this.f279184o;
    }

    /* renamed from: getMaxZoom */
    public float m79183x70202721() {
        return this.f279182m;
    }

    /* renamed from: getMinZoom */
    public float m79184x7d3a010f() {
        return this.f279183n;
    }

    /* renamed from: getOriginScale */
    public float m79185x4042388e() {
        return this.C;
    }

    /* renamed from: getRealWidth */
    public float m79186xca40a812() {
        return mo45732x7520af94() * mo79182x97cbed21();
    }

    @Override // db5.f0
    /* renamed from: getScale */
    public float mo45732x7520af94() {
        android.graphics.Matrix matrix = this.f279177e;
        float[] fArr = this.f279179g;
        matrix.getValues(fArr);
        s();
        float f17 = this.B * this.W;
        this.f279182m = f17;
        float f18 = this.f279187q * this.A;
        this.f279183n = f18;
        if (f17 < 1.0f) {
            this.f279182m = 1.0f;
        }
        if (f18 > 1.0f) {
            this.f279183n = 1.0f;
        }
        return fArr[0];
    }

    /* renamed from: getScaleHeight */
    public float m79187x95592ddb() {
        return this.f279175J;
    }

    @Override // db5.f0
    /* renamed from: getScaleRate */
    public float mo79188x8f7d8694() {
        return this.f279187q;
    }

    /* renamed from: getScaleWidth */
    public float m79189x607d2a92() {
        return this.I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        if (r2 < r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007b, code lost:
    
        if (r2 < r1) goto L33;
     */
    @Override // db5.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a.h():void");
    }

    @Override // db5.f0
    public void i() {
        this.f279177e.reset();
        s();
        a(this.f279187q, 0.0f, 0.0f);
        h();
    }

    @Override // db5.f0
    public boolean j() {
        return this.G;
    }

    @Override // db5.f0
    public android.graphics.PointF l(android.graphics.PointF pointF, int i17, int i18) {
        if (pointF == null) {
            return null;
        }
        float[] fArr = {pointF.x * this.f279184o, pointF.y * ((int) (((r1 * 1.0f) * i18) / i17))};
        android.graphics.Matrix m79181x1db5104b = m79181x1db5104b();
        if (m79181x1db5104b == null) {
            return null;
        }
        float[] fArr2 = new float[2];
        m79181x1db5104b.mapPoints(fArr2, fArr);
        return new android.graphics.PointF(fArr2[0], fArr2[1]);
    }

    @Override // db5.f0
    public android.graphics.PointF m(android.graphics.PointF pointF) {
        float[] fArr = {pointF.x, pointF.y};
        android.graphics.Matrix m79181x1db5104b = m79181x1db5104b();
        android.graphics.PointF pointF2 = null;
        if (m79181x1db5104b != null) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            if (m79181x1db5104b.invert(matrix)) {
                float[] fArr2 = new float[2];
                matrix.mapPoints(fArr2, fArr);
                pointF2 = new android.graphics.PointF(fArr2[0], fArr2[1]);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTouchImageView", "invertMapPoint invert matrix failed");
            }
        }
        if (pointF2 != null) {
            float f17 = pointF2.x;
            int i17 = this.f279184o;
            pointF2.x = f17 / i17;
            pointF2.y /= this.f279185p;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTouchImageView", "convertScreenToImageCoordinate screenCoordinate: %s, imageCoordinate: %s, imageWidth: %s, imageHeight: %s", pointF, pointF2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f279185p));
        }
        return pointF2;
    }

    @Override // db5.f0
    public void n(float f17, boolean z17) {
        this.P = z17;
        this.M = f17;
        invalidate();
    }

    @Override // db5.f0
    public void o() {
        if (this.E && 0.0f == this.f279181i) {
            this.f279181i = mo79179x72dd1a9c();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17 = configuration.orientation;
        if (i17 == 1 || i17 == 2) {
            this.f279192v = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        android.graphics.Bitmap bitmap;
        if (!this.f279186p0 && (bitmap = this.f279180h) != null && bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTouchImageView", "this bitmap is recycled! draw nothing!");
            return;
        }
        float f17 = this.M;
        if (f17 < 0.0f || f17 >= 1.0f || this.f279180h == null) {
            if (this.K == null || ((!this.f279186p0 || this.f279195x0 == null) && this.f279180h == null)) {
                super.onDraw(canvas);
                return;
            }
            android.graphics.Matrix imageMatrix = getImageMatrix();
            if (imageMatrix != null) {
                canvas.save();
                canvas.concat(imageMatrix);
                if (this.f279186p0) {
                    if (this.f279195x0.getIntrinsicWidth() > 2 && this.f279195x0.getIntrinsicHeight() > 2) {
                        canvas.drawRect(1.0f, 1.0f, this.f279195x0.getIntrinsicWidth() - 1, this.f279195x0.getIntrinsicHeight() - 1, this.K);
                    }
                } else if (this.f279180h.getWidth() > 2 && this.f279180h.getHeight() > 2) {
                    canvas.drawRect(1.0f, 1.0f, this.f279180h.getWidth() - 1, this.f279180h.getHeight() - 1, this.K);
                }
                canvas.restore();
            }
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int height2 = this.f279180h.getHeight();
        int width2 = this.f279180h.getWidth();
        float f18 = height2;
        float f19 = (f18 * 1.0f) / width2;
        if (!this.Q) {
            width = (int) (getHeight() / f19);
        }
        float f27 = width;
        int i18 = (int) (f27 * f19);
        android.graphics.Matrix m79181x1db5104b = m79181x1db5104b();
        float[] fArr = this.U;
        m79181x1db5104b.getValues(fArr);
        float f28 = fArr[5] / fArr[4];
        android.graphics.Rect rect = this.T;
        android.graphics.Rect rect2 = this.S;
        if (height2 > width2) {
            float f29 = this.M;
            int i19 = (int) (((height2 - width2) * (1.0f - f29)) / 2.0f);
            int i27 = f19 > (height * 1.0f) / f27 ? (int) (((int) (((f18 - (r7 * r10)) / 2.0f) * f29)) + (f28 * f29)) : 0;
            rect2.set(0, i19 - i27, width2, (height2 - i19) - i27);
            int width3 = ((height - i18) / 2) + ((int) (((i18 - getWidth()) * (1.0f - this.M)) / 2.0f));
            int width4 = (int) ((getWidth() - ((getHeight() - (width3 * 2)) / (((f19 - 1.0f) * this.M) + 1.0f))) / 2.0f);
            rect.set(width4, width3, getWidth() - width4, getHeight() - width3);
        } else {
            int i28 = (int) (((width2 - height2) * (1.0f - this.M)) / 2.0f);
            rect2.set(i28, 0, width2 - i28, height2);
            int width5 = (height - ((int) (getWidth() / (((width2 - (i28 * 2)) * 1.0f) / f18)))) / 2;
            if (!this.P) {
                float f37 = 1.0f - ((1.0f - this.N) * (1.0f - this.M));
                if ((height - (width5 * 2)) * f37 > i18) {
                    int i29 = (int) (((f27 / (1.0f / f37)) - f27) / 2.0f);
                    i17 = 0;
                    rect2.set(i29, 0, width2 - i29, height2);
                    width5 = (height - i18) / 2;
                    rect.set(i17, width5, getWidth(), getHeight() - width5);
                }
            }
            i17 = 0;
            rect.set(i17, width5, getWidth(), getHeight() - width5);
        }
        canvas.drawBitmap(this.f279180h, rect2, rect, this.L);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || !keyEvent.isTracking() || keyEvent.isCanceled() || mo45732x7520af94() <= 1.0f) {
            return super.onKeyUp(i17, keyEvent);
        }
        a(1.0f, this.f279190t / 2.0f, this.f279191u / 2.0f);
        h();
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f279190t == android.view.View.MeasureSpec.getSize(i17) && this.f279191u == android.view.View.MeasureSpec.getSize(i18)) {
            this.f279193w = false;
        } else {
            this.f279193w = true;
        }
        this.f279190t = android.view.View.MeasureSpec.getSize(i17);
        this.f279191u = android.view.View.MeasureSpec.getSize(i18);
        if (!this.f279192v) {
            this.f279192v = true;
            t();
        }
        if (this.f279193w && this.f279194x) {
            i();
        }
    }

    @Override // db5.f0
    public void p(float f17, float f18, float f19) {
        v(f17, f18, f19, 128.0f);
    }

    @Override // db5.f0
    public void r(int i17, int i18) {
        this.f279184o = i17;
        this.f279185p = i18;
    }

    public final void s() {
        float f17;
        int i17;
        java.lang.Float f18 = this.f279188r;
        if (f18 != null) {
            this.f279187q = f18.floatValue();
            return;
        }
        int i18 = this.f279190t;
        float f19 = 2.2f;
        if (i18 == 0 || (i17 = this.f279191u) == 0) {
            f17 = 1.8f;
        } else {
            f17 = i17 / i18;
            if (f17 < 1.5f) {
                f19 = 2.5f;
            }
        }
        int i19 = this.f279184o;
        float f27 = i18 / i19;
        this.I = f27;
        int i27 = this.f279191u;
        int i28 = this.f279185p;
        float f28 = i27 / i28;
        this.f279175J = f28;
        boolean z17 = ((float) i19) > ((float) i28) * f19;
        this.F = z17;
        boolean z18 = ((float) i28) > ((float) i19) * f19;
        this.G = z18;
        this.F = z17 && i19 > i18;
        this.G = z18 && i28 > i27;
        float f29 = i28 / i19;
        if (f29 <= f17 || f29 > f19) {
            this.f279187q = f27 * this.D;
            this.Q = true;
        } else {
            this.f279187q = f28 * this.D;
            this.Q = false;
        }
    }

    @Override // db5.f0
    /* renamed from: setAnimationScale */
    public void mo79190x5f9bc528(float f17) {
        this.N = f17;
    }

    @Override // db5.f0
    /* renamed from: setBitmapPlaceHolder */
    public void mo79191x855578a2(android.graphics.Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    @Override // db5.f0
    /* renamed from: setCanRefresh */
    public void mo45735x96646ed(boolean z17) {
        this.f279194x = z17;
    }

    @Override // db5.f0
    /* renamed from: setCustomScaleRate */
    public void mo45736x50bb6417(java.lang.Float f17) {
        this.f279188r = f17;
        if (f17 != null) {
            this.f279187q = f17.floatValue();
        }
    }

    /* renamed from: setCustomScaleType */
    public void m79192x50bca671(android.widget.ImageView.ScaleType scaleType) {
        this.R = scaleType;
    }

    /* renamed from: setDoubleTabScaleLimit */
    public void m79193x8a1c41f3(float f17) {
        if (java.lang.Float.compare(f17, 0.0f) < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTouchImageView", "double tab scale limit is less than 0.0, change nothing, return");
        } else {
            this.f279197z = f17;
        }
    }

    /* renamed from: setDoubleTabZoomToNormal */
    public void m79194xbc839517(boolean z17) {
    }

    /* renamed from: setEnableHorLongBmpMode */
    public void m79195x464b3146(boolean z17) {
        this.H = z17;
    }

    /* renamed from: setGifDrawable */
    public void m79196x703a2ac0(android.graphics.drawable.Drawable drawable) {
        this.f279186p0 = true;
        this.f279195x0 = drawable;
        setImageDrawable(drawable);
    }

    /* renamed from: setGifPath */
    public void m79197xb2d06f47(java.lang.String str) {
        this.f279186p0 = true;
        try {
            android.graphics.drawable.Drawable a17 = og5.g.a(str, str);
            this.f279195x0 = a17;
            setImageDrawable(a17);
            android.graphics.drawable.Drawable drawable = this.f279195x0;
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = this.f279195x0.getIntrinsicHeight();
                this.f279184o = intrinsicWidth;
                this.f279185p = intrinsicHeight;
            }
        } catch (java.lang.Exception unused) {
            this.f279186p0 = false;
        }
    }

    /* renamed from: setImageBackgroundColor */
    public void m79198xba81af7c(int i17) {
        if (android.graphics.Color.alpha(i17) == 0) {
            this.K = null;
        } else {
            android.graphics.Paint paint = new android.graphics.Paint(1);
            this.K = paint;
            paint.setStyle(android.graphics.Paint.Style.FILL);
            this.K.setColor(i17);
        }
        this.L.setAntiAlias(true);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        if (this.f279196y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTouchImageView", "ignore setImageBitmap for has set uhd image");
            return;
        }
        this.f279186p0 = false;
        this.f279180h = bitmap;
        this.f279192v = false;
        super.setImageBitmap(bitmap);
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (!(drawable instanceof android.graphics.drawable.BitmapDrawable) || bitmap == null) {
            return;
        }
        ((android.graphics.drawable.BitmapDrawable) drawable).setTargetDensity(bitmap.getDensity());
    }

    /* renamed from: setImageHeight */
    public void m79199xde4830a0(int i17) {
        this.f279185p = i17;
    }

    @Override // db5.f0
    /* renamed from: setImageViewMatrix */
    public void mo45742x548ba9bf(android.graphics.Matrix matrix) {
        float f17;
        db5.e0 e0Var;
        android.graphics.Matrix m79181x1db5104b = m79181x1db5104b();
        float[] fArr = this.f279179g;
        float f18 = 0.0f;
        if (m79181x1db5104b != null) {
            m79181x1db5104b.getValues(fArr);
            f17 = fArr[0];
        } else {
            f17 = 0.0f;
        }
        this.f279177e.reset();
        this.f279177e.set(matrix);
        android.graphics.Matrix matrix2 = this.f279177e;
        if (matrix2 != null) {
            matrix2.getValues(fArr);
            f18 = fArr[0];
        }
        setImageMatrix(m79181x1db5104b());
        if (f18 == f17 || (e0Var = this.f279189s) == null) {
            return;
        }
        ((kz3.j) e0Var).a(f17, f18);
    }

    /* renamed from: setImageWidth */
    public void m79200xc5f03b2d(int i17) {
        this.f279184o = i17;
    }

    /* renamed from: setMaxZoomDoubleTab */
    public void m79201x4cf4f0ef(boolean z17) {
        this.E = z17;
    }

    @Override // db5.f0
    /* renamed from: setMaxZoomLimit */
    public void mo79202xa3d97c26(float f17) {
        if (java.lang.Float.compare(f17, 1.0f) < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTouchImageView", "max scale limit is less than 1.0, change nothing, return");
        } else {
            this.B = f17;
        }
    }

    /* renamed from: setMinZoomLimit */
    public void m79203xc020a6f8(float f17) {
        if (java.lang.Float.compare(f17, 1.0f) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTouchImageView", "min scale limit is greater than 1.0, change nothing, return");
        } else if (java.lang.Float.compare(f17, 0.0f) < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTouchImageView", "min scale limit is less than 0.0, change nothing, return");
        } else {
            this.A = f17;
        }
    }

    @Override // db5.f0
    /* renamed from: setOnZoomScaleChangedListener */
    public void mo79204xfe3d8052(db5.e0 e0Var) {
        this.f279189s = e0Var;
    }

    /* renamed from: setOriginScale */
    public void m79205xd6a7ac02(float f17) {
        this.C = f17;
    }

    /* renamed from: setUhdImageBitmap */
    public void m79206x9f01167b(android.graphics.Bitmap bitmap) {
        if (this.f279180h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTouchImageView", "setUhdImageBitmap hd image is null");
            setImageBitmap(bitmap);
            this.f279196y = true;
            return;
        }
        this.f279196y = true;
        this.f279186p0 = false;
        float width = (r0.getWidth() * 1.0f) / bitmap.getWidth();
        this.f279180h = bitmap;
        float[] fArr = new float[9];
        this.f279177e.getValues(fArr);
        float f17 = fArr[2];
        float f18 = fArr[5];
        float f19 = fArr[0];
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.f279177e = matrix;
        matrix.postScale(width, width);
        this.f279177e.postScale(f19, f19);
        this.f279177e.postTranslate(f17, f18);
        setImageMatrix(m79181x1db5104b());
        super.setImageBitmap(bitmap);
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            ((android.graphics.drawable.BitmapDrawable) drawable).setTargetDensity(bitmap.getDensity());
        }
    }

    public final void t() {
        setScaleType(this.R);
        float f17 = getContext().getResources().getDisplayMetrics().widthPixels / 720.0f;
        if (f17 > 1.0f) {
            this.W = f17;
        }
        i();
    }

    public void u(float f17) {
        if (mo45732x7520af94() < this.f279182m && mo45732x7520af94() > this.f279183n) {
            if (this.f279180h != null || this.f279186p0) {
                if (this.f279195x0 == null && this.f279186p0) {
                    return;
                }
                this.f279177e.postScale(f17, f17, this.f279190t / 2.0f, this.f279191u / 2.0f);
                setImageMatrix(m79181x1db5104b());
            }
        }
    }

    public void v(float f17, float f18, float f19, float f27) {
        float mo45732x7520af94 = (f17 - mo45732x7520af94()) / f27;
        this.V.mo50293x3498a0(new db5.s8(this, f27, java.lang.System.currentTimeMillis(), mo45732x7520af94(), mo45732x7520af94, f18, f19));
    }

    public C21524xecd57b9a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279176d = new android.graphics.Matrix();
        this.f279177e = new android.graphics.Matrix();
        this.f279178f = new android.graphics.Matrix();
        this.f279179g = new float[9];
        this.f279180h = null;
        this.f279181i = 0.0f;
        this.f279182m = 0.0f;
        this.f279183n = 0.0f;
        this.f279192v = false;
        this.f279193w = false;
        this.f279194x = true;
        this.f279196y = false;
        this.f279197z = 2.0f;
        this.A = 0.75f;
        this.B = 20.0f;
        this.C = 0.0f;
        this.D = 1.0f;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = true;
        this.K = null;
        this.L = new android.graphics.Paint();
        this.M = 1.0f;
        this.N = 1.0f;
        this.P = true;
        this.Q = true;
        this.R = android.widget.ImageView.ScaleType.MATRIX;
        this.S = new android.graphics.Rect();
        this.T = new android.graphics.Rect();
        this.U = new float[9];
        this.V = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.W = 1.0f;
        this.f279186p0 = false;
        this.f279185p = 0;
        this.f279184o = 0;
        t();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528741z);
        try {
            m79198xba81af7c(obtainStyledAttributes.getColor(0, -1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

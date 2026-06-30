package bn5;

/* loaded from: classes10.dex */
public class h extends bn5.f {
    public long G;
    public final ok.p H;
    public final android.graphics.PointF I;

    /* renamed from: J, reason: collision with root package name */
    public float f22961J;
    public float K;
    public boolean L;
    public boolean M;

    public h(android.content.Context context, l45.q qVar) {
        super(context, qVar);
        this.G = -1L;
        this.H = l();
        this.I = new android.graphics.PointF();
        this.f22961J = 0.0f;
        this.K = 0.0f;
        this.L = false;
        this.M = false;
    }

    @Override // bn5.f
    public boolean f() {
        return true;
    }

    @Override // bn5.f
    public boolean g() {
        return ((float) getRawImageRect().width()) / ((float) getRawImageRect().height()) < ((float) getBoardRect().width()) / ((float) getBoardRect().height());
    }

    @Override // bn5.f
    public float getMinScale() {
        if (((l45.n) getPresenter()).f().m() != dl.a.CROP_PHOTO) {
            return super.getMinScale();
        }
        float width = getBoardRect().width() / getCurImageRect().width();
        float height = getBoardRect().height() / getCurImageRect().height();
        if (width <= height) {
            width = height;
        }
        return width * getCurScale();
    }

    @Override // bn5.f
    public void i(android.view.MotionEvent motionEvent) {
        float x17 = motionEvent.getX(motionEvent.getPointerCount() - 1);
        float y17 = motionEvent.getY(motionEvent.getPointerCount() - 1);
        if (((l45.n) getPresenter()).f316467h) {
            int actionMasked = motionEvent.getActionMasked();
            android.graphics.PointF pointF = this.I;
            ok.p pVar = this.H;
            if (actionMasked == 0) {
                pointF.set(x17, y17);
                this.f22961J = 0.0f;
                this.K = getCurScale();
                android.animation.ValueAnimator valueAnimator = pVar.f345955d;
                if (valueAnimator != null && (valueAnimator.isRunning() || pVar.f345955d.isStarted())) {
                    pVar.f345955d.cancel();
                }
                this.M = false;
                m();
            } else if (actionMasked == 1) {
                this.f22961J = 0.0f;
                if (this.M) {
                    pVar.b();
                }
                n();
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f22961J = 0.0f;
                    this.K = getCurScale();
                } else if (actionMasked == 6) {
                    this.f22961J = 0.0f;
                    this.L = true;
                }
            } else {
                if (this.L) {
                    this.L = false;
                    return;
                }
                if (motionEvent.getPointerCount() == 2) {
                    if (!this.M) {
                        ((l45.n) getPresenter()).f316476q++;
                    }
                    this.M = true;
                    float x18 = motionEvent.getX(0) - motionEvent.getX(1);
                    float y18 = motionEvent.getY(0) - motionEvent.getY(1);
                    float sqrt = (float) java.lang.Math.sqrt((x18 * x18) + (y18 * y18));
                    float f17 = this.f22961J;
                    if (f17 == 0.0f) {
                        this.f22961J = sqrt;
                    } else {
                        float f18 = (sqrt / f17) * this.K;
                        if (this.f22957x * 0.5f <= f18) {
                            float f19 = this.f22956w;
                            if (f18 > f19) {
                                f18 = ((f18 - f19) * 0.2f) + f19;
                            }
                            boolean z17 = ((float) (java.lang.System.currentTimeMillis() - this.G)) >= 100.0f;
                            if (bn5.f.F != 1.0f && java.lang.Math.abs(1.0f - f18) <= 0.005d && z17) {
                                this.G = java.lang.System.currentTimeMillis();
                                performHapticFeedback(0, 3);
                            }
                            getMainMatrix().postScale(f18 / getCurScale(), f18 / getCurScale(), x17, y17);
                        }
                        pVar.f345927a = true;
                        o(x17, y17);
                        postInvalidate();
                    }
                    if (((l45.n) getPresenter()).f().m() == dl.a.CROP_PHOTO && ((l45.n) getPresenter()).f316484y != null) {
                        ((l45.n) getPresenter()).f316484y.X6();
                    }
                } else if (motionEvent.getPointerCount() == 1 && this.f22958y) {
                    this.M = true;
                    pVar.f345927a = true;
                    o(x17, y17);
                    postInvalidate();
                }
            }
            pointF.x = x17;
            pointF.y = y17;
        }
    }

    public ok.p l() {
        return new ok.p(this);
    }

    public void m() {
    }

    public void n() {
    }

    public void o(float f17, float f18) {
        float f19;
        float f27;
        float f28;
        float f29;
        android.graphics.RectF curImageRect = getCurImageRect();
        android.graphics.PointF pointF = this.I;
        float f37 = f17 - pointF.x;
        float f38 = f18 - pointF.y;
        if (f37 > 0.0f) {
            if (getBoardRect().left > curImageRect.left) {
                if (java.lang.Math.abs(f37) > java.lang.Math.abs(curImageRect.left - getBoardRect().left)) {
                    f19 = getBoardRect().left;
                    f27 = curImageRect.left;
                    f37 = f19 - f27;
                }
            }
            f37 *= 0.5f;
        } else {
            if (getBoardRect().right < curImageRect.right) {
                if (java.lang.Math.abs(f37) > java.lang.Math.abs(getBoardRect().right - curImageRect.right)) {
                    f19 = getBoardRect().right;
                    f27 = curImageRect.right;
                    f37 = f19 - f27;
                }
            }
            f37 *= 0.5f;
        }
        if (f38 > 0.0f) {
            if (getBoardRect().top > curImageRect.top) {
                if (java.lang.Math.abs(f38) > java.lang.Math.abs(curImageRect.top - getBoardRect().top)) {
                    f28 = getBoardRect().top;
                    f29 = curImageRect.top;
                    f38 = f28 - f29;
                }
            }
            f38 *= 0.5f;
        } else {
            if (getBoardRect().bottom < curImageRect.bottom) {
                if (java.lang.Math.abs(f38) > java.lang.Math.abs(getBoardRect().bottom - curImageRect.bottom)) {
                    f28 = getBoardRect().bottom;
                    f29 = curImageRect.bottom;
                    f38 = f28 - f29;
                }
            }
            f38 *= 0.5f;
        }
        getMainMatrix().postTranslate(f37, f38);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.drawColor(-16777216);
        android.graphics.Matrix matrix = this.f22943g;
        if (matrix != null) {
            this.f22941e.set(matrix);
            canvas.setMatrix(this.f22943g);
        } else {
            canvas.setMatrix(getMainMatrix());
        }
        canvas.save();
        canvas.clipRect(getAliveRect());
        android.graphics.Bitmap bitmap = ((l45.n) getPresenter()).f316465f;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
        canvas.restore();
        ((l45.n) getPresenter()).q(canvas);
    }

    @Override // bn5.f, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            ok.p pVar = this.H;
            pVar.f345927a = true;
            pVar.b();
        }
    }
}

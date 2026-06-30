package bn5;

/* loaded from: classes10.dex */
public class h extends bn5.f {
    public long G;
    public final ok.p H;
    public final android.graphics.PointF I;

    /* renamed from: J, reason: collision with root package name */
    public float f104494J;
    public float K;
    public boolean L;
    public boolean M;

    public h(android.content.Context context, l45.q qVar) {
        super(context, qVar);
        this.G = -1L;
        this.H = l();
        this.I = new android.graphics.PointF();
        this.f104494J = 0.0f;
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
        return ((float) m10947x9f2f90d().width()) / ((float) m10947x9f2f90d().height()) < ((float) m10934x9faf4b34().width()) / ((float) m10934x9faf4b34().height());
    }

    @Override // bn5.f
    /* renamed from: getMinScale */
    public float mo10944x299dd38e() {
        if (((l45.n) m10945xc879b3f2()).f().m() != dl.a.CROP_PHOTO) {
            return super.mo10944x299dd38e();
        }
        float width = m10934x9faf4b34().width() / m10936x72f909f5().width();
        float height = m10934x9faf4b34().height() / m10936x72f909f5().height();
        if (width <= height) {
            width = height;
        }
        return width * m10937x9c703c60();
    }

    @Override // bn5.f
    public void i(android.view.MotionEvent motionEvent) {
        float x17 = motionEvent.getX(motionEvent.getPointerCount() - 1);
        float y17 = motionEvent.getY(motionEvent.getPointerCount() - 1);
        if (((l45.n) m10945xc879b3f2()).f398000h) {
            int actionMasked = motionEvent.getActionMasked();
            android.graphics.PointF pointF = this.I;
            ok.p pVar = this.H;
            if (actionMasked == 0) {
                pointF.set(x17, y17);
                this.f104494J = 0.0f;
                this.K = m10937x9c703c60();
                android.animation.ValueAnimator valueAnimator = pVar.f427488d;
                if (valueAnimator != null && (valueAnimator.isRunning() || pVar.f427488d.isStarted())) {
                    pVar.f427488d.cancel();
                }
                this.M = false;
                m();
            } else if (actionMasked == 1) {
                this.f104494J = 0.0f;
                if (this.M) {
                    pVar.b();
                }
                n();
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f104494J = 0.0f;
                    this.K = m10937x9c703c60();
                } else if (actionMasked == 6) {
                    this.f104494J = 0.0f;
                    this.L = true;
                }
            } else {
                if (this.L) {
                    this.L = false;
                    return;
                }
                if (motionEvent.getPointerCount() == 2) {
                    if (!this.M) {
                        ((l45.n) m10945xc879b3f2()).f398009q++;
                    }
                    this.M = true;
                    float x18 = motionEvent.getX(0) - motionEvent.getX(1);
                    float y18 = motionEvent.getY(0) - motionEvent.getY(1);
                    float sqrt = (float) java.lang.Math.sqrt((x18 * x18) + (y18 * y18));
                    float f17 = this.f104494J;
                    if (f17 == 0.0f) {
                        this.f104494J = sqrt;
                    } else {
                        float f18 = (sqrt / f17) * this.K;
                        if (this.f104490x * 0.5f <= f18) {
                            float f19 = this.f104489w;
                            if (f18 > f19) {
                                f18 = ((f18 - f19) * 0.2f) + f19;
                            }
                            boolean z17 = ((float) (java.lang.System.currentTimeMillis() - this.G)) >= 100.0f;
                            if (bn5.f.F != 1.0f && java.lang.Math.abs(1.0f - f18) <= 0.005d && z17) {
                                this.G = java.lang.System.currentTimeMillis();
                                performHapticFeedback(0, 3);
                            }
                            m10942xfeaf52d0().postScale(f18 / m10937x9c703c60(), f18 / m10937x9c703c60(), x17, y17);
                        }
                        pVar.f427460a = true;
                        o(x17, y17);
                        postInvalidate();
                    }
                    if (((l45.n) m10945xc879b3f2()).f().m() == dl.a.CROP_PHOTO && ((l45.n) m10945xc879b3f2()).f398017y != null) {
                        ((l45.n) m10945xc879b3f2()).f398017y.X6();
                    }
                } else if (motionEvent.getPointerCount() == 1 && this.f104491y) {
                    this.M = true;
                    pVar.f427460a = true;
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
        android.graphics.RectF m10936x72f909f5 = m10936x72f909f5();
        android.graphics.PointF pointF = this.I;
        float f37 = f17 - pointF.x;
        float f38 = f18 - pointF.y;
        if (f37 > 0.0f) {
            if (m10934x9faf4b34().left > m10936x72f909f5.left) {
                if (java.lang.Math.abs(f37) > java.lang.Math.abs(m10936x72f909f5.left - m10934x9faf4b34().left)) {
                    f19 = m10934x9faf4b34().left;
                    f27 = m10936x72f909f5.left;
                    f37 = f19 - f27;
                }
            }
            f37 *= 0.5f;
        } else {
            if (m10934x9faf4b34().right < m10936x72f909f5.right) {
                if (java.lang.Math.abs(f37) > java.lang.Math.abs(m10934x9faf4b34().right - m10936x72f909f5.right)) {
                    f19 = m10934x9faf4b34().right;
                    f27 = m10936x72f909f5.right;
                    f37 = f19 - f27;
                }
            }
            f37 *= 0.5f;
        }
        if (f38 > 0.0f) {
            if (m10934x9faf4b34().top > m10936x72f909f5.top) {
                if (java.lang.Math.abs(f38) > java.lang.Math.abs(m10936x72f909f5.top - m10934x9faf4b34().top)) {
                    f28 = m10934x9faf4b34().top;
                    f29 = m10936x72f909f5.top;
                    f38 = f28 - f29;
                }
            }
            f38 *= 0.5f;
        } else {
            if (m10934x9faf4b34().bottom < m10936x72f909f5.bottom) {
                if (java.lang.Math.abs(f38) > java.lang.Math.abs(m10934x9faf4b34().bottom - m10936x72f909f5.bottom)) {
                    f28 = m10934x9faf4b34().bottom;
                    f29 = m10936x72f909f5.bottom;
                    f38 = f28 - f29;
                }
            }
            f38 *= 0.5f;
        }
        m10942xfeaf52d0().postTranslate(f37, f38);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.drawColor(-16777216);
        android.graphics.Matrix matrix = this.f104476g;
        if (matrix != null) {
            this.f104474e.set(matrix);
            canvas.setMatrix(this.f104476g);
        } else {
            canvas.setMatrix(m10942xfeaf52d0());
        }
        canvas.save();
        canvas.clipRect(mo10933x81daa99b());
        android.graphics.Bitmap bitmap = ((l45.n) m10945xc879b3f2()).f397998f;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
        canvas.restore();
        ((l45.n) m10945xc879b3f2()).q(canvas);
    }

    @Override // bn5.f, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            ok.p pVar = this.H;
            pVar.f427460a = true;
            pVar.b();
        }
    }
}

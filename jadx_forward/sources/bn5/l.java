package bn5;

/* loaded from: classes10.dex */
public final class l extends bn5.h {
    public final java.lang.String N;
    public boolean P;
    public android.animation.ValueAnimator Q;
    public android.animation.ValueAnimator R;
    public int S;
    public final android.graphics.Paint T;
    public android.graphics.Bitmap U;
    public android.graphics.Paint V;
    public android.graphics.LinearGradient W;

    /* renamed from: p0, reason: collision with root package name */
    public bn5.i f104497p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, l45.q presenter) {
        super(context, presenter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.N = "MicroMsg.SnsCoverBoardView";
        this.T = new android.graphics.Paint();
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 255);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofInt, "ofInt(...)");
        this.Q = ofInt;
        ofInt.setDuration(250L);
        android.animation.ValueAnimator valueAnimator = this.Q;
        if (valueAnimator == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSnsCoverShowAnimator");
            throw null;
        }
        valueAnimator.addUpdateListener(new bn5.j(this));
        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(255, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofInt2, "ofInt(...)");
        this.R = ofInt2;
        ofInt2.setDuration(250L);
        android.animation.ValueAnimator valueAnimator2 = this.R;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new bn5.k(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSnsCoverHideAnimator");
            throw null;
        }
    }

    @Override // bn5.f
    public void a() {
        float height;
        int width;
        float f17;
        float f18;
        int width2;
        float f19;
        int width3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.N, "adaptImage execute guess only by first time");
        android.graphics.Rect m10947x9f2f90d = m10947x9f2f90d();
        android.graphics.Matrix matrix = this.f104474e;
        float f27 = 180;
        if (d(matrix) % f27 == 0.0f) {
            height = m10947x9f2f90d.width() * 1.0f;
            width = m10947x9f2f90d.height();
        } else {
            height = m10947x9f2f90d.height() * 1.0f;
            width = m10947x9f2f90d.width();
        }
        float f28 = height / width;
        float width4 = (m10934x9faf4b34().width() * 1.0f) / m10934x9faf4b34().height();
        float width5 = f28 < width4 ? m10934x9faf4b34().width() / f28 : m10934x9faf4b34().height();
        android.widget.ImageView.ScaleType scaleType = this.f104473d;
        if (scaleType == android.widget.ImageView.ScaleType.CENTER_INSIDE) {
            float width6 = (f28 < width4 ? m10934x9faf4b34().width() : m10934x9faf4b34().width()) / f28;
            if (d(matrix) % f27 == 0.0f) {
                f19 = width6 * 1.0f;
                width3 = m10947x9f2f90d.height();
            } else {
                f19 = width6 * 1.0f;
                width3 = m10947x9f2f90d.width();
            }
            f17 = f19 / width3;
        } else if (scaleType == android.widget.ImageView.ScaleType.CENTER_CROP) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m10947x9f2f90d);
            f17 = c(m10947x9f2f90d);
        } else {
            f17 = 1.0f;
        }
        if (d(matrix) % f27 == 0.0f) {
            f18 = width5 * 1.0f;
            width2 = m10947x9f2f90d.height();
        } else {
            f18 = width5 * 1.0f;
            width2 = m10947x9f2f90d.width();
        }
        float f29 = f18 / width2;
        matrix.postScale(f17, f17, m10947x9f2f90d.centerX(), m10947x9f2f90d.centerY());
        android.graphics.RectF m10936x72f909f5 = m10936x72f909f5();
        matrix.postTranslate(m10934x9faf4b34().centerX() - ((int) m10936x72f909f5.centerX()), m10935xca32c8d0() - ((int) m10936x72f909f5.centerY()));
        android.graphics.Matrix matrix2 = this.f104475f;
        matrix2.set(matrix);
        this.f104489w = e(matrix2) * 3.0f;
        this.f104490x = e(matrix2) * bn5.f.F;
        if (this.f104489w < f29) {
            this.f104489w = f29 * 1.2f;
        }
    }

    @Override // bn5.f
    public float c(android.graphics.Rect imageRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageRect, "imageRect");
        android.graphics.Rect m10934x9faf4b34 = m10934x9faf4b34();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m10934x9faf4b34, "getBoardRect(...)");
        android.graphics.RectF p17 = p(m10934x9faf4b34);
        return java.lang.Math.max(p17.width() / imageRect.width(), p17.height() / imageRect.height());
    }

    @Override // bn5.h
    public ok.p l() {
        return new ok.j(this);
    }

    @Override // bn5.h
    public void m() {
        bn5.i iVar = this.f104497p0;
        if (iVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchDown", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            ((y94.a0) iVar).K(0.0f, 1.0f, 250L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchDown", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        }
        android.animation.ValueAnimator valueAnimator = this.R;
        if (valueAnimator == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSnsCoverHideAnimator");
            throw null;
        }
        if (valueAnimator.isRunning()) {
            android.animation.ValueAnimator valueAnimator2 = this.R;
            if (valueAnimator2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSnsCoverHideAnimator");
                throw null;
            }
            valueAnimator2.cancel();
        }
        android.animation.ValueAnimator valueAnimator3 = this.Q;
        if (valueAnimator3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSnsCoverShowAnimator");
            throw null;
        }
        valueAnimator3.start();
        this.P = true;
    }

    @Override // bn5.h
    public void n() {
        boolean z17;
        bn5.i iVar = this.f104497p0;
        if (iVar != null) {
            y94.a0 a0Var = (y94.a0) iVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchUp", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            a0Var.K(1.0f, 0.0f, 250L);
            bn5.f fVar = a0Var.f541885w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
            new android.graphics.Matrix(fVar.m10942xfeaf52d0()).invert(new android.graphics.Matrix());
            bn5.f fVar2 = a0Var.f541885w;
            bn5.l lVar = fVar2 instanceof bn5.l ? (bn5.l) fVar2 : null;
            if (lVar != null) {
                float[] fArr = new float[9];
                float[] fArr2 = new float[9];
                lVar.f104474e.getValues(fArr);
                lVar.f104475f.getValues(fArr2);
                z17 = !java.util.Arrays.equals(fArr, fArr2);
            } else {
                z17 = false;
            }
            a0Var.L(z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchUp", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        }
        android.animation.ValueAnimator valueAnimator = this.Q;
        if (valueAnimator == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSnsCoverShowAnimator");
            throw null;
        }
        if (valueAnimator.isRunning()) {
            android.animation.ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSnsCoverShowAnimator");
                throw null;
            }
            valueAnimator2.cancel();
        }
        android.animation.ValueAnimator valueAnimator3 = this.R;
        if (valueAnimator3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSnsCoverHideAnimator");
            throw null;
        }
        valueAnimator3.start();
        this.P = false;
    }

    @Override // bn5.h
    public void o(float f17, float f18) {
        float f19;
        float f27;
        float f28;
        float f29;
        android.graphics.RectF m10936x72f909f5 = m10936x72f909f5();
        android.graphics.Rect m10934x9faf4b34 = m10934x9faf4b34();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m10934x9faf4b34, "getBoardRect(...)");
        android.graphics.RectF p17 = p(m10934x9faf4b34);
        android.graphics.PointF pointF = this.I;
        float f37 = f17 - pointF.x;
        float f38 = f18 - pointF.y;
        if (f37 > 0.0f) {
            if (p17.left > m10936x72f909f5.left) {
                if (java.lang.Math.abs(f37) > java.lang.Math.abs(m10936x72f909f5.left - p17.left)) {
                    f19 = p17.left;
                    f27 = m10936x72f909f5.left;
                    f37 = f19 - f27;
                }
            }
            f37 *= 0.5f;
        } else {
            if (p17.right < m10936x72f909f5.right) {
                if (java.lang.Math.abs(f37) > java.lang.Math.abs(p17.right - m10936x72f909f5.right)) {
                    f19 = p17.right;
                    f27 = m10936x72f909f5.right;
                    f37 = f19 - f27;
                }
            }
            f37 *= 0.5f;
        }
        if (f38 > 0.0f) {
            if (p17.top > m10936x72f909f5.top) {
                if (java.lang.Math.abs(f38) > java.lang.Math.abs(m10936x72f909f5.top - p17.top)) {
                    f28 = p17.top;
                    f29 = m10936x72f909f5.top;
                    f38 = f28 - f29;
                }
            }
            f38 *= 0.5f;
        } else {
            if (p17.bottom < m10936x72f909f5.bottom) {
                if (java.lang.Math.abs(f38) > java.lang.Math.abs(p17.bottom - m10936x72f909f5.bottom)) {
                    f28 = p17.bottom;
                    f29 = m10936x72f909f5.bottom;
                    f38 = f28 - f29;
                }
            }
            f38 *= 0.5f;
        }
        m10942xfeaf52d0().postTranslate(f37, f38);
    }

    @Override // bn5.h, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
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
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), null);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (this.W == null) {
                this.W = new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{0, android.graphics.Color.argb(128, 0, 0, 0), android.graphics.Color.argb(255, 0, 0, 0), android.graphics.Color.argb(255, 0, 0, 0), android.graphics.Color.argb(128, 0, 0, 0), 0}, new float[]{0.0f, 0.04f, 0.1f, 0.9f, 0.96f, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
            }
            if (this.V == null) {
                android.graphics.Paint paint = new android.graphics.Paint();
                this.V = paint;
                paint.setDither(true);
                android.graphics.Paint paint2 = this.V;
                if (paint2 != null) {
                    paint2.setAntiAlias(true);
                }
            }
            android.graphics.Paint paint3 = this.V;
            if (paint3 != null) {
                paint3.setShader(this.W);
            }
            android.graphics.Paint paint4 = this.V;
            if (paint4 != null) {
                paint4.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
            }
            android.graphics.Paint paint5 = this.V;
            if (paint5 != null) {
                canvas.drawRect(0.0f, 0.0f, width, height, paint5);
            }
            android.graphics.Paint paint6 = this.V;
            if (paint6 != null) {
                paint6.setXfermode(null);
            }
            canvas.restoreToCount(saveLayer);
        }
        android.graphics.Bitmap bitmap2 = this.U;
        if (bitmap2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap2);
            if (!bitmap2.isRecycled() && m10949x6b00ea39() != null && (this.P || this.S > 0)) {
                android.graphics.Rect m10949x6b00ea39 = m10949x6b00ea39();
                android.graphics.Paint paint7 = this.T;
                paint7.setAlpha(this.S);
                android.graphics.Bitmap bitmap3 = this.U;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap3);
                canvas.drawBitmap(bitmap3, m10949x6b00ea39.left, m10949x6b00ea39.top, paint7);
            }
        }
        canvas.restore();
        ((l45.n) m10945xc879b3f2()).q(canvas);
    }

    public final android.graphics.RectF p(android.graphics.Rect outerBoard) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outerBoard, "outerBoard");
        float width = outerBoard.width() * 0.9f;
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.left = outerBoard.left;
        rectF.right = outerBoard.right;
        float height = outerBoard.top + ((outerBoard.height() - width) / 2.0f);
        rectF.top = height;
        rectF.bottom = height + width;
        return rectF;
    }

    /* renamed from: setOnTouchStateListener */
    public final void m10958xc9a4b727(bn5.i iVar) {
        this.f104497p0 = iVar;
    }

    /* renamed from: setSnsCoverOrigin */
    public final void m10959x712b8e27(android.graphics.Bitmap bitmap) {
        this.U = bitmap;
    }
}

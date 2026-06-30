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
    public bn5.i f22964p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, l45.q presenter) {
        super(context, presenter);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.N = "MicroMsg.SnsCoverBoardView";
        this.T = new android.graphics.Paint();
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 255);
        kotlin.jvm.internal.o.f(ofInt, "ofInt(...)");
        this.Q = ofInt;
        ofInt.setDuration(250L);
        android.animation.ValueAnimator valueAnimator = this.Q;
        if (valueAnimator == null) {
            kotlin.jvm.internal.o.o("mSnsCoverShowAnimator");
            throw null;
        }
        valueAnimator.addUpdateListener(new bn5.j(this));
        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(255, 0);
        kotlin.jvm.internal.o.f(ofInt2, "ofInt(...)");
        this.R = ofInt2;
        ofInt2.setDuration(250L);
        android.animation.ValueAnimator valueAnimator2 = this.R;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new bn5.k(this));
        } else {
            kotlin.jvm.internal.o.o("mSnsCoverHideAnimator");
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
        com.tencent.mars.xlog.Log.i(this.N, "adaptImage execute guess only by first time");
        android.graphics.Rect rawImageRect = getRawImageRect();
        android.graphics.Matrix matrix = this.f22941e;
        float f27 = 180;
        if (d(matrix) % f27 == 0.0f) {
            height = rawImageRect.width() * 1.0f;
            width = rawImageRect.height();
        } else {
            height = rawImageRect.height() * 1.0f;
            width = rawImageRect.width();
        }
        float f28 = height / width;
        float width4 = (getBoardRect().width() * 1.0f) / getBoardRect().height();
        float width5 = f28 < width4 ? getBoardRect().width() / f28 : getBoardRect().height();
        android.widget.ImageView.ScaleType scaleType = this.f22940d;
        if (scaleType == android.widget.ImageView.ScaleType.CENTER_INSIDE) {
            float width6 = (f28 < width4 ? getBoardRect().width() : getBoardRect().width()) / f28;
            if (d(matrix) % f27 == 0.0f) {
                f19 = width6 * 1.0f;
                width3 = rawImageRect.height();
            } else {
                f19 = width6 * 1.0f;
                width3 = rawImageRect.width();
            }
            f17 = f19 / width3;
        } else if (scaleType == android.widget.ImageView.ScaleType.CENTER_CROP) {
            kotlin.jvm.internal.o.d(rawImageRect);
            f17 = c(rawImageRect);
        } else {
            f17 = 1.0f;
        }
        if (d(matrix) % f27 == 0.0f) {
            f18 = width5 * 1.0f;
            width2 = rawImageRect.height();
        } else {
            f18 = width5 * 1.0f;
            width2 = rawImageRect.width();
        }
        float f29 = f18 / width2;
        matrix.postScale(f17, f17, rawImageRect.centerX(), rawImageRect.centerY());
        android.graphics.RectF curImageRect = getCurImageRect();
        matrix.postTranslate(getBoardRect().centerX() - ((int) curImageRect.centerX()), getBoardRectCenterY() - ((int) curImageRect.centerY()));
        android.graphics.Matrix matrix2 = this.f22942f;
        matrix2.set(matrix);
        this.f22956w = e(matrix2) * 3.0f;
        this.f22957x = e(matrix2) * bn5.f.F;
        if (this.f22956w < f29) {
            this.f22956w = f29 * 1.2f;
        }
    }

    @Override // bn5.f
    public float c(android.graphics.Rect imageRect) {
        kotlin.jvm.internal.o.g(imageRect, "imageRect");
        android.graphics.Rect boardRect = getBoardRect();
        kotlin.jvm.internal.o.f(boardRect, "getBoardRect(...)");
        android.graphics.RectF p17 = p(boardRect);
        return java.lang.Math.max(p17.width() / imageRect.width(), p17.height() / imageRect.height());
    }

    @Override // bn5.h
    public ok.p l() {
        return new ok.j(this);
    }

    @Override // bn5.h
    public void m() {
        bn5.i iVar = this.f22964p0;
        if (iVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchDown", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            ((y94.a0) iVar).K(0.0f, 1.0f, 250L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchDown", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        }
        android.animation.ValueAnimator valueAnimator = this.R;
        if (valueAnimator == null) {
            kotlin.jvm.internal.o.o("mSnsCoverHideAnimator");
            throw null;
        }
        if (valueAnimator.isRunning()) {
            android.animation.ValueAnimator valueAnimator2 = this.R;
            if (valueAnimator2 == null) {
                kotlin.jvm.internal.o.o("mSnsCoverHideAnimator");
                throw null;
            }
            valueAnimator2.cancel();
        }
        android.animation.ValueAnimator valueAnimator3 = this.Q;
        if (valueAnimator3 == null) {
            kotlin.jvm.internal.o.o("mSnsCoverShowAnimator");
            throw null;
        }
        valueAnimator3.start();
        this.P = true;
    }

    @Override // bn5.h
    public void n() {
        boolean z17;
        bn5.i iVar = this.f22964p0;
        if (iVar != null) {
            y94.a0 a0Var = (y94.a0) iVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchUp", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            a0Var.K(1.0f, 0.0f, 250L);
            bn5.f fVar = a0Var.f460352w;
            kotlin.jvm.internal.o.d(fVar);
            new android.graphics.Matrix(fVar.getMainMatrix()).invert(new android.graphics.Matrix());
            bn5.f fVar2 = a0Var.f460352w;
            bn5.l lVar = fVar2 instanceof bn5.l ? (bn5.l) fVar2 : null;
            if (lVar != null) {
                float[] fArr = new float[9];
                float[] fArr2 = new float[9];
                lVar.f22941e.getValues(fArr);
                lVar.f22942f.getValues(fArr2);
                z17 = !java.util.Arrays.equals(fArr, fArr2);
            } else {
                z17 = false;
            }
            a0Var.L(z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchUp", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        }
        android.animation.ValueAnimator valueAnimator = this.Q;
        if (valueAnimator == null) {
            kotlin.jvm.internal.o.o("mSnsCoverShowAnimator");
            throw null;
        }
        if (valueAnimator.isRunning()) {
            android.animation.ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 == null) {
                kotlin.jvm.internal.o.o("mSnsCoverShowAnimator");
                throw null;
            }
            valueAnimator2.cancel();
        }
        android.animation.ValueAnimator valueAnimator3 = this.R;
        if (valueAnimator3 == null) {
            kotlin.jvm.internal.o.o("mSnsCoverHideAnimator");
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
        android.graphics.RectF curImageRect = getCurImageRect();
        android.graphics.Rect boardRect = getBoardRect();
        kotlin.jvm.internal.o.f(boardRect, "getBoardRect(...)");
        android.graphics.RectF p17 = p(boardRect);
        android.graphics.PointF pointF = this.I;
        float f37 = f17 - pointF.x;
        float f38 = f18 - pointF.y;
        if (f37 > 0.0f) {
            if (p17.left > curImageRect.left) {
                if (java.lang.Math.abs(f37) > java.lang.Math.abs(curImageRect.left - p17.left)) {
                    f19 = p17.left;
                    f27 = curImageRect.left;
                    f37 = f19 - f27;
                }
            }
            f37 *= 0.5f;
        } else {
            if (p17.right < curImageRect.right) {
                if (java.lang.Math.abs(f37) > java.lang.Math.abs(p17.right - curImageRect.right)) {
                    f19 = p17.right;
                    f27 = curImageRect.right;
                    f37 = f19 - f27;
                }
            }
            f37 *= 0.5f;
        }
        if (f38 > 0.0f) {
            if (p17.top > curImageRect.top) {
                if (java.lang.Math.abs(f38) > java.lang.Math.abs(curImageRect.top - p17.top)) {
                    f28 = p17.top;
                    f29 = curImageRect.top;
                    f38 = f28 - f29;
                }
            }
            f38 *= 0.5f;
        } else {
            if (p17.bottom < curImageRect.bottom) {
                if (java.lang.Math.abs(f38) > java.lang.Math.abs(p17.bottom - curImageRect.bottom)) {
                    f28 = p17.bottom;
                    f29 = curImageRect.bottom;
                    f38 = f28 - f29;
                }
            }
            f38 *= 0.5f;
        }
        getMainMatrix().postTranslate(f37, f38);
    }

    @Override // bn5.h, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
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
            kotlin.jvm.internal.o.d(bitmap2);
            if (!bitmap2.isRecycled() && getValidImageRect() != null && (this.P || this.S > 0)) {
                android.graphics.Rect validImageRect = getValidImageRect();
                android.graphics.Paint paint7 = this.T;
                paint7.setAlpha(this.S);
                android.graphics.Bitmap bitmap3 = this.U;
                kotlin.jvm.internal.o.d(bitmap3);
                canvas.drawBitmap(bitmap3, validImageRect.left, validImageRect.top, paint7);
            }
        }
        canvas.restore();
        ((l45.n) getPresenter()).q(canvas);
    }

    public final android.graphics.RectF p(android.graphics.Rect outerBoard) {
        kotlin.jvm.internal.o.g(outerBoard, "outerBoard");
        float width = outerBoard.width() * 0.9f;
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.left = outerBoard.left;
        rectF.right = outerBoard.right;
        float height = outerBoard.top + ((outerBoard.height() - width) / 2.0f);
        rectF.top = height;
        rectF.bottom = height + width;
        return rectF;
    }

    public final void setOnTouchStateListener(bn5.i iVar) {
        this.f22964p0 = iVar;
    }

    public final void setSnsCoverOrigin(android.graphics.Bitmap bitmap) {
        this.U = bitmap;
    }
}

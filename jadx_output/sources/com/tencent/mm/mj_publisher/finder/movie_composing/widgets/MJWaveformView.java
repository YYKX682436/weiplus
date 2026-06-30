package com.tencent.mm.mj_publisher.finder.movie_composing.widgets;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJWaveformView;", "Landroid/view/View;", "", "getLeftFadingEdgeStrength", "getRightFadingEdgeStrength", "", "ms", "Ljz5/f0;", "setVideoPosition", "Ljx0/r;", "d", "Ljx0/r;", "getListener", "()Ljx0/r;", "setListener", "(Ljx0/r;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "value", "x", "I", "setOffset", "(I)V", "offset", "getFramePixels", "()F", "framePixels", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MJWaveformView extends android.view.View {
    public static final int S = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 10);
    public int A;
    public float B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public android.view.VelocityTracker G;
    public final android.graphics.Paint H;
    public final android.graphics.Paint I;

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.Paint f69407J;
    public final android.graphics.Paint K;
    public final android.graphics.Paint L;
    public final android.graphics.Paint M;
    public final float N;
    public final int P;
    public final android.graphics.Path Q;
    public final android.graphics.Path R;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public jx0.r listener;

    /* renamed from: e, reason: collision with root package name */
    public final float f69409e;

    /* renamed from: f, reason: collision with root package name */
    public long f69410f;

    /* renamed from: g, reason: collision with root package name */
    public long f69411g;

    /* renamed from: h, reason: collision with root package name */
    public long f69412h;

    /* renamed from: i, reason: collision with root package name */
    public long f69413i;

    /* renamed from: m, reason: collision with root package name */
    public float[] f69414m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f69415n;

    /* renamed from: o, reason: collision with root package name */
    public int f69416o;

    /* renamed from: p, reason: collision with root package name */
    public float f69417p;

    /* renamed from: q, reason: collision with root package name */
    public int f69418q;

    /* renamed from: r, reason: collision with root package name */
    public float f69419r;

    /* renamed from: s, reason: collision with root package name */
    public final float f69420s;

    /* renamed from: t, reason: collision with root package name */
    public final float f69421t;

    /* renamed from: u, reason: collision with root package name */
    public final float f69422u;

    /* renamed from: v, reason: collision with root package name */
    public final float f69423v;

    /* renamed from: w, reason: collision with root package name */
    public final float f69424w;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int offset;

    /* renamed from: y, reason: collision with root package name */
    public int f69426y;

    /* renamed from: z, reason: collision with root package name */
    public int f69427z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MJWaveformView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final float getFramePixels() {
        return this.f69423v + 2.0f;
    }

    private final void setOffset(int i17) {
        this.offset = i17;
        this.f69413i = ((i17 * this.f69417p) * ((float) 1000)) / this.f69416o;
    }

    public final void a(float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        this.f69415n = fArr2;
        int length = fArr2.length;
        for (int i17 = 0; i17 < length; i17++) {
            float[] fArr3 = this.f69415n;
            if (fArr3 == null) {
                kotlin.jvm.internal.o.o("waveformHeights");
                throw null;
            }
            fArr3[i17] = fArr[i17] * this.f69420s;
        }
    }

    public final float[] b() {
        float[] fArr = this.f69414m;
        if (fArr == null) {
            kotlin.jvm.internal.o.o("frameGains");
            throw null;
        }
        long j17 = this.f69410f;
        int i17 = this.f69416o;
        this.f69417p = i17;
        this.E = false;
        int i18 = (int) ((((float) (this.f69412h - j17)) / 1000.0f) * i17);
        if (i18 < 0) {
            i18 = 0;
        }
        this.F = i18;
        if (i18 == 0) {
            this.E = true;
        }
        long j18 = this.f69413i;
        int max = j18 != 0 ? java.lang.Math.max(a06.d.b((((float) j18) / 1000.0f) * i17), 0) : 0;
        int i19 = this.F;
        if (max > i19) {
            max = i19;
        }
        setOffset(max);
        if (this.E) {
            this.F = this.offset;
        }
        this.f69427z = this.offset;
        return by0.w.a(fArr, 0.0f, 0.714f, 1, null);
    }

    public final float c(int i17) {
        int i18 = this.f69416o;
        if (i18 != 0) {
            return (i17 * 1.0f) / i18;
        }
        return 0.0f;
    }

    public final float d(float f17) {
        int i17 = this.f69418q;
        if (i17 <= 0) {
            return 0.0f;
        }
        return ((f17 * 1.0f) / ((float) this.f69411g)) * (i17 - (this.f69424w * 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJWaveformView.e():void");
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        return this.f69409e;
    }

    public final jx0.r getListener() {
        return this.listener;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        return this.f69409e;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17;
        float f18;
        int i17;
        float d17;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f69414m == null) {
            return;
        }
        float f19 = this.f69424w;
        float f27 = this.f69421t;
        float f28 = 2;
        float f29 = this.f69420s;
        float f37 = this.f69422u;
        canvas.drawRoundRect(f19, f27, (this.f69418q - (f19 * f28)) + f19, f27 + f29, f37, f37, this.M);
        canvas.drawRect(f19, f27, this.f69419r, f27 + f29, this.H);
        float f38 = this.f69418q;
        float f39 = this.f69424w;
        int i18 = (int) (f38 - f39);
        float f47 = this.f69421t + f29;
        float[] fArr = this.f69415n;
        if (fArr == null) {
            kotlin.jvm.internal.o.o("waveformHeights");
            throw null;
        }
        int i19 = this.offset;
        int d18 = (int) (f39 / d(1000.0f / this.f69416o));
        android.graphics.Paint paint = this.L;
        android.graphics.Path path = this.R;
        if (i19 > 0) {
            int i27 = i19 > d18 ? d18 : i19;
            float d19 = f39 - d(1000.0f / this.f69416o);
            paint.setAlpha(25);
            path.reset();
            path.moveTo(d19, f47);
            int i28 = i19 - 1;
            int i29 = i19 - i27;
            if (i29 <= i28) {
                while (true) {
                    float f48 = fArr[i28];
                    f18 = f29;
                    f17 = f27;
                    d17 = f39 - d((((i19 - i28) - 1) * 1000.0f) / this.f69416o);
                    path.lineTo(d17, f47 - f48);
                    if (i28 == i29) {
                        break;
                    }
                    i28--;
                    f27 = f17;
                    f29 = f18;
                }
                d19 = d17;
            } else {
                f17 = f27;
                f18 = f29;
            }
            path.lineTo(d19, f47);
            path.close();
            canvas.drawPath(path, paint);
        } else {
            f17 = f27;
            f18 = f29;
        }
        android.graphics.Path path2 = this.Q;
        path2.reset();
        path2.moveTo(f39, f47);
        int i37 = 0;
        float f49 = f39;
        while (f49 < i18 && (i17 = i19 + i37) < fArr.length && i17 >= 0) {
            path2.lineTo(f49, f47 - fArr[i17]);
            f49 = d((i37 * 1000.0f) / this.f69416o) + f39;
            i37++;
        }
        path2.lineTo(f49 - d(1000.0f / this.f69416o), f47);
        path2.close();
        canvas.drawPath(path2, this.K);
        int i38 = i19 + i37;
        if (i38 < fArr.length) {
            if (fArr.length - i38 <= d18) {
                d18 = fArr.length - i38;
            }
            paint.setAlpha(25);
            path.reset();
            path.moveTo(f49, f47);
            int i39 = d18 + i38;
            for (int i47 = i38; i47 < i39; i47++) {
                float f57 = fArr[i47];
                f49 = d(((i47 - i38) * 1000.0f) / this.f69416o) + (this.f69418q - f39);
                path.lineTo(f49, f47 - f57);
            }
            path.lineTo(f49, f47);
            path.close();
            canvas.drawPath(path, paint);
        }
        float f58 = this.f69424w;
        android.graphics.Paint paint2 = this.I;
        canvas.drawLine(f58, f17 + (paint2.getStrokeWidth() / f28), this.f69424w, (f17 + f18) - (paint2.getStrokeWidth() / f28), paint2);
        if (this.f69427z == this.offset && this.A == 0) {
            return;
        }
        e();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f69418q = i17;
        getFramePixels();
        float f17 = this.f69421t + (this.f69420s / 2);
        int color = b3.l.getColor(getContext(), com.tencent.mm.R.color.ade);
        int color2 = b3.l.getColor(getContext(), com.tencent.mm.R.color.add);
        android.graphics.Paint paint = this.H;
        float f18 = this.f69424w;
        paint.setShader(new android.graphics.LinearGradient(f18, f17, this.f69418q - f18, f17, color, color2, android.graphics.Shader.TileMode.CLAMP));
        if (this.f69415n != null || this.f69414m == null) {
            return;
        }
        a(b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
    
        if (r3 != 3) goto L112;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJWaveformView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setListener(jx0.r rVar) {
        this.listener = rVar;
    }

    public final void setVideoPosition(long j17) {
        if (this.f69414m != null) {
            int i17 = this.f69418q;
            float f17 = this.f69424w;
            this.f69419r = (i17 <= 0 ? 0.0f : ((((float) j17) * 1.0f) / ((float) this.f69411g)) * (i17 - (2 * f17))) + f17;
            invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MJWaveformView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f69409e = 1.0f;
        this.f69417p = 1.0f;
        this.H = new android.graphics.Paint(1);
        this.I = new android.graphics.Paint(1);
        this.f69407J = new android.graphics.Paint(1);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.K = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.L = paint2;
        this.M = new android.graphics.Paint(1);
        this.N = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.P = android.view.ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.Q = new android.graphics.Path();
        this.R = new android.graphics.Path();
        float f17 = context.getResources().getDisplayMetrics().density;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ez0.l.f257821h, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        for (android.graphics.Paint paint3 : kz5.c0.i(paint, paint2)) {
            paint3.setColor(b3.l.getColor(context, com.tencent.mm.R.color.ac_));
            paint3.setStyle(android.graphics.Paint.Style.FILL);
        }
        this.I.setColor(b3.l.getColor(context, com.tencent.mm.R.color.adc));
        float f18 = 2.0f * f17;
        this.I.setStrokeWidth(f18);
        this.I.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f69407J.setColor(-1);
        this.f69407J.setStrokeWidth(f18);
        this.f69407J.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.H.setStyle(android.graphics.Paint.Style.FILL);
        this.M.setColor(-1);
        this.M.setAlpha(12);
        this.f69423v = obtainStyledAttributes.getDimension(2, 0.0f);
        float dimension = obtainStyledAttributes.getDimension(0, 23.0f * f17);
        this.f69424w = dimension;
        this.f69422u = obtainStyledAttributes.getDimension(4, 1.0f * f17);
        this.f69420s = obtainStyledAttributes.getDimension(5, 56.0f * f17);
        this.f69421t = obtainStyledAttributes.getDimension(6, 0.0f * f17);
        obtainStyledAttributes.getDimension(3, f17 * 64.0f);
        this.f69419r = dimension;
        setHorizontalFadingEdgeEnabled(true);
        setFadingEdgeLength((int) dimension);
        obtainStyledAttributes.recycle();
    }
}

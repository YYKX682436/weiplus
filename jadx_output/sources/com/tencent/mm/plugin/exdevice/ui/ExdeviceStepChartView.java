package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes5.dex */
public class ExdeviceStepChartView extends android.view.View {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public int E;
    public final android.graphics.Typeface F;
    public int G;
    public final int[] H;
    public final float[] I;

    /* renamed from: J, reason: collision with root package name */
    public final float[] f99367J;
    public final boolean[] K;
    public android.graphics.Paint L;
    public android.graphics.Path M;
    public android.graphics.Path N;
    public java.util.List P;
    public java.util.List Q;
    public int R;
    public int S;
    public boolean T;

    /* renamed from: d, reason: collision with root package name */
    public final int f99368d;

    /* renamed from: e, reason: collision with root package name */
    public final int f99369e;

    /* renamed from: f, reason: collision with root package name */
    public final int f99370f;

    /* renamed from: g, reason: collision with root package name */
    public int f99371g;

    /* renamed from: h, reason: collision with root package name */
    public final int f99372h;

    /* renamed from: i, reason: collision with root package name */
    public final int f99373i;

    /* renamed from: m, reason: collision with root package name */
    public final int f99374m;

    /* renamed from: n, reason: collision with root package name */
    public final int f99375n;

    /* renamed from: o, reason: collision with root package name */
    public final int f99376o;

    /* renamed from: p, reason: collision with root package name */
    public final int f99377p;

    /* renamed from: q, reason: collision with root package name */
    public final int f99378q;

    /* renamed from: r, reason: collision with root package name */
    public final int f99379r;

    /* renamed from: s, reason: collision with root package name */
    public final int f99380s;

    /* renamed from: t, reason: collision with root package name */
    public final int f99381t;

    /* renamed from: u, reason: collision with root package name */
    public final int f99382u;

    /* renamed from: v, reason: collision with root package name */
    public final float f99383v;

    /* renamed from: w, reason: collision with root package name */
    public final float f99384w;

    /* renamed from: x, reason: collision with root package name */
    public final int f99385x;

    /* renamed from: y, reason: collision with root package name */
    public final int f99386y;

    /* renamed from: z, reason: collision with root package name */
    public final int f99387z;

    public ExdeviceStepChartView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f99368d = getResources().getColor(com.tencent.mm.R.color.f478930l6);
        this.f99369e = getResources().getColor(com.tencent.mm.R.color.f478931l7);
        this.f99370f = getResources().getColor(com.tencent.mm.R.color.f478931l7);
        this.f99371g = Integer.MAX_VALUE;
        this.f99372h = (int) b(1, 2.5f);
        this.f99373i = (int) b(1, 4.0f);
        this.f99374m = (int) b(1, 1.8f);
        this.f99375n = (int) b(1, 1.0f);
        this.f99376o = (int) b(1, 8.0f);
        this.f99377p = (int) b(1, 22.0f);
        this.f99378q = (int) b(1, 67.0f);
        this.f99379r = (int) b(1, 40.0f);
        this.f99380s = (int) b(1, 22.0f);
        b(1, 55.0f);
        this.f99381t = (int) b(1, 35.0f);
        this.f99382u = (int) b(1, 45.0f);
        this.f99383v = (int) b(1, 8.0f);
        this.f99384w = (int) b(1, 8.0f);
        this.f99385x = (int) b(1, 2.0f);
        this.f99386y = (int) b(1, 15.0f);
        this.f99387z = (int) b(1, 33.0f);
        this.A = (int) b(1, 8.0f);
        this.B = (int) b(1, 35.0f);
        this.C = (int) b(1, 10.0f);
        this.D = (int) b(1, 58.0f);
        b(1, 1.0f);
        this.E = 0;
        this.F = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT_BOLD, 0);
        android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT_BOLD, 1);
        this.G = 0;
        this.H = new int[]{0, 0, 0, 0, 0, 0, 0};
        this.I = new float[7];
        this.f99367J = new float[7];
        this.K = new boolean[7];
        new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        c();
    }

    private void getData() {
        float[] fArr;
        ((java.util.LinkedList) this.P).clear();
        this.G = ((0 - this.f99376o) - this.f99377p) / 6;
        int i17 = 0 - this.f99378q;
        int i18 = this.f99379r;
        int i19 = i17 - i18;
        int i27 = i19 / 2;
        int i28 = 0;
        while (true) {
            fArr = this.I;
            if (i28 >= fArr.length) {
                break;
            }
            fArr[i28] = (this.G * i28) + r0;
            i28++;
        }
        int[] iArr = this.H;
        int length = iArr.length;
        if (length > 7) {
            length = 7;
        }
        int i29 = 0;
        for (int i37 = 0; i37 < length; i37++) {
            if (iArr[i37] > 100000) {
                iArr[i37] = 100000;
            }
            if (iArr[i37] < 0) {
                iArr[i37] = 0;
            }
            int i38 = iArr[i37];
            if (i38 > i29) {
                i29 = i38;
            }
        }
        if (i29 <= 15000 && i29 >= 0) {
            i29 = 15000;
        } else if (i29 <= 15000 || i29 > 100000) {
            i29 = 0;
        } else if (i29 / 5000.0d > i29 / 5000.0f) {
            i29 = ((i29 / 5000) + 1) * 5000;
        }
        int i39 = 0 - i18;
        this.E = i39 - ((i19 * 10000) / i29);
        for (int i47 = 0; i47 < length; i47++) {
            float[] fArr2 = this.f99367J;
            fArr2[i47] = i39 - ((iArr[i47] / i29) * i19);
            ((java.util.LinkedList) this.P).add(new android.graphics.Point((int) fArr[i47], (int) fArr2[i47]));
        }
    }

    public final void a(android.graphics.Canvas canvas, boolean z17) {
        if (z17) {
            this.N.reset();
            this.N.moveTo(((android.graphics.Point) ((java.util.LinkedList) this.P).get(0)).x, ((android.graphics.Point) ((java.util.LinkedList) this.P).get(0)).y);
            for (int i17 = 0; i17 < ((java.util.LinkedList) this.P).size(); i17++) {
                this.N.lineTo(((android.graphics.Point) ((java.util.LinkedList) this.P).get(i17)).x, ((android.graphics.Point) ((java.util.LinkedList) this.P).get(i17)).y);
            }
            android.graphics.Path path = this.N;
            float[] fArr = this.I;
            float f17 = fArr[fArr.length - 1];
            int i18 = this.f99381t;
            path.lineTo(f17, (0 - i18) - 1);
            android.graphics.Path path2 = this.N;
            int i19 = this.f99376o;
            path2.lineTo(i19, (0 - i18) - 1);
            this.N.lineTo(i19, this.f99367J[0]);
            canvas.drawPath(this.N, this.L);
            return;
        }
        this.N.reset();
        this.N.moveTo(((android.graphics.Point) ((java.util.LinkedList) this.P).get(0)).x, ((android.graphics.Point) ((java.util.LinkedList) this.P).get(0)).y);
        for (int i27 = 0; i27 < ((java.util.LinkedList) this.P).size(); i27++) {
            if (i27 > 0) {
                if (((android.graphics.Point) ((java.util.LinkedList) this.P).get(i27 - 1)).y == 0 - this.f99379r) {
                    this.L.reset();
                    this.L.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
                    this.L.setAntiAlias(true);
                    this.L.setStrokeWidth(this.f99374m);
                    this.L.setStyle(android.graphics.Paint.Style.STROKE);
                    this.L.setColor(-1);
                } else {
                    d();
                }
            } else {
                d();
            }
            this.N.lineTo(((android.graphics.Point) ((java.util.LinkedList) this.P).get(i27)).x, ((android.graphics.Point) ((java.util.LinkedList) this.P).get(i27)).y);
            canvas.drawPath(this.N, this.L);
            this.N.reset();
            this.N.moveTo(((android.graphics.Point) ((java.util.LinkedList) this.P).get(i27)).x, ((android.graphics.Point) ((java.util.LinkedList) this.P).get(i27)).y);
        }
    }

    public float b(int i17, float f17) {
        android.content.Context context = getContext();
        return android.util.TypedValue.applyDimension(i17, f17, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics());
    }

    public final void c() {
        this.L = new android.graphics.Paint();
        this.M = new android.graphics.Path();
        this.N = new android.graphics.Path();
        this.P = new java.util.LinkedList();
        this.Q = new java.util.LinkedList();
        for (int i17 = 0; i17 < 7; i17++) {
            boolean[] zArr = this.K;
            if (i17 == 6) {
                zArr[i17] = true;
            } else {
                zArr[i17] = false;
            }
        }
    }

    public final void d() {
        this.L.reset();
        this.L.setAntiAlias(true);
        this.L.setStrokeWidth(this.f99374m);
        this.L.setStyle(android.graphics.Paint.Style.STROKE);
        this.L.setColor(-1);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        getData();
        super.onDraw(canvas);
        this.L.reset();
        this.L.setAntiAlias(true);
        this.L.setColor(-1);
        this.L.setStrokeWidth(0.0f);
        this.L.setStyle(android.graphics.Paint.Style.FILL);
        for (int i18 = 0; i18 < ((java.util.LinkedList) this.P).size(); i18++) {
            android.graphics.Point point = (android.graphics.Point) ((java.util.LinkedList) this.P).get(i18);
            if (i18 == ((java.util.LinkedList) this.P).size() - 1) {
                canvas.drawCircle(point.x, point.y, this.f99373i, this.L);
            } else {
                canvas.drawCircle(point.x, point.y, this.f99372h, this.L);
            }
        }
        int i19 = this.f99371g;
        int i27 = this.f99369e;
        boolean[] zArr = this.K;
        int[] iArr = this.H;
        if (i19 != Integer.MAX_VALUE) {
            this.L.reset();
            this.L.setColor(i27);
            this.L.setAntiAlias(true);
            this.L.setStrokeWidth(0.0f);
            this.L.setTextSize(b(2, 12.0f));
            this.L.setTextAlign(android.graphics.Paint.Align.CENTER);
            if (i19 >= 0 && i19 <= 6) {
                if (i19 == 0) {
                    this.L.setTextAlign(android.graphics.Paint.Align.LEFT);
                }
                if (i19 == 6) {
                    this.L.setTextAlign(android.graphics.Paint.Align.RIGHT);
                }
                boolean z17 = this.T;
                int i28 = this.D;
                if (!z17) {
                    int i29 = ((android.graphics.Point) ((java.util.LinkedList) this.P).get(i19)).y - i28;
                    this.R = i29;
                    this.S = i29;
                    this.T = true;
                }
                if (this.T) {
                    int i37 = this.S;
                    float f17 = (float) (i37 / 8.0d);
                    int i38 = this.R;
                    if (i38 > 0) {
                        this.L.setAlpha(((i37 - i38) * 255) / i37);
                    }
                    canvas.drawText("" + iArr[i19], ((android.graphics.Point) ((java.util.LinkedList) this.P).get(i19)).x, this.R + i28, this.L);
                    int i39 = this.R;
                    if (i39 > 0) {
                        float f18 = i39;
                        float f19 = f18 / this.S;
                        if (f19 <= 1.0f / f17) {
                            this.R = i39 - 1;
                        } else {
                            this.R = (int) (f18 - (f19 * f17));
                        }
                        invalidate();
                    } else {
                        this.T = false;
                    }
                }
            }
            int i47 = this.f99371g;
            if (i47 >= 0 && i47 <= 6) {
                zArr[i47] = true;
            }
        }
        this.L.reset();
        this.M.reset();
        this.L.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        android.graphics.Paint paint = this.L;
        int i48 = this.f99368d;
        paint.setColor(i48);
        android.graphics.Paint paint2 = this.L;
        float f27 = this.f99375n;
        paint2.setStrokeWidth(f27);
        this.L.setAlpha(102);
        this.L.setStyle(android.graphics.Paint.Style.STROKE);
        int i49 = this.E;
        if (i49 != 0) {
            this.M.moveTo(this.f99376o, i49);
            this.M.lineTo(0 - this.f99380s, this.E);
            canvas.drawPath(this.M, this.L);
        }
        this.L.reset();
        this.M.reset();
        this.L.setColor(i48);
        this.L.setStrokeWidth(f27);
        this.L.setStyle(android.graphics.Paint.Style.STROKE);
        this.L.setAlpha(102);
        this.M.reset();
        android.graphics.Path path = this.M;
        float f28 = 0 - this.f99381t;
        float f29 = this.f99383v;
        path.moveTo(f29, f28);
        android.graphics.Path path2 = this.M;
        float f37 = 0 - this.f99384w;
        path2.lineTo(f37, f28);
        android.graphics.Path path3 = this.M;
        float f38 = this.f99382u;
        path3.moveTo(f29, f38);
        this.M.lineTo(f37, f38);
        canvas.drawPath(this.M, this.L);
        this.L.reset();
        this.L.setColor(this.f99370f);
        this.L.setAntiAlias(true);
        this.L.setAlpha(102);
        this.L.setStrokeWidth(0.0f);
        this.L.setTextSize(b(2, 12.0f));
        this.L.setTextAlign(android.graphics.Paint.Align.RIGHT);
        int i57 = i27;
        canvas.drawText(getResources().getString(com.tencent.mm.R.string.c4f), 0 - this.f99385x, (float) (this.E + (this.L.getTextSize() * 0.34d)), this.L);
        this.L.reset();
        this.L.setColor(-1);
        this.L.setAntiAlias(true);
        this.L.setStrokeWidth(0.0f);
        this.L.setTypeface(this.F);
        this.L.setTextSize(b(2, 28.0f));
        canvas.drawText(getResources().getString(com.tencent.mm.R.string.c4g), this.A, this.f99387z, this.L);
        this.L.setTextAlign(android.graphics.Paint.Align.RIGHT);
        this.L.setTextSize(b(2, 33.0f));
        canvas.drawText("" + iArr[iArr.length - 1], 0 - this.C, this.B, this.L);
        if (((java.util.LinkedList) this.P).size() > 2) {
            this.L.reset();
            this.L.setAntiAlias(true);
            this.L.setStrokeWidth(0.0f);
            this.L.setAlpha(102);
            this.L.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            this.L.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, 0 - r5, -1, 16777215, android.graphics.Shader.TileMode.REPEAT));
            this.L.setColor(-1);
            a(canvas, true);
            d();
            a(canvas, false);
        }
        java.util.List list = this.Q;
        if (list != null) {
            java.util.LinkedList linkedList = (java.util.LinkedList) list;
            if (linkedList.size() == 7) {
                this.L.reset();
                this.L.setAntiAlias(true);
                this.L.setStrokeWidth(0.0f);
                this.L.setTextSize(b(2, 12.0f));
                this.L.setAlpha(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS);
                int i58 = 0;
                while (i58 < linkedList.size()) {
                    if (i58 == 0) {
                        this.L.setTextAlign(android.graphics.Paint.Align.LEFT);
                    } else {
                        this.L.setTextAlign(android.graphics.Paint.Align.CENTER);
                    }
                    if (zArr[i58]) {
                        this.L.setColor(-1);
                        i17 = i57;
                    } else {
                        i17 = i57;
                        this.L.setColor(i17);
                    }
                    canvas.drawText((java.lang.String) linkedList.get(i58), ((android.graphics.Point) ((java.util.LinkedList) this.P).get(i58)).x, 0 - this.f99386y, this.L);
                    i58++;
                    i57 = i17;
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        float x17 = motionEvent.getX();
        motionEvent.getY();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceStepChartView", "mOnTouchLinePsition:" + this.f99371g);
        int action = motionEvent.getAction();
        if (action == 0) {
            return true;
        }
        if (action != 1) {
            return false;
        }
        this.f99371g = Integer.MAX_VALUE;
        if (((java.util.LinkedList) this.P).size() > 0) {
            int i17 = 0;
            while (true) {
                if (i17 >= ((java.util.LinkedList) this.P).size()) {
                    break;
                }
                if (i17 == 0) {
                    if (x17 < ((android.graphics.Point) ((java.util.LinkedList) this.P).get(i17)).x + (this.G / 2) && x17 > 0.0f) {
                        this.f99371g = i17;
                        invalidate();
                        break;
                    }
                    i17++;
                } else if (i17 > 0 && i17 < ((java.util.LinkedList) this.P).size() - 1) {
                    if (x17 < ((android.graphics.Point) ((java.util.LinkedList) this.P).get(i17)).x + (this.G / 2) && x17 > ((android.graphics.Point) ((java.util.LinkedList) this.P).get(i17)).x - (this.G / 2)) {
                        this.f99371g = i17;
                        invalidate();
                        break;
                    }
                    i17++;
                } else {
                    if (i17 != ((java.util.LinkedList) this.P).size() - 1) {
                        this.f99371g = Integer.MAX_VALUE;
                        break;
                    }
                    if (x17 < 0 && x17 > ((android.graphics.Point) ((java.util.LinkedList) this.P).get(i17)).x - (this.G / 2)) {
                        this.f99371g = i17;
                        invalidate();
                        break;
                    }
                    i17++;
                }
            }
        }
        this.f99371g = this.f99371g;
        for (int i18 = 0; i18 < 7; i18++) {
            boolean[] zArr = this.K;
            if (i18 == 6) {
                zArr[i18] = true;
            } else {
                zArr[i18] = false;
            }
        }
        this.T = false;
        invalidate();
        return false;
    }

    public ExdeviceStepChartView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f99368d = getResources().getColor(com.tencent.mm.R.color.f478930l6);
        this.f99369e = getResources().getColor(com.tencent.mm.R.color.f478931l7);
        this.f99370f = getResources().getColor(com.tencent.mm.R.color.f478931l7);
        this.f99371g = Integer.MAX_VALUE;
        this.f99372h = (int) b(1, 2.5f);
        this.f99373i = (int) b(1, 4.0f);
        this.f99374m = (int) b(1, 1.8f);
        this.f99375n = (int) b(1, 1.0f);
        this.f99376o = (int) b(1, 8.0f);
        this.f99377p = (int) b(1, 22.0f);
        this.f99378q = (int) b(1, 67.0f);
        this.f99379r = (int) b(1, 40.0f);
        this.f99380s = (int) b(1, 22.0f);
        b(1, 55.0f);
        this.f99381t = (int) b(1, 35.0f);
        this.f99382u = (int) b(1, 45.0f);
        this.f99383v = (int) b(1, 8.0f);
        this.f99384w = (int) b(1, 8.0f);
        this.f99385x = (int) b(1, 2.0f);
        this.f99386y = (int) b(1, 15.0f);
        this.f99387z = (int) b(1, 33.0f);
        this.A = (int) b(1, 8.0f);
        this.B = (int) b(1, 35.0f);
        this.C = (int) b(1, 10.0f);
        this.D = (int) b(1, 58.0f);
        b(1, 1.0f);
        this.E = 0;
        this.F = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT_BOLD, 0);
        android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT_BOLD, 1);
        this.G = 0;
        this.H = new int[]{0, 0, 0, 0, 0, 0, 0};
        this.I = new float[7];
        this.f99367J = new float[7];
        this.K = new boolean[7];
        new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        c();
    }
}
